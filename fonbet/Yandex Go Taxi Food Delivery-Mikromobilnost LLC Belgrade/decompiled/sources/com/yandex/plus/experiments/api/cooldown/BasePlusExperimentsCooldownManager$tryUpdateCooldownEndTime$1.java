package com.yandex.plus.experiments.api.cooldown;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.experiments.api.cooldown.BasePlusExperimentsCooldownManager", f = "BasePlusExperimentsCooldownManager.kt", l = {17, 21}, m = "tryUpdateCooldownEndTime-VtjQ1oo$suspendImpl")
/* loaded from: classes2.dex */
final class BasePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePlusExperimentsCooldownManager$tryUpdateCooldownEndTime$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.d(this.this$0, 0L, this);
    }
}
