package defpackage;

import android.content.Context;
import com.monetization.ads.network.ssl.CustomCertificateProviderCreator;
import com.monetization.ads.network.ssl.browser.ssl.CustomCertificatesProvider;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes7.dex */
public final class mk71 {
    public final a081 a;

    public mk71() {
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
        this.a = a081Var2;
    }

    public final SSLSocketFactory a(Context context) {
        gg81 a = this.a.a(context);
        CustomCertificatesProvider create = CustomCertificateProviderCreator.create(context);
        if (a == null || !a.x) {
            if (!xga1.b(21)) {
                return null;
            }
            int i = kp71.b;
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                try {
                    sSLContext.init(null, null, null);
                } catch (KeyManagementException unused) {
                }
                return new kp71(sSLContext.getSocketFactory());
            } catch (NoSuchAlgorithmException unused2) {
                return null;
            }
        }
        od81 a2 = cg71.a(create);
        try {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            sSLContext2.init(null, new X509TrustManager[]{a2}, null);
            return sSLContext2.getSocketFactory();
        } catch (KeyManagementException e) {
            ny61.h("Failed to initialize SSLContext", e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            ny61.h("No system TLS", e2);
            return null;
        }
    }
}
