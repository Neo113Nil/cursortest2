package com.yandex.passport.internal;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.VpnStatus;
import com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class p implements vpr {
    public final /* synthetic */ PassportProcessGlobalComponent a;
    public final /* synthetic */ Context b;

    public p(PassportProcessGlobalComponent passportProcessGlobalComponent, Context context, tse tseVar) {
        this.a = passportProcessGlobalComponent;
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Triple triple, Continuation continuation) {
        PassportInitialization$initCheckVpnStatus$1$1$4$emit$1 passportInitialization$initCheckVpnStatus$1$1$4$emit$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean booleanValue;
        boolean z;
        VpnStatus vpnStatus;
        ?? r7;
        p pVar;
        int i2;
        boolean booleanValue2;
        if (continuation instanceof PassportInitialization$initCheckVpnStatus$1$1$4$emit$1) {
            passportInitialization$initCheckVpnStatus$1$1$4$emit$1 = (PassportInitialization$initCheckVpnStatus$1$1$4$emit$1) continuation;
            int i3 = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                passportInitialization$initCheckVpnStatus$1$1$4$emit$1.label = i3 - Integer.MIN_VALUE;
                obj = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    VpnStatus vpnStatus2 = (VpnStatus) triple.getFirst();
                    booleanValue = ((Boolean) triple.getSecond()).booleanValue();
                    boolean booleanValue3 = ((Boolean) triple.getThird()).booleanValue();
                    boolean z2 = booleanValue && booleanValue3;
                    com.yandex.passport.internal.usecase.vpn.e handleVpnAppBackgroundStateUseCase = this.a.getHandleVpnAppBackgroundStateUseCase();
                    passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$0 = this;
                    passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$1 = vpnStatus2;
                    passportInitialization$initCheckVpnStatus$1$1$4$emit$1.Z$0 = booleanValue;
                    passportInitialization$initCheckVpnStatus$1$1$4$emit$1.Z$1 = booleanValue3;
                    passportInitialization$initCheckVpnStatus$1$1$4$emit$1.I$0 = z2 ? 1 : 0;
                    passportInitialization$initCheckVpnStatus$1$1$4$emit$1.label = 1;
                    if (handleVpnAppBackgroundStateUseCase.a(z2, passportInitialization$initCheckVpnStatus$1$1$4$emit$1) != coroutineSingletons) {
                        z = booleanValue3;
                        vpnStatus = vpnStatus2;
                        r7 = z2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.I$0;
                    vpnStatus = (VpnStatus) passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$1;
                    pVar = (p) passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$0;
                    kotlin.b.b(obj);
                    booleanValue2 = ((Boolean) obj).booleanValue();
                    zy11 zy11Var = zy11.a;
                    if (!booleanValue2) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "isVpnChallengeActivityDisabled = true", 8);
                            return zy11Var;
                        }
                    } else if (vpnStatus instanceof VpnStatus.Blocked) {
                        VpnChallengeActivity.Companion.getClass();
                        if (!com.yandex.passport.internal.ui.challenge.vpn.a.b() && i2 == 0) {
                            Intent a = com.yandex.passport.internal.ui.challenge.vpn.a.a(pVar.b, ((VpnStatus.Blocked) vpnStatus).getUrl());
                            a.addFlags(SelfTester_JCP.IMITA);
                            try {
                                pVar.b.startActivity(a);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    return zy11Var;
                }
                int i4 = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.I$0;
                boolean z3 = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.Z$1;
                booleanValue = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.Z$0;
                VpnStatus vpnStatus3 = (VpnStatus) passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$1;
                p pVar2 = (p) passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$0;
                kotlin.b.b(obj);
                r7 = i4;
                this = pVar2;
                z = z3;
                vpnStatus = vpnStatus3;
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    LogLevel logLevel = LogLevel.DEBUG;
                    StringBuilder sb = new StringBuilder("checkVpnStatusUseCase ");
                    sb.append(vpnStatus);
                    sb.append(HexString.CHAR_SPACE);
                    VpnChallengeActivity.Companion.getClass();
                    sb.append(com.yandex.passport.internal.ui.challenge.vpn.a.b());
                    sb.append(" hostIsInBackground=");
                    sb.append(booleanValue);
                    sb.append(" passportIsInBackground=");
                    sb.append(z);
                    com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
                }
                com.yandex.passport.internal.usecase.vpn.b checkVpnStatusUseCase = this.a.getCheckVpnStatusUseCase();
                passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$0 = this;
                passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$1 = vpnStatus;
                passportInitialization$initCheckVpnStatus$1$1$4$emit$1.I$0 = r7;
                passportInitialization$initCheckVpnStatus$1$1$4$emit$1.label = 2;
                obj = checkVpnStatusUseCase.d(passportInitialization$initCheckVpnStatus$1$1$4$emit$1);
                if (obj != coroutineSingletons) {
                    pVar = this;
                    i2 = r7;
                    booleanValue2 = ((Boolean) obj).booleanValue();
                    zy11 zy11Var2 = zy11.a;
                    if (!booleanValue2) {
                    }
                    return zy11Var2;
                }
                return coroutineSingletons;
            }
        }
        passportInitialization$initCheckVpnStatus$1$1$4$emit$1 = new PassportInitialization$initCheckVpnStatus$1$1$4$emit$1(this, continuation);
        obj = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportInitialization$initCheckVpnStatus$1$1$4$emit$1.label;
        if (i != 0) {
        }
        com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        com.yandex.passport.internal.usecase.vpn.b checkVpnStatusUseCase2 = this.a.getCheckVpnStatusUseCase();
        passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$0 = this;
        passportInitialization$initCheckVpnStatus$1$1$4$emit$1.L$1 = vpnStatus;
        passportInitialization$initCheckVpnStatus$1$1$4$emit$1.I$0 = r7;
        passportInitialization$initCheckVpnStatus$1$1$4$emit$1.label = 2;
        obj = checkVpnStatusUseCase2.d(passportInitialization$initCheckVpnStatus$1$1$4$emit$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
