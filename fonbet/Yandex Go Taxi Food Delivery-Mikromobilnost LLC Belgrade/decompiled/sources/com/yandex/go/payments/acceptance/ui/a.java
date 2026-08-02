package com.yandex.go.payments.acceptance.ui;

import com.yandex.go.design.compose.spinner.SpinnerState;
import defpackage.ge;
import defpackage.ie;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wd;
import defpackage.xd;
import defpackage.yd;
import defpackage.zd;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ie b;

    public a(vpr vprVar, ie ieVar) {
        this.a = vprVar;
        this.b = ieVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AcceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1 acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        ge geVar;
        if (continuation instanceof AcceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1) {
            acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1 = (AcceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zd zdVar = (zd) obj;
                    boolean z = zdVar instanceof xd;
                    ie ieVar = this.b;
                    if (z) {
                        xd xdVar = (xd) zdVar;
                        geVar = new ge(xdVar.a, SpinnerState.LOADING, ie.b(ieVar, xdVar.b));
                    } else if (zdVar instanceof wd) {
                        wd wdVar = (wd) zdVar;
                        geVar = new ge(wdVar.a, SpinnerState.ERROR, ie.b(ieVar, wdVar.b));
                    } else {
                        if (!(zdVar instanceof yd)) {
                            w511.b();
                            return null;
                        }
                        geVar = new ge(((yd) zdVar).a, SpinnerState.DONE, EmptyList.a);
                    }
                    acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(geVar, acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1 = new AcceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = acceptancePaymentFullscreenUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
