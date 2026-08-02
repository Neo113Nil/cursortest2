package com.yandex.go.cryptosdk;

import com.yandex.passport.api.KPassportEnvironment;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.e0;
import com.yandex.passport.api.f0;
import com.yandex.passport.api.g;
import com.yandex.passport.api.g0;
import com.yandex.passport.api.h0;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.impl.o;
import com.yandex.passport.internal.properties.BiometricVerificationPropertiesImpl;
import com.yandex.passport.internal.ui.c;
import defpackage.fl3;
import defpackage.gy5;
import defpackage.hl3;
import defpackage.hy5;
import defpackage.ip90;
import defpackage.iy5;
import defpackage.jl40;
import defpackage.ky5;
import defpackage.ly5;
import defpackage.ny61;
import defpackage.u02;
import defpackage.w511;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.am.m;

/* loaded from: classes12.dex */
public final class a {
    public final u02 a;
    public final ip90 b;
    public final m c;

    public a(u02 u02Var, ip90 ip90Var, m mVar) {
        this.a = u02Var;
        this.b = ip90Var;
        this.c = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0112, code lost:
    
        if (r12 != r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(iy5 iy5Var, String str, ContinuationImpl continuationImpl) {
        BiometricVerificationNavigatorImpl$verifyBiometrics$1 biometricVerificationNavigatorImpl$verifyBiometrics$1;
        int i;
        String str2;
        g gVar;
        long j;
        if (continuationImpl instanceof BiometricVerificationNavigatorImpl$verifyBiometrics$1) {
            biometricVerificationNavigatorImpl$verifyBiometrics$1 = (BiometricVerificationNavigatorImpl$verifyBiometrics$1) continuationImpl;
            int i2 = biometricVerificationNavigatorImpl$verifyBiometrics$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                biometricVerificationNavigatorImpl$verifyBiometrics$1.label = i2 - Integer.MIN_VALUE;
                Object obj = biometricVerificationNavigatorImpl$verifyBiometrics$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = biometricVerificationNavigatorImpl$verifyBiometrics$1.label;
                if (i != 0) {
                    b.b(obj);
                    hl3 a = this.c.a();
                    fl3 fl3Var = a instanceof fl3 ? (fl3) a : null;
                    if (fl3Var == null) {
                        return ky5.c;
                    }
                    long j2 = fl3Var.a;
                    g a2 = this.b.a();
                    BiometricVerificationPropertiesImpl.a aVar = new BiometricVerificationPropertiesImpl.a();
                    if (jl40.l(iy5Var, gy5.a)) {
                        str2 = "ebs_age_18";
                    } else if (jl40.l(iy5Var, gy5.b)) {
                        str2 = "ebs_age_21";
                    } else {
                        if (!(iy5Var instanceof hy5)) {
                            w511.b();
                            return null;
                        }
                        str2 = ((hy5) iy5Var).a;
                    }
                    aVar.a = str2;
                    aVar.c = str;
                    this.a.getClass();
                    aVar.b = c.c(KPassportEnvironment.PRODUCTION, j2);
                    BiometricVerificationPropertiesImpl.Companion.getClass();
                    String flowId = aVar.getFlowId();
                    k2 uid = aVar.getUid();
                    PassportUidImpl.Companion.getClass();
                    BiometricVerificationPropertiesImpl biometricVerificationPropertiesImpl = new BiometricVerificationPropertiesImpl(l2.a(uid), flowId, aVar.getServiceId(), aVar.getTheme());
                    biometricVerificationNavigatorImpl$verifyBiometrics$1.L$0 = null;
                    biometricVerificationNavigatorImpl$verifyBiometrics$1.L$1 = null;
                    biometricVerificationNavigatorImpl$verifyBiometrics$1.L$2 = null;
                    biometricVerificationNavigatorImpl$verifyBiometrics$1.L$3 = a2;
                    biometricVerificationNavigatorImpl$verifyBiometrics$1.J$0 = j2;
                    biometricVerificationNavigatorImpl$verifyBiometrics$1.label = 1;
                    o oVar = (o) a2;
                    oVar.getClass();
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, "[EBS]", "startBiometricVerification", 8);
                    }
                    oVar.r.a(biometricVerificationPropertiesImpl);
                    if (zy11.a != coroutineSingletons) {
                        gVar = a2;
                        j = j2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    h0 h0Var = (h0) obj;
                    if (jl40.l(h0Var, e0.a)) {
                        return ky5.a;
                    }
                    if (h0Var instanceof f0) {
                        return ky5.b;
                    }
                    if (h0Var instanceof g0) {
                        return new ly5(((g0) h0Var).a);
                    }
                    w511.b();
                    return null;
                }
                j = biometricVerificationNavigatorImpl$verifyBiometrics$1.J$0;
                gVar = (g) biometricVerificationNavigatorImpl$verifyBiometrics$1.L$3;
                b.b(obj);
                n0 n0Var = ((o) gVar).m;
                biometricVerificationNavigatorImpl$verifyBiometrics$1.L$0 = null;
                biometricVerificationNavigatorImpl$verifyBiometrics$1.L$1 = null;
                biometricVerificationNavigatorImpl$verifyBiometrics$1.L$2 = null;
                biometricVerificationNavigatorImpl$verifyBiometrics$1.L$3 = null;
                biometricVerificationNavigatorImpl$verifyBiometrics$1.J$0 = j;
                biometricVerificationNavigatorImpl$verifyBiometrics$1.label = 2;
                obj = e.y(n0Var, biometricVerificationNavigatorImpl$verifyBiometrics$1);
            }
        }
        biometricVerificationNavigatorImpl$verifyBiometrics$1 = new BiometricVerificationNavigatorImpl$verifyBiometrics$1(this, continuationImpl);
        Object obj2 = biometricVerificationNavigatorImpl$verifyBiometrics$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = biometricVerificationNavigatorImpl$verifyBiometrics$1.label;
        if (i != 0) {
        }
        n0 n0Var2 = ((o) gVar).m;
        biometricVerificationNavigatorImpl$verifyBiometrics$1.L$0 = null;
        biometricVerificationNavigatorImpl$verifyBiometrics$1.L$1 = null;
        biometricVerificationNavigatorImpl$verifyBiometrics$1.L$2 = null;
        biometricVerificationNavigatorImpl$verifyBiometrics$1.L$3 = null;
        biometricVerificationNavigatorImpl$verifyBiometrics$1.J$0 = j;
        biometricVerificationNavigatorImpl$verifyBiometrics$1.label = 2;
        obj2 = e.y(n0Var2, biometricVerificationNavigatorImpl$verifyBiometrics$1);
    }
}
