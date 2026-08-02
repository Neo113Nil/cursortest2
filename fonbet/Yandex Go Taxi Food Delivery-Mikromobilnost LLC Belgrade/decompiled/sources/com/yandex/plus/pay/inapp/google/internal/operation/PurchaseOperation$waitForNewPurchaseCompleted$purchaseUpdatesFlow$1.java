package com.yandex.plus.pay.inapp.google.internal.operation;

import defpackage.agc0;
import defpackage.c0g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly6f0;", "Lgcd0;", "Lcom/android/billingclient/api/Purchase;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.inapp.google.internal.operation.PurchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1", f = "PurchaseOperation.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PurchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PurchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1 purchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1 = new PurchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1(this.this$0, continuation);
        purchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1.L$0 = obj;
        return purchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PurchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            c0g0 c0g0Var = new c0g0(fVar.a.c, fVar.e, y6f0Var);
            fVar.d.add(c0g0Var);
            agc0 agc0Var = new agc0(12, this.this$0, c0g0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, agc0Var, this) == coroutineSingletons) {
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
