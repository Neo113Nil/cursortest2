package com.yandex.go.superapp.web.modal;

import defpackage.cvq0;
import defpackage.dke;
import defpackage.hbp0;
import defpackage.ien;
import defpackage.j7w0;
import defpackage.jqr;
import defpackage.l8x;
import defpackage.qgn0;
import defpackage.rnc;
import defpackage.sls;
import defpackage.tpr;
import defpackage.vdn;
import ru.yandex.taxi.eatskit.dto.ServicePromo;

/* loaded from: classes14.dex */
public final class o implements rnc {
    public final /* synthetic */ WebModalView a;

    public o(WebModalView webModalView) {
        this.a = webModalView;
    }

    @Override // defpackage.rnc
    public final void a(sls slsVar, sls slsVar2) {
    }

    @Override // defpackage.rnc
    public final void close() {
        this.a.handleDismissAction();
    }

    @Override // defpackage.rnc
    public final void h() {
        boolean z;
        j7w0 j7w0Var;
        WebModalView webModalView = this.a;
        z = webModalView.ready;
        if (z) {
            return;
        }
        webModalView.ready = true;
        j7w0Var = webModalView.loadCallbacks;
        if (j7w0Var != null) {
            j7w0Var.j();
        }
    }

    @Override // defpackage.rnc
    public final void i(boolean z, dke dkeVar) {
        l8x l8xVar;
        tpr tprVar;
        hbp0 hbp0Var;
        WebModalView webModalView = this.a;
        l8xVar = webModalView.authJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        tprVar = webModalView.ongoingTokenUserIdPair;
        kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(new jqr(tprVar, new WebModalView$mainDelegate$1$requestAuthData$1(dkeVar, null), 3), new WebModalView$mainDelegate$1$requestAuthData$2(3, null));
        hbp0Var = webModalView.coroutineScopeDelegate;
        webModalView.authJob = com.yandex.go.coroutines.b.h(hbp0Var, oVar);
    }

    @Override // defpackage.rnc
    public final void j(vdn vdnVar) {
    }

    @Override // defpackage.rnc
    public final void k(String str, boolean z) {
    }

    @Override // defpackage.rnc
    public final ien l() {
        return this.a.superappWebView;
    }

    @Override // defpackage.rnc
    public final void m() {
    }

    @Override // defpackage.rnc
    public final cvq0 n() {
        WebModalView webModalView = this.a;
        return new cvq0(webModalView.url, webModalView.initParams.k, "", new qgn0("", ""), ServicePromo.BANNER, null, webModalView.initParams.m, null, false, null, null, false, false, false, null, 261984);
    }
}
