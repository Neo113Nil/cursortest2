package xsna;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.Field;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class uxy0 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        X509Certificate x509Certificate;
        qyy0 qyy0Var = fqa.a;
        if (qyy0Var == null) {
            gu8.c(null, "MyTargetWebViewClient: can't verify ssl Error – certData is null");
            sslErrorHandler.cancel();
            return;
        }
        TrustManagerFactory trustManagerFactory = qyy0Var.b;
        if (sslError.getPrimaryError() == 3) {
            SslCertificate certificate = sslError.getCertificate();
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    x509Certificate = certificate.getX509Certificate();
                } else {
                    Field declaredField = certificate.getClass().getDeclaredField("mX509Certificate");
                    declaredField.setAccessible(true);
                    x509Certificate = (X509Certificate) declaredField.get(certificate);
                }
                X509Certificate[] x509CertificateArr = {x509Certificate};
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        try {
                            ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, PeerVideoSettingsBitrateTable.CODEC_GENERIC);
                            sslErrorHandler.proceed();
                            return;
                        } catch (Exception e) {
                            gu8.f(null, "SslErrorVerifier: exception=" + gu8.b(e));
                        }
                    }
                }
            } catch (Exception e2) {
                gu8.f(null, "SslErrorVerifier: exception2=" + gu8.b(e2));
            }
        }
        gu8.c(null, "MyTargetWebViewClient: ssl error not verified");
        sslErrorHandler.cancel();
    }
}
