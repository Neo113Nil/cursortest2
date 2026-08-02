package defpackage;

import com.yandex.xplat.payment.sdk.CardVerificationError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;

/* loaded from: classes11.dex */
public abstract class ggb1 {
    public static au2 a;

    public static CardVerificationError a(cib cibVar) {
        ExternalErrorKind externalErrorKind = ExternalErrorKind.fail_3ds;
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.mobile_backend;
        String str = cibVar.a;
        String str2 = cibVar.c;
        String str3 = cibVar.b;
        return new CardVerificationError(externalErrorKind, externalErrorTrigger, null, str, b64.l("Invalid redirectUrl \"", str2, "\" in response: ", oyr.t(b64.v("<VerificationResponse: status - ", str, ", status code - ", str3, ", rc - "), cibVar.e, ">")));
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("Location", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(zp2.d);
        a6t0 a6t0Var2 = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(12.34f, 19.29f);
        uq90Var.i(-1.92f, -5.12f);
        uq90Var.i(-0.16f, -0.43f);
        uq90Var.i(-0.43f, -0.16f);
        uq90Var.i(-5.12f, -1.92f);
        uq90Var.h(17.59f, 6.4f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 2.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, a6t0Var2, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final lum c(tls tlsVar) {
        return new lum(new qls0(9), p9u0.a, new uwl0(13, tlsVar), q9u0.a);
    }
}
