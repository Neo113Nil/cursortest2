package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel", f = "CheckPinViewModel.kt", l = {114}, m = "openIssuePinIfPinLost")
/* loaded from: classes3.dex */
final class CheckPinViewModel$openIssuePinIfPinLost$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$openIssuePinIfPinLost$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.f0(this.this$0, this);
    }
}
