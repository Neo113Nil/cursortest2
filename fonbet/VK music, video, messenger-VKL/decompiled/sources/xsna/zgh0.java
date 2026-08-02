package xsna;

import androidx.compose.foundation.gestures.Orientation;

/* compiled from: Scrollable.kt */
/* loaded from: classes11.dex */
final class zgh0 extends d730<androidx.compose.foundation.gestures.l> {
    public final khh0 a;
    public final Orientation b;
    public final boolean c;
    public final boolean d;
    public final tpr e;
    public final sg50 f;

    public zgh0(khh0 khh0Var, Orientation orientation, boolean z, boolean z2, tpr tprVar, sg50 sg50Var) {
        this.a = khh0Var;
        this.b = orientation;
        this.c = z;
        this.d = z2;
        this.e = tprVar;
        this.f = sg50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgh0)) {
            return false;
        }
        zgh0 zgh0Var = (zgh0) obj;
        return epx.f(this.a, zgh0Var.a) && this.b == zgh0Var.b && this.c == zgh0Var.c && this.d == zgh0Var.d && epx.f(this.e, zgh0Var.e) && epx.f(this.f, zgh0Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 31, this.d);
        tpr tprVar = this.e;
        int hashCode = (b + (tprVar != null ? tprVar.hashCode() : 0)) * 31;
        sg50 sg50Var = this.f;
        return (hashCode + (sg50Var != null ? sg50Var.hashCode() : 0)) * 31;
    }

    @Override // xsna.d730
    public final androidx.compose.foundation.gestures.l r() {
        return new androidx.compose.foundation.gestures.l(this.b, null, this.e, this.f, null, this.a, this.c, this.d);
    }

    @Override // xsna.d730
    public final void s(androidx.compose.foundation.gestures.l lVar) {
        lVar.D2(this.b, null, this.e, this.f, null, this.a, this.c, this.d);
    }
}
