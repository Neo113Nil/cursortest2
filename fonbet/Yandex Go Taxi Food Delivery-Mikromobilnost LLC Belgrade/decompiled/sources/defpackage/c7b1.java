package defpackage;

import android.media.Image;
import android.util.SizeF;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.BillingServiceError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes11.dex */
public abstract class c7b1 {
    public static final void a(n8q0 n8q0Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1250159006);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n8q0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 12;
            a.j(n8q0Var.d, an91.m(c530.a, 16.0f, 0.0f, 2), 0L, 0L, 48.0f, tlsVar, tlsVar2, btsVar, (458752 & i3) | 48 | (i3 & 3670016), 12);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(n8q0Var, tlsVar, tlsVar2, i, 6);
        }
    }

    public static BillingServiceError b(chb chbVar, RuntimeException runtimeException) {
        String message = runtimeException instanceof YSError ? ((YSError) runtimeException).getMessage() : String.valueOf(runtimeException);
        ExternalErrorKind externalErrorKind = ExternalErrorKind.fail_3ds;
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.internal_sdk;
        String str = chbVar.a;
        String str2 = chbVar.b;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = chbVar.c;
        return new BillingServiceError(externalErrorKind, externalErrorTrigger, null, str, b64.l("Failed to handle 3ds challenge for response: ", oyr.t(b64.v("<DiehardResponse: status - ", str, ", code - ", str2, ", desc - "), str3 != null ? str3 : "null", ">"), ", error: \"", message));
    }

    public static final SizeF c(Image image, int i) {
        return (i == 90 || i == 270) ? new SizeF(image.getHeight(), image.getWidth()) : new SizeF(image.getWidth(), image.getHeight());
    }

    public static BillingServiceError d(String str, String str2, chb chbVar) {
        ExternalErrorKind externalErrorKind = ExternalErrorKind.fail_3ds;
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.diehard;
        String str3 = chbVar.a;
        String str4 = chbVar.b;
        if (str4 == null) {
            str4 = "null";
        }
        String str5 = chbVar.c;
        String t = oyr.t(b64.v("<DiehardResponse: status - ", str3, ", code - ", str4, ", desc - "), str5 != null ? str5 : "null", ">");
        StringBuilder v = b64.v("Invalid url \"", str, "\" for property \"", str2, "\" in response: ");
        v.append(t);
        return new BillingServiceError(externalErrorKind, externalErrorTrigger, null, str3, v.toString());
    }

    public static BillingServiceError e(String str, String str2, ggb ggbVar) {
        ExternalErrorKind externalErrorKind = ExternalErrorKind.fail_3ds;
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.mobile_backend;
        String str3 = ggbVar.a;
        String str4 = ggbVar.b;
        if (str4 == null) {
            str4 = "null";
        }
        String str5 = ggbVar.c;
        String t = oyr.t(b64.v("<MobileBackendResponse: status - ", str3, ", code - ", str4, ", desc - "), str5 != null ? str5 : "null", ">");
        StringBuilder v = b64.v("Invalid url \"", str, "\" for property \"", str2, "\" in response: ");
        v.append(t);
        return new BillingServiceError(externalErrorKind, externalErrorTrigger, null, str3, v.toString());
    }

    public static BillingServiceError f(chb chbVar) {
        ExternalErrorKind c = tia1.c(chbVar);
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.diehard;
        String str = chbVar.a;
        String str2 = chbVar.b;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = chbVar.c;
        String str4 = str3 != null ? str3 : "null";
        StringBuilder v = b64.v("<DiehardResponse: status - ", str, ", code - ", str2, ", desc - ");
        v.append(str4);
        v.append(">");
        return new BillingServiceError(c, externalErrorTrigger, null, str, "Undefined check payment status: ".concat(v.toString()));
    }
}
