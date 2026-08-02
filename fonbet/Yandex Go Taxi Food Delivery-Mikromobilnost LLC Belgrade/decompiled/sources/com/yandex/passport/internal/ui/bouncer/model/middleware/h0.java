package com.yandex.passport.internal.ui.bouncer.model.middleware;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.report.m4;
import com.yandex.passport.internal.report.yd;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class h0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i0 b;

    public h0(vpr vprVar, i0 i0Var) {
        this.a = vprVar;
        this.b = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cf, code lost:
    
        if (r9.emit(r11, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProcessFallbackResultMiddleware$accept$$inlined$map$1$2$1 processFallbackResultMiddleware$accept$$inlined$map$1$2$1;
        int i;
        Object b;
        vpr vprVar;
        com.yandex.passport.internal.ui.bouncer.model.r1 l1Var;
        Bundle extras;
        if (continuation instanceof ProcessFallbackResultMiddleware$accept$$inlined$map$1$2$1) {
            processFallbackResultMiddleware$accept$$inlined$map$1$2$1 = (ProcessFallbackResultMiddleware$accept$$inlined$map$1$2$1) continuation;
            int i2 = processFallbackResultMiddleware$accept$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                processFallbackResultMiddleware$accept$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = processFallbackResultMiddleware$accept$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = processFallbackResultMiddleware$accept$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.internal.ui.bouncer.model.v vVar = (com.yandex.passport.internal.ui.bouncer.model.v) obj;
                    vpr vprVar2 = this.a;
                    processFallbackResultMiddleware$accept$$inlined$map$1$2$1.L$0 = vprVar2;
                    processFallbackResultMiddleware$accept$$inlined$map$1$2$1.label = 1;
                    int i3 = vVar.a;
                    i0 i0Var = this.b;
                    if (i3 == -1) {
                        b = i0Var.b(vVar, processFallbackResultMiddleware$accept$$inlined$map$1$2$1);
                    } else if (i3 != 13) {
                        b = new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.l1("ProcessFallbackResultMiddleware", "Unknown result code: " + vVar.a));
                    } else {
                        Intent intent = vVar.b;
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                            if (!(serializable instanceof Exception)) {
                                serializable = null;
                            }
                            Exception exc = (Exception) serializable;
                            if (exc != null) {
                                l1Var = new com.yandex.passport.internal.ui.bouncer.model.m1(exc);
                                com.yandex.passport.internal.report.reporters.n nVar = i0Var.b;
                                nVar.getClass();
                                nVar.f(m4.w, new yd(!(l1Var instanceof com.yandex.passport.internal.ui.bouncer.model.m1) ? ((com.yandex.passport.internal.ui.bouncer.model.m1) l1Var).a : new Exception("No exception in fallback")));
                                b = new com.yandex.passport.internal.ui.bouncer.model.s(l1Var);
                            }
                        }
                        l1Var = new com.yandex.passport.internal.ui.bouncer.model.l1("ProcessFallbackResultMiddleware", "No exception in fallback");
                        com.yandex.passport.internal.report.reporters.n nVar2 = i0Var.b;
                        nVar2.getClass();
                        nVar2.f(m4.w, new yd(!(l1Var instanceof com.yandex.passport.internal.ui.bouncer.model.m1) ? ((com.yandex.passport.internal.ui.bouncer.model.m1) l1Var).a : new Exception("No exception in fallback")));
                        b = new com.yandex.passport.internal.ui.bouncer.model.s(l1Var);
                    }
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
                vprVar = (vpr) processFallbackResultMiddleware$accept$$inlined$map$1$2$1.L$0;
                kotlin.b.b(obj2);
                processFallbackResultMiddleware$accept$$inlined$map$1$2$1.L$0 = null;
                processFallbackResultMiddleware$accept$$inlined$map$1$2$1.label = 2;
            }
        }
        processFallbackResultMiddleware$accept$$inlined$map$1$2$1 = new ProcessFallbackResultMiddleware$accept$$inlined$map$1$2$1(this, continuation);
        Object obj22 = processFallbackResultMiddleware$accept$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = processFallbackResultMiddleware$accept$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        processFallbackResultMiddleware$accept$$inlined$map$1$2$1.L$0 = null;
        processFallbackResultMiddleware$accept$$inlined$map$1$2$1.label = 2;
    }
}
