package com.yandex.go.chargers.error;

import defpackage.cy9;
import defpackage.ny61;
import defpackage.sk7;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ sk7 b;
    public final /* synthetic */ cy9 c;

    public c(tpr tprVar, sk7 sk7Var, cy9 cy9Var) {
        this.a = tprVar;
        this.b = sk7Var;
        this.c = cy9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1 chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (ChargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new ChargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
