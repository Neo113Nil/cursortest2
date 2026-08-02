package com.yandex.go.rida.bids.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.rida.bids.ui.BidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "BidsScreen.kt", l = {217}, m = "emit", v = 2)
/* loaded from: classes13.dex */
public final class BidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidsScreenKt$ListenCollapseUiEventEffect$1$1$invokeSuspend$$inlined$filterIsInstance$1$2$1(f fVar, Continuation continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
