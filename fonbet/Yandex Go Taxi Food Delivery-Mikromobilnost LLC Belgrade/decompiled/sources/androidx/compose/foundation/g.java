package androidx.compose.foundation;

import androidx.compose.ui.node.s;
import androidx.compose.ui.node.u;
import defpackage.ag;
import defpackage.aur;
import defpackage.ay40;
import defpackage.bdp;
import defpackage.dai0;
import defpackage.dd11;
import defpackage.dr60;
import defpackage.ejt;
import defpackage.fud;
import defpackage.g8w;
import defpackage.gnq0;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.l8x;
import defpackage.lqh;
import defpackage.lvr;
import defpackage.mnq0;
import defpackage.omy0;
import defpackage.seu;
import defpackage.sxo;
import defpackage.tje;
import defpackage.tls;
import defpackage.vvr;
import defpackage.y5y;
import defpackage.zoy0;
import defpackage.ztr;
import defpackage.zx40;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class g extends lqh implements gnq0, ejt, fud, dr60, dd11 {
    public static final omy0 B = new omy0();
    public final lvr A;
    public zx40 c;
    public final tls w;
    public ztr x;
    public y5y y;
    public s z;

    public g(zx40 zx40Var, int i, tls tlsVar) {
        this.c = zx40Var;
        this.w = tlsVar;
        androidx.compose.ui.focus.d dVar = new androidx.compose.ui.focus.d(i, 10, new FocusableNode$focusTargetNode$1(2, this, g.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0));
        E0(dVar);
        this.A = dVar;
    }

    public final void H0(zx40 zx40Var, g8w g8wVar) {
        if (!isAttached()) {
            ((ay40) zx40Var).b(g8wVar);
        } else {
            l8x l8xVar = (l8x) getCoroutineScope().getCoroutineContext().get(seu.C);
            tje.N(getCoroutineScope(), null, null, new FocusableNode$emitWithFallback$1(zx40Var, g8wVar, l8xVar != null ? l8xVar.w(new sxo(12, zx40Var, g8wVar)) : null, null), 3);
        }
    }

    public final void I0(zx40 zx40Var) {
        ztr ztrVar;
        if (jl40.l(this.c, zx40Var)) {
            return;
        }
        zx40 zx40Var2 = this.c;
        if (zx40Var2 != null && (ztrVar = this.x) != null) {
            ((ay40) zx40Var2).b(new aur(ztrVar));
        }
        this.x = null;
        this.c = zx40Var;
    }

    @Override // defpackage.dd11
    public final Object V() {
        return B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dr60
    public final void e0() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        u.e(this, new bdp(10, ref$ObjectRef, this));
        y5y y5yVar = (y5y) ref$ObjectRef.element;
        if (((androidx.compose.ui.focus.d) this.A).J0().b()) {
            y5y y5yVar2 = this.y;
            if (y5yVar2 != null) {
                y5yVar2.b();
            }
            if (y5yVar != null) {
                y5yVar.a();
            } else {
                y5yVar = null;
            }
            this.y = y5yVar;
        }
    }

    @Override // defpackage.ejt
    public final void g(s sVar) {
        this.z = sVar;
        if (((androidx.compose.ui.focus.d) this.A).J0().b()) {
            boolean d = sVar.d();
            zoy0 zoy0Var = vvr.a;
            if (!d) {
                if (isAttached()) {
                    dai0.n(this, zoy0Var);
                }
            } else {
                s sVar2 = this.z;
                if (sVar2 != null && sVar2.d() && isAttached()) {
                    dai0.n(this, zoy0Var);
                }
            }
        }
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onReset() {
        y5y y5yVar = this.y;
        if (y5yVar != null) {
            y5yVar.b();
        }
        this.y = null;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        boolean b = ((androidx.compose.ui.focus.d) this.A).J0().b();
        kgx[] kgxVarArr = androidx.compose.ui.semantics.f.a;
        androidx.compose.ui.semantics.g gVar = androidx.compose.ui.semantics.d.l;
        kgx kgxVar = androidx.compose.ui.semantics.f.a[4];
        mnq0Var.a(gVar, Boolean.valueOf(b));
        mnq0Var.a(androidx.compose.ui.semantics.a.w, new ag(null, new FocusableNode$applySemantics$1(0, this, g.class, "requestFocus", "requestFocus()Z", 0)));
    }
}
