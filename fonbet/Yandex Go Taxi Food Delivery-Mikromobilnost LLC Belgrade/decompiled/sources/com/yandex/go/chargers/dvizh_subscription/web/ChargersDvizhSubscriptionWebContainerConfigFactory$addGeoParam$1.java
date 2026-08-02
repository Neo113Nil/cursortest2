package com.yandex.go.chargers.dvizh_subscription.web;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.dvizh_subscription.web.ChargersDvizhSubscriptionWebContainerConfigFactory", f = "ChargersDvizhSubscriptionWebContainerConfigFactory.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "addGeoParam", v = 2)
/* loaded from: classes12.dex */
final class ChargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDvizhSubscriptionWebContainerConfigFactory$addGeoParam$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
