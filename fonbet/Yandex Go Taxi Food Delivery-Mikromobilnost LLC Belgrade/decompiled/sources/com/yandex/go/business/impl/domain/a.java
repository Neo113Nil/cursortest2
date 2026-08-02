package com.yandex.go.business.impl.domain;

import defpackage.cy6;
import defpackage.d6z;
import defpackage.kc4;
import defpackage.lc4;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        B2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1 b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof B2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1) {
            b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1 = (B2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cy6 cy6Var = (cy6) obj;
                    Object lc4Var = cy6Var.b() ? new lc4(d6z.Y(cy6Var, cy6Var.d), cy6Var.c) : kc4.a;
                    b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.L$0 = null;
                    b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.L$1 = null;
                    b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.L$2 = null;
                    b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.L$3 = null;
                    b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lc4Var, b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1 = new B2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b2BMenuItemStateInteractorImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
