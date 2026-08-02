package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.internal.ModernAccount;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class y0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ z0 b;

    public y0(vpr vprVar, z0 z0Var) {
        this.a = vprVar;
        this.b = z0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r7.emit(r8, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SetCurrentAccountMiddleware$accept$$inlined$map$1$2$1 setCurrentAccountMiddleware$accept$$inlined$map$1$2$1;
        int i;
        Object b;
        com.yandex.passport.internal.ui.bouncer.model.a0 a0Var;
        vpr vprVar;
        Throwable a;
        Object sVar;
        if (continuation instanceof SetCurrentAccountMiddleware$accept$$inlined$map$1$2$1) {
            setCurrentAccountMiddleware$accept$$inlined$map$1$2$1 = (SetCurrentAccountMiddleware$accept$$inlined$map$1$2$1) continuation;
            int i2 = setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.internal.ui.bouncer.model.a0 a0Var2 = (com.yandex.passport.internal.ui.bouncer.model.a0) obj;
                    ModernAccount modernAccount = a0Var2.a.a;
                    vpr vprVar2 = this.a;
                    setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.L$0 = vprVar2;
                    setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.L$1 = a0Var2;
                    setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.label = 1;
                    b = z0.b(this.b, modernAccount, setCurrentAccountMiddleware$accept$$inlined$map$1$2$1);
                    if (b != coroutineSingletons) {
                        a0Var = a0Var2;
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
                a0Var = (com.yandex.passport.internal.ui.bouncer.model.a0) setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.L$1;
                vprVar = (vpr) setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.L$0;
                kotlin.b.b(obj2);
                b = ((Result) obj2).getValue();
                a = Result.a(b);
                if (a != null) {
                    sVar = new com.yandex.passport.internal.ui.bouncer.model.l0(a0Var.a);
                } else {
                    sVar = new com.yandex.passport.internal.ui.bouncer.model.s(new com.yandex.passport.internal.ui.bouncer.model.m1(a));
                }
                setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.L$0 = null;
                setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.L$1 = null;
                setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.label = 2;
            }
        }
        setCurrentAccountMiddleware$accept$$inlined$map$1$2$1 = new SetCurrentAccountMiddleware$accept$$inlined$map$1$2$1(this, continuation);
        Object obj22 = setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.L$0 = null;
        setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.L$1 = null;
        setCurrentAccountMiddleware$accept$$inlined$map$1$2$1.label = 2;
    }
}
