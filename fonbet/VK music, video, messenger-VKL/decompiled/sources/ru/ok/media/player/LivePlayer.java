package ru.ok.media.player;

import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.audio.util.SystemAudioConfiguration;
import ru.ok.media.audio.AACDecoder;
import ru.ok.media.audio.AudioPlayerNative;
import ru.ok.media.audio.OpusDecoder;
import ru.ok.media.audio.SpeexDecoder;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.player.LivePlayer;
import ru.ok.media.utils.DecoderInterface;
import ru.ok.media.video.H264Decoder;
import ru.ok.proto.rtmp.RtmpPlayer;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.ji;
import xsna.ne7;

/* loaded from: classes9.dex */
public class LivePlayer {
    private static final String TAG = "LivePlayer";
    private int audioBufferDeepness;
    private final SystemAudioConfiguration audioConfig;
    private DecoderInterface audioDecoder;
    private MediaFormat audioFormat;
    private AudioListener audioListener;
    private long audioTS;
    private AudioPlayerNative audioTrack;
    private boolean firstFrame;
    private FrameListener frameListener;
    private HandlerThread handlerThread;

    @NonNull
    private final LoggerInterface logger;
    private volatile boolean muted;
    private boolean notifiedBuffering;
    private int notifiedBufferingPercent;
    private int prevAudioTS;
    private int prevVideoTS;
    private volatile RtmpPlayer rtmpPlayer;
    private List<LivePlayerSource> rtmpSources;
    private Runnable setAudioVolumeAction;
    private H264Decoder videoDecoder;
    private double videoRotationDegrees;
    private long videoTS;
    private boolean voiceConfigured;
    private boolean voiceRequested;
    protected Handler workerHandler;
    private ByteBuffer zeroByteBuffer = null;
    private int initializedCodecID = -1;
    private boolean opusDecoderEnabled = false;
    private float audioVolume = 1.0f;

    public interface AudioListener {
        void handleAudioBuffer(int i, int i2, ByteBuffer byteBuffer);
    }

    public interface FrameListener {
        void handleVideoFrame(long j);
    }

