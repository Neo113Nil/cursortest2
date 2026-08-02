package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.agv0;
import defpackage.bgv0;
import defpackage.cgv0;
import defpackage.dgv0;
import defpackage.egv0;
import defpackage.ggb1;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kdd0;
import defpackage.mta1;
import defpackage.n7k0;
import defpackage.ny61;
import defpackage.u2b1;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xna1;
import defpackage.zfv0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kdd0 b;

    public g(vpr vprVar, kdd0 kdd0Var) {
        this.a = vprVar;
        this.b = kdd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RidaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        n7k0 n7k0Var;
        n7k0 n7k0Var2;
        if (continuation instanceof RidaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (RidaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    egv0 egv0Var = (egv0) obj;
                    boolean l = jl40.l(egv0Var, zfv0.a);
                    kdd0 kdd0Var = this.b;
                    if (l) {
                        n7k0Var = new n7k0(ggb1.b(), (String) ((i3y) kdd0Var.c).getValue());
                    } else {
                        if (egv0Var instanceof agv0) {
                            n7k0Var2 = new n7k0(xna1.a(), ((agv0) egv0Var).a);
                        } else if (jl40.l(egv0Var, cgv0.a)) {
                            n7k0Var = new n7k0(mta1.f(), (String) ((i3y) kdd0Var.d).getValue());
                        } else if (egv0Var instanceof dgv0) {
                            n7k0Var2 = new n7k0(u2b1.a(), ((dgv0) egv0Var).a);
                        } else {
                            if (!jl40.l(egv0Var, bgv0.a)) {
                                w511.b();
                                return null;
                            }
                            n7k0Var = null;
                        }
                        n7k0Var = n7k0Var2;
                    }
                    ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(n7k0Var, ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new RidaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaMapActionButtonUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
