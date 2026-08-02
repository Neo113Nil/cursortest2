package xsna;

import android.os.SystemClock;
import com.vk.knet.core.http.metric.HttpMetrics;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Protocol;
import okhttp3.TlsVersion;

/* compiled from: HttpMetricsCollector.kt */
/* loaded from: classes.dex */
public final class ujv {
    public final a a = new a();
    public final ConcurrentHashMap<okhttp3.d, b> b = new ConcurrentHashMap<>();
    public final LinkedHashMap c = new LinkedHashMap();

    /* compiled from: HttpMetricsCollector.kt */
    public final class a extends okhttp3.g {
        public a() {
        }

        @Override // okhttp3.g
        public final void a(f8f0 f8f0Var) {
            ujv ujvVar = ujv.this;
            b bVar = ujvVar.b.get(f8f0Var);
            if (bVar != null) {
                bVar.A(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            ujvVar.a(f8f0Var);
        }

        @Override // okhttp3.g
        public final void b(f8f0 f8f0Var, IOException iOException) {
            ujv ujvVar = ujv.this;
            b bVar = ujvVar.b.get(f8f0Var);
            if (bVar != null) {
                bVar.v(iOException);
            }
            ujvVar.a(f8f0Var);
        }

        @Override // okhttp3.g
        public final void c(f8f0 f8f0Var) {
            ConcurrentHashMap<okhttp3.d, b> concurrentHashMap = ujv.this.b;
            b bVar = concurrentHashMap.get(f8f0Var);
            if (bVar != null) {
                bVar.E(Long.valueOf(System.currentTimeMillis()));
            }
            b bVar2 = concurrentHashMap.get(f8f0Var);
            if (bVar2 != null) {
                bVar2.C(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }

        @Override // okhttp3.g
        public final void e(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            ConcurrentHashMap<okhttp3.d, b> concurrentHashMap = ujv.this.b;
            b bVar = concurrentHashMap.get(dVar);
            if (bVar != null) {
                bVar.r(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            b bVar2 = concurrentHashMap.get(dVar);
            if (bVar2 != null) {
                bVar2.w(protocol);
            }
        }

        @Override // okhttp3.g
        public final void g(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
            b bVar = ujv.this.b.get(dVar);
            if (bVar != null) {
                if (bVar.b() == null) {
                    bVar.s(Long.valueOf(SystemClock.elapsedRealtime()));
                }
                bVar.x(proxy.type() != Proxy.Type.DIRECT);
                if (bVar.q()) {
                    bVar.y(proxy.toString());
                }
            }
        }

        @Override // okhttp3.g
        public final void j(okhttp3.d dVar, String str, List<? extends InetAddress> list) {
            b bVar = ujv.this.b.get(dVar);
            if (bVar != null) {
                bVar.t(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }

        @Override // okhttp3.g
        public final void k(okhttp3.d dVar, String str) {
            b bVar = ujv.this.b.get(dVar);
            if (bVar == null || bVar.d() != null) {
                return;
            }
            bVar.u(Long.valueOf(SystemClock.elapsedRealtime()));
        }

        @Override // okhttp3.g
        public final void l(okhttp3.d dVar, long j) {
            b bVar = ujv.this.b.get(dVar);
            if (bVar == null || bVar.h() != null) {
                return;
            }
            bVar.z(Long.valueOf(SystemClock.elapsedRealtime()));
        }

        @Override // okhttp3.g
        public final void p(okhttp3.d dVar) {
            b bVar = ujv.this.b.get(dVar);
            if (bVar == null || bVar.j() != null) {
                return;
            }
            bVar.B(Long.valueOf(SystemClock.elapsedRealtime()));
        }

        @Override // okhttp3.g
        public final void q(okhttp3.d dVar, long j) {
            if (ujv.this.b.get(dVar) != null) {
                SystemClock.elapsedRealtime();
            }
        }

        @Override // okhttp3.g
        public final void u(okhttp3.d dVar) {
            b bVar = ujv.this.b.get(dVar);
            if (bVar == null || bVar.l() != null) {
                return;
            }
            bVar.D(Long.valueOf(SystemClock.elapsedRealtime()));
        }

        @Override // okhttp3.g
        public final void w(okhttp3.d dVar, okhttp3.j jVar) {
            TlsVersion d;
            ConcurrentHashMap<okhttp3.d, b> concurrentHashMap = ujv.this.b;
            b bVar = concurrentHashMap.get(dVar);
            if (bVar != null) {
                bVar.F(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            b bVar2 = concurrentHashMap.get(dVar);
            if (bVar2 != null) {
                bVar2.H((jVar == null || (d = jVar.d()) == null) ? null : d.h());
            }
        }

        @Override // okhttp3.g
        public final void x(okhttp3.d dVar) {
            b bVar = ujv.this.b.get(dVar);
            if (bVar != null) {
                bVar.G(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }
    }

    /* compiled from: HttpMetricsCollector.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public String a;
        public boolean b;
        public String c;
        public Protocol d;
        public Long e;
        public Long f;
        public Long g;
        public Long h;
        public Long i;
        public Long j;
        public Long k;
        public Long l;
        public Long m;
        public Long n;
        public Long o;
        public Long p;
        public Throwable q;

        public b() {
            this(0);
        }

        public final void A(Long l) {
            this.g = l;
        }

        public final void B(Long l) {
            this.n = l;
        }

        public final void C(Long l) {
            this.f = l;
        }

        public final void D(Long l) {
            this.p = l;
        }

        public final void E(Long l) {
            this.e = l;
        }

        public final void F(Long l) {
            this.m = l;
        }

        public final void G(Long l) {
            this.l = l;
        }

        public final void H(String str) {
            this.a = str;
        }

        public final Long a() {
            return this.k;
        }

        public final Long b() {
            return this.j;
        }

        public final Long c() {
            return this.i;
        }

        public final Long d() {
            return this.h;
        }

        public final Throwable e() {
            return this.q;
        }

        public final Protocol f() {
            return this.d;
        }

        public final String g() {
            return this.c;
        }

        public final Long h() {
            return this.o;
        }

        public final Long i() {
            return this.g;
        }

        public final Long j() {
            return this.n;
        }

        public final Long k() {
            return this.f;
        }

        public final Long l() {
            return this.p;
        }

        public final Long m() {
            return this.e;
        }

        public final Long n() {
            return this.m;
        }

        public final Long o() {
            return this.l;
        }

        public final String p() {
            return this.a;
        }

        public final boolean q() {
            return this.b;
        }

        public final void r(Long l) {
            this.k = l;
        }

        public final void s(Long l) {
            this.j = l;
        }

        public final void t(Long l) {
            this.i = l;
        }

        public final void u(Long l) {
            this.h = l;
        }

        public final void v(IOException iOException) {
            this.q = iOException;
        }

        public final void w(Protocol protocol) {
            this.d = protocol;
        }

        public final void x(boolean z) {
            this.b = z;
        }

        public final void y(String str) {
            this.c = str;
        }

        public final void z(Long l) {
            this.o = l;
        }

        public b(int i) {
            this.a = null;
            this.b = false;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
        }
    }

    public ujv(k46 k46Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x0005, B:8:0x001b, B:12:0x002c, B:14:0x0034, B:15:0x003b, B:17:0x0041, B:18:0x0048, B:20:0x004e, B:21:0x0054, B:23:0x005c, B:24:0x0065, B:26:0x006b, B:27:0x0074, B:29:0x007a, B:30:0x0083, B:32:0x0089, B:33:0x0092, B:35:0x0098, B:36:0x00a1, B:38:0x00a7, B:39:0x00b0, B:41:0x00b6, B:42:0x00bf, B:44:0x00c5, B:45:0x00ce, B:47:0x00d4, B:48:0x00dd, B:50:0x00e3, B:51:0x00ec, B:53:0x00f8, B:56:0x0105, B:59:0x0114, B:61:0x011b, B:65:0x0123, B:69:0x0136, B:71:0x013c, B:72:0x0140, B:78:0x012f), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(f8f0 f8f0Var) {
        long j;
        boolean z;
        boolean z2;
        String str;
        String message;
        try {
            b remove = this.b.remove(f8f0Var);
            izs izsVar = (izs) this.c.remove(f8f0Var);
            if (remove != null && izsVar != null) {
                Throwable e = remove.e();
                String p = remove.p();
                if (p == null) {
                    p = "";
                }
                String str2 = p;
                Long m = remove.m();
                long longValue = m != null ? m.longValue() : 0L;
                Long k = remove.k();
                long longValue2 = k != null ? k.longValue() : 0L;
                Long i = remove.i();
                long longValue3 = i != null ? i.longValue() : 0L;
                Long d = remove.d();
                long longValue4 = d != null ? d.longValue() : 0L;
                Long c = remove.c();
                long longValue5 = c != null ? c.longValue() : 0L;
                Long b2 = remove.b();
                long longValue6 = b2 != null ? b2.longValue() : 0L;
                Long a2 = remove.a();
                long longValue7 = a2 != null ? a2.longValue() : 0L;
                Long o = remove.o();
                long longValue8 = o != null ? o.longValue() : 0L;
                Long n = remove.n();
                long longValue9 = n != null ? n.longValue() : 0L;
                Long j2 = remove.j();
                long longValue10 = j2 != null ? j2.longValue() : 0L;
                Long h = remove.h();
                long longValue11 = h != null ? h.longValue() : 0L;
                Long l = remove.l();
                long longValue12 = l != null ? l.longValue() : 0L;
                Long i2 = remove.i();
                tjv tjvVar = new tjv(longValue4, longValue5, longValue6, longValue7, longValue8, longValue9, longValue10, longValue11, longValue12, i2 != null ? i2.longValue() : 0L);
                if (tjvVar.b() == 0 && tjvVar.a() == 0) {
                    j = longValue3;
                    z = true;
                } else {
                    j = longValue3;
                    z = false;
                }
                HttpMetrics.Source source = HttpMetrics.Source.OKHTTP;
                long j3 = j;
                boolean q = remove.q();
                String g = remove.g();
                if (g == null) {
                    g = "";
                }
                sjv c2 = tjvVar.c();
                long j4 = j3 - longValue2;
                if (e == null && !f8f0Var.q) {
                    z2 = false;
                    if (!f8f0Var.q) {
                        message = "request cancelled";
                    } else {
                        if (e == null) {
                            str = null;
                            Protocol f = remove.f();
                            izsVar.invoke(new HttpMetrics(source, z, str2, q, g, c2, j4, longValue, longValue2, z2, f != null ? wx70.c(f) : null, str));
                        }
                        message = e.getMessage();
                    }
                    str = message;
                    Protocol f2 = remove.f();
                    izsVar.invoke(new HttpMetrics(source, z, str2, q, g, c2, j4, longValue, longValue2, z2, f2 != null ? wx70.c(f2) : null, str));
                }
                z2 = true;
                if (!f8f0Var.q) {
                }
                str = message;
                Protocol f22 = remove.f();
                izsVar.invoke(new HttpMetrics(source, z, str2, q, g, c2, j4, longValue, longValue2, z2, f22 != null ? wx70.c(f22) : null, str));
            }
        } finally {
        }
    }
}
