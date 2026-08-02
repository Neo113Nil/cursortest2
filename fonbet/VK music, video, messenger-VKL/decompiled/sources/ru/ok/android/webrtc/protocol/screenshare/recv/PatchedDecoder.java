package ru.ok.android.webrtc.protocol.screenshare.recv;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.JavaI420Buffer;
import org.webrtc.NV12Buffer;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.YuvHelper;
import ru.ok.android.webrtc.RTCLog;
import xsna.dq;
import xsna.lhg;
import xsna.sr;

/* loaded from: classes9.dex */
public class PatchedDecoder implements VideoSink {
    public static final ErrorCallback w = new sr(23);
    public final String a;
    public final String b;

    @Nullable
    public volatile MediaCodec codec;
    public int e;
    public d f;
    public ThreadUtils.ThreadChecker g;
    public ThreadUtils.ThreadChecker h;
    public volatile boolean i;
    public volatile Exception j;
    public int l;
    public int m;
    public int n;
    public int o;
    public volatile boolean p;
    public final EglBase.Context q;
    public final RTCLog r;

    @Nullable
    public volatile Surface surface;

    @Nullable
    public volatile SurfaceTextureHelper surfaceTextureHelper;
    public volatile e t;
    public volatile VideoSink v;
    public final Object c = new Object();
    public final Object k = new Object();
    public final Object s = new Object();
    public final ConditionVariable u = new ConditionVariable(true);
    public final LinkedBlockingDeque d = new LinkedBlockingDeque();

    public interface ErrorCallback {
        void error(Exception exc, String str);
    }

    public PatchedDecoder(String str, String str2, int i, @Nullable EglBase.Context context, RTCLog rTCLog) {
        this.a = str;
        this.b = str2;
        this.e = i;
        this.q = context;
        this.r = rTCLog;
    }

