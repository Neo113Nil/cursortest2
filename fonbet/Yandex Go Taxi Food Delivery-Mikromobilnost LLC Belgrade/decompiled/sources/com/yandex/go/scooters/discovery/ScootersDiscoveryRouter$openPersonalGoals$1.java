package com.yandex.go.scooters.discovery;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryRouter", f = "ScootersDiscoveryRouter.kt", l = {214}, m = "openPersonalGoals", v = 2)
/* loaded from: classes13.dex */
final class ScootersDiscoveryRouter$openPersonalGoals$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryRouter$openPersonalGoals$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return m.Q(this.this$0, this);
    }
}
