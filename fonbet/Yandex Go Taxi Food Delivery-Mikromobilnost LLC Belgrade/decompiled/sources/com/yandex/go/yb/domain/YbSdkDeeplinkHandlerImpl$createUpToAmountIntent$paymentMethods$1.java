package com.yandex.go.yb.domain;

import com.ybsdk.api.YBSdk;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lxf51;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.domain.YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1", f = "YbSdkDeeplinkHandlerImpl.kt", l = {199}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1 extends SuspendLambda implements wls {
    int label;

    public YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbSdkDeeplinkHandlerImpl$createUpToAmountIntent$paymentMethods$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m351updatePaymentMethodsInfoIoAF18A;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            YBSdk yBSdk = YBSdk.INSTANCE;
            this.label = 1;
            m351updatePaymentMethodsInfoIoAF18A = yBSdk.m351updatePaymentMethodsInfoIoAF18A(this);
            if (m351updatePaymentMethodsInfoIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            m351updatePaymentMethodsInfoIoAF18A = ((Result) obj).getValue();
        }
        if (m351updatePaymentMethodsInfoIoAF18A instanceof Result.Failure) {
            return null;
        }
        return m351updatePaymentMethodsInfoIoAF18A;
    }
}
