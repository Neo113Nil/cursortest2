package ru.ok.tracer.base.cert;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import xsna.g5g;
import xsna.rl3;

/* compiled from: TrustManagerUtils.kt */
@SuppressLint({"CustomX509TrustManager"})
/* loaded from: classes9.dex */
final class CompositeX509TrustManager implements X509TrustManager {
    private final List<X509TrustManagerExtensions> delegateExtensions;
    private final X509TrustManager[] delegates;

    public CompositeX509TrustManager(X509TrustManager[] x509TrustManagerArr) {
        this.delegates = x509TrustManagerArr;
        ArrayList arrayList = new ArrayList(x509TrustManagerArr.length);
        for (X509TrustManager x509TrustManager : x509TrustManagerArr) {
            arrayList.add(new X509TrustManagerExtensions(x509TrustManager));
        }
        this.delegateExtensions = arrayList;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (X509TrustManager x509TrustManager : this.delegates) {
            try {
                x509TrustManager.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        for (X509TrustManager x509TrustManager : this.delegates) {
            try {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() throws CertificateException {
        X509TrustManager[] x509TrustManagerArr = this.delegates;
        ArrayList arrayList = new ArrayList();
        for (X509TrustManager x509TrustManager : x509TrustManagerArr) {
            g5g.y(rl3.u0(x509TrustManager.getAcceptedIssuers()), arrayList);
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        Iterator<X509TrustManagerExtensions> it = this.delegateExtensions.iterator();
        while (it.hasNext()) {
            try {
                return it.next().checkServerTrusted(x509CertificateArr, str, str2);
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
