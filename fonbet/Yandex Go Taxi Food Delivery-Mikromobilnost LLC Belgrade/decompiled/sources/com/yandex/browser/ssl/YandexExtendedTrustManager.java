package com.yandex.browser.ssl;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.cjf;
import defpackage.eg11;
import defpackage.i3y;
import defpackage.rm2;
import defpackage.xm51;
import defpackage.yx1;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/yandex/browser/ssl/YandexExtendedTrustManager;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "Lxm51;", "", "Ljava/security/cert/X509Certificate;", "chain", "", Constants.INTENT_PARAM_AUTH_TYPE, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "hostname1", "hostname2", "", "isSameTrustConfiguration", "(Ljava/lang/String;Ljava/lang/String;)Z", "lib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class YandexExtendedTrustManager extends X509ExtendedTrustManager implements xm51 {
    public final yx1 a;

    public YandexExtendedTrustManager(cjf cjfVar) {
        this.a = new yx1(cjfVar);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        i3y i3yVar = eg11.a;
        rm2.a(yx1Var.d(), x509CertificateArr, str, socket);
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String host) throws CertificateException {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        try {
            Method method = (Method) ((i3y) yx1Var.e).getValue();
            Object invoke = method != null ? method.invoke(chain, authType, host) : null;
            List<X509Certificate> list = invoke instanceof List ? (List) invoke : null;
            return list == null ? EmptyList.a : list;
        } catch (CertificateException unused) {
            synchronized (yx1Var.h) {
                try {
                    yx1Var.b();
                    try {
                        yx1Var.c();
                        Method method2 = (Method) yx1Var.g;
                        Object invoke2 = method2 != null ? method2.invoke(chain, authType, host) : null;
                        List<X509Certificate> list2 = invoke2 instanceof List ? (List) invoke2 : null;
                        return list2 == null ? EmptyList.a : list2;
                    } catch (Exception e) {
                        throw new CertificateException("Unable to verify certificate chain", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            throw new CertificateException("Unable to verify certificate chain", e2);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.d().getAcceptedIssuers();
    }

    public final boolean isSameTrustConfiguration(String hostname1, String hostname2) {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        try {
            Method method = (Method) ((i3y) yx1Var.f).getValue();
            Object invoke = method != null ? method.invoke(hostname1, hostname2) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        i3y i3yVar = eg11.a;
        rm2.b(yx1Var.d(), x509CertificateArr, str, sSLEngine);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.d().checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        try {
            X509TrustManager d = yx1Var.d();
            i3y i3yVar = eg11.a;
            rm2.c(d, x509CertificateArr, str, socket);
        } catch (CertificateException e) {
            synchronized (yx1Var.h) {
                yx1Var.b();
                yx1Var.c();
                X509TrustManager x509TrustManager = (X509TrustManager) yx1Var.d;
                if (x509TrustManager == null) {
                    throw e;
                }
                i3y i3yVar2 = eg11.a;
                rm2.c(x509TrustManager, x509CertificateArr, str, socket);
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        try {
            X509TrustManager d = yx1Var.d();
            i3y i3yVar = eg11.a;
            rm2.d(d, x509CertificateArr, str, sSLEngine);
        } catch (CertificateException e) {
            synchronized (yx1Var.h) {
                yx1Var.b();
                yx1Var.c();
                X509TrustManager x509TrustManager = (X509TrustManager) yx1Var.d;
                if (x509TrustManager == null) {
                    throw e;
                }
                i3y i3yVar2 = eg11.a;
                rm2.d(x509TrustManager, x509CertificateArr, str, sSLEngine);
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        yx1 yx1Var = this.a;
        yx1Var.getClass();
        try {
            yx1Var.d().checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            synchronized (yx1Var.h) {
                yx1Var.b();
                yx1Var.c();
                X509TrustManager x509TrustManager = (X509TrustManager) yx1Var.d;
                if (x509TrustManager == null) {
                    throw e;
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }
    }
}
