package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.i0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class c0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ c0(d0 d0Var, int i) {
        this.a = i;
        this.b = d0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        d0 d0Var = this.b;
        switch (i) {
            case 0:
                i0 i0Var = (i0) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth commandRequest: " + i0Var, 8);
                }
                Object emit = d0Var.w.emit(i0Var, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            case 1:
                a1 a1Var = (a1) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth result: " + a1Var, 8);
                }
                Object emit2 = d0Var.x.emit(a1Var, continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : zy11Var;
            default:
                com.yandex.passport.sloth.u uVar = (com.yandex.passport.sloth.u) obj;
                if (uVar instanceof com.yandex.passport.sloth.q) {
                    d0Var.c.e("native.show_webview");
                }
                if (uVar instanceof com.yandex.passport.sloth.r) {
                    d0Var.c.e("webview.".concat(((com.yandex.passport.sloth.r) uVar).a));
                }
                return zy11Var;
        }
    }
}
