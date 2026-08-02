package xsna;

import com.vk.core.network.metrics.traffic.TrafficItem;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.Protocol;
import xsna.f360;
import xsna.iae0;

/* compiled from: ProxyAsyncNetworkEventListener.kt */
/* loaded from: classes.dex */
public final class r9e0 extends iae0 {
    public final Executor b;
    public final y560 c;
    public final CopyOnWriteArraySet<f360> d;
    public final CopyOnWriteArraySet<iae0.a> e;

    public r9e0(ExecutorService executorService, y560 y560Var, f360... f360VarArr) {
        this.b = executorService;
        this.c = y560Var;
        CopyOnWriteArraySet<f360> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        g5g.A(copyOnWriteArraySet, f360VarArr);
        this.d = copyOnWriteArraySet;
        this.e = new CopyOnWriteArraySet<>();
    }

    @Override // okhttp3.g
    public final void a(f8f0 f8f0Var) {
        y(new lyb0(1, this, f8f0Var));
    }

    @Override // okhttp3.g
    public final void b(final f8f0 f8f0Var, final IOException iOException) {
        y(new izs() { // from class: xsna.n9e0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                r9e0 r9e0Var = r9e0.this;
                Iterator<f360> it = r9e0Var.d.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    f8f0 f8f0Var2 = f8f0Var;
                    if (!hasNext) {
                        r9e0Var.c.b(f8f0Var2.c);
                        return s3q0.a;
                    }
                    it.next().e(f8f0Var2, iOException);
                }
            }
        });
    }

    @Override // okhttp3.g
    public final void c(final f8f0 f8f0Var) {
        y(new izs() { // from class: xsna.m9e0
            /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                f8f0 f8f0Var2;
                long longValue;
                f360.a aVar = (f360.a) obj;
                r9e0 r9e0Var = r9e0.this;
                Iterator<f360> it = r9e0Var.d.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    f8f0Var2 = f8f0Var;
                    if (!hasNext) {
                        break;
                    }
                    it.next().f(f8f0Var2, aVar);
                }
                y560 y560Var = r9e0Var.c;
                okhttp3.p pVar = f8f0Var2.c;
                ConcurrentHashMap<okhttp3.p, TrafficItem> concurrentHashMap = y560Var.b;
                okhttp3.l lVar = pVar.a;
                boolean equals = "POST".equals(pVar.b.toUpperCase(Locale.US));
                if (equals) {
                    try {
                        okhttp3.t tVar = pVar.d;
                        longValue = (tVar != null ? Long.valueOf(tVar.contentLength()) : null).longValue();
                    } catch (Exception unused) {
                    }
                    concurrentHashMap.put(pVar, new TrafficItem(!equals ? TrafficItem.ContentType.POST : a201.d(lVar.b()) ? TrafficItem.ContentType.LONG_POLL : drm0.D(lVar.d, "mail.ru", false) ? TrafficItem.ContentType.THIRD_PARTY_MAIL : TrafficItem.ContentType.EMPTY, longValue, pVar.b, lVar.i, aVar.b));
                    return s3q0.a;
                }
                longValue = 0;
                concurrentHashMap.put(pVar, new TrafficItem(!equals ? TrafficItem.ContentType.POST : a201.d(lVar.b()) ? TrafficItem.ContentType.LONG_POLL : drm0.D(lVar.d, "mail.ru", false) ? TrafficItem.ContentType.THIRD_PARTY_MAIL : TrafficItem.ContentType.EMPTY, longValue, pVar.b, lVar.i, aVar.b));
                return s3q0.a;
            }
        });
    }

    @Override // okhttp3.g
    public final void e(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        y(new fo6(this, dVar, inetSocketAddress, proxy, protocol));
    }

    @Override // okhttp3.g
    public final void f(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        y(new p9e0(this, dVar, inetSocketAddress, proxy, iOException));
    }

    @Override // okhttp3.g
    public final void g(final okhttp3.d dVar, final InetSocketAddress inetSocketAddress, final Proxy proxy) {
        y(new izs(dVar, inetSocketAddress, proxy) { // from class: xsna.k9e0
            public final /* synthetic */ okhttp3.d c;
            public final /* synthetic */ Proxy d;

            {
                this.d = proxy;
            }

            @Override // xsna.izs
            public final Object invoke(Object obj) {
                f360.a aVar = (f360.a) obj;
                Iterator<f360> it = r9e0.this.d.iterator();
                while (it.hasNext()) {
                    it.next().h(this.c, this.d, aVar);
                }
                return s3q0.a;
            }
        });
    }

    @Override // okhttp3.g
    public final void h(okhttp3.d dVar, u3j u3jVar) {
        y(new w95(this, dVar, u3jVar, 8));
    }

    @Override // okhttp3.g
    public final void i(okhttp3.d dVar, u3j u3jVar) {
        y(new eaa(this, dVar, u3jVar));
    }

    @Override // okhttp3.g
    public final void j(final okhttp3.d dVar, final String str, final List<? extends InetAddress> list) {
        y(new izs(dVar, str, list) { // from class: xsna.l9e0
            public final /* synthetic */ okhttp3.d c;
            public final /* synthetic */ List d;

            {
                this.d = list;
            }

            @Override // xsna.izs
            public final Object invoke(Object obj) {
                f360.a aVar = (f360.a) obj;
                Iterator<f360> it = r9e0.this.d.iterator();
                while (it.hasNext()) {
                    it.next().j(this.c, aVar);
                }
                return s3q0.a;
            }
        });
    }

    @Override // okhttp3.g
    public final void k(final okhttp3.d dVar, final String str) {
        y(new izs(dVar, str) { // from class: xsna.o9e0
            public final /* synthetic */ okhttp3.d c;

            @Override // xsna.izs
            public final Object invoke(Object obj) {
                f360.a aVar = (f360.a) obj;
                Iterator<f360> it = r9e0.this.d.iterator();
                while (it.hasNext()) {
                    it.next().k(this.c, aVar);
                }
                return s3q0.a;
            }
        });
    }

    @Override // okhttp3.g
    public final void l(okhttp3.d dVar, long j) {
        y(new fkx(j, this, dVar, 1));
    }

    @Override // okhttp3.g
    public final void m(okhttp3.d dVar) {
        y(new b1a(29, this, dVar));
    }

    @Override // okhttp3.g
    public final void o(okhttp3.d dVar, okhttp3.p pVar) {
        y(new lx60(this, dVar, pVar));
    }

    @Override // okhttp3.g
    public final void p(okhttp3.d dVar) {
        y(new z5a(24, this, dVar));
    }

    @Override // okhttp3.g
    public final void q(okhttp3.d dVar, long j) {
        y(new j9e0(this, dVar, j));
    }

    @Override // okhttp3.g
    public final void r(okhttp3.d dVar) {
        y(new u9(29, this, dVar));
    }

    @Override // okhttp3.g
    public final void t(okhttp3.d dVar, okhttp3.u uVar) {
        y(new yl3(this, dVar, uVar, 3));
    }

    @Override // okhttp3.g
    public final void u(okhttp3.d dVar) {
        y(new na7(24, this, dVar));
    }

    @Override // okhttp3.g
    public final void w(okhttp3.d dVar, okhttp3.j jVar) {
        y(new d50(this, dVar, jVar));
    }

    @Override // okhttp3.g
    public final void x(final okhttp3.d dVar) {
        y(new izs() { // from class: xsna.q9e0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                f360.a aVar = (f360.a) obj;
                Iterator<f360> it = r9e0.this.d.iterator();
                while (it.hasNext()) {
                    it.next().r(dVar, aVar);
                }
                return s3q0.a;
            }
        });
    }

    public final void y(izs<? super f360.a, s3q0> izsVar) {
        this.b.execute(new m23(1, izsVar, new f360.a(0)));
    }
}
