package xsna;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: CompositeHostnameVerifier.kt */
/* loaded from: classes.dex */
public final class fti implements HostnameVerifier {
    public final dev0 b;
    public final k360 c;
    public final z9e0 d;

    public fti(dev0 dev0Var, k360 k360Var, z9e0 z9e0Var) {
        this.b = dev0Var;
        this.c = k360Var;
        this.d = z9e0Var;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        return this.b.isEnabled() ? this.d.verify(str, sSLSession) : this.c.verify(str, sSLSession);
    }
}
