package com.yandex.go.flex.main_screen.routers;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.flex.main_screen.experiments.SuperappMainFeedClientFeaturesExperiment;
import defpackage.bhx;
import defpackage.eor;
import defpackage.ffe;
import defpackage.h3y;
import defpackage.nbw0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.u900;
import defpackage.w900;
import defpackage.ylr;
import defpackage.yvf0;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;

/* loaded from: classes.dex */
public final class c extends u900 {
    public final com.yandex.go.flex.main_screen.jason_state.a F;
    public final nbw0 G;
    public final h3y H;
    public final yvf0 I;
    public final w900 J = new w900(0, this);

    public c(com.yandex.go.flex.main_screen.jason_state.a aVar, nbw0 nbw0Var, h3y h3yVar, bhx bhxVar) {
        this.F = aVar;
        this.G = nbw0Var;
        this.H = h3yVar;
        this.I = bhxVar;
    }

    @Override // defpackage.tmr, defpackage.h55
    public final void H(Object obj) {
        super.H((ffe) obj);
        this.J.g();
    }

    @Override // defpackage.tmr, defpackage.h55
    public final void I(Object obj) {
        super.I((ffe) obj);
        com.yandex.go.flex.main_screen.jason_state.a aVar = this.F;
        pzt0 pzt0Var = aVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        aVar.e.b();
    }

    @Override // defpackage.tmr, defpackage.h55
    public final void J(Object obj) {
        super.J((ffe) obj);
        this.F.a();
        if (((SuperappMainFeedClientFeaturesExperiment) this.G.a.c()).d) {
            tje.N(o(), null, null, new MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1(this, null), 3);
        }
    }

    @Override // defpackage.tmr
    public final void P(Object obj, ylr ylrVar) {
        ffe ffeVar = (ffe) obj;
        View asView = ylrVar.asView();
        ffeVar.a.addView(asView);
        ffeVar.a(asView, ContentContainer$ZOrder.MOST_IMPORTANT);
        tje.a0(asView.getContext(), this.J);
    }

    @Override // defpackage.tmr
    public final ylr Q(Object obj) {
        return (ylr) this.I.get();
    }

    @Override // defpackage.u900
    public final void R(RecyclerView.g gVar) {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            ylrVar.addScrollListener(gVar);
        }
    }

    @Override // defpackage.u900
    public final boolean S() {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            return ylrVar.interceptOnBackPressed();
        }
        return false;
    }

    @Override // defpackage.u900
    public final void T(RecyclerView.g gVar) {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            ylrVar.removeScrollListener(gVar);
        }
    }

    @Override // defpackage.u900
    public final void U(eor eorVar, eor eorVar2) {
        ylr ylrVar = this.E;
        if (ylrVar != null) {
            ylrVar.setFloatButtons(null, eorVar2);
        }
    }
}
