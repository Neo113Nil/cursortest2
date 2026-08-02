package com.ybsdk.di.modules.features;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.di.modules.features.TransferVersion2FeatureModule$userInfoProvider$1", f = "TransferVersion2FeatureModule.kt", l = {215}, m = "getPhoneNumber")
/* loaded from: classes3.dex */
final class TransferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferVersion2FeatureModule$userInfoProvider$1$getPhoneNumber$1(v vVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
