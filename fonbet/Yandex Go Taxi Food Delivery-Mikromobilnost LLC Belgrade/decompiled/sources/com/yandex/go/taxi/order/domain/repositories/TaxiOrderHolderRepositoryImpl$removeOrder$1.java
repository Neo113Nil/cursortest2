package com.yandex.go.taxi.order.domain.repositories;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.order.domain.repositories.TaxiOrderHolderRepositoryImpl", f = "TaxiOrderHolderRepositoryImpl.kt", l = {260, SubsamplingScaleImageView.ORIENTATION_180}, m = "removeOrder", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderHolderRepositoryImpl$removeOrder$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderHolderRepositoryImpl$removeOrder$1(e0 e0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.B(null, null, this);
    }
}
