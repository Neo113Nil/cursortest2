package com.yandex.go.yb.lack_of_order.domain;

import defpackage.hst;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Law51;", "", "e", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.lack_of_order.domain.TaxiOrderMoneyLackIntentInteractor$intentFlow$2", f = "TaxiOrderMoneyLackIntentInteractor.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class TaxiOrderMoneyLackIntentInteractor$intentFlow$2 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public TaxiOrderMoneyLackIntentInteractor$intentFlow$2() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TaxiOrderMoneyLackIntentInteractor$intentFlow$2 taxiOrderMoneyLackIntentInteractor$intentFlow$2 = new TaxiOrderMoneyLackIntentInteractor$intentFlow$2(3, (Continuation) obj3);
        taxiOrderMoneyLackIntentInteractor$intentFlow$2.L$0 = (vpr) obj;
        taxiOrderMoneyLackIntentInteractor$intentFlow$2.L$1 = (Throwable) obj2;
        return taxiOrderMoneyLackIntentInteractor$intentFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Throwable th = (Throwable) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hst hstVar = jst.e;
            ke00 a = hstVar.b.a();
            if (a != null && a.b(15)) {
                a.a(15, null, th, "Error while trying to collect lack of money intent", hstVar.a);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
