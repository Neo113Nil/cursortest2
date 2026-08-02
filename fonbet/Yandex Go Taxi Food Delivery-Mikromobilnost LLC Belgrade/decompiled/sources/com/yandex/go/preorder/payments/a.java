package com.yandex.go.preorder.payments;

import android.app.Activity;
import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.fvt;
import defpackage.g92;
import defpackage.jqr;
import defpackage.lvt;
import defpackage.oep0;
import defpackage.tpr;
import defpackage.yvf0;
import kotlinx.coroutines.flow.k;

/* loaded from: classes8.dex */
public final class a {
    public final fvt a;
    public final yvf0 b;
    public final oep0 c;
    public final Activity d;
    public volatile boolean e;
    public volatile Preorder f;

    public a(fvt fvtVar, yvf0 yvf0Var, oep0 oep0Var, Activity activity) {
        this.a = fvtVar;
        this.b = yvf0Var;
        this.c = oep0Var;
        this.d = activity;
    }

    public final tpr a(Preorder preorder) {
        fvt fvtVar = this.a;
        Activity activity = this.d;
        fvtVar.getClass();
        if (!((e) fvtVar).m(activity, false, lvt.f)) {
            return new g92(2, GooglePayInteractor$GooglePayTokenResult.ERROR);
        }
        this.f = preorder;
        this.e = true;
        return new jqr(new k(((e) this.a).h(), new GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$1(this, null)), new GooglePayTaxiOrderInteractorImpl$selectGooglePayCard$2(this, null), 3);
    }
}
