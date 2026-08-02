package yads;

import android.content.Context;
import android.net.http.SslError;
import android.os.Build;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.Lazy;
import xsna.bpn0;

/* loaded from: classes10.dex */
public final class mp3 implements kp3 {
    public final Lazy a = new bpn0(lp3.b);

    public final boolean a(Context context, SslError sslError) {
        qu2 a = gx2.a().a(context);
        if (a == null || !a.y) {
            return false;
        }
        X509Certificate x509Certificate = Build.VERSION.SDK_INT >= 29 ? sslError.getCertificate().getX509Certificate() : ct2.a(sslError.getCertificate(), (CertificateFactory) this.a.getValue());
        if (x509Certificate == null) {
            return false;
        }
        try {
            ff1.a(new ou2(context)).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
