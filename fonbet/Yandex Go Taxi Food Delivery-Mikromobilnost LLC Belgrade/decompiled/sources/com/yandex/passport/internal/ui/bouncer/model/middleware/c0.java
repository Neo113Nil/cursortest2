package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d0 b;

    public c0(vpr vprVar, d0 d0Var) {
        this.a = vprVar;
        this.b = d0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r7.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LoadAccountsMiddleware$accept$$inlined$map$1$2$1 loadAccountsMiddleware$accept$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof LoadAccountsMiddleware$accept$$inlined$map$1$2$1) {
            loadAccountsMiddleware$accept$$inlined$map$1$2$1 = (LoadAccountsMiddleware$accept$$inlined$map$1$2$1) continuation;
            int i2 = loadAccountsMiddleware$accept$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loadAccountsMiddleware$accept$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = loadAccountsMiddleware$accept$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loadAccountsMiddleware$accept$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar2 = this.a;
                    loadAccountsMiddleware$accept$$inlined$map$1$2$1.L$0 = vprVar2;
                    loadAccountsMiddleware$accept$$inlined$map$1$2$1.label = 1;
                    Object b = d0.b(this.b, (com.yandex.passport.internal.ui.bouncer.model.r) obj, loadAccountsMiddleware$accept$$inlined$map$1$2$1);
                    if (b != coroutineSingletons) {
                        obj2 = b;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vprVar = (vpr) loadAccountsMiddleware$accept$$inlined$map$1$2$1.L$0;
                kotlin.b.b(obj2);
                com.yandex.passport.internal.ui.bouncer.model.i0 i0Var = new com.yandex.passport.internal.ui.bouncer.model.i0((com.yandex.passport.internal.ui.bouncer.model.g1) obj2);
                loadAccountsMiddleware$accept$$inlined$map$1$2$1.L$0 = null;
                loadAccountsMiddleware$accept$$inlined$map$1$2$1.label = 2;
            }
        }
        loadAccountsMiddleware$accept$$inlined$map$1$2$1 = new LoadAccountsMiddleware$accept$$inlined$map$1$2$1(this, continuation);
        Object obj22 = loadAccountsMiddleware$accept$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loadAccountsMiddleware$accept$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        com.yandex.passport.internal.ui.bouncer.model.i0 i0Var2 = new com.yandex.passport.internal.ui.bouncer.model.i0((com.yandex.passport.internal.ui.bouncer.model.g1) obj22);
        loadAccountsMiddleware$accept$$inlined$map$1$2$1.L$0 = null;
        loadAccountsMiddleware$accept$$inlined$map$1$2$1.label = 2;
    }
}
