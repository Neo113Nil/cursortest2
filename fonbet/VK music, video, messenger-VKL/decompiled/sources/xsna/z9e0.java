package xsna;

import java.security.PublicKey;
import java.security.cert.Certificate;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;
import kotlin.collections.EmptyList;
import xsna.u9e0;

/* compiled from: ProxyHostnameVerifier.kt */
/* loaded from: classes.dex */
public final class z9e0 extends k360 {
    public final mqa b;
    public final boolean c;
    public final CopyOnWriteArrayList<Certificate> d = new CopyOnWriteArrayList<>();

    public z9e0(mqa mqaVar, boolean z) {
        this.b = mqaVar;
        this.c = z;
    }

    public static Certificate a(X509Certificate x509Certificate, CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            PublicKey publicKey = null;
            if (!it.hasNext()) {
                return null;
            }
            Certificate certificate = (Certificate) it.next();
            if (certificate != null) {
                try {
                    publicKey = certificate.getPublicKey();
                } catch (Throwable unused) {
                }
            }
            x509Certificate.verify(publicKey);
            return certificate;
        }
    }

    @Override // xsna.k360, javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        String property;
        if (sSLSession.isValid()) {
            X509Certificate[] peerCertificateChain = sSLSession.getPeerCertificateChain();
            CopyOnWriteArrayList<Certificate> copyOnWriteArrayList = this.d;
            if (peerCertificateChain != null) {
                for (X509Certificate x509Certificate : peerCertificateChain) {
                    if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty() && a(x509Certificate, copyOnWriteArrayList) != null) {
                        break;
                    }
                    c460 c460Var = this.b.c;
                    c460Var.f.get();
                    Certificate a = a(x509Certificate, c460Var.d);
                    if (a != null) {
                        if (copyOnWriteArrayList != null) {
                            copyOnWriteArrayList.add(a);
                            return true;
                        }
                    }
                }
            }
            Iterable iterable = this.b.e;
            if (iterable == null) {
                EmptyList emptyList = u9e0.d;
                iterable = u9e0.a.a();
            }
            Iterator it = iterable.iterator();
            loop1: while (true) {
                if (it.hasNext()) {
                    u9e0 u9e0Var = (u9e0) it.next();
                    if (u9e0Var.c()) {
                        X509Certificate b = u9e0Var.b();
                        if (peerCertificateChain != null && b != null) {
                            for (X509Certificate x509Certificate2 : peerCertificateChain) {
                                try {
                                    x509Certificate2.verify(b.getPublicKey());
                                    break loop1;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                } else if (!this.c || (property = System.getProperty("http.proxyHost")) == null || property.length() <= 0) {
                    return super.verify(str, sSLSession);
                }
            }
        }
        return true;
    }
}
