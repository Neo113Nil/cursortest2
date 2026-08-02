package xsna;

import com.vk.log.L;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: NetworkHostVerifier.kt */
/* loaded from: classes.dex */
public class k360 implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return mx70.b.verify(str, sSLSession);
        } catch (Exception e) {
            L.l("can't verify host " + e);
            return false;
        }
    }
}
