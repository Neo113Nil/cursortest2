package xsna;

import java.nio.ByteBuffer;

/* compiled from: VisualRandomAccessEntry.java */
/* loaded from: classes13.dex */
public final class z5u0 extends vju {
    public boolean a;
    public short b;

    @Override // xsna.vju
    public final ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((this.a ? 128 : 0) | (this.b & 127)));
        allocate.rewind();
        return allocate;
    }

    @Override // xsna.vju
    public final String b() {
        return "rap ";
    }

    @Override // xsna.vju
    public final void c(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        this.a = (b & 128) == 128;
        this.b = (short) (b & Byte.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z5u0.class != obj.getClass()) {
            return false;
        }
        z5u0 z5u0Var = (z5u0) obj;
        return this.b == z5u0Var.b && this.a == z5u0Var.a;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisualRandomAccessEntry{numLeadingSamplesKnown=");
        sb.append(this.a);
        sb.append(", numLeadingSamples=");
        return vu5.b(sb, this.b, '}');
    }
}
