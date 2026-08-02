package defpackage;

/* loaded from: classes2.dex */
public final class cg20 {
    public final CharSequence a;
    public final m8s b;

    public cg20(CharSequence charSequence, m8s m8sVar) {
        this.a = charSequence;
        this.b = m8sVar;
    }

    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg20)) {
            return false;
        }
        cg20 cg20Var = (cg20) obj;
        return jl40.l(this.b, cg20Var.b) && jl40.l(this.a.toString(), cg20Var.a.toString());
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
