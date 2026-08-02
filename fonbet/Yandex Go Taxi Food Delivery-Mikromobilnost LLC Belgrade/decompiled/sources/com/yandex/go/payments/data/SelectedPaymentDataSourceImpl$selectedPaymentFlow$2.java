package com.yandex.go.payments.data;

import defpackage.lv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Llv90;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.data.SelectedPaymentDataSourceImpl$selectedPaymentFlow$2", f = "SelectedPaymentDataSourceImpl.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SelectedPaymentDataSourceImpl$selectedPaymentFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $key;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedPaymentDataSourceImpl$selectedPaymentFlow$2(k kVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectedPaymentDataSourceImpl$selectedPaymentFlow$2 selectedPaymentDataSourceImpl$selectedPaymentFlow$2 = new SelectedPaymentDataSourceImpl$selectedPaymentFlow$2(this.this$0, this.$key, continuation);
        selectedPaymentDataSourceImpl$selectedPaymentFlow$2.L$0 = obj;
        return selectedPaymentDataSourceImpl$selectedPaymentFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectedPaymentDataSourceImpl$selectedPaymentFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lv90 b = this.this$0.b(this.$key);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(b, this) == coroutineSingletons) {
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
