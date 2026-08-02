package com.yandex.go.scooters.ignition.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.ignition.domain.ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1", f = "ScootersIgnitionUserStateProcessingInteractor.kt", l = {47, 49}, m = "emit", v = 2)
/* loaded from: classes13.dex */
public final class ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1(o oVar, Continuation continuation) {
        super(continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
