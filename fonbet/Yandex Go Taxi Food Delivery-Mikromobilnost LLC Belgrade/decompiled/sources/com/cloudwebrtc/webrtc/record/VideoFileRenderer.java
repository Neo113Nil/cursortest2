package com.cloudwebrtc.webrtc.record;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import defpackage.nnm;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import org.webrtc.VideoSink;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
class VideoFileRenderer implements VideoSink, JavaAudioDeviceModule.SamplesReadyCallback {
    private static final int FRAME_RATE = 30;
    private static final int IFRAME_INTERVAL = 5;
    private static final String MIME_TYPE = "video/avc";
    private static final String TAG = "VideoFileRenderer";
    private MediaCodec.BufferInfo audioBufferInfo;
    private MediaCodec audioEncoder;
    private ByteBuffer[] audioInputBuffers;
    private ByteBuffer[] audioOutputBuffers;
    private final HandlerThread audioThread;
    private final Handler audioThreadHandler;
    private int audioTrackIndex;
    private final MediaCodec.BufferInfo bufferInfo;
    private GlRectDrawer drawer;
    private EglBase eglBase;
    private MediaCodec encoder;
    private ByteBuffer[] encoderOutputBuffers;
    private VideoFrameDrawer frameDrawer;
    private final MediaMuxer mediaMuxer;
    private final HandlerThread renderThread;
    private final Handler renderThreadHandler;
    private final EglBase.Context sharedContext;
    private Surface surface;
    private int outputFileWidth = -1;
    private int outputFileHeight = -1;
    private int trackIndex = -1;
    private boolean isRunning = true;
    private boolean encoderStarted = false;
    private volatile boolean muxerStarted = false;
    private long videoFrameStart = 0;
    private long presTime = 0;

    public VideoFileRenderer(String str, EglBase.Context context, boolean z) throws IOException {
        HandlerThread handlerThread = new HandlerThread("VideoFileRendererRenderThread");
        this.renderThread = handlerThread;
        handlerThread.start();
        this.renderThreadHandler = new Handler(handlerThread.getLooper());
        if (z) {
            HandlerThread handlerThread2 = new HandlerThread("VideoFileRendererAudioThread");
            this.audioThread = handlerThread2;
            handlerThread2.start();
            this.audioThreadHandler = new Handler(handlerThread2.getLooper());
        } else {
            this.audioThread = null;
            this.audioThreadHandler = null;
        }
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.sharedContext = context;
        this.mediaMuxer = new MediaMuxer(str, 0);
        this.audioTrackIndex = z ? -1 : 0;
    }

