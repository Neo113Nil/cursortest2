package defpackage;

import com.yandex.mob.n;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes8.dex */
public final class io20 implements HostnameVerifier {
    public final n a;
    public final vg10 b;

    public io20(n nVar, vg10 vg10Var) {
        this.a = nVar;
        this.b = vg10Var;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean b;
        this.b.getClass();
        in2 in2Var = new in2(12, this, str, sSLSession);
        if (str.length() == ((int) q5z.d0(str))) {
            try {
                b = vv60.b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
            return b || ((Boolean) in2Var.invoke()).booleanValue();
        }
        b = false;
        if (b) {
            return true;
        }
    }
}
