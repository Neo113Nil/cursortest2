package com.yandex.go.preorder.navigation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.preorder.navigation.LocationDependentIntentRouter", f = "LocationDependentIntentRouter.kt", l = {MSException.ERROR_INVALID_PARAMETER, 90, HProv.PP_VERSION_TIMESTAMP, HProv.PP_CONTAINER_STATUS, 152}, m = "processRouteDeeplink", v = 2)
/* loaded from: classes13.dex */
final class LocationDependentIntentRouter$processRouteDeeplink$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDependentIntentRouter$processRouteDeeplink$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.P(this.this$0, null, this);
    }
}
