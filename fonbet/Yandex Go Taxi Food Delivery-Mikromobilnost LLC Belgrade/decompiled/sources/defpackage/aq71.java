package defpackage;

import android.content.Context;
import android.net.http.SslError;
import com.monetization.ads.network.ssl.CustomCertificateProviderCreator;
import java.security.cert.X509Certificate;
import yads.km3;

/* loaded from: classes7.dex */
public final class aq71 implements ak71 {
    public aq71() {
        int i = km3.w;
    }

    public static boolean a(Context context, SslError sslError) {
        X509Certificate x509Certificate;
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        if (a != null && a.x && (x509Certificate = sslError.getCertificate().getX509Certificate()) != null) {
            try {
                ((ig81) cg71.a(CustomCertificateProviderCreator.create(context))).checkServerTrusted(new X509Certificate[]{x509Certificate}, "RSA");
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
