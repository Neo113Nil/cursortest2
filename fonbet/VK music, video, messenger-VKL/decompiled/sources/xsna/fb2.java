package xsna;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import xsna.fta0;

/* compiled from: AndroidPlatform.kt */
/* loaded from: classes8.dex */
public final class fb2 extends fta0 {
    public static final boolean e;
    public final ArrayList c;
    public final p9e d;

    /* compiled from: AndroidPlatform.kt */
    public static final class a {
        public static fb2 a() {
            if (fb2.e) {
                return new fb2();
            }
            return null;
        }

        public static boolean b() {
            return fb2.e;
        }
    }

    /* compiled from: AndroidPlatform.kt */
    public static final class b implements csp0 {
        public final X509TrustManager a;
        public final Method b;

        public b(X509TrustManager x509TrustManager, Method method) {
            this.a = x509TrustManager;
            this.b = method;
        }

        @Override // xsna.csp0
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                return ((TrustAnchor) this.b.invoke(this.a, x509Certificate)).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
        }
    }

    static {
        boolean z = false;
        if (fta0.a.c() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public fb2() {
        fpk0 fpk0Var;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            fpk0Var = new fpk0(cls);
        } catch (Exception e2) {
            fta0.a.getClass();
            fta0.i(5, "unable to load android socket classes", e2);
            fpk0Var = null;
        }
        List I = rl3.I(new iek0[]{fpk0Var, new hsl(qc2.f), new hsl(x4j.a), new hsl(n98.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            if (((iek0) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new p9e(method3, method2, method);
    }

    @Override // xsna.fta0
    public final fqa b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        f52 f52Var = x509TrustManagerExtensions != null ? new f52(x509TrustManager, x509TrustManagerExtensions) : null;
        return f52Var != null ? f52Var : super.b(x509TrustManager);
    }

    @Override // xsna.fta0
    public final csp0 c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // xsna.fta0
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> list) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((iek0) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        iek0 iek0Var = (iek0) obj;
        if (iek0Var != null) {
            iek0Var.b(sSLSocket, str, list);
        }
    }

    @Override // xsna.fta0
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    @Override // xsna.fta0
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((iek0) obj).a(sSLSocket)) {
                break;
            }
        }
        iek0 iek0Var = (iek0) obj;
        if (iek0Var != null) {
            return iek0Var.c(sSLSocket);
        }
        return null;
    }

    @Override // xsna.fta0
    public final Object g() {
        p9e p9eVar = this.d;
        Method method = (Method) p9eVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                ((Method) p9eVar.b).invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // xsna.fta0
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // xsna.fta0
    public final void k(Object obj, String str) {
        p9e p9eVar = this.d;
        p9eVar.getClass();
        if (obj != null) {
            try {
                ((Method) p9eVar.c).invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        fta0.j(this, str, 4);
    }
}
