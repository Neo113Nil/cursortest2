package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http2.ConnectionShutdownException;

/* loaded from: classes9.dex */
public final class dk7 implements p8w {
    public static final dk7 b = new dk7(0);
    public static final dk7 c = new dk7(1);
    public final /* synthetic */ int a;

    public /* synthetic */ dk7(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d5, code lost:
    
        if ("close".equalsIgnoreCase(r2) != false) goto L175;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026d A[Catch: IOException -> 0x01f9, TryCatch #0 {IOException -> 0x01f9, blocks: (B:64:0x01ed, B:66:0x01f3, B:73:0x01fc, B:77:0x0227, B:79:0x022d, B:81:0x0230, B:88:0x0249, B:92:0x0255, B:97:0x0263, B:98:0x026a, B:101:0x026d, B:104:0x0276, B:109:0x0285, B:110:0x02ba, B:112:0x02c8, B:115:0x02d1, B:122:0x02e6, B:124:0x02f3, B:125:0x0317, B:126:0x02d7, B:127:0x02a3), top: B:63:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c8 A[Catch: IOException -> 0x01f9, TryCatch #0 {IOException -> 0x01f9, blocks: (B:64:0x01ed, B:66:0x01f3, B:73:0x01fc, B:77:0x0227, B:79:0x022d, B:81:0x0230, B:88:0x0249, B:92:0x0255, B:97:0x0263, B:98:0x026a, B:101:0x026d, B:104:0x0276, B:109:0x0285, B:110:0x02ba, B:112:0x02c8, B:115:0x02d1, B:122:0x02e6, B:124:0x02f3, B:125:0x0317, B:126:0x02d7, B:127:0x02a3), top: B:63:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022d A[Catch: IOException -> 0x01f9, TryCatch #0 {IOException -> 0x01f9, blocks: (B:64:0x01ed, B:66:0x01f3, B:73:0x01fc, B:77:0x0227, B:79:0x022d, B:81:0x0230, B:88:0x0249, B:92:0x0255, B:97:0x0263, B:98:0x026a, B:101:0x026d, B:104:0x0276, B:109:0x0285, B:110:0x02ba, B:112:0x02c8, B:115:0x02d1, B:122:0x02e6, B:124:0x02f3, B:125:0x0317, B:126:0x02d7, B:127:0x02a3), top: B:63:0x01ed }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0255 A[Catch: IOException -> 0x01f9, TryCatch #0 {IOException -> 0x01f9, blocks: (B:64:0x01ed, B:66:0x01f3, B:73:0x01fc, B:77:0x0227, B:79:0x022d, B:81:0x0230, B:88:0x0249, B:92:0x0255, B:97:0x0263, B:98:0x026a, B:101:0x026d, B:104:0x0276, B:109:0x0285, B:110:0x02ba, B:112:0x02c8, B:115:0x02d1, B:122:0x02e6, B:124:0x02f3, B:125:0x0317, B:126:0x02d7, B:127:0x02a3), top: B:63:0x01ed }] */
    /* JADX WARN: Type inference failed for: r14v1, types: [pjo] */
    /* JADX WARN: Type inference failed for: r15v1, types: [bgo] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [nci0] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [yf7] */
    /* JADX WARN: Type inference failed for: r7v21, types: [nci0] */
    /* JADX WARN: Type inference failed for: r7v3, types: [d5j0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.p8w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kvj0 intercept(m8w m8wVar) {
        cvj0 cvj0Var;
        boolean z;
        long j;
        IOException iOException;
        cvj0 cvj0Var2;
        yf7 yf7Var;
        d5j0 d5j0Var;
        long j2;
        kvj0 a;
        int i;
        rvj0 rvj0Var;
        boolean z2;
        boolean z3;
        kvj0 a2;
        m5j0 m5j0Var;
        long a3;
        uis0 f;
        pjo xtuVar;
        ?? r2 = 1;
        switch (this.a) {
            case 0:
                zci0 zci0Var = (zci0) m8wVar;
                q66 q66Var = zci0Var.d;
                ?? r14 = (pjo) q66Var.x;
                ?? r15 = (bgo) q66Var.c;
                nci0 nci0Var = (nci0) q66Var.b;
                ?? r7 = zci0Var.e;
                m5j0 m5j0Var2 = r7.d;
                meu meuVar = r7.c;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z4 = dai0.D(r7.b) && m5j0Var2 != null;
                boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(meuVar.a("Connection"));
                try {
                    try {
                        r15.requestHeadersStart(nci0Var);
                        r14.a(r7);
                        r15.requestHeadersEnd(nci0Var, r7);
                        if (z4) {
                            try {
                                if ("100-continue".equalsIgnoreCase(meuVar.a("Expect"))) {
                                    try {
                                        try {
                                            r14.b();
                                            cvj0Var = q66Var.q(true);
                                        } catch (IOException e) {
                                            r15.requestFailed(nci0Var, e);
                                            q66Var.r(e);
                                            throw e;
                                        }
                                    } catch (IOException e2) {
                                        e = e2;
                                        z = true;
                                        m8wVar = equalsIgnoreCase ? 1 : 0;
                                        r2 = r7;
                                        j = currentTimeMillis;
                                        r7 = nci0Var;
                                        cvj0Var = null;
                                        if (e instanceof ConnectionShutdownException) {
                                        }
                                    }
                                    try {
                                        r15.responseHeadersStart(nci0Var);
                                        z = false;
                                    } catch (IOException e3) {
                                        e = e3;
                                        z = true;
                                        m8wVar = equalsIgnoreCase ? 1 : 0;
                                        r2 = r7;
                                        j = currentTimeMillis;
                                        r7 = nci0Var;
                                        if (e instanceof ConnectionShutdownException) {
                                        }
                                    }
                                } else {
                                    z = true;
                                    cvj0Var = null;
                                }
                                if (cvj0Var == null) {
                                    try {
                                        m5j0Var2.getClass();
                                        try {
                                            m5j0Var = r7.d;
                                            m8wVar = equalsIgnoreCase ? 1 : 0;
                                        } catch (IOException e4) {
                                            e = e4;
                                            m8wVar = equalsIgnoreCase ? 1 : 0;
                                        }
                                        try {
                                            a3 = m5j0Var.a();
                                            r15.requestBodyStart(nci0Var);
                                            f = r14.f(r7, a3);
                                            try {
                                                j = currentTimeMillis;
                                                r2 = r7;
                                            } catch (IOException e5) {
                                                e = e5;
                                                j = currentTimeMillis;
                                                r2 = r7;
                                            }
                                        } catch (IOException e6) {
                                            e = e6;
                                            r2 = r7;
                                            j = currentTimeMillis;
                                            r7 = nci0Var;
                                            if (e instanceof ConnectionShutdownException) {
                                                throw e;
                                            }
                                            if (!q66Var.a) {
                                                throw e;
                                            }
                                            cvj0 cvj0Var3 = cvj0Var;
                                            iOException = e;
                                            cvj0Var2 = cvj0Var3;
                                            d5j0Var = r2;
                                            yf7Var = r7;
                                            if (cvj0Var2 == null) {
                                            }
                                            cvj0Var2.a = d5j0Var;
                                            cvj0Var2.e = q66Var.e().f;
                                            j2 = j;
                                            cvj0Var2.l = j2;
                                            cvj0Var2.m = System.currentTimeMillis();
                                            a = cvj0Var2.a();
                                            i = a.w;
                                            while (true) {
                                                rvj0Var = a.z;
                                                if (i == 100) {
                                                }
                                                cvj0 q = q66Var.q(false);
                                                if (!z) {
                                                }
                                                q.a = d5j0Var;
                                                q.e = q66Var.e().f;
                                                q.l = j2;
                                                q.m = System.currentTimeMillis();
                                                a = q.a();
                                                i = a.w;
                                            }
                                            r15.responseHeadersEnd(yf7Var, a);
                                            if (i != 101) {
                                            }
                                            if (z2) {
                                            }
                                            if (z2) {
                                            }
                                            z3 = false;
                                            if (m8wVar == null) {
                                            }
                                            fdi0 n = q66Var.n(a);
                                            cvj0 c2 = a.c();
                                            c2.g = n;
                                            c2.o = new kl40(18);
                                            a2 = c2.a();
                                            if (!"close".equalsIgnoreCase(a2.a.c.a("Connection"))) {
                                            }
                                            r14.j().b();
                                            if (i == 204) {
                                            }
                                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a2.z.contentLength());
                                        }
                                        try {
                                            ici0 ici0Var = new ici0(new mjo(q66Var, f, a3, false));
                                            m5j0Var2.d(ici0Var);
                                            ici0Var.close();
                                            r7 = nci0Var;
                                        } catch (IOException e7) {
                                            e = e7;
                                            r7 = nci0Var;
                                            if (e instanceof ConnectionShutdownException) {
                                            }
                                        }
                                    } catch (IOException e8) {
                                        e = e8;
                                        m8wVar = equalsIgnoreCase ? 1 : 0;
                                        r2 = r7;
                                        j = currentTimeMillis;
                                        r7 = nci0Var;
                                        if (e instanceof ConnectionShutdownException) {
                                        }
                                    }
                                } else {
                                    m8wVar = equalsIgnoreCase ? 1 : 0;
                                    r2 = r7;
                                    j = currentTimeMillis;
                                    r7 = nci0Var;
                                    try {
                                        r7.f(q66Var, true, false, false, false, null);
                                        if (!(q66Var.e().j != null)) {
                                            r14.j().b();
                                        }
                                    } catch (IOException e9) {
                                        e = e9;
                                        if (e instanceof ConnectionShutdownException) {
                                        }
                                    }
                                }
                            } catch (IOException e10) {
                                e = e10;
                                m8wVar = equalsIgnoreCase ? 1 : 0;
                                r2 = r7;
                                j = currentTimeMillis;
                                r7 = nci0Var;
                                cvj0Var = null;
                                z = true;
                                if (e instanceof ConnectionShutdownException) {
                                }
                            }
                        } else {
                            m8wVar = equalsIgnoreCase ? 1 : 0;
                            r2 = r7;
                            j = currentTimeMillis;
                            r7 = nci0Var;
                            r7.f(q66Var, true, false, false, false, null);
                            cvj0Var = null;
                            z = true;
                        }
                    } catch (IOException e11) {
                        r15.requestFailed(nci0Var, e11);
                        q66Var.r(e11);
                        throw e11;
                    }
                } catch (IOException e12) {
                    e = e12;
                }
                try {
                    r14.d();
                    cvj0Var2 = cvj0Var;
                    iOException = null;
                    d5j0Var = r2;
                    yf7Var = r7;
                    if (cvj0Var2 == null) {
                        try {
                            cvj0Var2 = q66Var.q(false);
                            if (z) {
                                r15.responseHeadersStart(yf7Var);
                                z = false;
                            }
                        } catch (IOException e13) {
                            if (iOException == null) {
                                throw e13;
                            }
                            ljo.a(iOException, e13);
                            throw iOException;
                        }
                    }
                    cvj0Var2.a = d5j0Var;
                    cvj0Var2.e = q66Var.e().f;
                    j2 = j;
                    cvj0Var2.l = j2;
                    cvj0Var2.m = System.currentTimeMillis();
                    a = cvj0Var2.a();
                    i = a.w;
                    while (true) {
                        rvj0Var = a.z;
                        if (i == 100 || (102 <= i && i < 200)) {
                            cvj0 q2 = q66Var.q(false);
                            if (!z) {
                                r15.responseHeadersStart(yf7Var);
                            }
                            q2.a = d5j0Var;
                            q2.e = q66Var.e().f;
                            q2.l = j2;
                            q2.m = System.currentTimeMillis();
                            a = q2.a();
                            i = a.w;
                        }
                    }
                    r15.responseHeadersEnd(yf7Var, a);
                    z2 = i != 101;
                    if (z2) {
                        if (q66Var.e().j != null) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                    }
                    if (z2) {
                        String a4 = a.y.a("Connection");
                        if (a4 == null) {
                            a4 = null;
                        }
                        if ("upgrade".equalsIgnoreCase(a4)) {
                            z3 = true;
                            if (m8wVar == null && z3) {
                                cvj0 c3 = a.c();
                                c3.g = new a321(rvj0Var.contentLength(), rvj0Var.contentType());
                                c3.h = q66Var.s();
                                a2 = c3.a();
                            } else {
                                fdi0 n2 = q66Var.n(a);
                                cvj0 c22 = a.c();
                                c22.g = n2;
                                c22.o = new kl40(18);
                                a2 = c22.a();
                            }
                            if (!"close".equalsIgnoreCase(a2.a.c.a("Connection"))) {
                                String a5 = a2.y.a("Connection");
                                if (a5 == null) {
                                    a5 = null;
                                }
                                break;
                            }
                            r14.j().b();
                            if ((i == 204 && i != 205) || a2.z.contentLength() <= 0) {
                                return a2;
                            }
                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a2.z.contentLength());
                        }
                    }
                    z3 = false;
                    if (m8wVar == null) {
                    }
                    fdi0 n22 = q66Var.n(a);
                    cvj0 c222 = a.c();
                    c222.g = n22;
                    c222.o = new kl40(18);
                    a2 = c222.a();
                    if (!"close".equalsIgnoreCase(a2.a.c.a("Connection"))) {
                    }
                    r14.j().b();
                    if (i == 204) {
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a2.z.contentLength());
                } catch (IOException e14) {
                    r15.requestFailed(r7, e14);
                    q66Var.r(e14);
                    throw e14;
                }
            case 1:
                zci0 zci0Var2 = (zci0) m8wVar;
                nci0 nci0Var2 = zci0Var2.a;
                synchronized (nci0Var2) {
                    if (!nci0Var2.J) {
                        throw new IllegalStateException("released");
                    }
                    if (nci0Var2.G || nci0Var2.F || nci0Var2.I || nci0Var2.H) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                qjo qjoVar = nci0Var2.B;
                RealConnection b2 = qjoVar.b();
                OkHttpClient okHttpClient = nci0Var2.a;
                int i2 = zci0Var2.g;
                jb7 jb7Var = b2.h;
                euu euuVar = b2.j;
                if (euuVar != null) {
                    xtuVar = new fuu(okHttpClient, b2, zci0Var2, euuVar);
                } else {
                    b2.e.setSoTimeout(i2);
                    ydz0 timeout = ((jci0) jb7Var.c).a.timeout();
                    long j3 = i2;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    timeout.g(j3, timeUnit);
                    ((ici0) jb7Var.w).a.timeout().g(zci0Var2.h, timeUnit);
                    xtuVar = new xtu(okHttpClient, b2, jb7Var);
                }
                q66 q66Var2 = new q66(nci0Var2, nci0Var2.x, qjoVar, xtuVar);
                nci0Var2.E = q66Var2;
                nci0Var2.L = q66Var2;
                synchronized (nci0Var2) {
                    nci0Var2.F = true;
                    nci0Var2.G = true;
                }
                if (!nci0Var2.K) {
                    return zci0.a(zci0Var2, 0, q66Var2, null, 61).b(zci0Var2.e);
                }
                ny61.v("Canceled");
                return null;
            default:
                zci0 zci0Var3 = (zci0) m8wVar;
                d5j0 d5j0Var2 = zci0Var3.e;
                String a6 = d5j0Var2.c.a("Accept-Language");
                if (a6 != null) {
                    evu0.J(a6);
                }
                return zci0Var3.b(d5j0Var2);
        }
    }
}
