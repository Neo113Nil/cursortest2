package xsna;

import kotlinx.coroutines.CoroutineStart;
import xsna.f1z;
import xsna.q630;

/* compiled from: LegacyAdaptingPlatformTextInputModifierNode.kt */
/* loaded from: classes11.dex */
public final class d0z extends q630.c implements kua0, nvi, o1u, f1z.a {
    public f1z p;
    public j1z q;
    public gho0 r;
    public final wh50 s = androidx.compose.runtime.k.b(null);

    public d0z(f1z f1zVar, j1z j1zVar, gho0 gho0Var) {
        this.p = f1zVar;
        this.q = j1zVar;
        this.r = gho0Var;
    }

    @Override // xsna.f1z.a
    public final yok0 L1(ma2 ma2Var) {
        if (this.o) {
            return myc0.h(W1(), null, CoroutineStart.UNDISPATCHED, new c0z(this, ma2Var, null), 1);
        }
        return null;
    }

    @Override // xsna.o1u
    public final void T1(androidx.compose.ui.node.o oVar) {
        ((zak0) this.s).setValue(oVar);
    }

    @Override // xsna.f1z.a
    public final gho0 W() {
        return this.r;
    }

    @Override // xsna.q630.c
    public final void a2() {
        f1z f1zVar = this.p;
        if (f1zVar.a != null) {
            xzw.c("Expected textInputModifierNode to be null");
        }
        f1zVar.a = this;
    }

    @Override // xsna.q630.c
    public final void b2() {
        this.p.j(this);
    }

    @Override // xsna.f1z.a
    public final j1z c0() {
        return this.q;
    }

    @Override // xsna.f1z.a
    public final nek0 getSoftwareKeyboardController() {
        return (nek0) ovi.a(this, uvi.q);
    }

    @Override // xsna.f1z.a
    public final rut0 getViewConfiguration() {
        return (rut0) ovi.a(this, uvi.t);
    }

    @Override // xsna.f1z.a
    public final tny j0() {
        return (tny) ((zak0) this.s).getValue();
    }
}
