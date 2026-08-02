package xsna;

import xsna.tlo0;

/* compiled from: SearchAddressErrorViewState.kt */
/* loaded from: classes18.dex */
public final class cmh0 {
    public final sqh0 a;
    public final tlo0.f b;
    public final tlo0.f c;
    public final rqh0 d;

    public cmh0(sqh0 sqh0Var, tlo0.f fVar, tlo0.f fVar2, rqh0 rqh0Var) {
        this.a = sqh0Var;
        this.b = fVar;
        this.c = fVar2;
        this.d = rqh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmh0)) {
            return false;
        }
        cmh0 cmh0Var = (cmh0) obj;
        return epx.f(this.a, cmh0Var.a) && this.b.equals(cmh0Var.b) && this.c.equals(cmh0Var.c) && epx.f(this.d, cmh0Var.d);
    }

    public final int hashCode() {
        sqh0 sqh0Var = this.a;
        int a = shy.a(this.c.a, shy.a(this.b.a, (sqh0Var == null ? 0 : sqh0Var.hashCode()) * 31, 31), 31);
        rqh0 rqh0Var = this.d;
        return a + (rqh0Var != null ? rqh0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SearchAddressErrorViewState(icon=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", button=" + this.d + ')';
    }
}
