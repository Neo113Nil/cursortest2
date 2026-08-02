package com.yandex.passport.internal.ui.sloth.menu;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.i0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class r implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ r(s sVar, int i) {
        this.a = i;
        this.b = sVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        s sVar = this.b;
        switch (i) {
            case 0:
                com.yandex.passport.internal.sloth.performers.usermenu.g gVar = (com.yandex.passport.internal.sloth.performers.usermenu.g) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New user menu event: " + gVar, 8);
                }
                Object emit = sVar.w.emit(gVar, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            case 1:
                i0 i0Var = (i0) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth commandRequest: " + i0Var, 8);
                }
                Object emit2 = sVar.b.emit(i0Var, continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : zy11Var;
            default:
                a1 a1Var = (a1) obj;
                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New sloth result: " + a1Var, 8);
                }
                Object emit3 = sVar.c.emit(a1Var, continuation);
                return emit3 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit3 : zy11Var;
        }
    }
}
