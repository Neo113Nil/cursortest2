package defpackage;

import com.google.crypto.tink.subtle.EllipticCurves$CurveType;
import com.google.crypto.tink.subtle.EllipticCurves$PointFormatType;
import java.nio.charset.Charset;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public abstract class mj41 {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final EllipticCurves$PointFormatType d;
    public static final EllipticCurves$CurveType e;

    static {
        Charset.forName("UTF-8");
        a = new byte[]{87, 101, 98, Alerts.alert_internal_error, 117, 115, 104, 58, BlobHeaderStructure.BLOB_VERSION, 105, Alerts.alert_unsupported_extension, 102, Alerts.alert_certificate_unobtainable, 0};
        b = new byte[]{67, Alerts.alert_certificate_unobtainable, Alerts.alert_unsupported_extension, 116, 101, Alerts.alert_unsupported_extension, 116, Alerts.alert_certificate_expired, 69, Alerts.alert_unsupported_extension, 99, Alerts.alert_certificate_unobtainable, Alerts.alert_no_renegotiation, 105, Alerts.alert_unsupported_extension, 103, 58, BlobHeaderStructure.BLOB_VERSION, 97, 101, 115, 49, Alerts.alert_decode_error, 56, 103, 99, 109, 0};
        c = new byte[]{67, Alerts.alert_certificate_unobtainable, Alerts.alert_unsupported_extension, 116, 101, Alerts.alert_unsupported_extension, 116, Alerts.alert_certificate_expired, 69, Alerts.alert_unsupported_extension, 99, Alerts.alert_certificate_unobtainable, Alerts.alert_no_renegotiation, 105, Alerts.alert_unsupported_extension, 103, 58, BlobHeaderStructure.BLOB_VERSION, Alerts.alert_unsupported_extension, Alerts.alert_certificate_unobtainable, Alerts.alert_unsupported_extension, 99, 101, 0};
        d = EllipticCurves$PointFormatType.UNCOMPRESSED;
        e = EllipticCurves$CurveType.NIST_P256;
    }
}
