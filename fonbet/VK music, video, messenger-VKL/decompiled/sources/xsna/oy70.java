package xsna;

import com.vk.net.stat.metric.NetStatSource;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.TlsVersion;
import xsna.f360;

/* compiled from: OkHttpRequestListener.kt */
/* loaded from: classes.dex */
public final class oy70 extends f360 {
    public final py70 a;
    public final ConcurrentHashMap<okhttp3.d, jkv> b = new ConcurrentHashMap<>();

    public oy70(py70 py70Var) {
        this.a = py70Var;
    }

    @Override // xsna.f360
    public final void d(f8f0 f8f0Var, f360.a aVar) {
        ConcurrentHashMap<okhttp3.d, jkv> concurrentHashMap = this.b;
        jkv jkvVar = concurrentHashMap.get(f8f0Var);
        concurrentHashMap.remove(f8f0Var);
        if (jkvVar != null) {
            if (jkvVar.G == 0) {
                long j = jkvVar.I;
                if (j == 0 && jkvVar.E == 0 && j == 0 && jkvVar.K == 0 && jkvVar.N == 0 && jkvVar.u == null) {
                    return;
                }
            }
            jkvVar.B = aVar.a;
            jkvVar.a();
            this.a.b(jkvVar);
        }
    }

    @Override // xsna.f360
    public final void e(f8f0 f8f0Var, IOException iOException) {
        jkv remove = this.b.remove(f8f0Var);
        if (remove != null) {
            String str = "Call_failed:" + iOException.getMessage();
            remove.x = true;
            remove.y = str;
            remove.a();
            this.a.b(remove);
        }
    }

    @Override // xsna.f360
    public final void f(f8f0 f8f0Var, f360.a aVar) {
        jkv jkvVar = new jkv();
        okhttp3.p pVar = f8f0Var.c;
        jkvVar.C = aVar.b;
        jkvVar.D = this.a.a();
        jkvVar.j = pVar.b;
        okhttp3.l lVar = pVar.a;
        String str = (String) j5g.k0(lVar.f);
        if (str == null) {
            str = "unknown";
        }
        jkvVar.h = str;
        jkvVar.i = lVar.d;
        jkvVar.g = NetStatSource.OKHTTP;
        String str2 = lVar.i;
        jkvVar.r = str2;
        jkvVar.z = str2;
        String a = pVar.c.a("Connection");
        jkvVar.v = a != null ? Boolean.valueOf(drm0.D(a.toLowerCase(Locale.getDefault()), "keep-alive", false)) : Boolean.FALSE;
        jkvVar.w = 0;
        this.b.put(f8f0Var, jkvVar);
    }

    @Override // xsna.f360
    public final void g(okhttp3.d dVar, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.J = aVar.a;
        }
    }

    @Override // xsna.f360
    public final void h(okhttp3.d dVar, Proxy proxy, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.I = aVar.a;
            boolean z = proxy.type() != Proxy.Type.DIRECT;
            jkvVar.n = z;
            if (z) {
                jkvVar.o = proxy.toString();
            }
            jkvVar.e = false;
        }
    }

    @Override // xsna.f360
    public final void i(okhttp3.d dVar, u3j u3jVar, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar == null || jkvVar.I != 0) {
            return;
        }
        InetSocketAddress inetSocketAddress = u3jVar.c().c;
        h(dVar, u3jVar.c().b, aVar);
        jkvVar.e = true;
    }

    @Override // xsna.f360
    public final void j(okhttp3.d dVar, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.H = aVar.a;
        }
    }

    @Override // xsna.f360
    public final void k(okhttp3.d dVar, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.G = aVar.a;
        }
    }

    @Override // xsna.f360
    public final void l(okhttp3.d dVar, long j, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.L = aVar.a;
            jkvVar.w = Integer.valueOf((int) j);
        }
    }

    @Override // xsna.f360
    public final void m(okhttp3.d dVar, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.K = aVar.a;
        }
    }

    @Override // xsna.f360
    public final void n(okhttp3.d dVar, long j, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.N = aVar.a;
            jkvVar.d = (int) j;
        }
    }

    @Override // xsna.f360
    public final void o(okhttp3.d dVar, okhttp3.u uVar) {
        String str;
        Integer m;
        TlsVersion d;
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            okhttp3.k s = uVar.s();
            int o = uVar.o();
            okhttp3.j p = uVar.p();
            if (p == null || (d = p.d()) == null || (str = d.h()) == null) {
                str = "";
            }
            jkvVar.u = str;
            String a = s.a("Content-Type");
            if (a == null) {
                a = "";
            }
            jkvVar.l = a;
            String a2 = s.a("X-Stat-Key");
            if (a2 == null || (m = arm0.m(10, a2)) == null) {
                String g = dVar.request().a.g("stat_key");
                m = g != null ? arm0.m(10, g) : null;
            }
            jkvVar.m = m;
            jkvVar.k = o;
            jkvVar.i = uVar.A().a.d;
            jkvVar.f = uVar.y();
            String a3 = s.a("X-Trace-Id");
            jkvVar.P = a3 != null ? a3 : "";
        }
    }

    @Override // xsna.f360
    public final void p(okhttp3.d dVar, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.M = aVar.a;
        }
    }

    @Override // xsna.f360
    public final void q(okhttp3.d dVar, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.F = aVar.a;
        }
    }

    @Override // xsna.f360
    public final void r(okhttp3.d dVar, f360.a aVar) {
        jkv jkvVar = this.b.get(dVar);
        if (jkvVar != null) {
            jkvVar.E = aVar.a;
        }
    }
}
