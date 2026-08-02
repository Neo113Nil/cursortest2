package ru.ok.android.webrtc.protocol.screenshare.recv;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.JniCommon;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxDecoderWrapper;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.screenshare.Codec;
import ru.ok.android.webrtc.protocol.screenshare.DataChannelUtils;
import xsna.h5z0;
import xsna.ji;
import xsna.q86;

/* loaded from: classes9.dex */
class DecoderWrapper$VpxDecoder implements h5z0, VideoSink, VpxDecoderWrapper.ErrorCallback {
    public final DecoderWrapper$DecodedFrameCallback b;
    public final RTCLog c;
    public final HandlerThread d;
    public final Handler e;
    public final Codec f;
    public final /* synthetic */ c o;
    public volatile boolean g = false;
    public volatile boolean h = false;
    public volatile boolean i = true;
    public final AtomicInteger j = new AtomicInteger(0);
    public final AtomicInteger k = new AtomicInteger(0);
    public final AtomicInteger l = new AtomicInteger(-1);
    public final AtomicInteger m = new AtomicInteger(-1);
    public final AtomicInteger n = new AtomicInteger(-1);
    public final VpxDecoderWrapper a = new VpxDecoderWrapper();

    public DecoderWrapper$VpxDecoder(c cVar, final Codec codec, DecoderWrapper$DecodedFrameCallback decoderWrapper$DecodedFrameCallback, RTCLog rTCLog) {
        this.o = cVar;
        this.b = decoderWrapper$DecodedFrameCallback;
        this.c = rTCLog;
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperVpxQueue");
        this.d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.e = handler;
        this.f = codec;
        handler.post(new Runnable() { // from class: ru.ok.android.webrtc.protocol.screenshare.recv.h
            @Override // java.lang.Runnable
            public final void run() {
                DecoderWrapper$VpxDecoder.this.a(codec);
            }
        });
    }

    public final /* synthetic */ void a(Codec codec) {
        this.a.init(VpxDecoderWrapper.DecoderKind.values()[codec.ordinal()]);
        this.a.setFrameHandler(this);
        this.a.setErrorCallback(this);
        this.a.setDesiredFps(10);
    }

    @Override // xsna.h5z0
    public String codec() {
        return this.f.name();
    }

    @Override // xsna.h5z0
    public int frameHeight() {
        return this.n.get();
    }

    @Override // xsna.h5z0
    public int frameWidth() {
        return this.m.get();
    }

    @Override // xsna.h5z0
    public void handleFrameDropStarted() {
        this.i = true;
        this.l.set(this.k.get());
    }

    @Override // xsna.h5z0
    @Nullable
    public String implName() {
        return "libvpx";
    }

    @Override // xsna.h5z0
    public boolean isReleased() {
        return this.h;
    }

    @Override // org.webrtc.VpxDecoderWrapper.ErrorCallback
    public void onDecodeError(int i) {
        RTCLog rTCLog = this.c;
        StringBuilder b = ji.b(i, "onDecodeError vpx_error_code:", " System.identityHashCode: ");
        b.append(System.identityHashCode(this));
        rTCLog.log("DecoderWrapper", b.toString());
        this.o.y.fire();
        this.o.u.incrementAndGet();
        handleFrameDropStarted();
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.g) {
            return;
        }
        this.o.t.incrementAndGet();
        this.o.x.fire();
        if (SystemClock.elapsedRealtimeNanos() > c.E) {
            this.b.deliver(videoFrame);
        }
        this.m.set(videoFrame.getRotatedWidth());
        this.n.set(videoFrame.getRotatedHeight());
    }

    @Override // xsna.h5z0
    public void release() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.c.log("DecoderWrapper", "releasing decoder " + System.identityHashCode(this));
        HandlerThread handlerThread = this.d;
        Handler handler = this.o.e;
        VpxDecoderWrapper vpxDecoderWrapper = this.a;
        Objects.requireNonNull(vpxDecoderWrapper);
        DataChannelUtils.releaseHandlerThread(handlerThread, handler, new q86(vpxDecoderWrapper, 5));
        this.h = true;
    }

    @Override // xsna.h5z0
    public void submitFrame(final EncodedImage encodedImage) {
        boolean z = encodedImage.frameType == EncodedImage.FrameType.VideoFrameKey;
        if (this.i && !z) {
            this.o.s.incrementAndGet();
            c cVar = this.o;
            ByteBuffer byteBuffer = encodedImage.buffer;
            cVar.z.decrementAndGet();
            byteBuffer.rewind();
            cVar.A.addAndGet(-byteBuffer.capacity());
            JniCommon.nativeFreeByteBuffer(byteBuffer);
            return;
        }
        int i = this.j.get();
        if (i <= 30 && (i <= 25 || z)) {
            this.i = false;
            if (z) {
                this.k.incrementAndGet();
            }
            final int i2 = this.k.get();
            this.j.incrementAndGet();
            this.e.post(new Runnable() { // from class: ru.ok.android.webrtc.protocol.screenshare.recv.i
                @Override // java.lang.Runnable
                public final void run() {
                    DecoderWrapper$VpxDecoder.this.a(encodedImage, i2);
                }
            });
            return;
        }
        this.o.s.incrementAndGet();
        c cVar2 = this.o;
        ByteBuffer byteBuffer2 = encodedImage.buffer;
        cVar2.z.decrementAndGet();
        byteBuffer2.rewind();
        cVar2.A.addAndGet(-byteBuffer2.capacity());
        JniCommon.nativeFreeByteBuffer(byteBuffer2);
        handleFrameDropStarted();
    }

    public final void a(EncodedImage encodedImage, int i) {
        this.j.decrementAndGet();
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (i > this.l.get()) {
            this.a.decode(byteBuffer);
        }
        c cVar = this.o;
        cVar.z.decrementAndGet();
        byteBuffer.rewind();
        cVar.A.addAndGet(-byteBuffer.capacity());
        JniCommon.nativeFreeByteBuffer(byteBuffer);
    }
}
