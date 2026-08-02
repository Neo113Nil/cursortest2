package com.yandex.passport.internal.usecase.vpn;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.common.h;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.q;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e {
    public final b a;
    public final h b;
    public final j c;

    public e(b bVar, h hVar, j jVar) {
        this.a = bVar;
        this.b = hVar;
        this.c = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r8.a.c(r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        HandleVpnAppBackgroundStateUseCase$execute$1 handleVpnAppBackgroundStateUseCase$execute$1;
        int i;
        if (continuationImpl instanceof HandleVpnAppBackgroundStateUseCase$execute$1) {
            handleVpnAppBackgroundStateUseCase$execute$1 = (HandleVpnAppBackgroundStateUseCase$execute$1) continuationImpl;
            int i2 = handleVpnAppBackgroundStateUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                handleVpnAppBackgroundStateUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = handleVpnAppBackgroundStateUseCase$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = handleVpnAppBackgroundStateUseCase$execute$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "App in background", 8);
                        }
                        if (((Boolean) this.c.b(q.E0)).booleanValue()) {
                            handleVpnAppBackgroundStateUseCase$execute$1.label = 2;
                            if (this.b.c(handleVpnAppBackgroundStateUseCase$execute$1) == coroutineSingletons) {
                            }
                        }
                        return zy11Var;
                    }
                    handleVpnAppBackgroundStateUseCase$execute$1.label = 1;
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "App in foreground", 8);
                    return zy11Var;
                }
                return zy11Var;
            }
        }
        handleVpnAppBackgroundStateUseCase$execute$1 = new HandleVpnAppBackgroundStateUseCase$execute$1(this, continuationImpl);
        Object obj2 = handleVpnAppBackgroundStateUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = handleVpnAppBackgroundStateUseCase$execute$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        return zy11Var2;
    }
}
