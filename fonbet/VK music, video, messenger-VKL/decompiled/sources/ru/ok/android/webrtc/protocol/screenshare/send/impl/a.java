package ru.ok.android.webrtc.protocol.screenshare.send.impl;

import java.nio.ByteBuffer;
import org.webrtc.EncodedImage;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.screenshare.Codec;
import ru.ok.android.webrtc.protocol.screenshare.send.DataChannelSendPacket;

/* loaded from: classes9.dex */
public final class a extends Thread {
    public final Object a = new Object();
    public final Object b = new Object();
    public RtcTransport c;
    public volatile boolean d;
    public ByteBuffer e;
    public EncodedImage f;
    public final /* synthetic */ FrameSenderImpl g;

    public a(FrameSenderImpl frameSenderImpl, RtcTransport rtcTransport) {
        this.g = frameSenderImpl;
        this.c = rtcTransport;
        setName("SSFrameSender");
    }

    public final void a() {
        synchronized (this.b) {
            this.c = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0126, code lost:
    
        r20.d = true;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long bufferedAmount;
        long bufferedAmount2;
        boolean z;
        boolean z2;
        loop0: while (true) {
            if (!this.d || this.f != null) {
                synchronized (this.b) {
                    try {
                        RtcTransport rtcTransport = this.c;
                        bufferedAmount = rtcTransport != null ? rtcTransport.bufferedAmount() : 0L;
                    } finally {
                    }
                }
                while (true) {
                    if ((!this.d || this.f != null) && (bufferedAmount >= 8000000 || (this.f == null && this.g.c.isEmpty()))) {
                        synchronized (this.a) {
                            try {
                                this.a.wait(50L);
                            } catch (InterruptedException unused) {
                            }
                        }
                        synchronized (this.b) {
                            try {
                                RtcTransport rtcTransport2 = this.c;
                                if (rtcTransport2 == null) {
                                    break loop0;
                                } else {
                                    bufferedAmount2 = rtcTransport2.bufferedAmount();
                                }
                            } finally {
                            }
                        }
                        break loop0;
                    }
                    bufferedAmount = bufferedAmount2;
                }
                if (this.d && this.f == null) {
                    break;
                }
                boolean z3 = false;
                if (this.f == null) {
                    EncodedImage encodedImage = (EncodedImage) this.g.c.poll();
                    this.f = encodedImage;
                    if (encodedImage == null) {
                        continue;
                    } else {
                        this.e = encodedImage.buffer;
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (8000000 - bufferedAmount < 4000) {
                    continue;
                } else {
                    long min = Math.min(7999989 - bufferedAmount, 8000L);
                    if (min >= this.e.remaining()) {
                        min = this.e.remaining();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ByteBuffer slice = this.e.slice();
                    slice.limit((int) min);
                    this.e.position((int) (r6.position() + min));
                    DataChannelSendPacket dataChannelSendPacket = new DataChannelSendPacket(this.g.e.incrementAndGet(), System.currentTimeMillis(), Codec.VP9, 0, z, z2, this.f.frameType == EncodedImage.FrameType.VideoFrameKey, false, slice);
                    synchronized (this.b) {
                        try {
                            RtcTransport rtcTransport3 = this.c;
                            if (rtcTransport3 != null) {
                                rtcTransport3.send(RtcFormat.BINARY, dataChannelSendPacket.header(), dataChannelSendPacket.getPayload());
                            } else {
                                z3 = true;
                            }
                        } finally {
                        }
                    }
                    this.g.d.addAndGet((int) (-min));
                    if (z3) {
                        this.d = true;
                        break;
                    } else if (z2) {
                        this.g.f.fire();
                        EncodedImage encodedImage2 = this.f;
                        if (encodedImage2 != null) {
                            encodedImage2.release();
                        }
                        this.f = null;
                        this.e = null;
                    }
                }
            } else {
                break;
            }
        }
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    this.c.send(RtcFormat.BINARY, new DataChannelSendPacket(this.g.e.incrementAndGet(), System.currentTimeMillis(), Codec.VP9, 0, true, true, false, true, null).header());
                }
            } finally {
            }
        }
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            this.g.d.addAndGet(-byteBuffer.remaining());
        }
        EncodedImage encodedImage3 = this.f;
        if (encodedImage3 != null) {
            encodedImage3.release();
        }
        this.f = null;
        this.e = null;
    }
}
