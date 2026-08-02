package okhttp3;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.d;
import okhttp3.g;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.proxy.NullProxySelector;
import xsna.a75;
import xsna.epx;
import xsna.f8f0;
import xsna.fqa;
import xsna.fta0;
import xsna.g5g;
import xsna.go9;
import xsna.gqa;
import xsna.h4j;
import xsna.mx70;
import xsna.n2r0;
import xsna.p8f0;
import xsna.qcn;
import xsna.t120;
import xsna.tsn;
import xsna.uhx0;
import xsna.wsj;
import xsna.x2r0;

/* compiled from: OkHttpClient.kt */
/* loaded from: classes11.dex */
public class o implements Cloneable, d.a {
    public static final List<Protocol> D = x2r0.k(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<f> E = x2r0.k(f.e, f.f);
    public final int A;
    public final long B;
    public final t120 C;
    public final qcn b;
    public final h4j c;
    public final List<Interceptor> d;
    public final List<Interceptor> e;
    public final g.b f;
    public final boolean g;
    public final a75 h;
    public final boolean i;
    public final boolean j;
    public final wsj k;
    public final b l;
    public final tsn m;
    public final ProxySelector n;
    public final a75 o;
    public final SocketFactory p;
    public final SSLSocketFactory q;
    public final X509TrustManager r;
    public final List<f> s;
    public final List<Protocol> t;
    public final HostnameVerifier u;
    public final gqa v;
    public final fqa w;
    public final int x;
    public final int y;
    public final int z;

    /* compiled from: OkHttpClient.kt */
    public static final class a {
        public long A;
        public t120 B;
        public qcn a = new qcn();
        public h4j b = new h4j();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public g.b e;
        public boolean f;
        public a75 g;
        public boolean h;
        public boolean i;
        public wsj j;
        public b k;
        public tsn l;
        public ProxySelector m;
        public a75 n;
        public SocketFactory o;
        public SSLSocketFactory p;
        public X509TrustManager q;
        public List<f> r;
        public List<? extends Protocol> s;
        public HostnameVerifier t;
        public gqa u;
        public fqa v;
        public int w;
        public int x;
        public int y;
        public int z;

        public a() {
            g.a aVar = g.a;
            byte[] bArr = x2r0.a;
            this.e = new n2r0(aVar);
            this.f = true;
            a75 a75Var = a75.b;
            this.g = a75Var;
            this.h = true;
            this.i = true;
            this.j = wsj.a;
            this.l = tsn.l7;
            this.n = a75Var;
            this.o = SocketFactory.getDefault();
            this.r = o.E;
            this.s = o.D;
            this.t = mx70.b;
            this.u = gqa.c;
            this.w = 10000;
            this.x = 10000;
            this.y = 10000;
            this.A = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        public final void a(Interceptor interceptor) {
            this.c.add(interceptor);
        }

        public final void b(Interceptor interceptor) {
            this.d.add(interceptor);
        }

        public final void c(long j, TimeUnit timeUnit) {
            this.w = x2r0.b("timeout", j, timeUnit);
        }

        public final void d(tsn tsnVar) {
            if (!tsnVar.equals(this.l)) {
                this.B = null;
            }
            this.l = tsnVar;
        }

        public final void e(long j, TimeUnit timeUnit) {
            this.x = x2r0.b("timeout", j, timeUnit);
        }

        public final void f(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (!sSLSocketFactory.equals(this.p) || !x509TrustManager.equals(this.q)) {
                this.B = null;
            }
            this.p = sSLSocketFactory;
            fta0 fta0Var = fta0.a;
            this.v = fta0.a.b(x509TrustManager);
            this.q = x509TrustManager;
        }

        public final void g(long j, TimeUnit timeUnit) {
            this.y = x2r0.b("timeout", j, timeUnit);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(a aVar) {
        List<Interceptor> list;
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = x2r0.w(aVar.c);
        this.e = x2r0.w(aVar.d);
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        ProxySelector proxySelector = aVar.m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.n = proxySelector == null ? NullProxySelector.INSTANCE : proxySelector;
        this.o = aVar.n;
        this.p = aVar.o;
        List<f> list2 = aVar.r;
        this.s = list2;
        this.t = aVar.s;
        this.u = aVar.t;
        this.x = aVar.w;
        this.y = aVar.x;
        this.z = aVar.y;
        this.A = aVar.z;
        this.B = aVar.A;
        t120 t120Var = aVar.B;
        this.C = t120Var == null ? new t120(1) : t120Var;
        List<f> list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((f) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = aVar.p;
                    if (sSLSocketFactory != null) {
                        this.q = sSLSocketFactory;
                        fqa fqaVar = aVar.v;
                        this.w = fqaVar;
                        this.r = aVar.q;
                        gqa gqaVar = aVar.u;
                        this.v = epx.f(gqaVar.b, fqaVar) ? gqaVar : new gqa(gqaVar.a, fqaVar);
                    } else {
                        fta0 fta0Var = fta0.a;
                        X509TrustManager n = fta0.a.n();
                        this.r = n;
                        this.q = fta0.a.m(n);
                        fqa b = fta0.a.b(n);
                        this.w = b;
                        gqa gqaVar2 = aVar.u;
                        this.v = epx.f(gqaVar2.b, b) ? gqaVar2 : new gqa(gqaVar2.a, b);
                    }
                    X509TrustManager x509TrustManager = this.r;
                    fqa fqaVar2 = this.w;
                    SSLSocketFactory sSLSocketFactory2 = this.q;
                    List<Interceptor> list4 = this.e;
                    list = this.d;
                    if (!list.contains(null)) {
                        throw new IllegalStateException(go9.c("Null interceptor: ", list).toString());
                    }
                    if (list4.contains(null)) {
                        throw new IllegalStateException(go9.c("Null network interceptor: ", list4).toString());
                    }
                    List<f> list5 = this.s;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator<T> it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((f) it2.next()).a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (fqaVar2 == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (fqaVar2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!epx.f(this.v, gqa.c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.q = null;
        this.w = null;
        this.r = null;
        this.v = gqa.c;
        X509TrustManager x509TrustManager2 = this.r;
        fqa fqaVar22 = this.w;
        SSLSocketFactory sSLSocketFactory22 = this.q;
        List<Interceptor> list42 = this.e;
        list = this.d;
        if (!list.contains(null)) {
        }
    }

    @Override // okhttp3.d.a
    public final d a(p pVar) {
        return new f8f0(this, pVar, false);
    }

    public final Object clone() {
        return super.clone();
    }

    public final a e() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        g5g.y(this.d, aVar.c);
        g5g.y(this.e, aVar.d);
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = this.h;
        aVar.h = this.i;
        aVar.i = this.j;
        aVar.j = this.k;
        aVar.k = this.l;
        aVar.l = this.m;
        aVar.m = this.n;
        aVar.n = this.o;
        aVar.o = this.p;
        aVar.p = this.q;
        aVar.q = this.r;
        aVar.r = this.s;
        aVar.s = this.t;
        aVar.t = this.u;
        aVar.u = this.v;
        aVar.v = this.w;
        aVar.w = this.x;
        aVar.x = this.y;
        aVar.y = this.z;
        aVar.z = this.A;
        aVar.A = this.B;
        aVar.B = this.C;
        return aVar;
    }

    public final p8f0 f(p pVar, uhx0 uhx0Var) {
        p8f0 p8f0Var = new p8f0(TaskRunner.i, pVar, uhx0Var, new Random(), this.A, this.B);
        p8f0Var.h(this);
        return p8f0Var;
    }

    public o() {
        this(new a());
    }
}
