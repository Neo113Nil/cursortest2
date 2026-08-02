package com.yandex.go.summary.interactor.anchored.state;

import defpackage.agv0;
import defpackage.avj0;
import defpackage.bgv0;
import defpackage.cgv0;
import defpackage.ctz0;
import defpackage.dgv0;
import defpackage.egv0;
import defpackage.ggb1;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mta1;
import defpackage.ny61;
import defpackage.psz0;
import defpackage.u2b1;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xna1;
import defpackage.zfv0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class u implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ y b;

    public u(vpr vprVar, y yVar) {
        this.a = vprVar;
        this.b = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ToolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1 toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1;
        int i;
        psz0 psz0Var;
        psz0 psz0Var2;
        if (continuation instanceof ToolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1) {
            toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1 = (ToolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    egv0 egv0Var = (egv0) obj;
                    zuj0 zuj0Var = this.b.a;
                    boolean l = jl40.l(egv0Var, zfv0.a);
                    ctz0 ctz0Var = ctz0.a;
                    if (l) {
                        psz0Var = new psz0(ggb1.b(), ((avj0) zuj0Var).h(kyh0.detect_my_location_description), ctz0Var);
                    } else {
                        if (egv0Var instanceof agv0) {
                            psz0Var2 = new psz0(xna1.a(), ((agv0) egv0Var).a, ctz0Var);
                        } else if (jl40.l(egv0Var, cgv0.a)) {
                            psz0Var = new psz0(mta1.f(), ((avj0) zuj0Var).h(kyh0.summory_route_show_description), ctz0Var);
                        } else if (egv0Var instanceof dgv0) {
                            psz0Var2 = new psz0(u2b1.a(), ((dgv0) egv0Var).a, ctz0Var);
                        } else {
                            if (!jl40.l(egv0Var, bgv0.a)) {
                                w511.b();
                                return null;
                            }
                            psz0Var = null;
                        }
                        psz0Var = psz0Var2;
                    }
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(psz0Var, toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1 = new ToolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