    private void drainAudio() {
        if (this.audioBufferInfo == null) {
            this.audioBufferInfo = new MediaCodec.BufferInfo();
        }
        while (true) {
            int dequeueOutputBuffer = this.audioEncoder.dequeueOutputBuffer(this.audioBufferInfo, 10000L);
            if (dequeueOutputBuffer == -1) {
                return;
            }
            if (dequeueOutputBuffer == -3) {
                this.audioOutputBuffers = this.audioEncoder.getOutputBuffers();
            } else {
                boolean z = true;
                if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.audioEncoder.getOutputFormat();
                    Objects.toString(outputFormat);
                    this.audioTrackIndex = this.mediaMuxer.addTrack(outputFormat);
                    if (this.trackIndex != -1 && !this.muxerStarted) {
                        this.mediaMuxer.start();
                        this.muxerStarted = true;
                    }
                    if (!this.muxerStarted) {
                        return;
                    }
                } else if (dequeueOutputBuffer < 0) {
                    nnm.q(dequeueOutputBuffer, "unexpected result fr om encoder.dequeueOutputBuffer: ", TAG);
                } else {
                    try {
                        ByteBuffer byteBuffer = this.audioOutputBuffers[dequeueOutputBuffer];
                        if (byteBuffer == null) {
                            Log.e(TAG, "encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                            return;
                        }
                        byteBuffer.position(this.audioBufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo = this.audioBufferInfo;
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        if (this.muxerStarted) {
                            this.mediaMuxer.writeSampleData(this.audioTrackIndex, byteBuffer, this.audioBufferInfo);
                        }
                        if (!this.isRunning || (this.audioBufferInfo.flags & 4) != 0) {
                            z = false;
                        }
                        this.isRunning = z;
                        this.audioEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                        if ((this.audioBufferInfo.flags & 4) != 0) {
                            return;
                        }
                    } catch (Exception e) {
                        Log.wtf(TAG, e);
                        return;
                    }
                }
            }
        }
    }

    private void drainEncoder() {
        if (!this.encoderStarted) {
            this.encoder.start();
            this.encoderOutputBuffers = this.encoder.getOutputBuffers();
            this.encoderStarted = true;
            return;
        }
        while (true) {
            int dequeueOutputBuffer = this.encoder.dequeueOutputBuffer(this.bufferInfo, 10000L);
            if (dequeueOutputBuffer == -1) {
                return;
            }
            if (dequeueOutputBuffer == -3) {
                this.encoderOutputBuffers = this.encoder.getOutputBuffers();
                Log.e(TAG, "encoder output buffers changed");
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.encoder.getOutputFormat();
                Log.e(TAG, "encoder output format changed: " + outputFormat);
                this.trackIndex = this.mediaMuxer.addTrack(outputFormat);
                if (this.audioTrackIndex != -1 && !this.muxerStarted) {
                    this.mediaMuxer.start();
                    this.muxerStarted = true;
                }
                if (!this.muxerStarted) {
                    return;
                }
            } else if (dequeueOutputBuffer < 0) {
                nnm.q(dequeueOutputBuffer, "unexpected result fr om encoder.dequeueOutputBuffer: ", TAG);
            } else {
                try {
                    ByteBuffer byteBuffer = this.encoderOutputBuffers[dequeueOutputBuffer];
                    if (byteBuffer == null) {
                        Log.e(TAG, "encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                        return;
                    }
                    byteBuffer.position(this.bufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    if (this.videoFrameStart == 0) {
                        long j = this.bufferInfo.presentationTimeUs;
                        if (j != 0) {
                            this.videoFrameStart = j;
                        }
                    }
                    this.bufferInfo.presentationTimeUs -= this.videoFrameStart;
                    if (this.muxerStarted) {
                        this.mediaMuxer.writeSampleData(this.trackIndex, byteBuffer, this.bufferInfo);
                    }
                    this.isRunning = this.isRunning && (this.bufferInfo.flags & 4) == 0;
                    this.encoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.bufferInfo.flags & 4) != 0) {
                        return;
                    }
                } catch (Exception e) {
                    Log.wtf(TAG, e);
                    return;
                }
            }
        }
    }

    private void initVideoEncoder() {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(MIME_TYPE, this.outputFileWidth, this.outputFileHeight);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", 6000000);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 5);
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MIME_TYPE);
            this.encoder = createEncoderByType;
            createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.renderThreadHandler.post(new a(this, 2));
        } catch (Exception e) {
            Log.wtf(TAG, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initVideoEncoder$0() {
        this.eglBase = EglBase.create(this.sharedContext, EglBase.CONFIG_RECORDABLE);
        Surface createInputSurface = this.encoder.createInputSurface();
        this.surface = createInputSurface;
        this.eglBase.createSurface(createInputSurface);
        this.eglBase.makeCurrent();
        this.drawer = new GlRectDrawer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onWebRtcAudioRecordSamplesReady$4(JavaAudioDeviceModule.AudioSamples audioSamples) {
        if (this.audioEncoder == null) {
            try {
                this.audioEncoder = MediaCodec.createEncoderByType("audio/mp4a-latm");
                MediaFormat mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", "audio/mp4a-latm");
                mediaFormat.setInteger("channel-count", audioSamples.getChannelCount());
                mediaFormat.setInteger("sample-rate", audioSamples.getSampleRate());
                mediaFormat.setInteger("bitrate", 65536);
                mediaFormat.setInteger("aac-profile", 2);
                this.audioEncoder.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                this.audioEncoder.start();
                this.audioInputBuffers = this.audioEncoder.getInputBuffers();
                this.audioOutputBuffers = this.audioEncoder.getOutputBuffers();
            } catch (IOException e) {
                Log.wtf(TAG, e);
            }
        }
        int dequeueInputBuffer = this.audioEncoder.dequeueInputBuffer(0L);
        if (dequeueInputBuffer >= 0) {
            ByteBuffer byteBuffer = this.audioInputBuffers[dequeueInputBuffer];
            byteBuffer.clear();
            byte[] data = audioSamples.getData();
            byteBuffer.put(data);
            this.audioEncoder.queueInputBuffer(dequeueInputBuffer, 0, data.length, this.presTime, 0);
            this.presTime += (data.length * HProv.PP_DELETE_KEYSET) / 12;
        }
        drainAudio();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2() {
        MediaCodec mediaCodec = this.audioEncoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.audioEncoder.release();
        }
        this.audioThread.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$3() {
        MediaCodec mediaCodec = this.encoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.encoder.release();
        }
        this.eglBase.release();
        this.mediaMuxer.stop();
        this.mediaMuxer.release();
        this.renderThread.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: renderFrameOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$onFrame$1(VideoFrame videoFrame) {
        if (this.frameDrawer == null) {
            this.frameDrawer = new VideoFrameDrawer();
        }
        this.frameDrawer.drawFrame(videoFrame, this.drawer, null, 0, 0, this.outputFileWidth, this.outputFileHeight);
        videoFrame.release();
        drainEncoder();
        this.eglBase.swapBuffers();
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        videoFrame.retain();
        if (this.outputFileWidth == -1) {
            this.outputFileWidth = videoFrame.getRotatedWidth();
            this.outputFileHeight = videoFrame.getRotatedHeight();
            initVideoEncoder();
        }
        this.renderThreadHandler.post(new b(this, videoFrame, 1));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        if (this.isRunning) {
            this.audioThreadHandler.post(new b(this, audioSamples, 0));
        }
    }

    public void release() {
        int i = 0;
        this.isRunning = false;
        Handler handler = this.audioThreadHandler;
        if (handler != null) {
            handler.post(new a(this, i));
        }
        this.renderThreadHandler.post(new a(this, 1));
    }
}
