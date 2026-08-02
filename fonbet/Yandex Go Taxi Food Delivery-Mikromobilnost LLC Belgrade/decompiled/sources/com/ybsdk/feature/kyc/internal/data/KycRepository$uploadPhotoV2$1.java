package com.ybsdk.feature.kyc.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.kyc.internal.data.KycRepository", f = "KycRepository.kt", l = {260}, m = "uploadPhotoV2-yxL6bBk")
/* loaded from: classes3.dex */
final class KycRepository$uploadPhotoV2$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycRepository$uploadPhotoV2$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object i = this.this$0.i(null, null, null, null, this);
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : new Result(i);
    }
}
