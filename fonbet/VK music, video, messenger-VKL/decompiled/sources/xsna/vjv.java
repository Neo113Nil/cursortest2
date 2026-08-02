package xsna;

import android.os.SystemClock;
import com.vk.knet.core.http.HttpMethod;
import com.vk.knet.core.http.HttpProtocol;
import com.vk.knet.core.http.metric.HttpMetrics;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import kotlin.Pair;
import okhttp3.Protocol;
import okhttp3.TlsVersion;

/* compiled from: HttpMetricsEventListener.kt */
/* loaded from: classes2.dex */
public final class vjv extends okhttp3.g {
    public final k46 b;
    public final wjv c;
    public final Executor d;
    public final LinkedHashMap e = new LinkedHashMap();
    public Pair<? extends InetAddress, a> f;
    public Long g;
    public Long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public TlsVersion m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public pkv s;

    /* compiled from: HttpMetricsEventListener.kt */
    public static final class a {
        public final long a;
        public long b;
        public final Proxy c;
        public Protocol d;
        public final boolean e;

        public a() {
            this(0L, null, null, 31);
        }

        public a(long j, Proxy proxy, Protocol protocol, int i) {
            j = (i & 1) != 0 ? 0L : j;
            proxy = (i & 4) != 0 ? Proxy.NO_PROXY : proxy;
            protocol = (i & 8) != 0 ? null : protocol;
            boolean z = (i & 16) == 0;
            this.a = j;
            this.b = 0L;
            this.c = proxy;
            this.d = protocol;
            this.e = z;
        }
    }

    public vjv(k46 k46Var, wjv wjvVar, Executor executor) {
        this.b = k46Var;
        this.c = wjvVar;
        this.d = executor;
    }

    public static long y(Long l, Long l2) {
        if (l != null && l2 != null) {
            long longValue = l.longValue();
            long longValue2 = l2.longValue();
            if (longValue > longValue2) {
                longValue = longValue2;
            }
            long longValue3 = l2.longValue();
            long longValue4 = l.longValue();
            if (longValue3 < longValue4) {
                longValue3 = longValue4;
            }
            if (longValue != 0 && longValue3 != 0) {
                return longValue3 - longValue;
            }
        }
        return 0L;
    }

    public final long A() {
        this.b.getClass();
        return SystemClock.elapsedRealtime();
    }

    @Override // okhttp3.g
    public final void a(f8f0 f8f0Var) {
        A();
        this.d.execute(new e6(4, this, f8f0Var));
    }

    @Override // okhttp3.g
    public final void b(f8f0 f8f0Var, IOException iOException) {
        A();
        this.d.execute(new boy0(this, f8f0Var, iOException, 3));
    }

    @Override // okhttp3.g
    public final void c(f8f0 f8f0Var) {
        this.r = A();
    }

    @Override // okhttp3.g
    public final void e(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        a aVar = (a) this.e.get(inetSocketAddress.getAddress());
        if (aVar != null) {
            aVar.b = A();
            aVar.d = protocol;
        }
    }

    @Override // okhttp3.g
    public final void g(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        if (this.g == null) {
            this.g = Long.valueOf(A());
        }
        this.e.put(inetSocketAddress.getAddress(), new a(A(), proxy, null, 26));
    }

    @Override // okhttp3.g
    public final void h(okhttp3.d dVar, u3j u3jVar) {
        InetAddress inetAddress = u3jVar.b().getInetAddress();
        a aVar = (a) this.e.get(inetAddress);
        if (aVar == null) {
            aVar = new a(0L, u3jVar.c().b, u3jVar.a(), 3);
        }
        this.f = new Pair<>(inetAddress, aVar);
    }

    @Override // okhttp3.g
    public final void j(okhttp3.d dVar, String str, List<? extends InetAddress> list) {
        this.j = A();
    }

    @Override // okhttp3.g
    public final void k(okhttp3.d dVar, String str) {
        this.i = A();
    }

    @Override // okhttp3.g
    public final void l(okhttp3.d dVar, long j) {
        this.o = A();
    }

    @Override // okhttp3.g
    public final void p(okhttp3.d dVar) {
        this.n = A();
    }

    @Override // okhttp3.g
    public final void q(okhttp3.d dVar, long j) {
        this.q = A();
    }

