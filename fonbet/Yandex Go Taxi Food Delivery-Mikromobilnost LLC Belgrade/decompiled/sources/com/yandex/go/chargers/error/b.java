package com.yandex.go.chargers.error;

import defpackage.cy9;
import defpackage.ny61;
import defpackage.sk7;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ sk7 b;
    public final /* synthetic */ cy9 c;

    public b(vpr vprVar, sk7 sk7Var, cy9 cy9Var) {
        this.a = vprVar;
        this.b = sk7Var;
        this.c = cy9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof ChargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (ChargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    a aVar = (a) this.b.c;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = null;
                    chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    Object a = aVar.a(this.c, chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = null;
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = null;
                chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new ChargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$4 = null;
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$5 = null;
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$6 = null;
        chargersErrorUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 2;
    }
}
