package com.yandex.go.scooters.mosru.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.mosru.data.ScootersMosRuIntegrationExperimentRepository", f = "ScootersMosRuIntegrationExperimentRepository.kt", l = {22}, m = "getScreensForReauthorizationModal", v = 2)
/* loaded from: classes13.dex */
final class ScootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
