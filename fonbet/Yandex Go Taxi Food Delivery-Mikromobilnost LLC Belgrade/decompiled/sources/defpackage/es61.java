package defpackage;

import java.security.AlgorithmConstraints;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.util.Set;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;
import ru.CryptoPro.ssl.util.DisabledAlgorithmConstraints;

/* loaded from: classes4.dex */
public final class es61 implements AlgorithmConstraints {
    public static final DisabledAlgorithmConstraints d = new DisabledAlgorithmConstraints("jdk.tls.disabledAlgorithms", new ks61());
    public static final DisabledAlgorithmConstraints e = new DisabledAlgorithmConstraints("jdk.certpath.disabledAlgorithms", new ks61());
    public static final es61 f;
    public static final es61 g;
    public AlgorithmConstraints a;
    public is61 b;
    public boolean c;

    static {
        es61 es61Var = new es61();
        es61Var.b = null;
        es61Var.c = true;
        es61Var.a = null;
        f = es61Var;
        g = new es61((SSLSocket) null, false);
    }

    public es61(SSLEngine sSLEngine, String[] strArr, boolean z) {
        this.a = null;
        this.b = null;
        this.c = true;
        if (sSLEngine != null) {
            this.a = sSLEngine.getSSLParameters().getAlgorithmConstraints();
            this.b = new is61(strArr);
        }
        if (z) {
            return;
        }
        this.c = false;
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, String str, AlgorithmParameters algorithmParameters) {
        AlgorithmConstraints algorithmConstraints;
        is61 is61Var = this.b;
        boolean permits = is61Var != null ? is61Var.permits(set, str, algorithmParameters) : true;
        if (permits && (algorithmConstraints = this.a) != null) {
            permits = algorithmConstraints.permits(set, str, algorithmParameters);
        }
        if (permits) {
            permits = d.permits(set, str, algorithmParameters);
        }
        return (permits && this.c) ? e.permits(set, str, algorithmParameters) : permits;
    }

    public es61(SSLEngine sSLEngine, boolean z) {
        this.a = null;
        this.b = null;
        this.c = true;
        if (sSLEngine != null) {
            this.a = sSLEngine.getSSLParameters().getAlgorithmConstraints();
        }
        if (z) {
            return;
        }
        this.c = false;
    }

    public es61(SSLSocket sSLSocket, boolean z) {
        this.a = null;
        this.b = null;
        this.c = true;
        if (sSLSocket != null) {
            this.a = sSLSocket.getSSLParameters().getAlgorithmConstraints();
        }
        if (z) {
            return;
        }
        this.c = false;
    }

    public es61(SSLSocket sSLSocket, String[] strArr, boolean z) {
        this.a = null;
        this.b = null;
        this.c = true;
        if (sSLSocket != null) {
            this.a = sSLSocket.getSSLParameters().getAlgorithmConstraints();
            this.b = new is61(strArr);
        }
        if (z) {
            return;
        }
        this.c = false;
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, String str, Key key, AlgorithmParameters algorithmParameters) {
        AlgorithmConstraints algorithmConstraints;
        is61 is61Var = this.b;
        boolean permits = is61Var != null ? is61Var.permits(set, str, key, algorithmParameters) : true;
        if (permits && (algorithmConstraints = this.a) != null) {
            permits = algorithmConstraints.permits(set, str, key, algorithmParameters);
        }
        if (permits) {
            permits = d.permits(set, str, key, algorithmParameters);
        }
        return (permits && this.c) ? e.permits(set, str, key, algorithmParameters) : permits;
    }

    @Override // java.security.AlgorithmConstraints
    public final boolean permits(Set set, Key key) {
        AlgorithmConstraints algorithmConstraints = this.a;
        boolean permits = algorithmConstraints != null ? algorithmConstraints.permits(set, key) : true;
        if (permits) {
            permits = d.permits(set, key);
        }
        return (permits && this.c) ? e.permits(set, key) : permits;
    }
}
