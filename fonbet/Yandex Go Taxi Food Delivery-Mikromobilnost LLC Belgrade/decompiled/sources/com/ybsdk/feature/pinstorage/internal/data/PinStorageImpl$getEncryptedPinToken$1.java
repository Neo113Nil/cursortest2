package com.ybsdk.feature.pinstorage.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pinstorage.internal.data.PinStorageImpl", f = "PinStorageImpl.kt", l = {145}, m = "getEncryptedPinToken-IoAF18A")
/* loaded from: classes3.dex */
final class PinStorageImpl$getEncryptedPinToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinStorageImpl$getEncryptedPinToken$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.e(this);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : new Result(e);
    }
}
