package xsna;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: ScrollableArea.kt */
/* loaded from: classes11.dex */
final class xgh0 extends d730<ygh0> {
    public final khh0 a;
    public final Orientation b;
    public final boolean c;
    public final tpr d;
    public final sg50 e;
    public final fd8 f;
    public final boolean g;
    public final e490 h;

    public xgh0(Orientation orientation, fd8 fd8Var, tpr tprVar, sg50 sg50Var, e490 e490Var, khh0 khh0Var, boolean z, boolean z2) {
        this.a = khh0Var;
        this.b = orientation;
        this.c = z;
        this.d = tprVar;
        this.e = sg50Var;
        this.f = fd8Var;
        this.g = z2;
        this.h = e490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xgh0.class != obj.getClass()) {
            return false;
        }
        xgh0 xgh0Var = (xgh0) obj;
        return epx.f(this.a, xgh0Var.a) && this.b == xgh0Var.b && this.c == xgh0Var.c && epx.f(this.d, xgh0Var.d) && epx.f(this.e, xgh0Var.e) && epx.f(this.f, xgh0Var.f) && this.g == xgh0Var.g && epx.f(this.h, xgh0Var.h);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        tpr tprVar = this.d;
        int hashCode = (b + (tprVar != null ? tprVar.hashCode() : 0)) * 31;
        sg50 sg50Var = this.e;
        int hashCode2 = (hashCode + (sg50Var != null ? sg50Var.hashCode() : 0)) * 31;
        fd8 fd8Var = this.f;
        int b2 = qoy.b((hashCode2 + (fd8Var != null ? fd8Var.hashCode() : 0)) * 31, 31, this.g);
        e490 e490Var = this.h;
        return b2 + (e490Var != null ? e490Var.hashCode() : 0);
    }

    @Override // xsna.d730
    public final ygh0 r() {
        ygh0 ygh0Var = new ygh0();
        ygh0Var.r = this.a;
        ygh0Var.s = this.b;
        ygh0Var.t = this.c;
        ygh0Var.u = this.d;
        ygh0Var.v = this.e;
        ygh0Var.w = this.f;
        ygh0Var.x = this.g;
        ygh0Var.y = this.h;
        return ygh0Var;
    }

    @Override // xsna.d730
    public final void s(ygh0 ygh0Var) {
        sg50 sg50Var = this.e;
        ygh0Var.n2(this.b, this.f, this.d, sg50Var, this.h, this.a, this.g, this.c);
    }
}
