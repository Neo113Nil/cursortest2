package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel", f = "CheckPinViewModel.kt", l = {404}, m = "buildExitScreenChainWithEnterType")
/* loaded from: classes3.dex */
final class CheckPinViewModel$buildExitScreenChainWithEnterType$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$buildExitScreenChainWithEnterType$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.i0(false, this);
    }
}
