package xsna;

import java.nio.ByteBuffer;

/* compiled from: ClosePacketHeader.java */
/* loaded from: classes8.dex */
public final class lvf extends g890 {
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
        byteBuffer.putInt(0);
    }
}
