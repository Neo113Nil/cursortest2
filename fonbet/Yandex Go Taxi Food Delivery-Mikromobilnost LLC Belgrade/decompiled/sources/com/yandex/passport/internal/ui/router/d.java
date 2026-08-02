package com.yandex.passport.internal.ui.router;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.m50;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        m50 m50Var;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                GlobalRouterActivity globalRouterActivity = (GlobalRouterActivity) obj2;
                j jVar = (j) obj;
                if (jl40.l(jVar, h.a)) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Global Route was cancelled", 8);
                    }
                    globalRouterActivity.finish();
                    return zy11Var;
                }
                if (!(jVar instanceof k)) {
                    w511.b();
                    return null;
                }
                m50Var = globalRouterActivity.routingLauncher;
                m50Var.a(jVar);
                return zy11Var;
            default:
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "start publishActualStatus triggered by host", 8);
                }
                Object e = ((com.yandex.passport.internal.usecase.vpn.b) obj2).e("data_changed", continuation);
                return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : zy11Var;
        }
    }
}
