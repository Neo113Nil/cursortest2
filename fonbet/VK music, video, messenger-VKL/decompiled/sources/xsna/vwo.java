package xsna;

import java.nio.ByteBuffer;

/* compiled from: EchoResponsePacketHeader.java */
/* loaded from: classes8.dex */
public final class vwo extends g890 {
    public final int c;
    public final int d;

    public vwo(int i, int i2) {
        super(3);
        this.c = i;
        this.d = i2;
    }

    @Override // xsna.g890
    public final int a() {
        return 11;
    }

    @Override // xsna.g890
    public final void b(int i) {
        this.b = i + 8;
    }

    @Override // xsna.g890
    public final void c(ByteBuffer byteBuffer) {
        super.c(byteBuffer);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.d);
    }
}
