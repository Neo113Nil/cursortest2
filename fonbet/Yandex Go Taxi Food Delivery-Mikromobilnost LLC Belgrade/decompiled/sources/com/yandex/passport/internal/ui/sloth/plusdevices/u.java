package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.sloth.a1;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class u implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ PassportProcessGlobalComponent b;
    public final /* synthetic */ com.yandex.passport.sloth.data.q c;
    public final /* synthetic */ v w;

    public /* synthetic */ u(PassportProcessGlobalComponent passportProcessGlobalComponent, com.yandex.passport.sloth.data.q qVar, v vVar, int i) {
        this.a = i;
        this.b = passportProcessGlobalComponent;
        this.c = qVar;
        this.w = vVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        v vVar = this.w;
        com.yandex.passport.sloth.data.q qVar = this.c;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.b;
        switch (i) {
            case 0:
                a1 a1Var = (a1) obj;
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New event: " + a1Var, 8);
                }
                if (!(a1Var instanceof com.yandex.passport.sloth.a)) {
                    return zy11Var;
                }
                passportProcessGlobalComponent.getManagingPlusDevicesReporter().m(qVar != null ? qVar.a : null, qVar != null ? qVar.w : null, qVar != null ? qVar.x : null, ((com.yandex.passport.sloth.a) a1Var).a);
                Object emit = vVar.b.emit(new Integer(-1), continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            default:
                com.yandex.passport.sloth.i0 i0Var = (com.yandex.passport.sloth.i0) obj;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "New request: " + i0Var, 8);
                }
                if (!(i0Var instanceof com.yandex.passport.sloth.a0)) {
                    return zy11Var;
                }
                com.yandex.passport.sloth.a0 a0Var = (com.yandex.passport.sloth.a0) i0Var;
                passportProcessGlobalComponent.getManagingPlusDevicesReporter().j(qVar != null ? qVar.a : null, qVar != null ? qVar.w : null, qVar != null ? qVar.x : null, a0Var.b);
                Object emit2 = vVar.b.emit(new Integer(a0Var.a instanceof InvalidTokenException ? 401 : 1112), continuation);
                return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : zy11Var;
        }
    }
}
