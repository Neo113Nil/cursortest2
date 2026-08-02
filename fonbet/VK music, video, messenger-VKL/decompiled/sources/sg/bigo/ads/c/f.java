package sg.bigo.ads.c;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes9.dex */
public final class f {
    public static Signature a(Context context, String str) {
        SigningInfo signingInfo;
        try {
            signingInfo = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo;
        } catch (Throwable unused) {
        }
        if (signingInfo == null) {
            return null;
        }
        Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
        if (apkContentsSigners != null && apkContentsSigners.length > 0) {
            return apkContentsSigners[0];
        }
        return null;
    }

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        try {
            String name = ((X509Certificate) CertificateFactory.getInstance(sg.bigo.ads.a.a.as).generateCertificate(new ByteArrayInputStream(bArr))).getSubjectX500Principal().getName();
            int indexOf = name.indexOf(sg.bigo.ads.a.a.at);
            return indexOf == -1 ? name : name.substring(indexOf);
        } catch (Exception unused) {
            return "";
        }
    }
}
