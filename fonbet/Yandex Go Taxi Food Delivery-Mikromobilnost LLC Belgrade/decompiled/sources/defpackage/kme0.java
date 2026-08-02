package defpackage;

/* loaded from: classes.dex */
public final class kme0 {
    public final String a;

    public kme0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kme0)) {
            return false;
        }
        return jl40.l(this.a, ((kme0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
