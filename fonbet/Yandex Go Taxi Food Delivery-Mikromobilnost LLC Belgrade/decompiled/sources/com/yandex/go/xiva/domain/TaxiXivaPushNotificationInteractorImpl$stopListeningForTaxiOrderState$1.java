package com.yandex.go.xiva.domain;

import defpackage.g050;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.xiva.domain.TaxiXivaPushNotificationInteractorImpl$stopListeningForTaxiOrderState$1", f = "TaxiXivaPushNotificationInteractorImpl.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes11.dex */
final class TaxiXivaPushNotificationInteractorImpl$stopListeningForTaxiOrderState$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiXivaPushNotificationInteractorImpl$stopListeningForTaxiOrderState$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiXivaPushNotificationInteractorImpl$stopListeningForTaxiOrderState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiXivaPushNotificationInteractorImpl$stopListeningForTaxiOrderState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar = fVar2.f;
            this.L$0 = aVar;
            this.L$1 = fVar2;
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
            fVar = (f) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            jst.e.getClass();
            fVar.c();
            pzt0 pzt0Var = fVar.h;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            fVar.h = null;
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
