package defpackage;

/* loaded from: classes6.dex */
public final class cw70 {
    public final String a;
    public final String b;

    public /* synthetic */ cw70(String str, int i) {
        this((i & 1) != 0 ? "" : str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw70)) {
            return false;
        }
        cw70 cw70Var = (cw70) obj;
        return jl40.l(this.a, cw70Var.a) && jl40.l(this.b, cw70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public cw70() {
        this((String) null, 3);
    }

    public cw70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
