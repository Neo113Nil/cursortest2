package com.yandex.go.superapp.biometrics;

import com.yandex.go.superapp.biometrics.analytics.BiometricsAnalytics$BiometricsFlowFailureReason;
import com.yandex.go.superapp.biometrics.domain.b;
import defpackage.a831;
import defpackage.ck7;
import defpackage.d931;
import defpackage.e3n;
import defpackage.e931;
import defpackage.f931;
import defpackage.gcn;
import defpackage.gqq0;
import defpackage.h1p;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.n2u0;
import defpackage.n4e;
import defpackage.n831;
import defpackage.o430;
import defpackage.p0u0;
import defpackage.rqo;
import defpackage.s731;
import defpackage.t1u0;
import defpackage.t831;
import defpackage.tje;
import defpackage.tse;
import defpackage.ty5;
import defpackage.v831;
import defpackage.w511;
import defpackage.w731;
import defpackage.w831;
import defpackage.x731;
import defpackage.x831;
import defpackage.z731;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.eatskit.dto.BleErrorCode;
import ru.yandex.taxi.eatskit.dto.SdkErrorCode;

/* loaded from: classes14.dex */
public final class a {
    public final tse a;
    public final h1p b;
    public final ty5 c;
    public final rqo d;
    public final com.yandex.go.superapp.biometrics.domain.a e;
    public final b f;

    public a(tse tseVar, h1p h1pVar, ty5 ty5Var, rqo rqoVar, com.yandex.go.superapp.biometrics.domain.a aVar, b bVar) {
        this.a = tseVar;
        this.b = h1pVar;
        this.c = ty5Var;
        this.d = rqoVar;
        this.e = aVar;
        this.f = bVar;
    }

    public static final BiometricsAnalytics$BiometricsFlowFailureReason a(a aVar, x831 x831Var) {
        aVar.getClass();
        if (jl40.l(x831Var, n831.a)) {
            return BiometricsAnalytics$BiometricsFlowFailureReason.BleDisconnected;
        }
        if (jl40.l(x831Var, n831.b)) {
            return BiometricsAnalytics$BiometricsFlowFailureReason.CourierNotFound;
        }
        if (jl40.l(x831Var, n831.c)) {
            return BiometricsAnalytics$BiometricsFlowFailureReason.PermissionDenied;
        }
        if (jl40.l(x831Var, t831.a)) {
            return BiometricsAnalytics$BiometricsFlowFailureReason.BiometryCancelled;
        }
        if (jl40.l(x831Var, t831.b) || jl40.l(x831Var, t831.c)) {
            return BiometricsAnalytics$BiometricsFlowFailureReason.BiometryFailed;
        }
        if (jl40.l(x831Var, v831.a)) {
            return BiometricsAnalytics$BiometricsFlowFailureReason.Timeout;
        }
        if (jl40.l(x831Var, v831.b)) {
            return BiometricsAnalytics$BiometricsFlowFailureReason.UserTooFar;
        }
        if (x831Var instanceof w831) {
            return null;
        }
        w511.b();
        return null;
    }

    public static final n2u0 b(a aVar, x831 x831Var) {
        SdkErrorCode sdkErrorCode;
        BleErrorCode bleErrorCode;
        aVar.getClass();
        if (x831Var instanceof n831) {
            n831 n831Var = (n831) x831Var;
            if (n831Var.equals(n831.c)) {
                bleErrorCode = BleErrorCode.PERMISSION_ERROR;
            } else if (n831Var.equals(n831.b)) {
                bleErrorCode = BleErrorCode.CONNECTION_FAILED;
            } else {
                if (!n831Var.equals(n831.a)) {
                    w511.b();
                    return null;
                }
                bleErrorCode = BleErrorCode.DISCONNECTED;
            }
            return new n2u0((String) null, new s731(bleErrorCode), 1);
        }
        if (!(x831Var instanceof t831)) {
            if (jl40.l(x831Var, v831.a)) {
                return new n2u0((String) null, x731.INSTANCE, 1);
            }
            if (jl40.l(x831Var, v831.b)) {
                return new n2u0((String) null, z731.INSTANCE, 1);
            }
            if (x831Var instanceof w831) {
                return new n2u0(((w831) x831Var).a, (a831) null, 2);
            }
            w511.b();
            return null;
        }
        t831 t831Var = (t831) x831Var;
        if (t831Var.equals(t831.a)) {
            sdkErrorCode = SdkErrorCode.CANCEL;
        } else if (t831Var.equals(t831.b)) {
            sdkErrorCode = SdkErrorCode.INVALID_MASTER_TOKEN;
        } else {
            if (!t831Var.equals(t831.c)) {
                w511.b();
                return null;
            }
            sdkErrorCode = SdkErrorCode.UNKNOWN_ERROR;
        }
        return new n2u0((String) null, new w731(sdkErrorCode), 1);
    }

