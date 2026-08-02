package yads;

import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class mx2 extends Lambda implements gzs {
    public static final mx2 b = new mx2();

    public mx2() {
        super(0);
    }

    @Override // xsna.gzs
    public final Object invoke() {
        X509TrustManager a = fa3.a(null);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("Failed to create default TrustManager");
    }
}
