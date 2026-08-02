package com.yandex.go.flex.main_screen.interactors;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.flex.main_screen.interactors.MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2", f = "MainScreenFlexLoadInteractor.kt", l = {217}, m = "emit", v = 2)
/* loaded from: classes.dex */
public final class MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1(g gVar, Continuation continuation) {
        super(continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
