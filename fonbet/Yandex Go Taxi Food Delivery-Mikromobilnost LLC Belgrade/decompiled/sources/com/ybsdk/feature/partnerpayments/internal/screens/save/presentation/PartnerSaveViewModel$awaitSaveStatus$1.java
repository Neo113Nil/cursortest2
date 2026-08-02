package com.ybsdk.feature.partnerpayments.internal.screens.save.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.partnerpayments.internal.screens.save.presentation.PartnerSaveViewModel", f = "PartnerSaveViewModel.kt", l = {142}, m = "awaitSaveStatus")
/* loaded from: classes3.dex */
final class PartnerSaveViewModel$awaitSaveStatus$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerSaveViewModel$awaitSaveStatus$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.b0(this.this$0, null, this);
    }
}
