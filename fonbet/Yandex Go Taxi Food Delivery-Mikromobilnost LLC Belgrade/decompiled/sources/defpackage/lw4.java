package defpackage;

import java.util.Arrays;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes4.dex */
public abstract class lw4 {
    public static final int[] a;
    public static final int[] b;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, Alerts.alert_protocol_version, Alerts.alert_insufficient_security, 72, 73, 74, 75, 76, 77, 78, 79, Alerts.alert_internal_error, 81, 82, 83, 84, 85, 86, 87, 88, 89, Alerts.alert_user_canceled, 97, 98, 99, Alerts.alert_no_renegotiation, 101, 102, 103, 104, 105, 106, 107, 108, 109, Alerts.alert_unsupported_extension, Alerts.alert_certificate_unobtainable, Alerts.alert_unrecognized_name, Alerts.alert_bad_certificate_status_response, Alerts.alert_bad_certificate_hash_value, 115, 116, 117, 118, 119, Alerts.alert_no_application_protocol, 121, 122, 48, 49, Alerts.alert_decode_error, Alerts.alert_decrypt_error, 52, 53, 54, 55, 56, 57, Alerts.alert_unsupported_certificate, Alerts.alert_illegal_parameter};
        int[] iArr = new int[256];
        int i = 0;
        Arrays.fill(iArr, 0, 256, -1);
        iArr[61] = -2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 64) {
            iArr[bArr[i2]] = i3;
            i2++;
            i3++;
        }
        a = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, Alerts.alert_protocol_version, Alerts.alert_insufficient_security, 72, 73, 74, 75, 76, 77, 78, 79, Alerts.alert_internal_error, 81, 82, 83, 84, 85, 86, 87, 88, 89, Alerts.alert_user_canceled, 97, 98, 99, Alerts.alert_no_renegotiation, 101, 102, 103, 104, 105, 106, 107, 108, 109, Alerts.alert_unsupported_extension, Alerts.alert_certificate_unobtainable, Alerts.alert_unrecognized_name, Alerts.alert_bad_certificate_status_response, Alerts.alert_bad_certificate_hash_value, 115, 116, 117, 118, 119, Alerts.alert_no_application_protocol, 121, 122, 48, 49, Alerts.alert_decode_error, Alerts.alert_decrypt_error, 52, 53, 54, 55, 56, 57, Alerts.alert_certificate_expired, 95};
        int[] iArr2 = new int[256];
        Arrays.fill(iArr2, 0, 256, -1);
        iArr2[61] = -2;
        int i4 = 0;
        while (i < 64) {
            iArr2[bArr2[i]] = i4;
            i++;
            i4++;
        }
        b = iArr2;
    }
}
