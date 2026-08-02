package com.ybsdk.di.modules;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.di.modules.FingerprintFeatureModule$provideFingerprintStarter$1", f = "FingerprintFeatureModule.kt", l = {48}, m = "startFingerprint-gIAlu-s")
/* renamed from: com.ybsdk.di.modules.FingerprintFeatureModule$provideFingerprintStarter$1$startFingerprint-gIAlu-s$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class FingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FingerprintFeatureModule$provideFingerprintStarter$1$startFingerprintgIAlus$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
