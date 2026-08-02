package xsna;

import java.nio.ByteBuffer;

/* compiled from: UnknownEntry.java */
/* loaded from: classes13.dex */
public final class m4q0 extends vju {
    public ByteBuffer a;
    public String b;

    @Override // xsna.vju
    public final ByteBuffer a() {
        return this.a.duplicate();
    }

    @Override // xsna.vju
    public final String b() {
        return this.b;
    }

    @Override // xsna.vju
    public final void c(ByteBuffer byteBuffer) {
        this.a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m4q0.class != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.a;
        ByteBuffer byteBuffer2 = ((m4q0) obj).a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public final String toString() {
        ByteBuffer duplicate = this.a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return "UnknownEntry{content=" + skd.c(0, bArr) + '}';
    }
}
