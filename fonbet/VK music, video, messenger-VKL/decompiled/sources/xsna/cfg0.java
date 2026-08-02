package xsna;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.l;
import okhttp3.p;
import okhttp3.u;
import ru.ok.android.commons.http.Http;
import xsna.kpg0;

/* compiled from: RetryAndFollowUpInterceptor.kt */
/* loaded from: classes11.dex */
public final class cfg0 implements Interceptor {
    public final okhttp3.o a;

    public cfg0(okhttp3.o oVar) {
        this.a = oVar;
    }

    public static int c(okhttp3.u uVar, int i) {
        String r = okhttp3.u.r(CommonGatewayClient.HEADER_RETRY_AFTER, uVar);
        if (r == null) {
            return i;
        }
        if (new Regex("\\d+").f(r)) {
            return Integer.valueOf(r).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final okhttp3.p a(okhttp3.u uVar, u1q u1qVar) throws IOException {
        String r;
        l.a aVar;
        okhttp3.t tVar;
        okhttp3.u x;
        g8f0 g;
        ipg0 ipg0Var = (u1qVar == null || (g = u1qVar.g()) == null) ? null : g.b;
        int o = uVar.o();
        String str = uVar.A().b;
        if (o != 307 && o != 308) {
            if (o == 401) {
                this.a.h.getClass();
                return null;
            }
            if (o == 421) {
                okhttp3.t tVar2 = uVar.A().d;
                if ((tVar2 == null || !tVar2.isOneShot()) && u1qVar != null && u1qVar.j()) {
                    g8f0 g2 = u1qVar.g();
                    synchronized (g2) {
                        g2.k = true;
                    }
                    return uVar.A();
                }
            } else if (o == 503) {
                okhttp3.u x2 = uVar.x();
                if ((x2 == null || x2.o() != 503) && c(uVar, Integer.MAX_VALUE) == 0) {
                    return uVar.A();
                }
            } else {
                if (o == 407) {
                    if (ipg0Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    this.a.o.getClass();
                    return null;
                }
                if (o != 408) {
                    switch (o) {
                    }
                } else if (this.a.g && (((tVar = uVar.A().d) == null || !tVar.isOneShot()) && (((x = uVar.x()) == null || x.o() != 408) && c(uVar, 0) <= 0))) {
                    return uVar.A();
                }
            }
            return null;
        }
        okhttp3.o oVar = this.a;
        if (oVar.i && (r = okhttp3.u.r("Location", uVar)) != null) {
            okhttp3.l lVar = uVar.A().a;
            lVar.getClass();
            try {
                aVar = new l.a();
                aVar.e(lVar, r);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            okhttp3.l b = aVar != null ? aVar.b() : null;
            if (b != null && (epx.f(b.a, uVar.A().a.a) || oVar.j)) {
                p.a b2 = uVar.A().b();
                if (xwk.f(str)) {
                    int o2 = uVar.o();
                    boolean z = str.equals("PROPFIND") || o2 == 308 || o2 == 307;
                    if (str.equals("PROPFIND") || o2 == 308 || o2 == 307) {
                        b2.f(str, z ? uVar.A().d : null);
                    } else {
                        b2.f("GET", null);
                    }
                    if (!z) {
                        b2.g("Transfer-Encoding");
                        b2.g(Http.Header.CONTENT_LENGTH);
                        b2.g("Content-Type");
                    }
                }
                if (!x2r0.a(uVar.A().a, b)) {
                    b2.g(Http.Header.AUTHORIZATION);
                }
                b2.a = b;
                return b2.b();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        if (r7 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(IOException iOException, f8f0 f8f0Var, okhttp3.p pVar, boolean z) {
        boolean z2;
        kpg0 kpg0Var;
        g8f0 g8f0Var;
        okhttp3.t tVar;
        if (!this.a.g || ((z && (((tVar = pVar.d) != null && tVar.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        x1q x1qVar = f8f0Var.j;
        int i = x1qVar.g;
        if (i == 0 && x1qVar.h == 0 && x1qVar.i == 0) {
            z2 = false;
        } else {
            if (x1qVar.j == null) {
                ipg0 ipg0Var = null;
                if (i <= 1 && x1qVar.h <= 1 && x1qVar.i <= 0 && (g8f0Var = x1qVar.c.k) != null) {
                    synchronized (g8f0Var) {
                        if (g8f0Var.l == 0) {
                            if (x2r0.a(g8f0Var.b.a.h, x1qVar.b.h)) {
                                ipg0Var = g8f0Var.b;
                            }
                        }
                    }
                }
                if (ipg0Var != null) {
                    x1qVar.j = ipg0Var;
                } else {
                    kpg0.a aVar = x1qVar.e;
                    if ((aVar == null || !aVar.a()) && (kpg0Var = x1qVar.f) != null) {
                        z2 = kpg0Var.a();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        gqa gqaVar;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        okhttp3.p pVar = realInterceptorChain.e;
        f8f0 f8f0Var = realInterceptorChain.a;
        List list = EmptyList.b;
        okhttp3.u uVar = null;
        int i = 0;
        okhttp3.p pVar2 = pVar;
        while (true) {
            boolean z = true;
            while (f8f0Var.m == null) {
                synchronized (f8f0Var) {
                    if (f8f0Var.o) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                    if (f8f0Var.n) {
                        throw new IllegalStateException("Check failed.");
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                if (z) {
                    l8f0 l8f0Var = f8f0Var.e;
                    okhttp3.l lVar = pVar2.a;
                    okhttp3.o oVar = f8f0Var.b;
                    if (lVar.j) {
                        SSLSocketFactory sSLSocketFactory2 = oVar.q;
                        if (sSLSocketFactory2 == null) {
                            throw new IllegalStateException("CLEARTEXT-only client");
                        }
                        HostnameVerifier hostnameVerifier2 = oVar.u;
                        gqaVar = oVar.v;
                        sSLSocketFactory = sSLSocketFactory2;
                        hostnameVerifier = hostnameVerifier2;
                    } else {
                        sSLSocketFactory = null;
                        hostnameVerifier = null;
                        gqaVar = null;
                    }
                    f8f0Var.j = new x1q(l8f0Var, new okhttp3.a(lVar.d, lVar.e, oVar.m, oVar.p, sSLSocketFactory, hostnameVerifier, gqaVar, oVar.o, oVar.t, oVar.s, oVar.n), f8f0Var, f8f0Var.f);
                }
                try {
                    if (f8f0Var.q) {
                        throw new IOException("Canceled");
                    }
                    try {
                        okhttp3.u a = realInterceptorChain.a(pVar2);
                        if (uVar != null) {
                            u.a w = a.w();
                            u.a w2 = uVar.w();
                            w2.b(null);
                            w.l(w2.c());
                            a = w.c();
                        }
                        uVar = a;
                        u1q u1qVar = f8f0Var.m;
                        pVar2 = a(uVar, u1qVar);
                        if (pVar2 == null) {
                            if (u1qVar != null && u1qVar.k()) {
                                f8f0Var.j();
                            }
                            f8f0Var.d(false);
                            return uVar;
                        }
                        okhttp3.t tVar = pVar2.d;
                        if (tVar != null && tVar.isOneShot()) {
                            f8f0Var.d(false);
                            return uVar;
                        }
                        okhttp3.v m = uVar.m();
                        if (m != null) {
                            x2r0.c(m);
                        }
                        i++;
                        if (i > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i);
                        }
                        f8f0Var.d(true);
                    } catch (IOException e) {
                        if (!b(e, f8f0Var, pVar2, !(e instanceof ConnectionShutdownException))) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                mnh0.d(e, (Exception) it.next());
                            }
                            throw e;
                        }
                        list = j5g.v0(e, list);
                        f8f0Var.d(true);
                        z = false;
                    } catch (RouteException e2) {
                        if (!b(e2.g(), f8f0Var, pVar2, false)) {
                            IOException d = e2.d();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                mnh0.d(d, (Exception) it2.next());
                            }
                            throw d;
                        }
                        list = j5g.v0(e2.d(), list);
                        f8f0Var.d(true);
                        z = false;
                    }
                } catch (Throwable th) {
                    f8f0Var.d(true);
                    throw th;
                }
            }
            throw new IllegalStateException("Check failed.");
        }
    }
}
