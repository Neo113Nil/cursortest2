package xsna;

import xsna.tlo0;

/* compiled from: SmartCropScreenViewState.kt */
/* loaded from: classes7.dex */
public final class j5k0 implements lm50 {
    public final y4k0 b;
    public final xrp0 c;
    public final boolean d;
    public final tlo0.f e;
    public final d3e0 f;
    public final vh8 g;
    public final boolean h;
    public final m5k0 i;

    public j5k0(y4k0 y4k0Var, xrp0 xrp0Var, boolean z, tlo0.f fVar, d3e0 d3e0Var, vh8 vh8Var, boolean z2, m5k0 m5k0Var) {
        this.b = y4k0Var;
        this.c = xrp0Var;
        this.d = z;
        this.e = fVar;
        this.f = d3e0Var;
        this.g = vh8Var;
        this.h = z2;
        this.i = m5k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5k0)) {
            return false;
        }
        j5k0 j5k0Var = (j5k0) obj;
        return this.b.equals(j5k0Var.b) && this.c.equals(j5k0Var.c) && this.d == j5k0Var.d && this.e.equals(j5k0Var.e) && epx.f(this.f, j5k0Var.f) && epx.f(this.g, j5k0Var.g) && this.h == j5k0Var.h && epx.f(this.i, j5k0Var.i);
    }

    public final int hashCode() {
        int a = shy.a(this.e.a, qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31);
        d3e0 d3e0Var = this.f;
        int hashCode = (a + (d3e0Var == null ? 0 : d3e0Var.hashCode())) * 31;
        vh8 vh8Var = this.g;
        int b = qoy.b((hashCode + (vh8Var == null ? 0 : vh8Var.hashCode())) * 31, 31, this.h);
        m5k0 m5k0Var = this.i;
        return b + (m5k0Var != null ? m5k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCropScreenViewState(player=" + this.b + ", trimmer=" + this.c + ", isSmartCropSwitchChecked=" + this.d + ", bottomBarButtonText=" + this.e + ", progressModal=" + this.f + ", abortConfirmDialog=" + this.g + ", isExitConfirmDialogVisible=" + this.h + ", snackbar=" + this.i + ')';
    }
}
