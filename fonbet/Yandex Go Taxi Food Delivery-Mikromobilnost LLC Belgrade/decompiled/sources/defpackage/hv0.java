package defpackage;

/* loaded from: classes5.dex */
public final class hv0 {
    public final CharSequence a;
    public final CharSequence b;

    public /* synthetic */ hv0(String str, int i) {
        this((i & 2) != 0 ? "" : str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv0)) {
            return false;
        }
        hv0 hv0Var = (hv0) obj;
        return jl40.l(this.a, hv0Var.a) && jl40.l(this.b, hv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public hv0(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public hv0() {
        this((String) null, 3);
    }
}
