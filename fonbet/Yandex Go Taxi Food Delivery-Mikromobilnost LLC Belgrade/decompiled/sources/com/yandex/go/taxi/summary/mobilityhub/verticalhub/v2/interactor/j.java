package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import defpackage.a1v;
import defpackage.a2a0;
import defpackage.d2a0;
import defpackage.lv90;
import defpackage.m1a0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.y0v;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ q c;

    public j(vpr vprVar, boolean z, q qVar) {
        this.a = vprVar;
        this.b = z;
        this.c = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        if (r9.emit(r10, r5) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1 verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        lv90 lv90Var;
        vpr vprVar2;
        Object y0vVar;
        if (continuation instanceof VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1) {
            verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1 = (VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1) continuation;
            int i2 = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1 verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12 = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1;
                Object obj2 = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lv90 lv90Var2 = (lv90) obj;
                    boolean z = this.b;
                    vprVar = this.a;
                    if (!z) {
                        d2a0 d2a0Var = this.c.m;
                        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$0 = null;
                        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$1 = null;
                        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$2 = null;
                        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$3 = null;
                        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$4 = vprVar;
                        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$5 = null;
                        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$6 = lv90Var2;
                        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.label = 1;
                        obj2 = a2a0.a(d2a0Var, lv90Var2, null, null, verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12, 12);
                        if (obj2 != coroutineSingletons) {
                            lv90Var = lv90Var2;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    y0vVar = new y0v(null);
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$0 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$1 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$2 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$3 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$4 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$5 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$6 = null;
                    verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    lv90Var = (lv90) verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$6;
                    vprVar2 = (vpr) verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$4;
                    kotlin.b.b(obj2);
                }
                vprVar = vprVar2;
                y0vVar = new a1v((m1a0) obj2, lv90Var);
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$0 = null;
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$1 = null;
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$2 = null;
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$3 = null;
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$4 = null;
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$5 = null;
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.L$6 = null;
                verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$12.label = 2;
            }
        }
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1 = new VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1(this, continuation);
        VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1 verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122 = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$1;
        Object obj22 = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        vprVar = vprVar2;
        y0vVar = new a1v((m1a0) obj22, lv90Var);
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.L$0 = null;
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.L$1 = null;
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.L$2 = null;
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.L$3 = null;
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.L$4 = null;
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.L$5 = null;
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.L$6 = null;
        verticalHubV2UiStateInteractor$paymentCardFlow$$inlined$map$1$2$122.label = 2;
    }
}