    public static /* synthetic */ void a(Exception exc, String str) {
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.q);
    }

    public VideoCodecStatus decode(EncodedImage encodedImage) {
        VideoCodecStatus videoCodecStatus;
        this.h.checkIsOnValidThread();
        if (this.v == null) {
            StringBuilder sb = new StringBuilder("decode uninitalized, codec: ");
            sb.append(this.codec != null);
            sb.append(", callback: ");
            sb.append(this.v);
            a(sb.toString(), (Exception) null);
            return VideoCodecStatus.UNINITIALIZED;
        }
        if (this.codec == null) {
            int i = encodedImage.encodedWidth;
            int i2 = encodedImage.encodedHeight;
            this.h.checkIsOnValidThread();
            synchronized (this.c) {
                try {
                    if (this.q != null) {
                        this.surfaceTextureHelper = createSurfaceTextureHelper();
                        if (this.surfaceTextureHelper == null) {
                            videoCodecStatus = VideoCodecStatus.ERROR;
                        } else {
                            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
                            this.surfaceTextureHelper.startListening(this);
                        }
                    }
                    a("initDecodeInternal " + this.b + " " + i + " x " + i2 + " " + this.surface, (Exception) null);
                    if (this.f != null) {
                        a("initDecodeInternal called while the codec is already running", (Exception) null);
                        videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
                    } else {
                        this.p = true;
                        try {
                            this.codec = MediaCodec.createByCodecName(this.a);
                            try {
                                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.b, i, i2);
                                createVideoFormat.setInteger("color-format", this.e);
                                createVideoFormat.setLong("durationUs", Long.MAX_VALUE);
                                createVideoFormat.setInteger("capture-rate", 30);
                                this.codec.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                                this.codec.start();
                                this.d.clear();
                                this.i = true;
                                d dVar = new d(this);
                                this.f = dVar;
                                dVar.start();
                                a("initDecodeInternal done", (Exception) null);
                                videoCodecStatus = VideoCodecStatus.OK;
                            } catch (IllegalArgumentException e) {
                                ErrorCallback errorCallback = w;
                                if (errorCallback != null) {
                                    errorCallback.error(e, "hwdec.iae");
                                }
                                a("initDecode failed", e);
                                release();
                                videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
                            } catch (IllegalStateException e2) {
                                a("initDecode failed", e2);
                                ErrorCallback errorCallback2 = w;
                                if (errorCallback2 != null) {
                                    errorCallback2.error(e2, "hwdec.ise");
                                }
                                release();
                                videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
                            }
                        } catch (IOException | IllegalArgumentException unused) {
                            a("Cannot create media decoder " + this.a, (Exception) null);
                            videoCodecStatus = VideoCodecStatus.FALLBACK_SOFTWARE;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (videoCodecStatus != VideoCodecStatus.OK) {
                return videoCodecStatus;
            }
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            a("decode() - no input data", (Exception) null);
            return VideoCodecStatus.ERR_PARAMETER;
        }
        int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            a("decode() - input buffer empty", (Exception) null);
            return VideoCodecStatus.ERR_PARAMETER;
        }
        if (this.p && encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
            a("decode() - key frame required first", (Exception) null);
            return VideoCodecStatus.NO_OUTPUT;
        }
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000L);
            if (dequeueInputBuffer < 0) {
                a("decode() - no HW buffers available; decoder falling behind", (Exception) null);
                this.p = true;
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                ByteBuffer byteBuffer2 = this.codec.getInputBuffers()[dequeueInputBuffer];
                if (byteBuffer2.capacity() < remaining) {
                    a("decode() - HW buffer too small", (Exception) null);
                    return VideoCodecStatus.ERROR;
                }
                byteBuffer2.put(encodedImage.buffer);
                a("frameInfos: " + this.d.size(), (Exception) null);
                this.d.offer(new f(SystemClock.elapsedRealtime(), encodedImage.rotation));
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                    if (this.p) {
                        this.p = false;
                    }
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e3) {
                    a("queueInputBuffer failed", e3);
                    this.d.pollLast();
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e4) {
                a("getInputBuffers failed", e4);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e5) {
            a("dequeueInputBuffer failed", e5);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverDecodedFrame() {
        int i;
        this.g.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (dequeueOutputBuffer == -2) {
                a(this.codec.getOutputFormat());
                return;
            }
            Integer num = null;
            if (dequeueOutputBuffer < 0) {
                a("dequeueOutputBuffer returned " + dequeueOutputBuffer, (Exception) null);
                return;
            }
            f fVar = (f) this.d.poll();
            if (fVar != null) {
                num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - fVar.a));
                i = fVar.b;
            } else {
                i = 0;
            }
            if (this.surfaceTextureHelper != null) {
                a(dequeueOutputBuffer, bufferInfo, i, num);
            } else {
                a(dequeueOutputBuffer, bufferInfo, i);
            }
        } catch (IllegalStateException e) {
            a("deliverDecodedFrame failed", e);
        }
    }

    public VideoCodecStatus initDecode(VideoSink videoSink) {
        this.h = new ThreadUtils.ThreadChecker();
        this.v = videoSink;
        return VideoCodecStatus.OK;
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j;
        synchronized (this.s) {
            if (this.t == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j = this.t.a * 1000;
            Integer num = this.t.b;
            this.t = null;
        }
        this.u.open();
        this.v.onFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j));
    }

    public VideoCodecStatus release() {
        a("release", (Exception) null);
        VideoCodecStatus releaseInternal = releaseInternal();
        this.v = null;
        return releaseInternal;
    }

    public VideoCodecStatus releaseInternal() {
        VideoCodecStatus videoCodecStatus;
        synchronized (this.c) {
            if (!this.i) {
                a("release: Decoder is not running.", (Exception) null);
                return VideoCodecStatus.OK;
            }
            try {
                this.i = false;
                if (ThreadUtils.joinUninterruptibly(this.f, 5000L)) {
                    if (this.j == null) {
                        this.codec = null;
                        this.f = null;
                        try {
                            if (this.surface != null) {
                                releaseSurface();
                                this.surface = null;
                                this.surfaceTextureHelper.stopListening();
                                this.surfaceTextureHelper.dispose();
                                this.surfaceTextureHelper = null;
                            }
                            synchronized (this.s) {
                                this.t = null;
                            }
                            this.d.clear();
                            return VideoCodecStatus.OK;
                        } catch (Throwable th) {
                            synchronized (this.s) {
                                this.t = null;
                                throw th;
                            }
                        }
                    }
                    RuntimeException runtimeException = new RuntimeException(this.j);
                    a("Media decoder release error", runtimeException);
                    ErrorCallback errorCallback = w;
                    if (errorCallback != null) {
                        errorCallback.error(runtimeException, "hwdec.release.e");
                    }
                    this.j = null;
                    videoCodecStatus = VideoCodecStatus.ERROR;
                    this.codec = null;
                    this.f = null;
                    try {
                        if (this.surface != null) {
                            releaseSurface();
                            this.surface = null;
                            this.surfaceTextureHelper.stopListening();
                            this.surfaceTextureHelper.dispose();
                            this.surfaceTextureHelper = null;
                        }
                        synchronized (this.s) {
                            this.t = null;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.s) {
                            this.t = null;
                            throw th2;
                        }
                    }
                }
                RuntimeException runtimeException2 = new RuntimeException(TextUtils.join("\n", this.f.getStackTrace()));
                a("Media decoder release timeout", runtimeException2);
                ErrorCallback errorCallback2 = w;
                if (errorCallback2 != null) {
                    errorCallback2.error(runtimeException2, "hwdec.release.timeout");
                }
                videoCodecStatus = VideoCodecStatus.OK;
                this.codec = null;
                this.f = null;
                try {
                    if (this.surface != null) {
                        releaseSurface();
                        this.surface = null;
                        this.surfaceTextureHelper.stopListening();
                        this.surfaceTextureHelper.dispose();
                        this.surfaceTextureHelper = null;
                    }
                    synchronized (this.s) {
                        this.t = null;
                    }
                } catch (Throwable th3) {
                    synchronized (this.s) {
                        this.t = null;
                        throw th3;
                    }
                }
                return videoCodecStatus;
            } catch (Throwable th4) {
                this.codec = null;
                this.f = null;
                try {
                    if (this.surface != null) {
                        releaseSurface();
                        this.surface = null;
                        this.surfaceTextureHelper.stopListening();
                        this.surfaceTextureHelper.dispose();
                        this.surfaceTextureHelper = null;
                    }
                    synchronized (this.s) {
                        this.t = null;
                        throw th4;
                    }
                } catch (Throwable th5) {
                    synchronized (this.s) {
                        this.t = null;
                        throw th5;
                    }
                }
            }
        }
    }

    public void releaseSurface() {
        this.surface.release();
    }

    public void setNeedsKeyFrame() {
        this.p = true;
    }

    public void shutdown() {
        releaseInternal();
    }

    public final void a(String str, Exception exc) {
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            exc.printStackTrace(printWriter);
            printWriter.close();
            str = str + "\n" + stringWriter.toString();
        }
        this.r.log("AndroidVideoDecoder", str);
    }

    public final void a(int i, MediaCodec.BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        synchronized (this.k) {
            i3 = this.l;
            i4 = this.m;
        }
        if (this.t != null) {
            a("blocking", (Exception) null);
            this.u.block(60L);
        }
        synchronized (this.s) {
            try {
                if (this.t != null) {
                    this.codec.releaseOutputBuffer(i, false);
                    a("false release", (Exception) null);
                    return;
                }
                this.u.close();
                this.surfaceTextureHelper.setTextureSize(i3, i4);
                this.surfaceTextureHelper.setFrameRotation(i2);
                this.t = new e(bufferInfo.presentationTimeUs, num);
                this.codec.releaseOutputBuffer(i, true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(int i, MediaCodec.BufferInfo bufferInfo, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        VideoFrame.I420Buffer i420;
        PatchedDecoder patchedDecoder = this;
        synchronized (patchedDecoder.k) {
            i3 = patchedDecoder.l;
            i4 = patchedDecoder.m;
            i5 = patchedDecoder.n;
            i6 = patchedDecoder.o;
        }
        int i7 = bufferInfo.size;
        if (i7 < ((i3 * i4) * 3) / 2) {
            patchedDecoder.a("Insufficient output buffer size: " + bufferInfo.size, (Exception) null);
            return;
        }
        if (i7 < ((i5 * i4) * 3) / 2 && i6 == i4 && i5 > i3) {
            i5 = (i7 * 2) / (i4 * 3);
        }
        int i8 = i5;
        ByteBuffer byteBuffer = patchedDecoder.codec.getOutputBuffers()[i];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        if (patchedDecoder.e == 19) {
            if (i8 % 2 == 0) {
                int i9 = (i3 + 1) / 2;
                int i10 = i6 % 2;
                int i11 = i10 == 0 ? (i4 + 1) / 2 : i4 / 2;
                int i12 = i8 / 2;
                int i13 = i8 * i6;
                int i14 = i12 * i11;
                int i15 = i13 + i14;
                int b = dq.b(i12, i6, 2, i13);
                int i16 = b + i14;
                i420 = patchedDecoder.allocateI420Buffer(i3, i4);
                slice.limit(i8 * i4);
                slice.position(0);
                patchedDecoder.copyPlane(slice.slice(), i8, i420.getDataY(), i420.getStrideY(), i3, i4);
                slice.limit(i15);
                slice.position(i13);
                copyPlane(slice.slice(), i12, i420.getDataU(), i420.getStrideU(), i9, i11);
                if (i10 == 1) {
                    slice.position(((i11 - 1) * i12) + i13);
                    ByteBuffer dataU = i420.getDataU();
                    dataU.position(i420.getStrideU() * i11);
                    dataU.put(slice);
                }
                slice.limit(i16);
                slice.position(b);
                patchedDecoder = this;
                patchedDecoder.copyPlane(slice.slice(), i12, i420.getDataV(), i420.getStrideV(), i9, i11);
                if (i10 == 1) {
                    slice.position(((i11 - 1) * i12) + b);
                    ByteBuffer dataV = i420.getDataV();
                    dataV.position(i420.getStrideV() * i11);
                    dataV.put(slice);
                }
                z = false;
            } else {
                throw new AssertionError(lhg.a(i8, "Stride is not divisible by two: "));
            }
        } else {
            z = false;
            i420 = new NV12Buffer(i3, i4, i8, i6, slice, null).toI420();
        }
        VideoFrame.I420Buffer i420Buffer = i420;
        patchedDecoder.codec.releaseOutputBuffer(i, z);
        VideoFrame videoFrame = new VideoFrame(i420Buffer, i2, bufferInfo.presentationTimeUs * 1000);
        patchedDecoder.v.onFrame(videoFrame);
        videoFrame.release();
    }

    public final void a(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.g.checkIsOnValidThread();
        a("Decoder format changed: " + mediaFormat.toString(), (Exception) null);
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.k) {
            this.l = integer;
            this.m = integer2;
        }
        if (this.surfaceTextureHelper == null && mediaFormat.containsKey("color-format")) {
            this.e = mediaFormat.getInteger("color-format");
            a("Color: 0x" + Integer.toHexString(this.e), (Exception) null);
        }
        synchronized (this.k) {
            try {
                if (mediaFormat.containsKey("stride")) {
                    this.n = mediaFormat.getInteger("stride");
                }
                if (mediaFormat.containsKey("slice-height")) {
                    this.o = mediaFormat.getInteger("slice-height");
                }
                a("Frame stride and slice height: " + this.n + " x " + this.o, (Exception) null);
                this.n = Math.max(this.l, this.n);
                this.o = Math.max(this.m, this.o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(MediaCodec mediaCodec) {
        this.g.checkIsOnValidThread();
        a("Releasing MediaCodec on output thread", (Exception) null);
        try {
            mediaCodec.stop();
        } catch (Exception e) {
            a("Media decoder stop failed", e);
        }
        try {
            mediaCodec.release();
        } catch (Exception e2) {
            a("Media decoder release failed", e2);
            this.j = e2;
        }
        a("Release on output thread done", (Exception) null);
    }
}
