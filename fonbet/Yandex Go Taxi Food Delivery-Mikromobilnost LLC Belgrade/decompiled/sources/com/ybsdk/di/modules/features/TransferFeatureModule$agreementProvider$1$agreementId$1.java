package com.ybsdk.di.modules.features;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.di.modules.features.TransferFeatureModule$agreementProvider$1", f = "TransferFeatureModule.kt", l = {42}, m = "agreementId")
/* loaded from: classes3.dex */
final class TransferFeatureModule$agreementProvider$1$agreementId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFeatureModule$agreementProvider$1$agreementId$1(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
