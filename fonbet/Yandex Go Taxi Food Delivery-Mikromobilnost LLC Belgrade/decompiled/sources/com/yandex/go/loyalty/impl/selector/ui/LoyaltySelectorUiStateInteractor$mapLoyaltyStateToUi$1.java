package com.yandex.go.loyalty.impl.selector.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.loyalty.impl.selector.ui.LoyaltySelectorUiStateInteractor", f = "LoyaltySelectorUiStateInteractor.kt", l = {71}, m = "mapLoyaltyStateToUi", v = 2)
/* loaded from: classes12.dex */
final class LoyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltySelectorUiStateInteractor$mapLoyaltyStateToUi$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.b(this.this$0, null, null, null, this);
    }
}