    @Override // okhttp3.g
    public final void t(okhttp3.d dVar, okhttp3.u uVar) {
        HttpProtocol httpProtocol;
        a j;
        Protocol protocol;
        int i = uVar.e;
        long j2 = x2r0.j(uVar);
        okhttp3.k kVar = uVar.g;
        String str = (String) j5g.a0(kVar.g("content-type"));
        if (str == null) {
            str = null;
        } else {
            int L = drm0.L(str, ';', 0, 6);
            if (L != -1) {
                str = str.substring(0, L);
            }
        }
        TreeMap e = kVar.e();
        Pair<? extends InetAddress, a> pair = this.f;
        if (pair == null || (j = pair.j()) == null || (protocol = j.d) == null || (httpProtocol = wx70.c(protocol)) == null) {
            HttpProtocol.Companion.getClass();
            httpProtocol = HttpProtocol.HTTP_2;
        }
        this.s = new pkv(i, str, Long.valueOf(j2), httpProtocol, e);
    }

    @Override // okhttp3.g
    public final void u(okhttp3.d dVar) {
        this.p = A();
    }

    @Override // okhttp3.g
    public final void w(okhttp3.d dVar, okhttp3.j jVar) {
        this.l = A();
        this.m = jVar != null ? jVar.a : null;
    }

    @Override // okhttp3.g
    public final void x(okhttp3.d dVar) {
        this.k = A();
        if (this.h == null) {
            this.h = Long.valueOf(A());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z(f8f0 f8f0Var, IOException iOException) {
        HashMap hashMap;
        ekv ekvVar;
        ckv ckvVar;
        String str;
        String message;
        Pair<? extends InetAddress, a> pair = this.f;
        if (pair == null) {
            return;
        }
        a g = pair.g();
        okhttp3.p pVar = f8f0Var.c;
        String str2 = pVar.a.i;
        HttpMethod.a aVar = HttpMethod.Companion;
        String str3 = pVar.b;
        aVar.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        hashMap = HttpMethod.methodMap;
        HttpMethod httpMethod = (HttpMethod) hashMap.get(upperCase);
        if (httpMethod == null) {
            ckvVar = null;
        } else {
            okhttp3.t tVar = pVar.d;
            okhttp3.m contentType = tVar != null ? tVar.contentType() : null;
            Map e = pVar.c.e();
            if (contentType != null) {
                e = pn00.o(e, new Pair("Content-Type", yiz.p(contentType.a)));
            }
            Map map = e;
            if ((httpMethod == HttpMethod.POST || httpMethod == HttpMethod.PUT || httpMethod == HttpMethod.PATCH) && tVar != null) {
                okhttp3.m contentType2 = tVar.contentType();
                String str4 = contentType2 != null ? contentType2.a : null;
                vl8 vl8Var = new vl8();
                tVar.writeTo(vl8Var);
                ekvVar = new ekv(vl8Var.v(vl8Var.c), str4);
            } else {
                ekvVar = null;
            }
            ckvVar = new ckv(httpMethod, str2, map, ekvVar, 16);
        }
        if (ckvVar == null) {
            return;
        }
        TlsVersion tlsVersion = this.m;
        String h = tlsVersion != null ? tlsVersion.h() : null;
        String str5 = h == null ? "" : h;
        long j = g.a;
        Proxy proxy = g.c;
        if (j == 0 || g.e) {
            j = this.n;
        }
        HttpMetrics.Source source = HttpMetrics.Source.OKHTTP;
        long j2 = j;
        boolean z = g.e;
        Proxy.Type type = proxy.type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        boolean z2 = type != type2;
        if (proxy.type() == type2) {
            proxy = null;
        }
        String proxy2 = proxy != null ? proxy.toString() : null;
        String str6 = proxy2 == null ? "" : proxy2;
        sjv sjvVar = new sjv(y(Long.valueOf(this.j), Long.valueOf(this.i)), y(this.h, this.g), y(Long.valueOf(this.l), Long.valueOf(this.k)), y(Long.valueOf(g.b), Long.valueOf(g.a)), y(Long.valueOf(this.q), Long.valueOf(j2)), y(Long.valueOf(this.p), Long.valueOf(j2)));
        long j3 = this.o;
        long j4 = this.n;
        long j5 = j3 - j4;
        boolean z3 = iOException != null || f8f0Var.q;
        if (f8f0Var.q) {
            message = "request cancelled";
        } else {
            if (iOException == null) {
                str = null;
                Protocol protocol = g.d;
                this.c.a(new HttpMetrics(source, z, str5, z2, str6, sjvVar, j5, this.r, j4, z3, protocol != null ? wx70.c(protocol) : null, str), ckvVar, this.s);
            }
            message = iOException.getMessage();
        }
        str = message;
        Protocol protocol2 = g.d;
        if (protocol2 != null) {
        }
        this.c.a(new HttpMetrics(source, z, str5, z2, str6, sjvVar, j5, this.r, j4, z3, protocol2 != null ? wx70.c(protocol2) : null, str), ckvVar, this.s);
    }
}
