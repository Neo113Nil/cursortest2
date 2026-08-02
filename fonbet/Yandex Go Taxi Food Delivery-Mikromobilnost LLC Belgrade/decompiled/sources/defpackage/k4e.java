package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.a;
import okhttp3.Protocol;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes9.dex */
public final class k4e implements f7l0, ojo {
    public final mtx0 a;
    public final oci0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final nci0 h;
    public final gdi0 i;
    public final b0l0 j;
    public final List k;
    public final int l;
    public final d5j0 m;
    public final int n;
    public final boolean o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public o6u s;
    public Protocol t;
    public jb7 u;
    public RealConnection v;

    public k4e(mtx0 mtx0Var, oci0 oci0Var, int i, int i2, int i3, int i4, boolean z, nci0 nci0Var, gdi0 gdi0Var, b0l0 b0l0Var, List list, int i5, d5j0 d5j0Var, int i6, boolean z2) {
        this.a = mtx0Var;
        this.b = oci0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = nci0Var;
        this.i = gdi0Var;
        this.j = b0l0Var;
        this.k = list;
        this.l = i5;
        this.m = d5j0Var;
        this.n = i6;
        this.o = z2;
    }

    public static k4e j(k4e k4eVar, int i, d5j0 d5j0Var, int i2, boolean z, int i3) {
        return new k4e(k4eVar.a, k4eVar.b, k4eVar.c, k4eVar.d, k4eVar.e, k4eVar.f, k4eVar.g, k4eVar.h, k4eVar.i, k4eVar.j, k4eVar.k, (i3 & 1) != 0 ? k4eVar.l : i, (i3 & 2) != 0 ? k4eVar.m : d5j0Var, (i3 & 4) != 0 ? k4eVar.n : i2, (i3 & 8) != 0 ? k4eVar.o : z);
    }

    @Override // defpackage.f7l0
    public final RealConnection a() {
        y1l0 y1l0Var = this.h.a.V;
        b0l0 b0l0Var = this.j;
        synchronized (y1l0Var) {
            y1l0Var.a.remove(b0l0Var);
        }
        RealConnection realConnection = this.v;
        realConnection.i.getClass();
        o2k0 d = this.i.d(this, this.k);
        if (d != null) {
            return d.a;
        }
        synchronized (realConnection) {
            oci0 oci0Var = this.b;
            oci0Var.getClass();
            TimeZone timeZone = bg61.a;
            oci0Var.f.add(realConnection);
            oci0Var.d.d(oci0Var.e, 0L);
            this.h.b(realConnection);
        }
        nci0 nci0Var = this.h;
        nci0Var.x.connectionAcquired(nci0Var, realConnection);
        realConnection.i.getClass();
        return realConnection;
    }

