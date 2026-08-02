package okhttp3;

import com.mbridge.msdk.foundation.download.Command;
import java.io.Closeable;
import okhttp3.c;
import okhttp3.k;
import xsna.u1q;

/* compiled from: Response.kt */
/* loaded from: classes8.dex */
public final class u implements Closeable {
    public final p b;
    public final Protocol c;
    public final String d;
    public final int e;
    public final j f;
    public final k g;
    public final v h;
    public final u i;
    public final u j;
    public final u k;
    public final long l;
    public final long m;
    public final u1q n;
    public c o;

    /* compiled from: Response.kt */
    public static class a {
        public p a;
        public Protocol b;
        public String d;
        public j e;
        public v g;
        public u h;
        public u i;
        public u j;
        public long k;
        public long l;
        public u1q m;
        public int c = -1;
        public k.a f = new k.a();

        public static void e(String str, u uVar) {
            if (uVar != null) {
                if (uVar.h != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (uVar.i != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (uVar.j != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (uVar.k != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final void a(String str, String str2) {
            this.f.b(str, str2);
        }

        public final void b(v vVar) {
            this.g = vVar;
        }

        public final u c() {
            int i = this.c;
            if (i < 0) {
                throw new IllegalStateException(("code < 0: " + this.c).toString());
            }
            p pVar = this.a;
            if (pVar == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.d;
            if (str != null) {
                return new u(pVar, protocol, str, i, this.e, this.f.e(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
            }
            throw new IllegalStateException("message == null");
        }

        public final void d(u uVar) {
            e("cacheResponse", uVar);
            this.i = uVar;
        }

        public final void f(int i) {
            this.c = i;
        }

        public final void g(j jVar) {
            this.e = jVar;
        }

        public final void h() {
            this.f.h("Proxy-Authenticate", "OkHttp-Preemptive");
        }

        public final void i(k kVar) {
            this.f = kVar.d();
        }

        public final void j(String str) {
            this.d = str;
        }

        public final void k(u uVar) {
            e("networkResponse", uVar);
            this.h = uVar;
        }

        public final void l(u uVar) {
            if (uVar.h != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.j = uVar;
        }

        public final void m(Protocol protocol) {
            this.b = protocol;
        }

        public final void n(long j) {
            this.l = j;
        }

        public final void o(String str) {
            this.f.g(str);
        }

        public final void p(p pVar) {
            this.a = pVar;
        }

        public final void q(long j) {
            this.k = j;
        }
    }

    public u(p pVar, Protocol protocol, String str, int i, j jVar, k kVar, v vVar, u uVar, u uVar2, u uVar3, long j, long j2, u1q u1qVar) {
        this.b = pVar;
        this.c = protocol;
        this.d = str;
        this.e = i;
        this.f = jVar;
        this.g = kVar;
        this.h = vVar;
        this.i = uVar;
        this.j = uVar2;
        this.k = uVar3;
        this.l = j;
        this.m = j2;
        this.n = u1qVar;
    }

    public static String r(String str, u uVar) {
        String a2 = uVar.g.a(str);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    public final p A() {
        return this.b;
    }

    public final long E() {
        return this.l;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.h;
        if (vVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        vVar.close();
    }

    public final v m() {
        return this.h;
    }

    public final c n() {
        c cVar = this.o;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = c.n;
        c a2 = c.b.a(this.g);
        this.o = a2;
        return a2;
    }

    public final int o() {
        return this.e;
    }

    public final j p() {
        return this.f;
    }

    public final String q() {
        String a2 = this.g.a(Command.HTTP_HEADER_RANGE);
        if (a2 == null) {
            return null;
        }
        return a2;
    }

    public final k s() {
        return this.g;
    }

    public final boolean t() {
        int i = this.e;
        return 200 <= i && i < 300;
    }

    public final String toString() {
        return "Response{protocol=" + this.c + ", code=" + this.e + ", message=" + this.d + ", url=" + this.b.a + '}';
    }

    public final String v() {
        return this.d;
    }

    public final a w() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        aVar.c = this.e;
        aVar.d = this.d;
        aVar.e = this.f;
        aVar.f = this.g.d();
        aVar.g = this.h;
        aVar.h = this.i;
        aVar.i = this.j;
        aVar.j = this.k;
        aVar.k = this.l;
        aVar.l = this.m;
        aVar.m = this.n;
        return aVar;
    }

    public final u x() {
        return this.k;
    }

    public final Protocol y() {
        return this.c;
    }

    public final long z() {
        return this.m;
    }
}
