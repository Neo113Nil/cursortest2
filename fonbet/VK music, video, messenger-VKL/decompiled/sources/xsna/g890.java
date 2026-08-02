package xsna;

import java.nio.ByteBuffer;

/* compiled from: PacketHeaderBase.java */
/* loaded from: classes8.dex */
public class g890 {
    public final int a;
    public int b;

    public g890(int i) {
        this.a = i;
    }

    public int a() {
        throw null;
    }

    public void b(int i) {
        throw null;
    }

    public void c(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) this.a);
        byteBuffer.putShort((short) this.b);
    }
}
