package defpackage;

/* loaded from: classes9.dex */
public final class k3m extends mzl {
    public final String a;

    public k3m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k3m)) {
            return false;
        }
        return jl40.l(this.a, ((k3m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
