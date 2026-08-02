package com.yandex.go.xiva.domain;

import defpackage.g050;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.xiva.domain.TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1", f = "TaxiXivaPushNotificationInteractorImpl.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1 taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1 = new TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1(this.this$0, continuation);
        taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1.L$0 = obj;
        return taxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        g050 g050Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar = fVar2.f;
            this.L$0 = tseVar;
            this.L$1 = aVar;
            this.L$2 = fVar2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            fVar = fVar2;
            g050Var = aVar;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = (f) this.L$2;
            g050Var = (g050) this.L$1;
            kotlin.b.b(obj);
        }
        try {
            pzt0 pzt0Var = fVar.h;
            boolean isActive = pzt0Var != null ? pzt0Var.isActive() : false;
            jst.e.getClass();
            if (!isActive) {
                pzt0 pzt0Var2 = fVar.h;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                fVar.h = tje.N(tseVar, null, null, new TaxiXivaPushNotificationInteractorImpl$startListeningForTaxiOrderState$1$1$1(fVar, null), 3);
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