    public static ck7 h() {
        return new ck7(new IllegalStateException("UBS is disabled by experiment"));
    }

    public final void c(n4e n4eVar, gcn gcnVar) {
        e3n e3nVar;
        if (!d()) {
            gcnVar.a(h());
            return;
        }
        String str = n4eVar.a;
        Double d = n4eVar.b;
        if (d != null) {
            long doubleValue = (long) d.doubleValue();
            o430 o430Var = e3n.b;
            e3nVar = new e3n(kp50.V(doubleValue, DurationUnit.SECONDS));
        } else {
            e3nVar = null;
        }
        if (str == null || e3nVar == null) {
            gcnVar.a(new ck7(new IllegalArgumentException("serviceUuid and timeout are required")));
        } else {
            tje.N(this.a, null, null, new EatsKitBiometricVerificationDelegate$connectToCourier$1(this, str, e3nVar, gcnVar, null), 3);
        }
    }

    public final boolean d() {
        return ((Boolean) ((jbh) this.d).a(SimpleBooleanExperiment.UBS_VERIFICATION).b()).booleanValue();
    }

    public final void e(gqq0 gqq0Var, gcn gcnVar) {
        f931 f931Var;
        if (!d()) {
            gcnVar.a(h());
            return;
        }
        String str = gqq0Var.a;
        Boolean bool = gqq0Var.b;
        if (jl40.l(bool, Boolean.TRUE) && str != null) {
            f931Var = new e931(str);
        } else {
            if (!jl40.l(bool, Boolean.FALSE)) {
                gcnVar.a(new ck7(new IllegalArgumentException("verificationId and isSuccess are required")));
                return;
            }
            f931Var = d931.a;
        }
        tje.N(this.a, null, null, new EatsKitBiometricVerificationDelegate$sendVerificationResultToCourier$1(this, f931Var, gcnVar, null), 3);
    }

    public final void f(p0u0 p0u0Var, gcn gcnVar) {
        e3n e3nVar;
        if (!d()) {
            gcnVar.a(h());
            return;
        }
        Integer num = p0u0Var.b;
        Double d = p0u0Var.a;
        if (d != null) {
            long doubleValue = (long) d.doubleValue();
            o430 o430Var = e3n.b;
            e3nVar = new e3n(kp50.V(doubleValue, DurationUnit.SECONDS));
        } else {
            e3nVar = null;
        }
        if (num == null || e3nVar == null) {
            gcnVar.a(new ck7(new IllegalArgumentException("rssiThreshold and timeout are required")));
        } else {
            tje.N(this.a, null, null, new EatsKitBiometricVerificationDelegate$startCourierVerification$1(this, p0u0Var, num, e3nVar, gcnVar, null), 3);
        }
    }

    public final void g(t1u0 t1u0Var, gcn gcnVar) {
        if (!d()) {
            gcnVar.a(h());
            return;
        }
        Double d = t1u0Var.a;
        if (d == null) {
            gcnVar.a(new ck7(new IllegalArgumentException("timeout is required")));
            return;
        }
        long doubleValue = (long) d.doubleValue();
        o430 o430Var = e3n.b;
        tje.N(this.a, null, null, new EatsKitBiometricVerificationDelegate$startOrderVerification$1(this, t1u0Var, kp50.V(doubleValue, DurationUnit.SECONDS), gcnVar, null), 3);
    }
}
