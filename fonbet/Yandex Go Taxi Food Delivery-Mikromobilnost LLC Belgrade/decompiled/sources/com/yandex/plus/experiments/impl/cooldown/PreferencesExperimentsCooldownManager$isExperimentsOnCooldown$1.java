package com.yandex.plus.experiments.impl.cooldown;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.experiments.impl.cooldown.PreferencesExperimentsCooldownManager", f = "PreferencesExperimentsCooldownManager.kt", l = {19, 20}, m = "isExperimentsOnCooldown")
/* loaded from: classes8.dex */
final class PreferencesExperimentsCooldownManager$isExperimentsOnCooldown$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesExperimentsCooldownManager$isExperimentsOnCooldown$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
