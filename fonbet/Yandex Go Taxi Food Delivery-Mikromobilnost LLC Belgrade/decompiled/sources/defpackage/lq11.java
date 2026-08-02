package defpackage;

/* loaded from: classes9.dex */
public final class lq11 implements Comparable {
    public final byte a;

    public /* synthetic */ lq11(byte b) {
        this.a = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return jl40.q(this.a & 255, ((lq11) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lq11) {
            return this.a == ((lq11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
