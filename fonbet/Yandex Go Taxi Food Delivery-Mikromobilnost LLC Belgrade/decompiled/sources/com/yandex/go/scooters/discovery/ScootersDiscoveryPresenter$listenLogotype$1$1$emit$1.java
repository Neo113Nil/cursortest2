package com.yandex.go.scooters.discovery;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.discovery.ScootersDiscoveryPresenter$listenLogotype$1$1", f = "ScootersDiscoveryPresenter.kt", l = {119}, m = "emit", v = 2)
/* loaded from: classes13.dex */
final class ScootersDiscoveryPresenter$listenLogotype$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersDiscoveryPresenter$listenLogotype$1$1$emit$1(i iVar, Continuation continuation) {
        super(continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
