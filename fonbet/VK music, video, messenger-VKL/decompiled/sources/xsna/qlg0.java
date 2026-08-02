package xsna;

import java.nio.ByteBuffer;

/* compiled from: RollRecoveryEntry.java */
/* loaded from: classes13.dex */
public final class qlg0 extends vju {
    public short a;

    @Override // xsna.vju
    public final ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort(this.a);
        allocate.rewind();
        return allocate;
    }

    @Override // xsna.vju
    public final String b() {
        return "roll";
    }

    @Override // xsna.vju
    public final void c(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getShort();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && qlg0.class == obj.getClass() && this.a == ((qlg0) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
