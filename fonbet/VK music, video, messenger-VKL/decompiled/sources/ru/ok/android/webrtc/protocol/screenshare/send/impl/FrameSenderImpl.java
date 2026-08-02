package ru.ok.android.webrtc.protocol.screenshare.send.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.EncodedImage;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.screenshare.send.DataChannelSendCommand;
import ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder;
import ru.ok.android.webrtc.protocol.screenshare.send.FrameSender;
import ru.ok.android.webrtc.utils.TimedEvent;

/* loaded from: classes9.dex */
public class FrameSenderImpl implements FrameSender, FrameEncoder.SenderBackpressure, RtcTransport.BufferedAmountChangeListener, RtcTransport.DataListener {
    public volatile boolean a;
    public volatile RtcTransport b;
    public final ConcurrentLinkedQueue c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e;
    public final TimedEvent f;
    public volatile a g;
    public volatile boolean h;

    public FrameSenderImpl() {
        new AtomicLong();
        this.e = new AtomicInteger();
        this.c = new ConcurrentLinkedQueue();
        this.f = new TimedEvent(0.3d);
    }

    public final synchronized void a(boolean z) {
        try {
            if (this.a) {
                this.a = false;
                a aVar = this.g;
                if (aVar != null) {
                    aVar.d = true;
                    if (z) {
                        aVar.a();
                    }
                }
                a(aVar);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    EncodedImage encodedImage = (EncodedImage) it.next();
                    this.d.addAndGet(-encodedImage.buffer.remaining());
                    encodedImage.release();
                    it.remove();
                }
            }
        } finally {
        }
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameSender
    public double fps() {
        return this.f.perSecond();
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder.SenderBackpressure
    public boolean needsKeyFrame() {
        boolean z = this.h;
        this.h = false;
        return z;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport.BufferedAmountChangeListener
    public void onBufferedAmountChange(@NonNull RtcTransport rtcTransport, long j) {
        if (rtcTransport != this.b) {
            return;
        }
        a(this.g);
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder.Consumer
    public void onEncodedFrame(EncodedImage encodedImage) {
        if (!this.a) {
            encodedImage.release();
            return;
        }
        if (encodedImage.frameType == EncodedImage.FrameType.VideoFrameKey) {
            this.h = false;
        }
        this.c.add(encodedImage);
        this.d.addAndGet(encodedImage.buffer.remaining());
        a(this.g);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport.DataListener
    public void onReceive(@NonNull RtcTransport rtcTransport, @NonNull byte[] bArr, @NonNull RtcFormat rtcFormat) {
        if (new DataChannelSendCommand(bArr).isKeyFrameRequest()) {
            this.h = true;
        }
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameSender
    public void release() {
        stopSending();
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameSender
    public synchronized void setTransport(RtcTransport rtcTransport) {
        try {
            if (this.b != null) {
                this.b.removeBufferedAmountChangeListener(this);
                this.b.removeDataListener(this);
            }
            a(true);
            this.b = rtcTransport;
            if (this.b != null) {
                this.b.addBufferedAmountChangeListener(this);
                this.b.addDataListener(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder.SenderBackpressure
    public boolean shouldSkipFrame() {
        return this.c.size() > 15 || this.d.get() > 4000000;
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameSender
    public synchronized void startSending() {
        a(true);
        this.a = true;
        a aVar = new a(this, this.b);
        this.g = aVar;
        aVar.start();
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameSender
    public void stopSending() {
        a(false);
    }

    public static void a(a aVar) {
        if (aVar != null) {
            synchronized (aVar.a) {
                aVar.a.notify();
            }
        }
    }
}
