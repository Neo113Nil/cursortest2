package com.ybsdk.api;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.api.PublicApiInteractor", f = "PublicApiInteractor.kt", l = {SubsamplingScaleImageView.ORIENTATION_180, 181}, m = "updatePaymentMethods-gIAlu-s")
/* loaded from: classes2.dex */
final class PublicApiInteractor$updatePaymentMethods$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicApiInteractor$updatePaymentMethods$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object j = this.this$0.j(null, this);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : new Result(j);
    }
}
