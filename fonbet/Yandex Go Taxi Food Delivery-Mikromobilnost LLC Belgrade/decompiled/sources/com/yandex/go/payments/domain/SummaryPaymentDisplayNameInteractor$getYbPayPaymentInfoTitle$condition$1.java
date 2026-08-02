package com.yandex.go.payments.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uv51;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqv51;", "<anonymous>", "(Ltse;)Lqv51;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1", f = "SummaryPaymentDisplayNameInteractor.kt", l = {130}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $code;
    final /* synthetic */ uv51 $info;
    final /* synthetic */ BigDecimal $tariffPrice;
    int label;
    final /* synthetic */ p0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1(p0 p0Var, uv51 uv51Var, BigDecimal bigDecimal, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = p0Var;
        this.$info = uv51Var;
        this.$tariffPrice = bigDecimal;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1(this.this$0, this.$info, this.$tariffPrice, this.$code, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPaymentDisplayNameInteractor$getYbPayPaymentInfoTitle$condition$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.go.yb.data.u uVar = this.this$0.a;
        String str = this.$info.a;
        BigDecimal bigDecimal = this.$tariffPrice;
        String str2 = this.$code;
        this.label = 1;
        Object b = uVar.b(str, bigDecimal, str2, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
