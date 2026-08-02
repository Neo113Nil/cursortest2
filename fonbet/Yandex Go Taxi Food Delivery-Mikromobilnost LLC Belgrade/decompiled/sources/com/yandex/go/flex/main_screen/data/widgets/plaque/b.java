package com.yandex.go.flex.main_screen.data.widgets.plaque;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import defpackage.ip11;
import defpackage.jqr;
import defpackage.m9a0;
import defpackage.mtc0;
import defpackage.rol0;
import defpackage.stc0;
import defpackage.tje;
import defpackage.u0x;
import defpackage.uyj;
import defpackage.v0x;
import defpackage.vtc0;
import defpackage.yvf0;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class b extends v0x {
    public final ip11 c;
    public final m9a0 d;

    public b(ip11 ip11Var, m9a0 m9a0Var) {
        this.c = ip11Var;
        this.d = m9a0Var;
    }

    @Override // defpackage.v0x
    public final void b(x0 x0Var, u0x u0xVar) {
        ((vtc0) x0Var).N.bind(((mtc0) u0xVar).a);
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        return new vtc0(new PlaqueWidgetItemView(viewGroup.getContext(), this.c), new PlaqueWidgetItemAdapter$createViewHolder$1(0, this.d, yvf0.class, "get", "get()Ljava/lang/Object;", 0));
    }

    @Override // defpackage.v0x
    public final void f(x0 x0Var) {
        vtc0 vtc0Var = (vtc0) x0Var;
        if (vtc0Var.P == null) {
            stc0 stc0Var = (stc0) ((PlaqueWidgetItemAdapter$createViewHolder$1) vtc0Var.O).invoke();
            PlaqueWidgetItemView plaqueWidgetItemView = vtc0Var.N;
            stc0Var.Bg(plaqueWidgetItemView);
            tje.N(stc0Var.Jg(), null, null, new PlaqueWidgetItemPresenter$attachView$$inlined$collectIn$1(plaqueWidgetItemView.getEvents(), null, stc0Var), 3);
            jqr jqrVar = new jqr(e.t(new rol0(new PlaqueWidgetItemPresenter$attachView$uiStateFlow$1(stc0Var, null))), new PlaqueWidgetItemPresenter$attachView$2(2, stc0Var, stc0.class, "logNewState", "logNewState(Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/SuperAppMainScreenTopPlaqueUIState;)V", 4), 3);
            stc0Var.x.getClass();
            tje.N(stc0Var.Jg(), null, null, new PlaqueWidgetItemPresenter$attachView$$inlined$collectIn$2(e.F(jqrVar, uyj.a), null, plaqueWidgetItemView), 3);
            vtc0Var.P = stc0Var;
        }
    }

    @Override // defpackage.v0x
    public final void g(x0 x0Var) {
        vtc0 vtc0Var = (vtc0) x0Var;
        stc0 stc0Var = vtc0Var.P;
        if (stc0Var != null) {
            stc0Var.Cg();
        }
        vtc0Var.P = null;
    }

    @Override // defpackage.v0x
    public final void h(x0 x0Var) {
        ((vtc0) x0Var).getClass();
    }
}
