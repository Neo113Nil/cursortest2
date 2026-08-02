package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import defpackage.dlg;
import defpackage.eja1;
import defpackage.j0g;
import defpackage.nmg;
import defpackage.pzt0;
import defpackage.t8j0;
import defpackage.tje;
import java.util.List;

/* loaded from: classes3.dex */
public final class a {
    public final dlg a;
    public pzt0 b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ DashboardV3Fragment e;

    public a(DashboardV3Fragment dashboardV3Fragment, dlg dlgVar) {
        this.e = dashboardV3Fragment;
        this.a = dlgVar;
    }

    public final void a() {
        DashboardV3Fragment dashboardV3Fragment = this.e;
        d access$getViewModel = DashboardV3Fragment.access$getViewModel(dashboardV3Fragment);
        nmg nmgVar = (nmg) access$getViewModel.X();
        j0g j0gVar = (j0g) access$getViewModel.J;
        if (!j0gVar.s().d || !j0gVar.e(nmgVar.a.getProductId()) || (nmgVar.b instanceof t8j0) || this.d || this.c) {
            return;
        }
        dashboardV3Fragment.postponeEnterTransition();
        this.b = tje.N(eja1.s(dashboardV3Fragment.getViewLifecycleOwner()), null, null, new DashboardV3Fragment$TransitionHelper$postponeEnterTransitionIfNeeded$1(dashboardV3Fragment, this, null), 3);
        this.c = true;
    }

    public final void b(List list) {
        if (!this.c || this.d || list.isEmpty()) {
            return;
        }
        this.e.startPostponedEnterTransition();
        pzt0 pzt0Var = this.b;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d = true;
    }

    public final boolean c() {
        return ((j0g) this.a).s().d;
    }
}
