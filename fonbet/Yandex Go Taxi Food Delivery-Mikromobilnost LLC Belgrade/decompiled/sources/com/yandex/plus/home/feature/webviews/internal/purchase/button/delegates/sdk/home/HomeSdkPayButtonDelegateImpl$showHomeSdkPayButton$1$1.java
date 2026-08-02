package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home;

import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzf0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.HomeSdkPayButtonDelegateImpl$showHomeSdkPayButton$1$1", f = "HomeSdkPayButtonDelegateImpl.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HomeSdkPayButtonDelegateImpl$showHomeSdkPayButton$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ PlusPaySdkAdapter$CompositeOffer $compositeOffer;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSdkPayButtonDelegateImpl$showHomeSdkPayButton$1$1(a aVar, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$compositeOffer = plusPaySdkAdapter$CompositeOffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeSdkPayButtonDelegateImpl$showHomeSdkPayButton$1$1(this.this$0, this.$compositeOffer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeSdkPayButtonDelegateImpl$showHomeSdkPayButton$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            rzf0 rzf0Var = this.this$0.b;
            PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer = this.$compositeOffer;
            this.label = 1;
            rzf0Var.e(plusPaySdkAdapter$CompositeOffer);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11Var;
    }
}
