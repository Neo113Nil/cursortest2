package com.yandex.go.zone.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.zone.repository.ZoneFallbackTtlExperimentProvider", f = "ZoneFallbackTtlExperiment.kt", l = {21}, m = "cacheTtlSec", v = 2)
/* loaded from: classes8.dex */
final class ZoneFallbackTtlExperimentProvider$cacheTtlSec$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneFallbackTtlExperimentProvider$cacheTtlSec$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
