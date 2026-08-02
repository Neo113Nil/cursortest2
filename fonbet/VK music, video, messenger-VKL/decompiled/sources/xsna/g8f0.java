package xsna;

import com.ironsource.InterfaceC4413l1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Protocol;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.j;
import okhttp3.p;
import okhttp3.u;
import xsna.gqa;
import xsna.vhv;

/* compiled from: RealConnection.kt */
/* loaded from: classes11.dex */
public final class g8f0 extends vhv.c implements u3j {
    public final ipg0 b;
    public Socket c;
    public Socket d;
    public okhttp3.j e;
    public Protocol f;
    public vhv g;
    public e8f0 h;
    public d8f0 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o = 1;
    public final ArrayList p = new ArrayList();
    public long q = Long.MAX_VALUE;

    /* compiled from: RealConnection.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public g8f0(ipg0 ipg0Var) {
        this.b = ipg0Var;
    }

    public static void g(okhttp3.o oVar, ipg0 ipg0Var, IOException iOException) {
        if (ipg0Var.b.type() != Proxy.Type.DIRECT) {
            okhttp3.a aVar = ipg0Var.a;
            aVar.g.connectFailed(aVar.h.i(), ipg0Var.b.address(), iOException);
        }
        t120 t120Var = oVar.C;
        synchronized (t120Var) {
            ((LinkedHashSet) t120Var.b).add(ipg0Var);
        }
    }

    @Override // xsna.u3j
    public final Protocol a() {
        return this.f;
    }

    @Override // xsna.u3j
    public final Socket b() {
        return this.d;
    }

    @Override // xsna.u3j
    public final ipg0 c() {
        return this.b;
    }

    @Override // xsna.vhv.c
    public final synchronized void d(e0j0 e0j0Var) {
        this.o = e0j0Var.b();
    }

    @Override // xsna.vhv.c
    public final void e(fiv fivVar) throws IOException {
        fivVar.c(ErrorCode.REFUSED_STREAM, null);
    }

    public final void f(int i, int i2, int i3, int i4, boolean z, okhttp3.d dVar, okhttp3.g gVar) {
        okhttp3.d dVar2;
        okhttp3.g gVar2;
        ipg0 ipg0Var;
        ipg0 ipg0Var2;
        if (this.f != null) {
            throw new IllegalStateException("already connected");
        }
        okhttp3.a aVar = this.b.a;
        List<okhttp3.f> list = aVar.j;
        m4j m4jVar = new m4j(list);
        if (aVar.c == null) {
            if (!list.contains(okhttp3.f.f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            fta0 fta0Var = fta0.a;
            if (!fta0.a.h(str)) {
                throw new RouteException(new UnknownServiceException(zr.a("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.i.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                ipg0Var = this.b;
                try {
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                dVar2 = dVar;
                gVar2 = gVar;
            }
            try {
                if (ipg0Var.a.c != null && ipg0Var.b.type() == Proxy.Type.HTTP) {
                    dVar2 = dVar;
                    gVar2 = gVar;
                    i(i, i2, i3, dVar2, gVar2);
                    if (this.c == null) {
                        ipg0Var2 = this.b;
                        if (ipg0Var2.a.c == null && ipg0Var2.b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.q = System.nanoTime();
                        return;
                    }
                } else {
                    dVar2 = dVar;
                    gVar2 = gVar;
                    h(i, i2, dVar2, gVar2);
                }
                j(m4jVar, i4, dVar2, gVar2);
                ipg0 ipg0Var3 = this.b;
                gVar2.e(dVar2, ipg0Var3.c, ipg0Var3.b, this.f);
                ipg0Var2 = this.b;
                if (ipg0Var2.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e3) {
                e = e3;
                Socket socket = this.d;
                if (socket != null) {
                    x2r0.d(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    x2r0.d(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                ipg0 ipg0Var4 = this.b;
                gVar2.f(dVar2, ipg0Var4.c, ipg0Var4.b, e);
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    routeException.a(e);
                }
                if (!z) {
                    throw routeException;
                }
                m4jVar.d = true;
                if (!m4jVar.c) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
            }
        } while (e instanceof SSLException);
        throw routeException;
    }

    public final void h(int i, int i2, okhttp3.d dVar, okhttp3.g gVar) throws IOException {
        ipg0 ipg0Var = this.b;
        Proxy proxy = ipg0Var.b;
        okhttp3.a aVar = ipg0Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : a.$EnumSwitchMapping$0[type.ordinal()];
        Socket createSocket = (i3 == 1 || i3 == 2) ? aVar.b.createSocket() : new Socket(proxy);
        this.c = createSocket;
        gVar.g(dVar, this.b.c, proxy);
        createSocket.setSoTimeout(i2);
        try {
            fta0 fta0Var = fta0.a;
            fta0.a.e(createSocket, this.b.c, i);
            try {
                Logger logger = ez70.a;
                jek0 jek0Var = new jek0(createSocket);
                this.h = new e8f0(new qz3(jek0Var, new i3x(createSocket.getInputStream(), jek0Var)));
                jek0 jek0Var2 = new jek0(createSocket);
                this.i = new d8f0(new pz3(jek0Var2, new p190(createSocket.getOutputStream(), jek0Var2)));
            } catch (NullPointerException e) {
                if (epx.f(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void i(int i, int i2, int i3, okhttp3.d dVar, okhttp3.g gVar) throws IOException {
        p.a aVar = new p.a();
        ipg0 ipg0Var = this.b;
        aVar.a = ipg0Var.a.h;
        aVar.f("CONNECT", null);
        okhttp3.a aVar2 = ipg0Var.a;
        aVar.c.h("Host", x2r0.v(aVar2.h, true));
        aVar.c.h("Proxy-Connection", "Keep-Alive");
        aVar.c.h("User-Agent", "okhttp/4.12.0");
        okhttp3.p b = aVar.b();
        u.a aVar3 = new u.a();
        aVar3.p(b);
        aVar3.m(Protocol.HTTP_1_1);
        aVar3.f(InterfaceC4413l1.a.b.g);
        aVar3.j("Preemptive Authenticate");
        aVar3.b(x2r0.c);
        aVar3.q(-1L);
        aVar3.n(-1L);
        aVar3.h();
        aVar3.c();
        aVar2.f.getClass();
        okhttp3.l lVar = b.a;
        h(i, i2, dVar, gVar);
        String str = "CONNECT " + x2r0.v(lVar, true) + " HTTP/1.1";
        e8f0 e8f0Var = this.h;
        d8f0 d8f0Var = this.i;
        thv thvVar = new thv(null, this, e8f0Var, d8f0Var);
        mxo0 timeout = e8f0Var.b.timeout();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(j, timeUnit);
        d8f0Var.b.timeout().g(i3, timeUnit);
        thvVar.k(b.c, str);
        thvVar.g();
        u.a h = thvVar.h(false);
        h.p(b);
        okhttp3.u c = h.c();
        thvVar.j(c);
        int o = c.o();
        if (o == 200) {
            if (!e8f0Var.c.W1() || !d8f0Var.c.W1()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (o == 407) {
                aVar2.f.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException("Unexpected response code for CONNECT: " + c.o());
        }
    }

    public final void j(m4j m4jVar, int i, okhttp3.d dVar, okhttp3.g gVar) throws IOException {
        Protocol protocol;
        okhttp3.a aVar = this.b.a;
        if (aVar.c == null) {
            List<Protocol> list = aVar.i;
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol2)) {
                this.d = this.c;
                this.f = Protocol.HTTP_1_1;
                return;
            } else {
                this.d = this.c;
                this.f = protocol2;
                o(i);
                return;
            }
        }
        gVar.x(dVar);
        okhttp3.a aVar2 = this.b.a;
        SSLSocketFactory sSLSocketFactory = aVar2.c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Socket socket = this.c;
            okhttp3.l lVar = aVar2.h;
            SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory.createSocket(socket, lVar.d, lVar.e, true);
            try {
                okhttp3.f a2 = m4jVar.a(sSLSocket2);
                if (a2.b) {
                    fta0 fta0Var = fta0.a;
                    fta0.a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                okhttp3.j a3 = j.a.a(session);
                if (!aVar2.d.verify(aVar2.h.d, session)) {
                    List<Certificate> c = a3.c();
                    if (c.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) c.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(aVar2.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    gqa gqaVar = gqa.c;
                    sb.append(gqa.a.a(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(j5g.u0(mx70.a(x509Certificate, 2), mx70.a(x509Certificate, 7)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(xqm0.h(sb.toString()));
                }
                gqa gqaVar2 = aVar2.e;
                this.e = new okhttp3.j(a3.d(), a3.a(), a3.b(), new h8f0(gqaVar2, a3, aVar2));
                gqaVar2.a(aVar2.h.d, new i8f0(this));
                if (a2.b) {
                    fta0 fta0Var2 = fta0.a;
                    str = fta0.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = ez70.a;
                jek0 jek0Var = new jek0(sSLSocket2);
                this.h = new e8f0(new qz3(jek0Var, new i3x(sSLSocket2.getInputStream(), jek0Var)));
                jek0 jek0Var2 = new jek0(sSLSocket2);
                this.i = new d8f0(new pz3(jek0Var2, new p190(sSLSocket2.getOutputStream(), jek0Var2)));
                if (str != null) {
                    Protocol.Companion.getClass();
                    protocol = Protocol.a.a(str);
                } else {
                    protocol = Protocol.HTTP_1_1;
                }
                this.f = protocol;
                fta0 fta0Var3 = fta0.a;
                fta0.a.a(sSLSocket2);
                gVar.w(dVar, this.e);
                if (this.f == Protocol.HTTP_2) {
                    o(i);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    fta0 fta0Var4 = fta0.a;
                    fta0.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    x2r0.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (xsna.mx70.verify(r5, (java.security.cert.X509Certificate) r11.get(0)) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(okhttp3.a aVar, List<ipg0> list) {
        okhttp3.j jVar;
        okhttp3.l lVar = aVar.h;
        byte[] bArr = x2r0.a;
        if (this.p.size() < this.o && !this.j) {
            ipg0 ipg0Var = this.b;
            okhttp3.a aVar2 = ipg0Var.a;
            okhttp3.a aVar3 = ipg0Var.a;
            if (aVar2.a(aVar)) {
                String str = lVar.d;
                String str2 = lVar.d;
                if (epx.f(str, aVar3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null) {
                    List<ipg0> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ipg0 ipg0Var2 = (ipg0) it.next();
                            Proxy.Type type = ipg0Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && ipg0Var.b.type() == type2 && epx.f(ipg0Var.c, ipg0Var2.c)) {
                                if (aVar.d == mx70.b) {
                                    byte[] bArr2 = x2r0.a;
                                    okhttp3.l lVar2 = aVar3.h;
                                    if (lVar.e == lVar2.e) {
                                        if (!epx.f(str2, lVar2.d)) {
                                            if (!this.k && (jVar = this.e) != null) {
                                                List<Certificate> c = jVar.c();
                                                if (!c.isEmpty()) {
                                                }
                                            }
                                        }
                                        try {
                                            gqa gqaVar = aVar.e;
                                            List<Certificate> c2 = this.e.c();
                                            gqaVar.getClass();
                                            gqaVar.a(str2, new hqa(gqaVar, c2, str2));
                                            return true;
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean l(boolean z) {
        long j;
        byte[] bArr = x2r0.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        Socket socket2 = this.d;
        e8f0 e8f0Var = this.h;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        vhv vhvVar = this.g;
        if (vhvVar != null) {
            return vhvVar.i(nanoTime);
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !e8f0Var.W1();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final w1q m(okhttp3.o oVar, RealInterceptorChain realInterceptorChain) throws SocketException {
        int i = realInterceptorChain.g;
        Socket socket = this.d;
        e8f0 e8f0Var = this.h;
        d8f0 d8f0Var = this.i;
        vhv vhvVar = this.g;
        if (vhvVar != null) {
            return new eiv(oVar, this, realInterceptorChain, vhvVar);
        }
        socket.setSoTimeout(i);
        mxo0 timeout = e8f0Var.b.timeout();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(j, timeUnit);
        d8f0Var.b.timeout().g(realInterceptorChain.h, timeUnit);
        return new thv(oVar, this, e8f0Var, d8f0Var);
    }

    public final synchronized void n() {
        this.j = true;
    }

    public final void o(int i) throws IOException {
        Socket socket = this.d;
        e8f0 e8f0Var = this.h;
        d8f0 d8f0Var = this.i;
        socket.setSoTimeout(0);
        vhv.a aVar = new vhv.a(TaskRunner.i);
        aVar.d(socket, this.b.a.h.d, e8f0Var, d8f0Var);
        aVar.b(this);
        aVar.c(i);
        vhv a2 = aVar.a();
        this.g = a2;
        e0j0 e0j0Var = vhv.B;
        this.o = vhv.b.a().b();
        vhv.m(a2);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        ipg0 ipg0Var = this.b;
        sb.append(ipg0Var.a.h.d);
        sb.append(':');
        sb.append(ipg0Var.a.h.e);
        sb.append(", proxy=");
        sb.append(ipg0Var.b);
        sb.append(" hostAddress=");
        sb.append(ipg0Var.c);
        sb.append(" cipherSuite=");
        okhttp3.j jVar = this.e;
        if (jVar == null || (obj = jVar.a()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
