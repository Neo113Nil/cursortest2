package com.ybsdk.feature.pin.internal.screens.checkpin;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel", f = "CheckPinViewModel.kt", l = {220}, m = "fetchRemoteConfig-IoAF18A")
/* loaded from: classes3.dex */
final class CheckPinViewModel$fetchRemoteConfig$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$fetchRemoteConfig$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e0 = b.e0(this.this$0, this);
        return e0 == CoroutineSingletons.COROUTINE_SUSPENDED ? e0 : new Result(e0);
    }
}
