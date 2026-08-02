package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host;

import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzf0;
import defpackage.tse;
import defpackage.wls;
import defpackage.y250;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.host.HostPayButtonDelegateImpl$showHostPayButton$1$1", f = "HostPayButtonDelegateImpl.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HostPayButtonDelegateImpl$showHostPayButton$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ y250 $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostPayButtonDelegateImpl$showHostPayButton$1$1(a aVar, y250 y250Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = y250Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HostPayButtonDelegateImpl$showHostPayButton$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HostPayButtonDelegateImpl$showHostPayButton$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            rzf0 rzf0Var = this.this$0.b;
            PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer = this.$it.a;
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
