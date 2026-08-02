package defpackage;

/* loaded from: classes14.dex */
public final class hox0 {
    public final String a;
    public final boolean b;

    public hox0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hox0)) {
            return false;
        }
        hox0 hox0Var = (hox0) obj;
        return jl40.l(this.a, hox0Var.a) && this.b == hox0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
