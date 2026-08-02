package com.yandex.mob;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.MobMainInitializer", f = "MobMainInitializer.kt", l = {195, 196, 198}, m = "requestAndSaveMetricaData")
/* loaded from: classes8.dex */
final class MobMainInitializer$requestAndSaveMetricaData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MobMainInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobMainInitializer$requestAndSaveMetricaData$1(MobMainInitializer mobMainInitializer, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mobMainInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MobMainInitializer.a(this.this$0, null, this);
    }
}
