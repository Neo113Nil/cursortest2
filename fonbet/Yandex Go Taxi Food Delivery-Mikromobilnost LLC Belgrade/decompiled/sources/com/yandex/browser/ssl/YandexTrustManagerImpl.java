package com.yandex.browser.ssl;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.xm51;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.Metadata;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/browser/ssl/YandexTrustManagerImpl;", "Lxm51;", "", "Ljava/security/cert/X509Certificate;", "chain", "", Constants.INTENT_PARAM_AUTH_TYPE, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "hostname1", "hostname2", "", "isSameTrustConfiguration", "(Ljava/lang/String;Ljava/lang/String;)Z", "lib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexTrustManagerImpl implements xm51 {
    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw null;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        throw null;
    }

    public final boolean isSameTrustConfiguration(String hostname1, String hostname2) {
        throw null;
    }

    public final List<X509Certificate> checkServerTrusted(X509Certificate[] chain, String authType, String host) {
        throw null;
    }
}
