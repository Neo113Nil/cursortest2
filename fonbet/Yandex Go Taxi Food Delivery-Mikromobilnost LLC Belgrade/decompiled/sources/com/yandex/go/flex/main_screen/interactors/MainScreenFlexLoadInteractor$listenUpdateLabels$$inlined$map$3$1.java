package com.yandex.go.flex.main_screen.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.flex.main_screen.interactors.MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3", f = "MainScreenFlexLoadInteractor.kt", l = {112}, m = "collect", v = 2)
/* loaded from: classes12.dex */
public final class MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1(n nVar, Continuation continuation) {
        super(continuation);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
