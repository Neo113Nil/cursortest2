package com.yandex.plus.home.graphql.experiments;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.graphql.experiments.PlusHomeExperimentsCooldownManager", f = "PlusHomeExperimentsCooldownManager.kt", l = {31, 32}, m = "setCooldownEndTime-VtjQ1oo")
/* loaded from: classes2.dex */
final class PlusHomeExperimentsCooldownManager$setCooldownEndTime$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusHomeExperimentsCooldownManager$setCooldownEndTime$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, this);
    }
}
