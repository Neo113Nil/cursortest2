package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor", f = "SuperappTrackingCardUiStateInteractor.kt", l = {931, 933, 934, 935}, m = "getRatingUiStateFlow", v = 2)
/* loaded from: classes12.dex */
final class SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$getRatingUiStateFlow$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.l(this.this$0, null, false, this);
    }
}
