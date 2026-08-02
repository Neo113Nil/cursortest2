package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: ScrollableArea.kt */
/* loaded from: classes11.dex */
public final class ygh0 extends ytl implements nvi, hr70 {
    public htl A;
    public f490 B;
    public e490 C;
    public boolean D;
    public khh0 r;
    public Orientation s;
    public boolean t;
    public tpr u;
    public sg50 v;
    public fd8 w;
    public boolean x;
    public e490 y;
    public androidx.compose.foundation.gestures.l z;

    @Override // xsna.hr70
    public final void D1() {
        f490 f490Var = (f490) ovi.a(this, g490.a);
        if (epx.f(f490Var, this.B)) {
            return;
        }
        this.B = f490Var;
        this.C = null;
        htl htlVar = this.A;
        if (htlVar != null) {
            j2(htlVar);
        }
        this.A = null;
        l2();
        androidx.compose.foundation.gestures.l lVar = this.z;
        if (lVar != null) {
            khh0 khh0Var = this.r;
            Orientation orientation = this.s;
            e490 e490Var = this.x ? this.C : this.y;
            lVar.D2(orientation, this.w, this.u, this.v, e490Var, khh0Var, this.t, this.D);
        }
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void a2() {
        this.D = m2();
        l2();
        if (this.z == null) {
            khh0 khh0Var = this.r;
            e490 e490Var = this.x ? this.C : this.y;
            tpr tprVar = this.u;
            androidx.compose.foundation.gestures.l lVar = new androidx.compose.foundation.gestures.l(this.s, this.w, tprVar, this.v, e490Var, khh0Var, this.t, this.D);
            i2(lVar);
            this.z = lVar;
        }
    }

    @Override // xsna.q630.c
    public final void b2() {
        htl htlVar = this.A;
        if (htlVar != null) {
            j2(htlVar);
        }
    }

    public final void l2() {
        htl htlVar = this.A;
        if (htlVar != null) {
            if (htlVar.z().o) {
                return;
            }
            i2(htlVar);
            return;
        }
        if (this.x) {
            ir70.a(this, new b1z(this, 23));
        }
        e490 e490Var = this.x ? this.C : this.y;
        if (e490Var != null) {
            htl z = e490Var.z();
            if (z.z().o) {
                return;
            }
            i2(z);
            this.A = z;
        }
    }

    public final boolean m2() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (this.o) {
            layoutDirection = itl.f(this).A;
        }
        return layoutDirection != LayoutDirection.Rtl || this.s == Orientation.Vertical;
    }

    public final void n2(Orientation orientation, fd8 fd8Var, tpr tprVar, sg50 sg50Var, e490 e490Var, khh0 khh0Var, boolean z, boolean z2) {
        boolean z3;
        this.r = khh0Var;
        this.s = orientation;
        boolean z4 = true;
        if (this.x != z) {
            this.x = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (epx.f(this.y, e490Var)) {
            z4 = false;
        } else {
            this.y = e490Var;
        }
        if (z3 || (z4 && !z)) {
            htl htlVar = this.A;
            if (htlVar != null) {
                j2(htlVar);
            }
            this.A = null;
            l2();
        }
        this.t = z2;
        this.u = tprVar;
        this.v = sg50Var;
        this.w = fd8Var;
        boolean m2 = m2();
        this.D = m2;
        androidx.compose.foundation.gestures.l lVar = this.z;
        if (lVar != null) {
            lVar.D2(orientation, fd8Var, tprVar, sg50Var, this.x ? this.C : this.y, khh0Var, z2, m2);
        }
    }

    @Override // xsna.htl
    public final void y1() {
        boolean m2 = m2();
        if (this.D != m2) {
            this.D = m2;
            khh0 khh0Var = this.r;
            Orientation orientation = this.s;
            boolean z = this.x;
            e490 e490Var = z ? this.C : this.y;
            n2(orientation, this.w, this.u, this.v, e490Var, khh0Var, z, this.t);
        }
    }
}
