package com.yandex.go.taxi.order.common;

import defpackage.b2k;
import defpackage.jqr;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ur70;
import defpackage.uyj;
import defpackage.vng;
import defpackage.vpr;
import defpackage.yk;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ f a;
    public final /* synthetic */ tse b;

    public a(f fVar, tse tseVar) {
        this.a = fVar;
        this.b = tseVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        o2y0 o2y0Var = (o2y0) obj;
        f fVar = this.a;
        tt2 tt2Var = fVar.a;
        fVar.B = o2y0Var;
        fVar.w.b(o2y0Var);
        pzt0 pzt0Var = fVar.y;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        c cVar = new c(o2y0Var.a(), o2y0Var);
        ur70 ur70Var = new ur70(6);
        yk ykVar = vng.c;
        b2k l = vng.l(new jqr(vng.l(cVar, ur70Var, ykVar), new OrderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$3(2, fVar, f.class, "handleStatusInfoUpdate", "handleStatusInfoUpdate(Lcom/yandex/go/taxi/order/models/api/TaxiOrderHolder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), 3), new ur70(7), ykVar);
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        OrderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$collectLatestIn$1 orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$collectLatestIn$1 = new OrderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$collectLatestIn$1(kotlinx.coroutines.flow.e.F(l, sjhVar), null, fVar.F);
        tse tseVar = this.b;
        fVar.y = tje.N(tseVar, null, null, orderFragmentPresenterDelegate$subscribeToActiveOrderStatusUpdates$$inlined$collectLatestIn$1, 3);
        pzt0 pzt0Var2 = fVar.z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        fVar.z = tje.N(tseVar, null, null, new OrderFragmentPresenterDelegate$subscribeToFeedbackSelectorDecorationUpdates$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.t(new e(o2y0Var.a())), sjhVar), null, fVar.n), 3);
        ((com.yandex.go.taxi.order.details.v2.core.d) fVar.v.get()).a(o2y0Var.b());
        return zy11.a;
    }
}
