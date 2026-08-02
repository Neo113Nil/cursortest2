package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import defpackage.jl40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class e1 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ e1(f1 f1Var, int i) {
        this.a = i;
        this.b = f1Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object j;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f1 f1Var = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.sloth.a1 a1Var = (com.yandex.passport.sloth.a1) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth result: " + a1Var, 8);
                }
                if (!jl40.l(a1Var, com.yandex.passport.sloth.d.a)) {
                    if (!jl40.l(a1Var, com.yandex.passport.sloth.j0.a)) {
                        f1Var.x.j(com.yandex.passport.sloth.j.b(a1Var), WebAmReporter$Companion$EventPlace.DELETE_FOREVER_ACCOUNT);
                        break;
                    } else {
                        y0 y0Var = f1Var.c;
                        j = (y0Var != null ? y0Var : null).j(p0.b, continuation);
                        if (j != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        }
                    }
                } else {
                    y0 y0Var2 = f1Var.c;
                    j = (y0Var2 != null ? y0Var2 : null).j(p0.a, continuation);
                    if (j != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                }
                break;
            default:
                com.yandex.passport.sloth.i0 i0Var = (com.yandex.passport.sloth.i0) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth external request: " + i0Var, 8);
                }
                if (!(i0Var instanceof com.yandex.passport.sloth.c0)) {
                    f1Var.x.j(i0Var.toString(), WebAmReporter$Companion$EventPlace.DELETE_FOREVER_ACCOUNT);
                    break;
                } else {
                    y0 y0Var3 = f1Var.c;
                    Object j2 = (y0Var3 != null ? y0Var3 : null).j(p0.c, continuation);
                    if (j2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
