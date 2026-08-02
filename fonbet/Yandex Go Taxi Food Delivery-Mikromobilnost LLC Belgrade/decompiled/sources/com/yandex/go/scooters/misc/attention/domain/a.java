package com.yandex.go.scooters.misc.attention.domain;

import defpackage.hzm0;
import defpackage.izm0;
import defpackage.jl40;
import defpackage.kzm0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.vym0;
import defpackage.w511;
import defpackage.wym0;
import defpackage.xym0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        if (r2.emit(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1 scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Object obj2;
        vpr vprVar2;
        if (continuation instanceof ScootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1) {
            scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1 = (ScootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1) continuation;
            int i2 = scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    xym0 xym0Var = (xym0) obj;
                    boolean z = xym0Var instanceof vym0;
                    vprVar = this.a;
                    if (z) {
                        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$0 = null;
                        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$1 = null;
                        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$2 = null;
                        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$3 = null;
                        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$4 = vprVar;
                        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$5 = null;
                        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$6 = null;
                        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.label = 1;
                        obj3 = c.a(this.b, (vym0) xym0Var, scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1);
                        if (obj3 != coroutineSingletons) {
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    if (!jl40.l(xym0Var, wym0.a)) {
                        w511.b();
                        return null;
                    }
                    obj2 = hzm0.a;
                    scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$0 = null;
                    scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$1 = null;
                    scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$2 = null;
                    scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$3 = null;
                    scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$4 = null;
                    scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$5 = null;
                    scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$6 = null;
                    scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                }
                obj2 = new izm0((kzm0) obj3);
                vprVar = vprVar2;
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$0 = null;
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$1 = null;
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$2 = null;
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$3 = null;
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$4 = null;
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$5 = null;
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$6 = null;
                scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.label = 2;
            }
        }
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1 = new ScootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1(this, continuation);
        Object obj32 = scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        obj2 = new izm0((kzm0) obj32);
        vprVar = vprVar2;
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$0 = null;
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$1 = null;
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$2 = null;
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$3 = null;
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$4 = null;
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$5 = null;
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.L$6 = null;
        scootersAttentionUiActionsInteractor$listenToUiAction$$inlined$map$1$2$1.label = 2;
    }
}
