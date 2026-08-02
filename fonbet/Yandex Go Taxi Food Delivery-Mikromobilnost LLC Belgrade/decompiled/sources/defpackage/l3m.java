package defpackage;

/* loaded from: classes9.dex */
public final class l3m extends mzl {
    public final String a;

    public l3m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l3m)) {
            return false;
        }
        return jl40.l(this.a, ((l3m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
