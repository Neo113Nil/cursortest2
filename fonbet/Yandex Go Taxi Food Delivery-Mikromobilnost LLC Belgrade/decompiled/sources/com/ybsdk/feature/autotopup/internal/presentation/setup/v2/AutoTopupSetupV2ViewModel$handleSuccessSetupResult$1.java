package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2ViewModel", f = "AutoTopupSetupV2ViewModel.kt", l = {296}, m = "handleSuccessSetupResult")
/* loaded from: classes3.dex */
final class AutoTopupSetupV2ViewModel$handleSuccessSetupResult$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupV2ViewModel$handleSuccessSetupResult$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.c0(this.this$0, null, false, this);
    }
}
