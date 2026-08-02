package com.ybsdk.feature.change.payment.method.internal.domain;

import com.ybsdk.feature.change.payment.method.internal.data.DefaultPaymentMethodUnifiedStatusEntity;
import defpackage.ahh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lahh;", "", "<anonymous>", "(Lahh;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.domain.DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1", f = "DefaultPaymentMethodUnifiedSetInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1 defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1 = new DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1(2, continuation);
        defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1.L$0 = obj;
        return defaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultPaymentMethodUnifiedSetInteractor$defaultPaymentMethodUnifiedSetInit$1$1$1) create((ahh) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        DefaultPaymentMethodUnifiedStatusEntity defaultPaymentMethodUnifiedStatusEntity = ((ahh) this.L$0).a;
        return Boolean.valueOf((defaultPaymentMethodUnifiedStatusEntity == DefaultPaymentMethodUnifiedStatusEntity.PENDING || defaultPaymentMethodUnifiedStatusEntity == DefaultPaymentMethodUnifiedStatusEntity.REQUIRED_3DS) ? false : true);
    }
}
