package xsna;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class vsa {
    public final dt1 a;
    public final izs<q9x, q9x> b;
    public final phr<q9x> c;
    public final boolean d;

    public vsa(dt1 dt1Var, phr phrVar, izs izsVar, boolean z) {
        this.a = dt1Var;
        this.b = izsVar;
        this.c = phrVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsa)) {
            return false;
        }
        vsa vsaVar = (vsa) obj;
        return epx.f(this.a, vsaVar.a) && epx.f(this.b, vsaVar.b) && epx.f(this.c, vsaVar.c) && this.d == vsaVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + dq.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", animationSpec=");
        sb.append(this.c);
        sb.append(", clip=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
