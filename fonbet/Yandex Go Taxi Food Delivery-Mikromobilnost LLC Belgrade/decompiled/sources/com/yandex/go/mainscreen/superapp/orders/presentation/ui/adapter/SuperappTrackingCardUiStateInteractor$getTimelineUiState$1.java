package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import defpackage.dn70;
import defpackage.mvg;
import defpackage.p301;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor", f = "SuperappTrackingCardUiStateInteractor.kt", l = {390}, m = "getTimelineUiState-Psea4W4", v = 2)
/* loaded from: classes12.dex */
final class SuperappTrackingCardUiStateInteractor$getTimelineUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$getTimelineUiState$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object x = this.this$0.x(null, null, false, this);
        if (x == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return x;
        }
        p301 p301Var = (p301) x;
        if (p301Var != null) {
            return new dn70(p301Var);
        }
        return null;
    }
}
