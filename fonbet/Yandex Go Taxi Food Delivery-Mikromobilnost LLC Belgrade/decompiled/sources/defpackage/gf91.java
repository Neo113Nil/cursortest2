package defpackage;

import androidx.compose.runtime.f;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public abstract class gf91 {
    public static final byte[] a = {5, -36, PKIBody._RP, 97, -27, -117, -29, -27};
    public static final byte[] b = {106, -78, 93, 9, -118, -27, -122, -79, 119, -67, 99, 18, -125, -18, -111, -89, Alerts.alert_no_renegotiation, -78, 102, Alerts.alert_decode_error, DerValue.TAG_CONTEXT, -25, -122, -122, Alerts.alert_bad_certificate_status_response, -71, 105};
    public static final byte[] c = {98, -71, 121, 62, -106, -2, -124, -126, 96, -81, 121, 4, -127, -44, -127, -124, 107, -73, 126};
    public static final byte[] d = {98, -71, 121, 62, -121, -22, -115, -114, 118, -125, Alerts.alert_certificate_unobtainable, 24, -70, -23, -118, -122};
    public static final byte[] e = {106, -78, DerValue.TAG_APPLICATION, 4, -41, -58, -122, -79, 106, -84, Alerts.alert_no_application_protocol, PKIBody._CANN, -89, -22, -115, -114, 86, -71, 97, 4, -122, -1, -122, -127};
    public static final byte[] f = {106, -78, 82, PKIBody._CCP, DerValue.TAG_CONTEXT, -4, -68, -120, 55, -79, 82, 3, -124, -27, -120, -70, 118, -71, 97, 4, -122, -1, -122, -127, Alerts.alert_user_canceled, -67, Alerts.alert_unsupported_extension, 21, -116, -28, -115};
    public static final byte[] g = {103, -67, 99, 10, -106};
    public static final byte[] h = {103, -67, 99, 10, -70, -30, -121};
    public static final byte[] i = {103, -67, 99, 10, -70, -30, -121};
    public static final byte[] j = {103, -67, 99, 10, -70, -30, -115, -125, 106};
    public static final byte[] k = {103, -67, 99, 10, -84, -17};
    public static final byte[] l = {Alerts.alert_bad_certificate_status_response, -67, Byte.MAX_VALUE, 6, DerValue.TAG_CONTEXT, -1, -68, -121, Alerts.alert_no_renegotiation, -78, 102, 62, -116, -17};
    public static final byte[] m = {103, -67, 99, 10, -70, -25, -116, -126, 106};
    public static final byte[] n = {86, -103, 65, 36, -90, -33, -68, -73, DerValue.TAG_APPLICATION, -97, 72, Alerts.alert_handshake_failure, -77, -50, -79, -70, Alerts.alert_insufficient_security, -99, 67, Alerts.alert_bad_certificate, -70, -39, -90, -74, Alerts.alert_internal_error, -112, 89, 62, -82, -50, -70};
    public static final byte[] o = {103, -67, 99, 10};

    public static final void a(uca0 uca0Var, tls tlsVar, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-67974073);
        int i4 = 4;
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (btsVar.k(uca0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i6 = 0;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = f.j(evu0.k0(uca0Var.b).toString());
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            cx20.a(null, null, null, null, null, false, false, wwg.S(-1026653155, true, new pca0(tlsVar, oz40Var, i6), btsVar), wwg.S(548744533, true, new ls40(i4, oz40Var, uca0Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(uca0Var, tlsVar, i2, i5);
        }
    }

    public static String b() {
        byte[] bArr = new byte[31];
        for (int i2 = 0; i2 < 31; i2++) {
            bArr[i2] = (byte) (n[i2] ^ a[i2 % 8]);
        }
        return new String(bArr, uza.a);
    }

    public static final void c(RobotoTextView robotoTextView, as60 as60Var) {
        if (as60Var == null) {
            robotoTextView.setVisibility(8);
            return;
        }
        int i2 = as60Var.c;
        robotoTextView.setText(as60Var.a);
        kdc kdcVar = as60Var.b;
        robotoTextView.setBackgroundColor(kdcVar != null ? s8o.m(kdcVar, robotoTextView.getContext()) : 0);
        robotoTextView.setMinHeight(tje.u(i2, robotoTextView.getContext()));
        robotoTextView.setMinWidth(tje.u(i2, robotoTextView.getContext()));
        robotoTextView.setVisibility(0);
    }
}