    @Override // defpackage.ojo
    public final void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x011f A[Catch: all -> 0x0034, TryCatch #2 {all -> 0x0034, blocks: (B:7:0x0023, B:100:0x0027, B:102:0x002f, B:9:0x004b, B:12:0x0050, B:15:0x0055, B:17:0x0061, B:20:0x0066, B:22:0x0072, B:24:0x0093, B:26:0x00bf, B:29:0x00d5, B:42:0x010b, B:44:0x011f, B:47:0x0124, B:50:0x0129, B:52:0x012d, B:55:0x0136, B:58:0x013b, B:61:0x0143, B:90:0x00a5, B:91:0x00ac, B:92:0x00ad, B:95:0x00bc, B:98:0x00ba), top: B:6:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    @Override // defpackage.f7l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e7l0 c() {
        k4e k4eVar;
        IOException iOException;
        k4e k4eVar2;
        k4e k4eVar3;
        k4e k4eVar4;
        oci0 oci0Var = this.b;
        nci0 nci0Var = this.h;
        bgo bgoVar = nci0Var.x;
        CopyOnWriteArrayList copyOnWriteArrayList = nci0Var.M;
        Socket socket = this.q;
        if (socket == null) {
            ny61.g("TCP not connected");
            return null;
        }
        if (isReady()) {
            ny61.r("already connected");
            return null;
        }
        b0l0 b0l0Var = this.j;
        no0 no0Var = b0l0Var.a;
        Proxy proxy = b0l0Var.b;
        no0 no0Var2 = b0l0Var.a;
        List list = no0Var.j;
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                if (this.m != null) {
                    try {
                        e7l0 i = i();
                        if (i.b != null || i.c != null) {
                            copyOnWriteArrayList.remove(this);
                            Socket socket2 = this.r;
                            if (socket2 != null) {
                                bg61.d(socket2);
                            }
                            bg61.d(socket);
                            return i;
                        }
                    } catch (IOException e) {
                        iOException = e;
                        k4eVar2 = null;
                        k4eVar = null;
                        k4e k4eVar5 = k4eVar;
                        nci0Var.x.connectFailed(nci0Var, b0l0Var.c, proxy, null, iOException);
                        oci0Var.b.getClass();
                        if (this.g && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException))) {
                            k4eVar3 = k4eVar2;
                            e7l0 e7l0Var = new e7l0(this, k4eVar3, iOException);
                            copyOnWriteArrayList.remove(this);
                            if (!z) {
                                Socket socket3 = this.r;
                                if (socket3 != null) {
                                    bg61.d(socket3);
                                }
                                bg61.d(socket);
                            }
                            return e7l0Var;
                        }
                        k4eVar3 = k4eVar5;
                        e7l0 e7l0Var2 = new e7l0(this, k4eVar3, iOException);
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                        }
                        return e7l0Var2;
                    }
                }
                if (no0Var2.c != null) {
                    jb7 jb7Var = this.u;
                    if (jb7Var == null) {
                        jb7Var = null;
                    }
                    if (((jci0) jb7Var.c).b.I1()) {
                        jb7 jb7Var2 = this.u;
                        if (jb7Var2 == null) {
                            jb7Var2 = null;
                        }
                        if (((ici0) jb7Var2.w).b.I1()) {
                            bgoVar.secureConnectStart(nci0Var);
                            SSLSocketFactory sSLSocketFactory = no0Var2.c;
                            kwu kwuVar = no0Var2.h;
                            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, kwuVar.d, kwuVar.e, true);
                            k4e l = l(list, sSLSocket);
                            j5e j5eVar = (j5e) list.get(l.n);
                            k4eVar4 = l.k(list, sSLSocket);
                            try {
                                j5eVar.a(sSLSocket, l.o);
                                h(sSLSocket, j5eVar);
                                bgoVar.secureConnectEnd(nci0Var, this.s);
                            } catch (IOException e2) {
                                iOException = e2;
                                k4eVar2 = k4eVar4;
                                k4eVar = null;
                                k4e k4eVar52 = k4eVar;
                                nci0Var.x.connectFailed(nci0Var, b0l0Var.c, proxy, null, iOException);
                                oci0Var.b.getClass();
                                if (this.g) {
                                    k4eVar3 = k4eVar2;
                                    e7l0 e7l0Var22 = new e7l0(this, k4eVar3, iOException);
                                    copyOnWriteArrayList.remove(this);
                                    if (!z) {
                                    }
                                    return e7l0Var22;
                                }
                                k4eVar3 = k4eVar52;
                                e7l0 e7l0Var222 = new e7l0(this, k4eVar3, iOException);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                }
                                return e7l0Var222;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket;
                List list2 = no0Var2.i;
                Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(protocol)) {
                    protocol = Protocol.HTTP_1_1;
                }
                this.t = protocol;
                k4eVar4 = null;
                try {
                    mtx0 mtx0Var = this.a;
                    b0l0 b0l0Var2 = this.j;
                    Socket socket4 = this.r;
                    o6u o6uVar = this.s;
                    Protocol protocol2 = this.t;
                    jb7 jb7Var3 = this.u;
                    RealConnection realConnection = new RealConnection(mtx0Var, b0l0Var2, socket, socket4, o6uVar, protocol2, jb7Var3 == null ? null : jb7Var3, oci0Var.b);
                    this.v = realConnection;
                    realConnection.h();
                    bgoVar.connectEnd(nci0Var, b0l0Var.c, proxy, this.t);
                    try {
                        try {
                            k4eVar = null;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            copyOnWriteArrayList.remove(this);
                            if (!z) {
                                Socket socket5 = this.r;
                                if (socket5 != null) {
                                    bg61.d(socket5);
                                }
                                bg61.d(socket);
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        k4eVar = null;
                    }
                } catch (IOException e4) {
                    e = e4;
                    k4eVar = null;
                }
            } catch (IOException e5) {
                k4eVar = null;
                iOException = e5;
                k4eVar2 = null;
            }
            try {
                e7l0 e7l0Var3 = new e7l0(this, null, null, 6);
                copyOnWriteArrayList.remove(this);
                return e7l0Var3;
            } catch (IOException e6) {
                e = e6;
                z = true;
                iOException = e;
                k4eVar2 = k4eVar4;
                k4e k4eVar522 = k4eVar;
                nci0Var.x.connectFailed(nci0Var, b0l0Var.c, proxy, null, iOException);
                oci0Var.b.getClass();
                if (this.g) {
                }
                k4eVar3 = k4eVar522;
                e7l0 e7l0Var2222 = new e7l0(this, k4eVar3, iOException);
                copyOnWriteArrayList.remove(this);
                if (!z) {
                }
                return e7l0Var2222;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.f7l0, defpackage.ojo
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            bg61.d(socket);
        }
    }

    @Override // defpackage.f7l0
    public final e7l0 d() {
        Socket socket;
        Socket socket2;
        oci0 oci0Var = this.b;
        b0l0 b0l0Var = this.j;
        nci0 nci0Var = this.h;
        CopyOnWriteArrayList copyOnWriteArrayList = nci0Var.M;
        if (this.q != null) {
            ny61.r("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            nci0Var.x.connectStart(nci0Var, b0l0Var.c, b0l0Var.b);
            oci0Var.b.getClass();
            g();
            z = true;
            e7l0 e7l0Var = new e7l0(this, null, null, 6);
            copyOnWriteArrayList.remove(this);
            return e7l0Var;
        } catch (IOException e) {
            boolean z2 = z;
            try {
                no0 no0Var = b0l0Var.a;
                if (b0l0Var.b.type() != Proxy.Type.DIRECT) {
                    no0 no0Var2 = b0l0Var.a;
                    no0Var2.g.connectFailed(no0Var2.h.l(), b0l0Var.b.address(), e);
                }
                nci0Var.x.connectFailed(nci0Var, b0l0Var.c, b0l0Var.b, null, e);
                oci0Var.b.getClass();
                e7l0 e7l0Var2 = new e7l0(this, null, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z2 && (socket2 = this.q) != null) {
                    bg61.d(socket2);
                }
                return e7l0Var2;
            } catch (Throwable th) {
                th = th;
                z = z2;
                copyOnWriteArrayList.remove(this);
                if (!z && (socket = this.q) != null) {
                    bg61.d(socket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            copyOnWriteArrayList.remove(this);
            if (!z) {
                bg61.d(socket);
            }
            throw th;
        }
    }

    @Override // defpackage.ojo
    public final void e(nci0 nci0Var, IOException iOException) {
    }

    @Override // defpackage.f7l0
    public final f7l0 f() {
        return new k4e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    public final void g() {
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : j4e.a[type.ordinal()];
        Socket createSocket = (i == 1 || i == 2) ? this.j.a.b.createSocket() : new Socket(this.j.b);
        this.q = createSocket;
        if (this.p) {
            ny61.v("canceled");
            return;
        }
        createSocket.setSoTimeout(this.f);
        try {
            d72 d72Var = dvc0.a;
            d72 d72Var2 = dvc0.a;
            InetSocketAddress inetSocketAddress = this.j.c;
            int i2 = this.e;
            d72Var2.getClass();
            createSocket.connect(inetSocketAddress, i2);
            try {
                this.u = new jb7(new cxq0(createSocket));
            } catch (NullPointerException e) {
                if (jl40.l(e.getMessage(), "throw with null exception")) {
                    kbs.r(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.ojo
    public final b0l0 getRoute() {
        return this.j;
    }

    public final void h(SSLSocket sSLSocket, j5e j5eVar) {
        Protocol protocol;
        Object obj;
        Object obj2;
        no0 no0Var = this.j.a;
        try {
            String str = null;
            if (j5eVar.b) {
                d72 d72Var = dvc0.a;
                d72 d72Var2 = dvc0.a;
                String str2 = no0Var.h.d;
                List list = no0Var.i;
                Iterator it = d72Var2.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((l5t0) obj2).a(sSLSocket)) {
                            break;
                        }
                    }
                }
                l5t0 l5t0Var = (l5t0) obj2;
                if (l5t0Var != null) {
                    l5t0Var.c(sSLSocket, str2, list);
                }
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            o6u A = tje.A(session);
            int i = 2;
            if (!no0Var.d.verify(no0Var.h.d, session)) {
                List a = A.a();
                if (a.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + no0Var.h.d + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) a.get(0);
                StringBuilder sb = new StringBuilder();
                sb.append("\n            |Hostname ");
                sb.append(no0Var.h.d);
                sb.append(" not verified:\n            |    certificate: ");
                p79 p79Var = p79.c;
                sb.append(bb1.F(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(a.m0(vv60.a(x509Certificate, 2), vv60.a(x509Certificate, 7)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(vuu0.d(sb.toString()));
            }
            p79 p79Var2 = no0Var.e;
            this.s = new o6u(A.a, A.b, A.c, new in2(i, p79Var2, A, no0Var));
            String str3 = no0Var.h.d;
            Iterator it2 = p79Var2.a.iterator();
            if (it2.hasNext()) {
                b64.D(it2.next());
                throw null;
            }
            if (j5eVar.b) {
                d72 d72Var3 = dvc0.a;
                Iterator it3 = dvc0.a.d.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it3.next();
                        if (((l5t0) obj).a(sSLSocket)) {
                            break;
                        }
                    }
                }
                l5t0 l5t0Var2 = (l5t0) obj;
                if (l5t0Var2 != null) {
                    str = l5t0Var2.b(sSLSocket);
                }
            }
            this.r = sSLSocket;
            this.u = new jb7(new cxq0(sSLSocket));
            if (str != null) {
                Protocol.Companion.getClass();
                protocol = nvf0.a(str);
            } else {
                protocol = Protocol.HTTP_1_1;
            }
            this.t = protocol;
            d72 d72Var4 = dvc0.a;
            dvc0.a.getClass();
        } catch (Throwable th) {
            d72 d72Var5 = dvc0.a;
            dvc0.a.getClass();
            bg61.d(sSLSocket);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        return new defpackage.e7l0(r13, null, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        r1 = r13.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        defpackage.bg61.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        r1 = r13.l + 1;
        r3 = r13.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        if (r1 >= 21) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        r3.x.connectEnd(r3, r0.c, r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f6, code lost:
    
        return new defpackage.e7l0(r13, j(r13, r1, r2, 0, false, 12), null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f7, code lost:
    
        r7 = new java.net.ProtocolException("Too many tunnel connections attempted: 21");
        r3.x.connectFailed(r3, r0.c, r5, null, r7);
        r13.b.b.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0114, code lost:
    
        return new defpackage.e7l0(r13, null, r7, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e7l0 i() {
        d5j0 d5j0Var;
        b0l0 b0l0Var = this.j;
        no0 no0Var = b0l0Var.a;
        Proxy proxy = b0l0Var.b;
        String str = "CONNECT " + bg61.j(no0Var.h, true) + " HTTP/1.1";
        d5j0 d5j0Var2 = this.m;
        while (true) {
            jb7 jb7Var = this.u;
            if (jb7Var == null) {
                jb7Var = null;
            }
            xtu xtuVar = new xtu(null, this, jb7Var);
            jb7 jb7Var2 = this.u;
            if (jb7Var2 == null) {
                jb7Var2 = null;
            }
            ydz0 timeout = ((jci0) jb7Var2.c).a.timeout();
            long j = this.c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            timeout.g(j, timeUnit);
            jb7 jb7Var3 = this.u;
            if (jb7Var3 == null) {
                jb7Var3 = null;
            }
            ((ici0) jb7Var3.w).a.timeout().g(this.d, timeUnit);
            xtuVar.l(d5j0Var2.c, str);
            xtuVar.d();
            cvj0 h = xtuVar.h(false);
            h.a = d5j0Var2;
            kvj0 a = h.a();
            int i = a.w;
            long f = bg61.f(a);
            if (f != -1) {
                vtu k = xtuVar.k(a.a.a, f);
                bg61.h(k, Integer.MAX_VALUE);
                k.close();
            }
            if (i == 200) {
                d5j0Var = null;
                break;
            }
            if (i != 407) {
                ny61.v(oyr.i(i, "Unexpected response code for CONNECT: "));
                return null;
            }
            d5j0 a2 = b0l0Var.a.f.a(b0l0Var, a);
            if (a2 == null) {
                ny61.v("Failed to authenticate with proxy");
                return null;
            }
            String a3 = a.y.a("Connection");
            if (a3 == null) {
                a3 = null;
            }
            if ("close".equalsIgnoreCase(a3)) {
                d5j0Var = a2;
                break;
            }
            d5j0Var2 = a2;
        }
    }

    @Override // defpackage.f7l0
    public final boolean isReady() {
        return this.t != null;
    }

    public final k4e k(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int i = this.n;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            j5e j5eVar = (j5e) list.get(i2);
            if (j5eVar.a && (((strArr = j5eVar.d) == null || yf61.g(strArr, sSLSocket.getEnabledProtocols(), u450.a)) && ((strArr2 = j5eVar.c) == null || yf61.g(strArr2, sSLSocket.getEnabledCipherSuites(), gtb.c)))) {
                return j(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final k4e l(List list, SSLSocket sSLSocket) {
        if (this.n != -1) {
            return this;
        }
        k4e k = k(list, sSLSocket);
        if (k != null) {
            return k;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.o);
        sb.append(", modes=");
        sb.append(list);
        String arrays = Arrays.toString(sSLSocket.getEnabledProtocols());
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
