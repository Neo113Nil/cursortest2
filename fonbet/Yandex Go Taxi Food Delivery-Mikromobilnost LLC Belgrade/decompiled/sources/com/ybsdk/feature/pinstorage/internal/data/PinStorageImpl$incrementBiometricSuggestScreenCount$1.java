package com.ybsdk.feature.pinstorage.internal.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pinstorage.internal.data.PinStorageImpl", f = "PinStorageImpl.kt", l = {215, 217}, m = "incrementBiometricSuggestScreenCount")
/* loaded from: classes3.dex */
final class PinStorageImpl$incrementBiometricSuggestScreenCount$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinStorageImpl$incrementBiometricSuggestScreenCount$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(this);
    }
}
