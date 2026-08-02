package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.data.helpers.Transfer2Helper", f = "Transfer2Helper.kt", l = {267, 271}, m = "getFundDocsNotice-0hPOyJY")
/* loaded from: classes3.dex */
final class Transfer2Helper$getFundDocsNotice$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transfer2Helper$getFundDocsNotice$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object g = this.this$0.g(null, 0, this);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : new Result(g);
    }
}
