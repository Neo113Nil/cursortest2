package xsna;

import java.nio.ByteBuffer;

/* compiled from: SequenceNumberPacketHeader.java */
/* loaded from: classes8.dex */
public final class zki0 extends g890 {
    public final int c;

    public zki0(int i) {
        super(9);
        this.c = i;
    }

    @Override // xsna.g890
    public final int a() {
        return 7;
    }

    @Override // xsna.g890
    public final void b(int i) {
        this.b = i + 4;
    }

    @Override // xsna.g890
    public final void c(ByteBuffer byteBuffer) {
        super.c(byteBuffer);
        byteBuffer.putInt(this.c);
    }
}
