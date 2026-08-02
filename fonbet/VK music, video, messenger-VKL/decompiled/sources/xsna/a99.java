package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.u;

/* compiled from: CallServerInterceptor.kt */
/* loaded from: classes11.dex */
public final class a99 implements Interceptor {
    public final boolean a;

    public a99(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        if (r11 >= 200) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0 A[Catch: IOException -> 0x00ac, TryCatch #3 {IOException -> 0x00ac, blocks: (B:70:0x00a1, B:72:0x00a7, B:23:0x00af, B:26:0x00da, B:28:0x00e0, B:29:0x00e3, B:30:0x0101, B:34:0x010c, B:35:0x0129, B:37:0x0139, B:45:0x014e, B:47:0x0154, B:50:0x0161, B:52:0x0176, B:53:0x017e, B:54:0x0188, B:63:0x0143, B:64:0x011a), top: B:69:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139 A[Catch: IOException -> 0x00ac, TryCatch #3 {IOException -> 0x00ac, blocks: (B:70:0x00a1, B:72:0x00a7, B:23:0x00af, B:26:0x00da, B:28:0x00e0, B:29:0x00e3, B:30:0x0101, B:34:0x010c, B:35:0x0129, B:37:0x0139, B:45:0x014e, B:47:0x0154, B:50:0x0161, B:52:0x0176, B:53:0x017e, B:54:0x0188, B:63:0x0143, B:64:0x011a), top: B:69:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154 A[Catch: IOException -> 0x00ac, TryCatch #3 {IOException -> 0x00ac, blocks: (B:70:0x00a1, B:72:0x00a7, B:23:0x00af, B:26:0x00da, B:28:0x00e0, B:29:0x00e3, B:30:0x0101, B:34:0x010c, B:35:0x0129, B:37:0x0139, B:45:0x014e, B:47:0x0154, B:50:0x0161, B:52:0x0176, B:53:0x017e, B:54:0x0188, B:63:0x0143, B:64:0x011a), top: B:69:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0161 A[Catch: IOException -> 0x00ac, TryCatch #3 {IOException -> 0x00ac, blocks: (B:70:0x00a1, B:72:0x00a7, B:23:0x00af, B:26:0x00da, B:28:0x00e0, B:29:0x00e3, B:30:0x0101, B:34:0x010c, B:35:0x0129, B:37:0x0139, B:45:0x014e, B:47:0x0154, B:50:0x0161, B:52:0x0176, B:53:0x017e, B:54:0x0188, B:63:0x0143, B:64:0x011a), top: B:69:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.u intercept(Interceptor.a aVar) throws IOException {
        u.a aVar2;
        int o;
        okhttp3.u c;
        okhttp3.v m;
        boolean z;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) aVar;
        u1q u1qVar = realInterceptorChain.d;
        okhttp3.p pVar = realInterceptorChain.e;
        okhttp3.t tVar = pVar.d;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = true;
        try {
            u1qVar.s(pVar);
            if (!xwk.f(pVar.b) || tVar == null) {
                u1qVar.m();
                aVar2 = null;
            } else {
                if ("100-continue".equalsIgnoreCase(pVar.c.a("Expect"))) {
                    u1qVar.f();
                    aVar2 = u1qVar.o(true);
                    try {
                        u1qVar.q();
                        z = false;
                    } catch (IOException e) {
                        e = e;
                        if (!(e instanceof ConnectionShutdownException)) {
                        }
                    }
                } else {
                    z = true;
                    aVar2 = null;
                }
                try {
                    if (aVar2 != null) {
                        u1qVar.m();
                        if (u1qVar.g().g == null) {
                            z2 = false;
                        }
                        if (!z2) {
                            u1qVar.l();
                        }
                    } else if (tVar.isDuplex()) {
                        u1qVar.f();
                        tVar.writeTo(new d8f0(u1qVar.c(pVar, true)));
                    } else {
                        d8f0 d8f0Var = new d8f0(u1qVar.c(pVar, false));
                        tVar.writeTo(d8f0Var);
                        d8f0Var.close();
                    }
                    z2 = z;
                } catch (IOException e2) {
                    e = e2;
                    z2 = z;
                    if (!(e instanceof ConnectionShutdownException)) {
                        throw e;
                    }
                    if (!u1qVar.i()) {
                        throw e;
                    }
                    if (aVar2 == null) {
                    }
                    aVar2.p(pVar);
                    aVar2.g(u1qVar.g().e);
                    aVar2.q(currentTimeMillis);
                    aVar2.n(System.currentTimeMillis());
                    okhttp3.u c2 = aVar2.c();
                    o = c2.o();
                    if (o != 100) {
                    }
                    u.a o2 = u1qVar.o(false);
                    if (z2) {
                    }
                    o2.p(pVar);
                    o2.g(u1qVar.g().e);
                    o2.q(currentTimeMillis);
                    o2.n(System.currentTimeMillis());
                    c2 = o2.c();
                    o = c2.o();
                    u1qVar.p(c2);
                    if (this.a) {
                    }
                    u.a w = c2.w();
                    w.b(u1qVar.n(c2));
                    c = w.c();
                    if (!CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c.A().c.a("Connection"))) {
                    }
                    u1qVar.l();
                    if (o != 204) {
                    }
                    m = c.m();
                    if ((m != null ? m.contentLength() : -1L) > 0) {
                    }
                    return c;
                }
            }
            if (tVar == null || !tVar.isDuplex()) {
                u1qVar.e();
            }
            e = null;
        } catch (IOException e3) {
            e = e3;
            aVar2 = null;
        }
        if (aVar2 == null) {
            try {
                aVar2 = u1qVar.o(false);
                if (z2) {
                    u1qVar.q();
                    z2 = false;
                }
            } catch (IOException e4) {
                if (e == null) {
                    throw e4;
                }
                mnh0.d(e, e4);
                throw e;
            }
        }
        aVar2.p(pVar);
        aVar2.g(u1qVar.g().e);
        aVar2.q(currentTimeMillis);
        aVar2.n(System.currentTimeMillis());
        okhttp3.u c22 = aVar2.c();
        o = c22.o();
        if (o != 100) {
            if (102 > o) {
            }
            u1qVar.p(c22);
            if (this.a || o != 101) {
                u.a w2 = c22.w();
                w2.b(u1qVar.n(c22));
                c = w2.c();
            } else {
                u.a w3 = c22.w();
                w3.b(x2r0.c);
                c = w3.c();
            }
            if (!CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c.A().c.a("Connection")) || CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(okhttp3.u.r("Connection", c))) {
                u1qVar.l();
            }
            if (o != 204 || o == 205) {
                m = c.m();
                if ((m != null ? m.contentLength() : -1L) > 0) {
                    StringBuilder sb = new StringBuilder("HTTP ");
                    sb.append(o);
                    sb.append(" had non-zero Content-Length: ");
                    okhttp3.v m2 = c.m();
                    sb.append(m2 != null ? Long.valueOf(m2.contentLength()) : null);
                    throw new ProtocolException(sb.toString());
                }
            }
            return c;
        }
        u.a o22 = u1qVar.o(false);
        if (z2) {
            u1qVar.q();
        }
        o22.p(pVar);
        o22.g(u1qVar.g().e);
        o22.q(currentTimeMillis);
        o22.n(System.currentTimeMillis());
        c22 = o22.c();
        o = c22.o();
        u1qVar.p(c22);
        if (this.a) {
        }
        u.a w22 = c22.w();
        w22.b(u1qVar.n(c22));
        c = w22.c();
        if (!CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c.A().c.a("Connection"))) {
        }
        u1qVar.l();
        if (o != 204) {
        }
        m = c.m();
        if ((m != null ? m.contentLength() : -1L) > 0) {
        }
        return c;
    }
}
