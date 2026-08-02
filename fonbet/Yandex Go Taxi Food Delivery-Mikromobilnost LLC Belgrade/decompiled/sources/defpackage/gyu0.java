package defpackage;

import androidx.compose.foundation.text.handwriting.a;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.g;

/* loaded from: classes10.dex */
public final class gyu0 extends lqh implements gwd0, ytr, avr {
    public sls c;
    public boolean w;
    public final g x;

    public gyu0(sls slsVar) {
        this.c = slsVar;
        a aVar = new a(this);
        tvd0 tvd0Var = exw0.a;
        g gVar = new g(null, null, aVar);
        E0(gVar);
        this.x = gVar;
    }

    @Override // defpackage.gwd0
    public final long B() {
        fwi fwiVar = qje.P(this).R;
        s1a1.a.getClass();
        int i = wyz0.b;
        return wdz.j(fwiVar.f0(10.0f), fwiVar.f0(40.0f), fwiVar.f0(10.0f), fwiVar.f0(40.0f));
    }

    @Override // defpackage.gwd0
    public final void D() {
        this.x.D();
    }

    @Override // defpackage.gwd0
    public final void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        this.x.m0(tvd0Var, pointerEventPass, j);
    }

    @Override // defpackage.ytr
    public final void x0(ivr ivrVar) {
        this.w = ((FocusStateImpl) ivrVar).b();
    }
}
