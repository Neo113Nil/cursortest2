package ru.ok.android.webrtc.protocol.screenshare.send.impl;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.EncoderCallback;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame;
import org.webrtc.VpxEncoderWrapper;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.screenshare.send.ControlThread;
import ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder;
import ru.ok.android.webrtc.rotation.RotationProvider;
import ru.ok.android.webrtc.utils.TimedEvent;
import xsna.cs2;
import xsna.h9p;
import xsna.vv4;
import xsna.wv4;
import xsna.yh9;

/* loaded from: classes9.dex */
public class FrameEncoderImpl implements FrameEncoder, EncoderCallback {
    public final long a;
    public final long b;
    public final ControlThread c;
    public final RTCLog d;
    public final RotationProvider e;
    public volatile VpxEncoderWrapper f;
    public volatile FrameEncoder.Consumer g;
    public volatile FrameEncoder.SenderBackpressure h;
    public volatile long i;
    public final TimedEvent j;
    public final TimedEvent k;
    public final AtomicInteger l;
    public volatile boolean m;
    public volatile long n;

    public FrameEncoderImpl(RTCLog rTCLog, RotationProvider rotationProvider) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = timeUnit.toMillis(5L);
        this.b = timeUnit.toNanos(1L) / 10;
        this.l = new AtomicInteger(0);
        this.d = rTCLog;
        this.e = rotationProvider;
        this.c = new ControlThread("SSFrameEncoder");
        this.j = new TimedEvent(0.3d);
        this.k = new TimedEvent(0.3d);
    }

    public final void a() {
        this.m = false;
        VpxEncoderWrapper vpxEncoderWrapper = this.f;
        if (vpxEncoderWrapper != null) {
            vpxEncoderWrapper.release();
        }
        this.f = null;
    }

    public final /* synthetic */ void b() {
        a();
        this.g = null;
        this.h = null;
    }

    public final /* synthetic */ void c() {
        this.m = true;
        VpxEncoderWrapper vpxEncoderWrapper = new VpxEncoderWrapper();
        vpxEncoderWrapper.setConsumerCallback(this);
        this.f = vpxEncoderWrapper;
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder
    public double droppedFps() {
        return this.k.perSecond();
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder
    public double fps() {
        return this.j.perSecond();
    }

    @Override // org.webrtc.EncoderCallback
    public void onEncodedImage(EncodedImage encodedImage) {
        this.j.fire();
        if (encodedImage.frameType == EncodedImage.FrameType.VideoFrameKey) {
            this.i = SystemClock.elapsedRealtime();
        }
        if (this.g != null) {
            this.g.onEncodedFrame(encodedImage);
        }
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        FrameEncoder.SenderBackpressure senderBackpressure = this.h;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (elapsedRealtimeNanos < this.n + this.b) {
            return;
        }
        if ((senderBackpressure == null || !senderBackpressure.shouldSkipFrame()) && this.l.get() < 5) {
            try {
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                if (i420 == null) {
                    this.d.log("SSFrameEncoder", "toI420 didn't result in valid buffer, skipping");
                    return;
                }
                float rotation = ((videoFrame.getRotation() + 360) + this.e.currentRotation()) % 360.0f;
                this.d.log("SSFrameEncoder", "rotation angle = " + rotation);
                VideoFrame videoFrame2 = new VideoFrame(i420, (int) rotation, videoFrame.getTimestampNs());
                this.n = elapsedRealtimeNanos;
                this.l.incrementAndGet();
                this.c.run(new h9p(this, senderBackpressure, videoFrame2, 1));
            } catch (GlUtil.GlOutOfMemoryException unused) {
                this.d.log("SSFrameEncoder", "gl oom @ toI420, skipping");
            }
        }
    }

    @Override // org.webrtc.EncoderCallback
    public void onFrameDropped(int i) {
        this.k.fire();
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder
    public void release() {
        stopEncoding();
        this.c.close(new yh9(this, 2));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder
    public void setEncodedImageConsumer(FrameEncoder.Consumer consumer) {
        this.c.run(new vv4(4, this, consumer));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder
    public void setSenderBackpressure(FrameEncoder.SenderBackpressure senderBackpressure) {
        this.c.run(new wv4(7, this, senderBackpressure));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder
    public void startEncoding() {
        this.c.run(new io.reactivex.rxjava3.android.a(this, 5));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder
    public void stopEncoding() {
        this.c.run(new cs2(this, 9));
    }

    public final /* synthetic */ void a(FrameEncoder.Consumer consumer) {
        this.g = consumer;
    }

    public final /* synthetic */ void a(FrameEncoder.SenderBackpressure senderBackpressure) {
        this.h = senderBackpressure;
    }

    public final /* synthetic */ void a(FrameEncoder.SenderBackpressure senderBackpressure, VideoFrame videoFrame) {
        if (this.m) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = elapsedRealtime <= this.i + this.a ? senderBackpressure != null && senderBackpressure.needsKeyFrame() : true;
            if (z) {
                this.i = elapsedRealtime;
            }
            VpxEncoderWrapper vpxEncoderWrapper = this.f;
            if (vpxEncoderWrapper != null) {
                vpxEncoderWrapper.encode(videoFrame, z);
            }
        }
        this.l.decrementAndGet();
        try {
            videoFrame.release();
        } catch (Throwable th) {
            this.d.reportException("SSFrameEncoder", "Error on release frame", th);
        }
    }
}
