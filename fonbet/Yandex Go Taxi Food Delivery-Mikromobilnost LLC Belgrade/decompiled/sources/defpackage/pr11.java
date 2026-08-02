package defpackage;

/* loaded from: classes9.dex */
public final class pr11 implements Comparable {
    public final short a;

    public /* synthetic */ pr11(short s) {
        this.a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return jl40.q(this.a & 65535, ((pr11) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pr11) {
            return this.a == ((pr11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
