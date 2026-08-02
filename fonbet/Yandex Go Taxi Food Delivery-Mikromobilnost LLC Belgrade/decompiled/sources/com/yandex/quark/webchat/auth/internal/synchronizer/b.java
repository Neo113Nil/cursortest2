package com.yandex.quark.webchat.auth.internal.synchronizer;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.x0x0;
import defpackage.y0x0;
import defpackage.ya41;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WebAuthorizationSynchronizer$special$$inlined$map$1$2$1 webAuthorizationSynchronizer$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WebAuthorizationSynchronizer$special$$inlined$map$1$2$1) {
            webAuthorizationSynchronizer$special$$inlined$map$1$2$1 = (WebAuthorizationSynchronizer$special$$inlined$map$1$2$1) continuation;
            int i2 = webAuthorizationSynchronizer$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webAuthorizationSynchronizer$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webAuthorizationSynchronizer$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webAuthorizationSynchronizer$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ya41 ya41Var = (ya41) obj;
                    Object y0x0Var = ya41Var.b() ? new y0x0(ya41Var.a, ya41Var.b) : x0x0.a;
                    webAuthorizationSynchronizer$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(y0x0Var, webAuthorizationSynchronizer$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        webAuthorizationSynchronizer$special$$inlined$map$1$2$1 = new WebAuthorizationSynchronizer$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = webAuthorizationSynchronizer$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webAuthorizationSynchronizer$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
