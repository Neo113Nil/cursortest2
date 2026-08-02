package com.yandex.go.navigator.gas_stations.analytics;

import defpackage.mvg;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.gas_stations.analytics.NavigatorPetrolStationsAnalyticsInteractor", f = "NavigatorPetrolStationsAnalyticsInteractor.kt", l = {21}, m = Constants.KEY_SERVICE, v = 2)
/* loaded from: classes12.dex */
final class NavigatorPetrolStationsAnalyticsInteractor$service$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigatorPetrolStationsAnalyticsInteractor$service$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b(this.this$0, this);
    }
}
