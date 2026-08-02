package com.yandex.go.taxi.summary.verticalsummary.interactor;

import defpackage.fg31;
import defpackage.mmq0;
import defpackage.nmq0;
import defpackage.ny61;
import defpackage.omq0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1 verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1;
        int i;
        fg31 fg31Var;
        if (continuation instanceof VerticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1) {
            verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1 = (VerticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    omq0 omq0Var = (omq0) obj;
                    if (omq0Var instanceof mmq0) {
                        fg31Var = null;
                    } else {
                        if (!(omq0Var instanceof nmq0)) {
                            w511.b();
                            return null;
                        }
                        fg31Var = ((nmq0) omq0Var).a;
                    }
                    verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(fg31Var, verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1 = new VerticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalSummaryUiStateInteractor$verticalsSelectorUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
