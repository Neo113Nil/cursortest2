package xsna;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Protocol;

/* compiled from: OkHttpListeners.kt */
/* loaded from: classes2.dex */
public final class dy70 extends okhttp3.g {
    public final CopyOnWriteArrayList<okhttp3.g> b;

    public dy70(ArrayList arrayList) {
        CopyOnWriteArrayList<okhttp3.g> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.b = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(arrayList);
    }

    @Override // okhttp3.g
    public final void a(f8f0 f8f0Var) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(f8f0Var);
        }
    }

    @Override // okhttp3.g
    public final void b(f8f0 f8f0Var, IOException iOException) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(f8f0Var, iOException);
        }
    }

    @Override // okhttp3.g
    public final void c(f8f0 f8f0Var) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c(f8f0Var);
        }
    }

    @Override // okhttp3.g
    public final void e(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().e(dVar, inetSocketAddress, proxy, protocol);
        }
    }

    @Override // okhttp3.g
    public final void f(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().f(dVar, inetSocketAddress, proxy, iOException);
        }
    }

    @Override // okhttp3.g
    public final void g(okhttp3.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().g(dVar, inetSocketAddress, proxy);
        }
    }

    @Override // okhttp3.g
    public final void h(okhttp3.d dVar, u3j u3jVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().h(dVar, u3jVar);
        }
    }

    @Override // okhttp3.g
    public final void i(okhttp3.d dVar, u3j u3jVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().i(dVar, u3jVar);
        }
    }

    @Override // okhttp3.g
    public final void j(okhttp3.d dVar, String str, List<? extends InetAddress> list) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().j(dVar, str, list);
        }
    }

    @Override // okhttp3.g
    public final void k(okhttp3.d dVar, String str) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().k(dVar, str);
        }
    }

    @Override // okhttp3.g
    public final void l(okhttp3.d dVar, long j) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().l(dVar, j);
        }
    }

    @Override // okhttp3.g
    public final void m(okhttp3.d dVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().m(dVar);
        }
    }

    @Override // okhttp3.g
    public final void o(okhttp3.d dVar, okhttp3.p pVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().o(dVar, pVar);
        }
    }

    @Override // okhttp3.g
    public final void p(okhttp3.d dVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().p(dVar);
        }
    }

    @Override // okhttp3.g
    public final void q(okhttp3.d dVar, long j) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().q(dVar, j);
        }
    }

    @Override // okhttp3.g
    public final void r(okhttp3.d dVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().r(dVar);
        }
    }

    @Override // okhttp3.g
    public final void t(okhttp3.d dVar, okhttp3.u uVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().t(dVar, uVar);
        }
    }

    @Override // okhttp3.g
    public final void u(okhttp3.d dVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().u(dVar);
        }
    }

    @Override // okhttp3.g
    public final void w(okhttp3.d dVar, okhttp3.j jVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().w(dVar, jVar);
        }
    }

    @Override // okhttp3.g
    public final void x(okhttp3.d dVar) {
        Iterator<okhttp3.g> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().x(dVar);
        }
    }
}
