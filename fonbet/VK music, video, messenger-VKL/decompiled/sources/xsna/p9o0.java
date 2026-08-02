package xsna;

import java.nio.ByteBuffer;

/* compiled from: TemporalLevelEntry.java */
/* loaded from: classes13.dex */
public final class p9o0 extends vju {
    public boolean a;

    @Override // xsna.vju
    public final ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) (this.a ? 128 : 0));
        allocate.rewind();
        return allocate;
    }

    @Override // xsna.vju
    public final String b() {
        return "tele";
    }

    @Override // xsna.vju
    public final void c(ByteBuffer byteBuffer) {
        this.a = (byteBuffer.get() & 128) == 128;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p9o0.class == obj.getClass() && this.a == ((p9o0) obj).a;
    }

    public final int hashCode() {
        return (this.a ? 1 : 0) * 31;
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("TemporalLevelEntry{levelIndependentlyDecodable="), this.a, '}');
    }
}
