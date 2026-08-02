package com.yandex.go.inapp_calls.dynamic;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.dynamic.InAppCallsDynamicApiImpl", f = "InAppCallsDynamicApiImpl.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "handleIncomingPush-gIAlu-s", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsDynamicApiImpl$handleIncomingPush$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppCallsDynamicApiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsDynamicApiImpl$handleIncomingPush$1(InAppCallsDynamicApiImpl inAppCallsDynamicApiImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = inAppCallsDynamicApiImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object c = this.this$0.c(null, this);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : new Result(c);
    }
}
