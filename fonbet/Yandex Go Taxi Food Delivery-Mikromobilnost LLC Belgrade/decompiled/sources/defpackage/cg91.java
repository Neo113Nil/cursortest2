package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.yandex.xplat.payment.sdk.DiehardBackendApiError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.ybsdk.core.utils.ext.d;
import com.ybsdk.core.utils.ext.view.b;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.VMInspector.Depends;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes3.dex */
public abstract class cg91 {
    public static final byte[] a = {68, 9, 102, DerValue.tag_UniversalString, -33, -124, -28, 24};
    public static final byte[] b = {38, 104, 8, 119, -84};
    public static final byte[] c = {38, 104, 8, 119, -84};
    public static final byte[] d = {38, 104, 8, 119, DerValue.TAG_CONTEXT, -19, DerValue.TAG_CONTEXT};
    public static final byte[] e = {61, 104, 8, Alerts.alert_no_application_protocol, -70, -4, -69, 122, 37, 103, PKIBody._RP, 67, -81, -27, -99, 116, Alerts.alert_unsupported_certificate, 104, 2};
    public static final byte[] f = {23, 107, 22, 93, -68, -25, -117, 109, Alerts.alert_bad_certificate, 125, 36, 125, -79, -17, -105, 75, 39, 123, 3, 121, -79};
    public static final byte[] g = {6, 72, Alerts.alert_handshake_failure, 87, DerValue.TAG_CONTEXT, -53, -94, 94, 1, 91, 53};

    public static final void a(rz20 rz20Var, fid fidVar, int i) {
        rz20 rz20Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-379141727);
        int i2 = (btsVar.k(rz20Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            dad.a.getClass();
            rz20Var2 = rz20Var;
            qy20.a(rz20Var2, null, null, false, dad.b, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 14);
        } else {
            rz20Var2 = rz20Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sc20(rz20Var2, i, 27);
        }
    }

    public static DiehardBackendApiError b(whj whjVar, int i) {
        ExternalErrorKind c2 = tia1.c(whjVar);
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.diehard;
        Integer valueOf = Integer.valueOf(i);
        String str = whjVar.a;
        String str2 = whjVar.b;
        String str3 = Depends.NOT_AVAILABLE;
        if (str2 == null) {
            str2 = Depends.NOT_AVAILABLE;
        }
        String str4 = whjVar.d;
        if (str4 == null) {
            str4 = Depends.NOT_AVAILABLE;
        }
        String str5 = whjVar.c;
        if (str5 != null) {
            str3 = str5;
        }
        StringBuilder v = unr0.v(i, "Diehard Error: http_code - ", ", status - ", str, ", status_code - ");
        g8e.D(v, str2, ", status_3ds - ", str4, ", description - ");
        v.append(str3);
        return new DiehardBackendApiError(c2, externalErrorTrigger, valueOf, v.toString(), str, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void c(View view, qk31 qk31Var) {
        d hapticFeedbackHelper;
        i5z0.a.a("Vibration called", new Object[0]);
        Fragment u = b.u(view, true);
        if (u != null) {
            ?? r0 = u;
            while (true) {
                if (r0 == 0) {
                    xx60 activity = u.getActivity();
                    if (!(activity instanceof y6u)) {
                        activity = null;
                    }
                    y6u y6uVar = (y6u) activity;
                    r0 = y6uVar == null ? 0 : y6uVar;
                } else if (r0 instanceof y6u) {
                    break;
                } else {
                    r0 = r0.getParentFragment();
                }
            }
            y6u y6uVar2 = (y6u) r0;
            if (y6uVar2 == null || (hapticFeedbackHelper = y6uVar2.getHapticFeedbackHelper()) == null) {
                return;
            }
            hapticFeedbackHelper.a(qk31Var);
        }
    }
}
