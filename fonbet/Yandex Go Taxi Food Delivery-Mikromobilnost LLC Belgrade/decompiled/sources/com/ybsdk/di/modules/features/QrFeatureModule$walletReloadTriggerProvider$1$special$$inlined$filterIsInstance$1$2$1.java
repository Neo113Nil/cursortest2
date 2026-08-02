package com.ybsdk.di.modules.features;

import defpackage.mvg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.di.modules.features.QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2", f = "QrFeatureModule.kt", l = {50}, m = "emit")
/* loaded from: classes3.dex */
public final class QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrFeatureModule$walletReloadTriggerProvider$1$special$$inlined$filterIsInstance$1$2$1(m mVar, Continuation continuation) {
        super(continuation);
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.emit(null, this);
        return zy11.a;
    }
}
