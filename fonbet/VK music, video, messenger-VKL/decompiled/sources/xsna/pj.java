package xsna;

import java.nio.ByteBuffer;

/* compiled from: AcceptPacketHeader.java */
/* loaded from: classes8.dex */
public final class pj extends g890 {
    @Override // xsna.g890
    public final int a() {
        return 4;
    }

    @Override // xsna.g890
    public final void b(int i) {
        this.b = i + 1;
    }

    @Override // xsna.g890
    public final void c(ByteBuffer byteBuffer) {
        super.c(byteBuffer);
        byteBuffer.put((byte) 0);
    }
}
