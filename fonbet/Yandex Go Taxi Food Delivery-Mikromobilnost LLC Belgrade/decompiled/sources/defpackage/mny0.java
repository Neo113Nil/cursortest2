package defpackage;

/* loaded from: classes10.dex */
public final class mny0 extends ulb1 {
    public final it1 b = x4c.G;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mny0)) {
            return false;
        }
        return jl40.l(this.b, ((mny0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Above(alignment=" + this.b + ')';
    }
}
