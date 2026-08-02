package xsna;

import java.net.DatagramPacket;
import java.nio.ByteBuffer;
import java.time.Instant;

/* compiled from: RawPacket.java */
/* loaded from: classes8.dex */
public final class imy0 {
    public final Instant a;
    public final ByteBuffer b;

    public imy0(DatagramPacket datagramPacket, Instant instant) {
        this.a = instant;
        this.b = ByteBuffer.wrap(datagramPacket.getData(), 0, datagramPacket.getLength());
    }
}
