package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home;

import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$CompositeOffer;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.HomeSdkPayButtonDelegateImpl$purchaseSubscription$1", f = "HomeSdkPayButtonDelegateImpl.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class HomeSdkPayButtonDelegateImpl$purchaseSubscription$1 extends SuspendLambda implements wls {
    final /* synthetic */ PlusPaySdkAdapter$CompositeOffer $compositeOffer;
    final /* synthetic */ SubscriptionConfiguration $subscriptionConfig;
    final /* synthetic */ String $trackId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeSdkPayButtonDelegateImpl$purchaseSubscription$1(a aVar, String str, SubscriptionConfiguration subscriptionConfiguration, PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$trackId = str;
        this.$subscriptionConfig = subscriptionConfiguration;
        this.$compositeOffer = plusPaySdkAdapter$CompositeOffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeSdkPayButtonDelegateImpl$purchaseSubscription$1(this.this$0, this.$trackId, this.$subscriptionConfig, this.$compositeOffer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeSdkPayButtonDelegateImpl$purchaseSubscription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.payment.a aVar = this.this$0.c;
            String str = this.$trackId;
            SubscriptionConfiguration subscriptionConfiguration = this.$subscriptionConfig;
            PlusPaySdkAdapter$CompositeOffer plusPaySdkAdapter$CompositeOffer = this.$compositeOffer;
            this.label = 1;
            if (aVar.b(str, subscriptionConfiguration, plusPaySdkAdapter$CompositeOffer, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