    public LivePlayer(@NonNull SystemAudioConfiguration systemAudioConfiguration, @NonNull String str, @NonNull LoggerInterface loggerInterface) {
        H264Decoder h264Decoder = new H264Decoder(str, loggerInterface) { // from class: ru.ok.media.player.LivePlayer.1
            private final AtomicBoolean isFirstVideoFrameRendered = new AtomicBoolean();

            @Override // ru.ok.media.video.H264Decoder
            public void handleOutputFormatUpdate() {
                LivePlayer livePlayer = LivePlayer.this;
                livePlayer.updateVideoDisplay(this, livePlayer.videoRotationDegrees);
            }

            @Override // ru.ok.media.utils.DecoderBase
            public void handleVideoFrameRendered() {
                if (this.isFirstVideoFrameRendered.getAndSet(true)) {
                    return;
                }
                LivePlayer.this.handleFirstVideoFrameRendered();
            }
        };
        this.videoDecoder = h264Decoder;
        h264Decoder.setCallback(new DecoderInterface.Callback() { // from class: ru.ok.media.player.LivePlayer.2
            @Override // ru.ok.media.utils.DecoderInterface.Callback
            public void handleFormatChanged(@NonNull MediaFormat mediaFormat) {
                LivePlayer.this.handleVideoFormatChanged(mediaFormat);
            }

            @Override // ru.ok.media.utils.DecoderInterface.Callback
            public void handleDecodedData(ByteBuffer byteBuffer) {
            }
        });
        this.audioConfig = systemAudioConfiguration;
        this.logger = loggerInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkedClose() {
        RtmpPlayer rtmpPlayer = this.rtmpPlayer;
        if (rtmpPlayer != null) {
            rtmpPlayer.notifyStopping();
        }
        Handler handler = this.workerHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: ru.ok.media.player.LivePlayer.6
                @Override // java.lang.Runnable
                public void run() {
                    if (LivePlayer.this.rtmpPlayer != null) {
                        LivePlayer.this.rtmpPlayer.stop();
                    }
                    if (LivePlayer.this.rtmpPlayer == null) {
                        if (LivePlayer.this.videoDecoder != null) {
                            LivePlayer.this.videoDecoder.close();
                            LivePlayer.this.videoDecoder = null;
                        }
                        if (LivePlayer.this.audioDecoder != null) {
                            LivePlayer.this.audioDecoder.close();
                            LivePlayer.this.audioDecoder = null;
                        }
                        LivePlayer.this.stopAudioTrack();
                        if (LivePlayer.this.handlerThread != null) {
                            LivePlayer.this.handlerThread.quitSafely();
                            LivePlayer.this.handlerThread = null;
                        }
                        LivePlayer.this.workerHandler = null;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public DecoderInterface.Callback createAudioDecoderCallback() {
        return new DecoderInterface.Callback() { // from class: ru.ok.media.player.LivePlayer.5
            @Override // ru.ok.media.utils.DecoderInterface.Callback
            public void handleDecodedData(ByteBuffer byteBuffer) {
                int remaining = byteBuffer.remaining();
                boolean z = LivePlayer.this.muted;
                if (LivePlayer.this.audioTrack == null && LivePlayer.this.audioFormat != null) {
                    LivePlayer livePlayer = LivePlayer.this;
                    livePlayer.startAudioPlayback(livePlayer.audioFormat);
                }
                if (LivePlayer.this.audioTrack != null) {
                    boolean z2 = LivePlayer.this.voiceRequested;
                    if (z2 != LivePlayer.this.voiceConfigured) {
                        LivePlayer.this.audioTrack.setVoice(z2);
                        LivePlayer.this.voiceConfigured = z2;
                    }
                    if (z) {
                        if (LivePlayer.this.zeroByteBuffer == null || LivePlayer.this.zeroByteBuffer.capacity() < remaining) {
                            LivePlayer.this.zeroByteBuffer = ByteBuffer.allocateDirect(remaining);
                        }
                        LivePlayer.this.zeroByteBuffer.clear();
                        LivePlayer.this.zeroByteBuffer.limit(remaining);
                    } else {
                        byteBuffer.rewind();
                    }
                    LivePlayer livePlayer2 = LivePlayer.this;
                    if (z) {
                        byteBuffer = livePlayer2.zeroByteBuffer;
                    }
                    livePlayer2.writeAudioSamples(byteBuffer, remaining);
                }
            }

            @Override // ru.ok.media.utils.DecoderInterface.Callback
            public void handleFormatChanged(MediaFormat mediaFormat) {
                LivePlayer.this.audioFormat = mediaFormat;
                LivePlayer.this.startAudioPlayback(mediaFormat);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RtmpPlayer createPlayer(@NonNull List<LivePlayerSource> list, int i, @NonNull LoggerInterface loggerInterface) throws IOException {
        return new RtmpPlayer(list, this.handlerThread, i, this.opusDecoderEnabled, loggerInterface) { // from class: ru.ok.media.player.LivePlayer.4
            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public ByteBuffer allocateAudioBuffer(int i2, int i3) {
                if (i2 != 10 && i2 != 11 && i2 != 12) {
                    ne7.J(LivePlayer.TAG, "Received unsupported audio format: codec id=" + i2);
                    return null;
                }
                if (LivePlayer.this.initializedCodecID >= 0 && LivePlayer.this.initializedCodecID != i2) {
                    ne7.J(LivePlayer.TAG, "Unsupported codec switch " + LivePlayer.this.initializedCodecID + "=>" + i2);
                    return null;
                }
                if (LivePlayer.this.audioDecoder == null) {
                    if (i2 == 10) {
                        ne7.J(LivePlayer.TAG, "AAC frame buffer was requested before audio decoder was initialized");
                        return null;
                    }
                    if (i2 == 12) {
                        LivePlayer.this.audioDecoder = new OpusDecoder();
                        LivePlayer.this.audioDecoder.setCallback(LivePlayer.this.createAudioDecoderCallback());
                        LivePlayer.this.initializedCodecID = i2;
                        LivePlayer.this.firstFrame = true;
                    } else {
                        LivePlayer.this.audioDecoder = new SpeexDecoder();
                        LivePlayer.this.audioDecoder.setCallback(LivePlayer.this.createAudioDecoderCallback());
                        LivePlayer.this.initializedCodecID = i2;
                        LivePlayer.this.firstFrame = true;
                    }
                }
                return LivePlayer.this.audioDecoder.getDataBuffer(i3);
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public ByteBuffer allocateVideoBuffer(int i2, int i3) {
                if (i2 == 7) {
                    if (LivePlayer.this.videoDecoder == null) {
                        return null;
                    }
                    return LivePlayer.this.videoDecoder.getDataBuffer(i3);
                }
                ne7.J(LivePlayer.TAG, "Received unsupported video format: codec id=" + i2);
                return null;
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public int getAudioQueueDeepness() {
                return LivePlayer.this.audioBufferDeepness;
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public int getAudioQueuedMS() {
                AudioPlayerNative audioPlayerNative = LivePlayer.this.audioTrack;
                if (audioPlayerNative == null) {
                    return 0;
                }
                return audioPlayerNative.getBufferedMS();
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleAudioFrame(int i2, int i3, ByteBuffer byteBuffer) {
                if (LivePlayer.this.audioDecoder == null) {
                    ne7.J(LivePlayer.TAG, "Received frame before AAC header");
                    return;
                }
                LivePlayer.this.initTimestamps(i3);
                LivePlayer.this.audioTS += (i3 - LivePlayer.this.prevAudioTS) * 1000;
                LivePlayer.this.prevAudioTS = i3;
                LivePlayer.this.audioDecoder.enqueueDataBuffer(byteBuffer.remaining(), LivePlayer.this.audioTS);
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleAudioHeader(int i2, int i3, ByteBuffer byteBuffer) {
                if (i2 != 10) {
                    ne7.J(LivePlayer.TAG, "Received unsupported audio format: codec id=" + i2);
                    return;
                }
                if (LivePlayer.this.audioDecoder == null) {
                    AACDecoder aACDecoder = new AACDecoder();
                    LivePlayer.this.audioDecoder = aACDecoder;
                    aACDecoder.setCallback(LivePlayer.this.createAudioDecoderCallback());
                    LivePlayer.this.initializedCodecID = i2;
                    LivePlayer.this.firstFrame = true;
                }
                LivePlayer.this.audioDecoder.setConfig(byteBuffer);
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleBitrateChanged(long j, long j2) {
                LivePlayer.this.handleBitrateChanged(j, j2);
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleBuffering(boolean z, int i2) {
                super.handleBuffering(z, i2);
                LivePlayer.this.notifyBuffering(z, i2);
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleError(int i2, @Nullable Throwable th) {
                super.handleError(i2, th);
                LivePlayer.this.handleError(i2, th);
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleRetry() {
                super.handleRetry();
                LivePlayer.this.handleRetry();
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleRotation(double d) {
                if (LivePlayer.this.videoRotationDegrees != d) {
                    LivePlayer.this.videoRotationDegrees = d;
                    LivePlayer livePlayer = LivePlayer.this;
                    livePlayer.updateVideoDisplay(livePlayer.videoDecoder, d);
                }
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleStopped() {
                super.handleStopped();
                LivePlayer.this.rtmpPlayer = null;
                LivePlayer.this.checkedClose();
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleUnpublished() {
                LivePlayer.this.handleUnpublished();
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleVideoFrame(int i2, int i3, int i4, boolean z, ByteBuffer byteBuffer) {
                if (LivePlayer.this.videoDecoder == null) {
                    ne7.J(LivePlayer.TAG, "Received frame before H.264 header");
                    return;
                }
                LivePlayer.this.initTimestamps(i3);
                if (LivePlayer.this.prevVideoTS != 0 && LivePlayer.this.prevVideoTS - i3 > 0) {
                    ne7.J(LivePlayer.TAG, "Backward ts; prev=" + LivePlayer.this.prevVideoTS + " timestamp=" + i3 + " resetting");
                    LivePlayer.this.prevVideoTS = i3;
                }
                LivePlayer.this.videoTS += (i3 - LivePlayer.this.prevVideoTS) * 1000;
                LivePlayer.this.prevVideoTS = i3;
                LivePlayer.this.videoDecoder.enqueueDataBuffer(byteBuffer.remaining(), LivePlayer.this.videoTS + (i4 * 1000));
                if (LivePlayer.this.frameListener != null) {
                    LivePlayer.this.frameListener.handleVideoFrame(i3);
                }
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public void handleVideoHeader(int i2, ByteBuffer byteBuffer) {
                if (i2 != 7) {
                    ne7.J(LivePlayer.TAG, "Received unsupported video format: codec id=" + i2);
                } else if (LivePlayer.this.videoDecoder != null) {
                    LivePlayer.this.videoDecoder.setConfig(byteBuffer);
                }
            }

            @Override // ru.ok.proto.rtmp.RtmpPlayer
            public boolean isMuted() {
                return LivePlayer.this.muted;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initTimestamps(int i) {
        if (this.firstFrame) {
            this.prevAudioTS = i;
            this.prevVideoTS = i;
            this.firstFrame = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAudioVolume$0(float f) {
        AudioPlayerNative audioPlayerNative = this.audioTrack;
        if (audioPlayerNative != null) {
            audioPlayerNative.setVolume(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBuffering(boolean z, int i) {
        if (this.notifiedBuffering == z && this.notifiedBufferingPercent == i) {
            return;
        }
        this.notifiedBufferingPercent = i;
        this.notifiedBuffering = z;
        handleBuffering(z, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startAudioPlayback(MediaFormat mediaFormat) {
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        AudioPlayerNative audioPlayerNative = this.audioTrack;
        if (audioPlayerNative != null && audioPlayerNative.getChannelCount() == integer && this.audioTrack.getSampleRate() == integer2) {
            return;
        }
        stopAudioTrack();
        boolean z = this.voiceRequested;
        AudioPlayerNative audioPlayerNative2 = new AudioPlayerNative(this.audioConfig, integer2, integer, this.audioBufferDeepness);
        this.audioTrack = audioPlayerNative2;
        audioPlayerNative2.setVoice(z);
        this.voiceConfigured = z;
        this.audioTrack.setVolume(this.audioVolume);
        this.audioTrack.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopAudioTrack() {
        AudioPlayerNative audioPlayerNative = this.audioTrack;
        if (audioPlayerNative != null) {
            audioPlayerNative.stop();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVideoDisplay(@Nullable H264Decoder h264Decoder, double d) {
        if (h264Decoder != null) {
            handleVideoSizeUpdate(h264Decoder.getVideoWidth(), h264Decoder.getVideoHeight(), d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeAudioSamples(ByteBuffer byteBuffer, int i) {
        AudioListener audioListener = this.audioListener;
        if (audioListener != null) {
            audioListener.handleAudioBuffer(this.audioTrack.getSampleRate(), this.audioTrack.getChannelCount(), byteBuffer);
        }
        this.audioTrack.writeAudioSamples(byteBuffer, i);
    }

    public void dismiss() {
        Handler handler = this.workerHandler;
        if (handler != null) {
            this.setAudioVolumeAction = null;
            handler.removeCallbacksAndMessages(null);
        }
        checkedClose();
    }

    public float getAudioVolume() {
        return this.audioVolume;
    }

    public final long getAverageBitrate() {
        RtmpPlayer rtmpPlayer = this.rtmpPlayer;
        if (rtmpPlayer != null) {
            return rtmpPlayer.getAverageBitrate();
        }
        return 0L;
    }

    public long getCurrentPosition() {
        return this.prevVideoTS;
    }

    @Nullable
    public List<LivePlayerSource> getRtmpSources() {
        return this.rtmpSources;
    }

    public double getVideoRotationDegrees() {
        return this.videoRotationDegrees;
    }

    @Nullable
    public final TextureView getVideoView() {
        H264Decoder h264Decoder = this.videoDecoder;
        if (h264Decoder != null) {
            return h264Decoder.getView();
        }
        return null;
    }

    public boolean isRunning() {
        return this.handlerThread != null;
    }

    public boolean isVideoFrameRendered() {
        H264Decoder h264Decoder = this.videoDecoder;
        return h264Decoder != null && h264Decoder.isVideoFrameRendered();
    }

    public void requestVoice(boolean z) {
        this.voiceRequested = z;
    }

    public void setAudioListener(AudioListener audioListener) {
        this.audioListener = audioListener;
    }

    public void setAudioVolume(float f) {
        final float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, f));
        if (this.audioVolume != max) {
            this.audioVolume = max;
            Handler handler = this.workerHandler;
            if (handler != null) {
                Runnable runnable = this.setAudioVolumeAction;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = new Runnable() { // from class: xsna.ikz
                    @Override // java.lang.Runnable
                    public final void run() {
                        LivePlayer.this.lambda$setAudioVolume$0(max);
                    }
                };
                this.setAudioVolumeAction = runnable2;
                handler.post(runnable2);
            }
        }
    }

    public void setFrameListener(FrameListener frameListener) {
        this.frameListener = frameListener;
    }

    public void setMuted(boolean z) {
        this.muted = z;
    }

    public void setOpusDecoderEnabled(boolean z) {
        this.opusDecoderEnabled = z;
    }

    public final void setSurface(Surface surface) {
        this.videoDecoder.setSurface(surface);
    }

    public final void setVideoView(@Nullable TextureView textureView) {
        H264Decoder h264Decoder = this.videoDecoder;
        if (h264Decoder != null) {
            h264Decoder.setView(textureView);
        }
    }

    public void start(@NonNull final List<LivePlayerSource> list, final int i) {
        this.audioBufferDeepness = Math.min(1000, Math.max(200, i));
        StringBuilder b = ji.b(i, "start: buffer=", "ms audio=");
        b.append(this.audioBufferDeepness);
        b.append(UcumUtils.UCUM_MILLISECODS);
        ne7.t(TAG, b.toString());
        this.rtmpSources = Collections.unmodifiableList(list);
        this.setAudioVolumeAction = null;
        HandlerThread handlerThread = new HandlerThread("RtmpPlayerThread");
        this.handlerThread = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.handlerThread.getLooper());
        this.workerHandler = handler;
        handler.post(new Runnable() { // from class: ru.ok.media.player.LivePlayer.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    LivePlayer livePlayer = LivePlayer.this;
                    livePlayer.rtmpPlayer = livePlayer.createPlayer(list, i, livePlayer.logger);
                    LivePlayer.this.rtmpPlayer.start();
                } catch (Exception e) {
                    ne7.K(LivePlayer.TAG, "Error starting rtmp player", e);
                    LivePlayer.this.handleError(15, e);
                }
            }
        });
    }

    public void handleFirstVideoFrameRendered() {
    }

    public void handleRetry() {
    }

    public void handleUnpublished() {
    }

    public void handleVideoFormatChanged(@NonNull MediaFormat mediaFormat) {
    }

    public void handleBitrateChanged(long j, long j2) {
    }

    public void handleBuffering(boolean z, int i) {
    }

    public void handleError(int i, @Nullable Throwable th) {
    }

    public void handleVideoSizeUpdate(int i, int i2, double d) {
    }
}
