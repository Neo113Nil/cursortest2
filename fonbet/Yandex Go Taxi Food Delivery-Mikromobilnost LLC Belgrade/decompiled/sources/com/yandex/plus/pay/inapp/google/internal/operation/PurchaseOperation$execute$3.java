package com.yandex.plus.pay.inapp.google.internal.operation;

import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lgcd0;", "Lcom/android/billingclient/api/Purchase;", "<anonymous>", "(Ltse;)Lgcd0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.inapp.google.internal.operation.PurchaseOperation$execute$3", f = "PurchaseOperation.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PurchaseOperation$execute$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseOperation$execute$3(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PurchaseOperation$execute$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PurchaseOperation$execute$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        this.label = 1;
        fVar.getClass();
        Object y = kotlinx.coroutines.flow.e.y(kotlinx.coroutines.flow.e.g(new PurchaseOperation$waitForNewPurchaseCompleted$purchaseUpdatesFlow$1(fVar, null)), this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
