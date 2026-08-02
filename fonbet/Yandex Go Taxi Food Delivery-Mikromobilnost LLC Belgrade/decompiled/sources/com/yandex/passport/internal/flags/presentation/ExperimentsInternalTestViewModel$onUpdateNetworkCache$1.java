package com.yandex.passport.internal.flags.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.flags.presentation.ExperimentsInternalTestViewModel", f = "ExperimentsInternalTestViewModel.kt", l = {111}, m = "onUpdateNetworkCache")
/* loaded from: classes15.dex */
final class ExperimentsInternalTestViewModel$onUpdateNetworkCache$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExperimentsInternalTestViewModel$onUpdateNetworkCache$1(o0 o0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return o0.f0(this.this$0, null, this);
    }
}
