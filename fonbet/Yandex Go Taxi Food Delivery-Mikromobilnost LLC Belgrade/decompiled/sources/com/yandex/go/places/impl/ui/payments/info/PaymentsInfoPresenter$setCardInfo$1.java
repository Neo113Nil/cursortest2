package com.yandex.go.places.impl.ui.payments.info;

import defpackage.fna0;
import defpackage.lcc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.payments.info.PaymentsInfoPresenter$setCardInfo$1", f = "PaymentsInfoPresenter.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsInfoPresenter$setCardInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $cardInfo;
    int label;
    final /* synthetic */ fna0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsInfoPresenter$setCardInfo$1(fna0 fna0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fna0Var;
        this.$cardInfo = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsInfoPresenter$setCardInfo$1(this.this$0, this.$cardInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsInfoPresenter$setCardInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        lcc0 lcc0Var = this.this$0.z;
        String str = this.$cardInfo;
        this.label = 1;
        lcc0Var.c.e.emit(str, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
