package com.ybsdk.feature.autotopup.internal.presentation.saver;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel", f = "AutoTopupRegularViewModel.kt", l = {527}, m = "loadSetupRequestResult")
/* loaded from: classes3.dex */
final class AutoTopupRegularViewModel$loadSetupRequestResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupRegularViewModel$loadSetupRequestResult$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.c0(this.this$0, null, this);
    }
}
