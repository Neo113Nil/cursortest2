package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardViewModelV4", f = "SavingsDashboardViewModelV4.kt", l = {390, 391}, m = "startPolling")
/* loaded from: classes3.dex */
final class SavingsDashboardViewModelV4$startPolling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsDashboardViewModelV4$startPolling$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.b0(this.this$0, null, this);
    }
}
