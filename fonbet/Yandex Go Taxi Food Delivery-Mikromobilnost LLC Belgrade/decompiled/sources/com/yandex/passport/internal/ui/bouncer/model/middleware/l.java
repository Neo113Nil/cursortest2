package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.internal.ui.bouncer.model.a2;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Timer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar, n nVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CheckConnectionMiddleware$accept$$inlined$map$1$2$1 checkConnectionMiddleware$accept$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CheckConnectionMiddleware$accept$$inlined$map$1$2$1) {
            checkConnectionMiddleware$accept$$inlined$map$1$2$1 = (CheckConnectionMiddleware$accept$$inlined$map$1$2$1) continuation;
            int i2 = checkConnectionMiddleware$accept$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                checkConnectionMiddleware$accept$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = checkConnectionMiddleware$accept$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = checkConnectionMiddleware$accept$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kotlinx.coroutines.flow.n0 c = ffx.c(1, 0, null, 6);
                    new Timer().schedule(new m(c), 5000L);
                    com.yandex.passport.internal.ui.bouncer.model.m0 m0Var = new com.yandex.passport.internal.ui.bouncer.model.m0(new a2(((com.yandex.passport.internal.ui.bouncer.model.g) obj).a, new com.yandex.passport.biometric.ui.verification.a(6, c)));
                    checkConnectionMiddleware$accept$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(m0Var, checkConnectionMiddleware$accept$$inlined$map$1$2$1) == coroutineSingletons) {
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
        checkConnectionMiddleware$accept$$inlined$map$1$2$1 = new CheckConnectionMiddleware$accept$$inlined$map$1$2$1(this, continuation);
        Object obj22 = checkConnectionMiddleware$accept$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = checkConnectionMiddleware$accept$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
