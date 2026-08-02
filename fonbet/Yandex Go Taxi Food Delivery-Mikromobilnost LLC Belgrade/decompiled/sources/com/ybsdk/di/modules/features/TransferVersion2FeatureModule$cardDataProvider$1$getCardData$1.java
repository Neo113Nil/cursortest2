package com.ybsdk.di.modules.features;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.di.modules.features.TransferVersion2FeatureModule$cardDataProvider$1", f = "TransferVersion2FeatureModule.kt", l = {460}, m = "getCardData-7Pf_VjM")
/* loaded from: classes3.dex */
final class TransferVersion2FeatureModule$cardDataProvider$1$getCardData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferVersion2FeatureModule$cardDataProvider$1$getCardData$1(u uVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(0, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
