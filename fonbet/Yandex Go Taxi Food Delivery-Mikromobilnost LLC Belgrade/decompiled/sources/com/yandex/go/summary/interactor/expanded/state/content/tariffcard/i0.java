package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.dex0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i0 implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ dex0 b;

    public i0(mth mthVar, dex0 dex0Var) {
        this.a = mthVar;
        this.b = dex0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1 tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1) {
            tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1 = (TariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1) continuation;
            int i2 = tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h0 h0Var = new h0(vprVar, this.b);
                    tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.L$0 = null;
                    tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.L$1 = null;
                    tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.L$2 = null;
                    tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.label = 1;
                    if (this.a.collect(h0Var, tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1 = new TariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardUiStateInteractor$toIdentifiable$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
