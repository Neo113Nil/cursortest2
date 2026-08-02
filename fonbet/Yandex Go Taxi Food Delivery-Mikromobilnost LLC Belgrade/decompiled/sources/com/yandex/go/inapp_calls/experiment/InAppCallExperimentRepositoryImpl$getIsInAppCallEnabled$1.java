package com.yandex.go.inapp_calls.experiment;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.experiment.InAppCallExperimentRepositoryImpl", f = "InAppCallExperimentRepositoryImpl.kt", l = {22}, m = "getIsInAppCallEnabled", v = 2)
/* loaded from: classes12.dex */
final class InAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallExperimentRepositoryImpl$getIsInAppCallEnabled$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
