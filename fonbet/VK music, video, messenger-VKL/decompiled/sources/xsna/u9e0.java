package xsna;

import java.security.PublicKey;
import javax.security.cert.X509Certificate;
import kotlin.collections.EmptyList;

/* compiled from: ProxyCertificate.kt */
/* loaded from: classes3.dex */
public final class u9e0 {
    public static final EmptyList d = EmptyList.b;
    public final t9e0 a;
    public final X509Certificate b;
    public final PublicKey c;

    /* compiled from: ProxyCertificate.kt */
    public static final class a {
        public static EmptyList a() {
            return u9e0.d;
        }
    }

    public u9e0(t9e0 t9e0Var, X509Certificate x509Certificate, PublicKey publicKey) {
        this.a = t9e0Var;
        this.b = x509Certificate;
        this.c = publicKey;
    }

    public final t9e0 a() {
        return this.a;
    }

    public final X509Certificate b() {
        return this.b;
    }

    public final boolean c() {
        return this.c != null;
    }
}
