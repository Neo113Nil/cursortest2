package com.yandex.go.scooters.data.mapper;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.data.mapper.ScootersSubscriptionMapper", f = "ScootersSubscriptionMapper.kt", l = {HProv.PP_CONTAINER_STATUS, 147, 149}, m = "mapSubscriptionUpsaleWindow", v = 2)
/* loaded from: classes13.dex */
final class ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSubscriptionMapper$mapSubscriptionUpsaleWindow$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.f(this.this$0, null, null, this);
    }
}
