package com.yandex.go.chargers.push;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.push.ChargersLowBatteryPushJob", f = "ChargersLowBatteryPushJob.kt", l = {30, 31}, m = "doWork", v = 2)
/* loaded from: classes12.dex */
final class ChargersLowBatteryPushJob$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChargersLowBatteryPushJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersLowBatteryPushJob$doWork$1(ChargersLowBatteryPushJob chargersLowBatteryPushJob, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = chargersLowBatteryPushJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
