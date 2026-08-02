package defpackage;

import com.yandex.payment.common.result.ResultType;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.xplat.common.c;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes3.dex */
public abstract class hg91 {
    public static final byte[] a = {-91, -75, 109, Alerts.alert_illegal_parameter, -20, 124, 31, 79};
    public static final byte[] b = {-57, -44, 3, 68};
    public static final byte[] c = {-57, -44, 3, 68, -97};
    public static final byte[] d = {-58, -35, 8, 76, -121, 35, 106, Alerts.alert_export_restriction, DerValue.TAG_PRIVATE, -57, Alerts.alert_decode_error, 77, -115, 18, 116};
    public static final byte[] e = {-62, -48, 25, Alerts.alert_unrecognized_name, -115, PKIBody._CKUANN, 115, PKIBody._CKUANN, -57, -44, 3, 68, -97};
    public static final byte[] f = {-57, -44, 3, 68, -77, 21, 123};
    public static final byte[] g = {-58, -35, 8, 76, -121, 35, 106, Alerts.alert_export_restriction, DerValue.TAG_PRIVATE, -57, Alerts.alert_decode_error, 77, -115, 18, 116, PKIBody._CKUANN, -52, -47};
    public static final byte[] h = {-62, -48, 25, Alerts.alert_unrecognized_name, -114, 29, Alerts.alert_bad_certificate_status_response, 36, -42, -22, PKIBody._CCP, 86, -77, 31, Alerts.alert_unrecognized_name, 58, -53, -63, 31, 86};
    public static final byte[] i = {-58, -35, 8, 76, -121, 35, 106, Alerts.alert_export_restriction, DerValue.TAG_PRIVATE, -57, Alerts.alert_decode_error, 77, -115, 18, 116, PKIBody._CKUANN, -42, -63, 12, 91, -103, PKIBody._CCP};
    public static final byte[] j = {-58, -35, 8, 76, -121, 35, 106, Alerts.alert_export_restriction, DerValue.TAG_PRIVATE, -57, Alerts.alert_decode_error, 77, -115, 18, 116, PKIBody._CKUANN, -42, -63, 12, 91, -103, PKIBody._CCP, DerValue.TAG_APPLICATION, Alerts.alert_export_restriction, -47, -44, 31, 91};
    public static volatile int k;
    public static eds0 l;

    public static final md51 a(String str, rwo rwoVar, sls slsVar) {
        final int i2 = 1;
        Object obj = null;
        kdd0 kdd0Var = new kdd0((Object) 3, (Object) new bzd0(c.a(1000), i2), obj, obj);
        final o3 o3Var = new o3(str, rwoVar);
        final int i3 = 0;
        md51 f2 = new d2e0(new bmh(26, o3Var, slsVar), new vhj(rwoVar, i3), kdd0Var).b().f(new lhj(2));
        f2.h(new tls() { // from class: shj
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i4 = i3;
                zy11 zy11Var = zy11.a;
                o3 o3Var2 = o3Var;
                switch (i4) {
                    case 0:
                        o3Var2.z("success");
                        break;
                    default:
                        o3Var2.z(ResultType.RESULT_TYPE_FAILURE);
                        break;
                }
                return zy11Var;
            }
        }).b(new tls() { // from class: shj
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i4 = i2;
                zy11 zy11Var = zy11.a;
                o3 o3Var2 = o3Var;
                switch (i4) {
                    case 0:
                        o3Var2.z("success");
                        break;
                    default:
                        o3Var2.z(ResultType.RESULT_TYPE_FAILURE);
                        break;
                }
                return zy11Var;
            }
        });
        return f2;
    }

    public static final PaymentSdkEnvironment b(com.ybsdk.feature.paymentsdk.api.PaymentSdkEnvironment paymentSdkEnvironment) {
        int i2 = via0.a[paymentSdkEnvironment.ordinal()];
        if (i2 == 1) {
            return PaymentSdkEnvironment.PRODUCTION;
        }
        if (i2 == 2) {
            return PaymentSdkEnvironment.TESTING;
        }
        if (i2 == 3) {
            return PaymentSdkEnvironment.CROWDTESTING;
        }
        if (i2 == 4) {
            return PaymentSdkEnvironment.MIMINOTESTING;
        }
        if (i2 == 5) {
            return PaymentSdkEnvironment.LOCALTESTING;
        }
        w511.b();
        return null;
    }
}
