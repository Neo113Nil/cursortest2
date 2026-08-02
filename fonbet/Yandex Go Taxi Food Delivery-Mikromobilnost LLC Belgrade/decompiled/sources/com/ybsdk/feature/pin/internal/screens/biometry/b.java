package com.ybsdk.feature.pin.internal.screens.biometry;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$ChangePinBiometryResultResult;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$ForgotPinBiometryResultResult;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$ReissuePinBiometryResultResult;
import com.ybsdk.core.analytics.generated.delegates.PinEvents$SetupPinBiometryResultResult;
import defpackage.ay5;
import defpackage.bgc;
import defpackage.ds31;
import defpackage.em3;
import defpackage.fcy0;
import defpackage.frp0;
import defpackage.p6s0;
import defpackage.quz;
import defpackage.ry5;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.trp0;
import defpackage.uc5;
import defpackage.ux5;
import defpackage.w511;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final BiometricScreenParams B;
    public final AppAnalyticsReporter C;
    public final ux5 D;
    public final com.ybsdk.feature.pin.internal.domain.a E;
    public final com.ybsdk.feature.pin.internal.domain.b F;
    public final tfl0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BiometricScreenParams biometricScreenParams, AppAnalyticsReporter appAnalyticsReporter, ux5 ux5Var, com.ybsdk.feature.pin.internal.domain.a aVar, com.ybsdk.feature.pin.internal.domain.b bVar, tfl0 tfl0Var) {
        super(new bgc(12), new quz(24));
        com.ybsdk.core.analytics.a aVar2 = appAnalyticsReporter.S.a;
        this.B = biometricScreenParams;
        this.C = appAnalyticsReporter;
        this.D = ux5Var;
        this.E = aVar;
        this.F = bVar;
        this.G = tfl0Var;
        int i = ry5.a[biometricScreenParams.getAnalyticsScenario().ordinal()];
        if (i == 1) {
            aVar2.a("setup_pin.show_biometry_setup", null);
        } else if (i == 2) {
            aVar2.a("change_pin.show_biometry_setup", null);
        } else if (i == 3) {
            aVar2.a("forgot_pin.show_biometry_setup", null);
        } else if (i == 4) {
            aVar2.a("reissue_pin.show_biometry_setup", null);
        }
        tje.N(ds31.a(this), null, null, new BiometricViewModel$3(this, null), 3);
    }

    public final void b0(ay5 ay5Var) {
        tje.N(ds31.a(this), null, null, new BiometricViewModel$encryptBiometric$1(this, ay5Var, null), 3);
    }

    public final com.ybsdk.feature.pin.internal.domain.a c0() {
        return this.E;
    }

    public final void d0(Throwable th) {
        tje.N(ds31.a(this), null, null, new BiometricViewModel$onBiometricException$1(this, th, null), 3);
    }

    public final void e0() {
        this.C.m0.a.a("tech.biometry.enable.click", null);
        Z(new p6s0(this.D));
    }

    public final void f0() {
        this.C.m0.a.a("tech.biometry.prompt.canceled", null);
    }

    public final void g0(int i) {
        fcy0 fcy0Var = this.C.m0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("error_code", Integer.valueOf(i));
        fcy0Var.a.a("tech.biometry.prompt.error", linkedHashMap);
    }

    public final void h0() {
        i0(BiometricViewModel$PinSkipableResult.SKIP);
        this.G.e();
        trp0 trp0Var = trp0.a;
        trp0.f(new frp0(true, false));
    }

    public final void i0(BiometricViewModel$PinSkipableResult biometricViewModel$PinSkipableResult) {
        PinEvents$SetupPinBiometryResultResult pinEvents$SetupPinBiometryResultResult;
        PinEvents$ChangePinBiometryResultResult pinEvents$ChangePinBiometryResultResult;
        PinEvents$ForgotPinBiometryResultResult pinEvents$ForgotPinBiometryResultResult;
        PinEvents$ReissuePinBiometryResultResult pinEvents$ReissuePinBiometryResultResult;
        int i = ry5.a[this.B.getAnalyticsScenario().ordinal()];
        AppAnalyticsReporter appAnalyticsReporter = this.C;
        if (i == 1) {
            em3 em3Var = appAnalyticsReporter.S;
            biometricViewModel$PinSkipableResult.getClass();
            int i2 = a.a[biometricViewModel$PinSkipableResult.ordinal()];
            if (i2 == 1) {
                pinEvents$SetupPinBiometryResultResult = PinEvents$SetupPinBiometryResultResult.OK;
            } else if (i2 == 2) {
                pinEvents$SetupPinBiometryResultResult = PinEvents$SetupPinBiometryResultResult.SKIP;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return;
                }
                pinEvents$SetupPinBiometryResultResult = PinEvents$SetupPinBiometryResultResult.ERROR;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$SetupPinBiometryResultResult.getOriginalValue());
            em3Var.a.a("setup_pin.biometry_result", linkedHashMap);
            return;
        }
        if (i == 2) {
            em3 em3Var2 = appAnalyticsReporter.S;
            biometricViewModel$PinSkipableResult.getClass();
            int i3 = a.a[biometricViewModel$PinSkipableResult.ordinal()];
            if (i3 == 1) {
                pinEvents$ChangePinBiometryResultResult = PinEvents$ChangePinBiometryResultResult.OK;
            } else if (i3 == 2) {
                pinEvents$ChangePinBiometryResultResult = PinEvents$ChangePinBiometryResultResult.SKIP;
            } else {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                pinEvents$ChangePinBiometryResultResult = PinEvents$ChangePinBiometryResultResult.ERROR;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$ChangePinBiometryResultResult.getOriginalValue());
            em3Var2.a.a("change_pin.biometry_result", linkedHashMap2);
            return;
        }
        if (i == 3) {
            em3 em3Var3 = appAnalyticsReporter.S;
            biometricViewModel$PinSkipableResult.getClass();
            int i4 = a.a[biometricViewModel$PinSkipableResult.ordinal()];
            if (i4 == 1) {
                pinEvents$ForgotPinBiometryResultResult = PinEvents$ForgotPinBiometryResultResult.OK;
            } else if (i4 == 2) {
                pinEvents$ForgotPinBiometryResultResult = PinEvents$ForgotPinBiometryResultResult.SKIP;
            } else {
                if (i4 != 3) {
                    w511.b();
                    return;
                }
                pinEvents$ForgotPinBiometryResultResult = PinEvents$ForgotPinBiometryResultResult.ERROR;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(1);
            linkedHashMap3.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$ForgotPinBiometryResultResult.getOriginalValue());
            em3Var3.a.a("forgot_pin.biometry_result", linkedHashMap3);
            return;
        }
        if (i != 4) {
            return;
        }
        em3 em3Var4 = appAnalyticsReporter.S;
        biometricViewModel$PinSkipableResult.getClass();
        int i5 = a.a[biometricViewModel$PinSkipableResult.ordinal()];
        if (i5 == 1) {
            pinEvents$ReissuePinBiometryResultResult = PinEvents$ReissuePinBiometryResultResult.OK;
        } else if (i5 == 2) {
            pinEvents$ReissuePinBiometryResultResult = PinEvents$ReissuePinBiometryResultResult.SKIP;
        } else {
            if (i5 != 3) {
                w511.b();
                return;
            }
            pinEvents$ReissuePinBiometryResultResult = PinEvents$ReissuePinBiometryResultResult.ERROR;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(1);
        linkedHashMap4.put(TarifficatorScenarioActivity.RESULT_KEY, pinEvents$ReissuePinBiometryResultResult.getOriginalValue());
        em3Var4.a.a("reissue_pin.biometry_result", linkedHashMap4);
    }
}
