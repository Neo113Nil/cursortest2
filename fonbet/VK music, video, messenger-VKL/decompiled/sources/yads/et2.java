package yads;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes10.dex */
public final class et2 {
    public final hx2 a;

    public et2(hx2 hx2Var) {
        this.a = hx2Var;
    }

    public final SSLSocketFactory a(Context context) {
        qu2 a = this.a.a(context);
        ou2 ou2Var = new ou2(context);
        if (a == null || !a.y) {
            if (!ub.a(21)) {
                return null;
            }
            int i = sh2.b;
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                try {
                    sSLContext.init(null, null, null);
                } catch (KeyManagementException unused) {
                }
                return new sh2(sSLContext.getSocketFactory());
            } catch (NoSuchAlgorithmException unused2) {
                return null;
            }
        }
        lx2 a2 = ff1.a(ou2Var);
        try {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            sSLContext2.init(null, new X509TrustManager[]{a2}, null);
            return sSLContext2.getSocketFactory();
        } catch (KeyManagementException e) {
            throw new IllegalStateException("Failed to initialize SSLContext", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No system TLS", e2);
        }
    }
}
