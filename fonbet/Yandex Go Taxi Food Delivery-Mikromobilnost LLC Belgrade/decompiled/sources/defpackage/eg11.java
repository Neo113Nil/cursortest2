package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.a;

/* loaded from: classes.dex */
public abstract class eg11 {
    public static final i3y a = a.a(new k801(26));

    public static final List a(X509TrustManager x509TrustManager, X509Certificate[] x509CertificateArr, String str, String str2) {
        Method c = c(x509TrustManager);
        if (c == null) {
            x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            return Arrays.asList(x509CertificateArr);
        }
        try {
            return (List) c.invoke(x509TrustManager, x509CertificateArr, str, str2);
        } catch (IllegalAccessException e) {
            throw new CertificateException("checkServerTrusted(host) failed", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            CertificateException certificateException = cause instanceof CertificateException ? (CertificateException) cause : null;
            if (certificateException != null) {
                throw certificateException;
            }
            throw new CertificateException("checkServerTrusted(host) failed", e2.getCause());
        }
    }

    public static final X509TrustManager b(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) kotlin.collections.a.R(arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static final Method c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
