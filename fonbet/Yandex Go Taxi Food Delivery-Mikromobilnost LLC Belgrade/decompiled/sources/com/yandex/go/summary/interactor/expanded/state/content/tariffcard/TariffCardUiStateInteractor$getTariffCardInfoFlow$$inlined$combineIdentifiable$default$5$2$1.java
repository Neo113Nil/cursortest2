package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2", f = "TariffCardUiStateInteractor.kt", l = {217}, m = "emit", v = 2)
/* loaded from: classes14.dex */
public final class TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardUiStateInteractor$getTariffCardInfoFlow$$inlined$combineIdentifiable$default$5$2$1(b0 b0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
