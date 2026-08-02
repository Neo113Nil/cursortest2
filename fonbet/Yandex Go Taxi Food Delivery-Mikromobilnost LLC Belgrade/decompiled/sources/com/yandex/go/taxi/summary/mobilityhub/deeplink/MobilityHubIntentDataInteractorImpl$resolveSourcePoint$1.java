package com.yandex.go.taxi.summary.mobilityhub.deeplink;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.deeplink.MobilityHubIntentDataInteractorImpl", f = "MobilityHubIntentDataInteractorImpl.kt", l = {60, 62}, m = "resolveSourcePoint", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubIntentDataInteractorImpl$resolveSourcePoint$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubIntentDataInteractorImpl$resolveSourcePoint$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
