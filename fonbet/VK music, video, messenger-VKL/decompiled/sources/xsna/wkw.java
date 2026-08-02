package xsna;

import android.content.ContentResolver;
import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.core.DownsampleMode;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.din0;
import xsna.n7l;
import xsna.vkw;

/* compiled from: ImagePipelineFactory.java */
/* loaded from: classes.dex */
public final class wkw {
    public static wkw p;
    public static skw q;
    public final sqo0 a;
    public final ukw b;
    public final vvf c;
    public final yhn0<fbn> d;
    public qyj<ww8, svf> e;
    public r8x<ww8, svf> f;
    public q900 g;
    public r8x<ww8, PooledByteBuffer> h;
    public niw i;
    public gmw j;
    public xhd0 k;
    public aid0 l;
    public lm3 m;
    public oy80 n;
    public kj2 o;

    public wkw(ukw ukwVar) {
        if (lhs.d()) {
            lhs.a("ImagePipelineConfig()");
        }
        ukwVar.getClass();
        this.b = ukwVar;
        ukwVar.getExperiments().getClass();
        this.a = new sqo0(ukwVar.w().d());
        this.c = new vvf(ukwVar.f());
        if (lhs.d()) {
            lhs.b();
        }
        this.d = ukwVar.m();
        ukwVar.getExperiments().getClass();
    }

    public static wkw f() {
        wkw wkwVar = p;
        sex0.e(wkwVar, "ImagePipelineFactory was not initialized!");
        return wkwVar;
    }

    public static synchronized void i(tkw tkwVar) {
        synchronized (wkw.class) {
            try {
                if (p != null && ahq.a.a(5)) {
                    bhq.b(5, wkw.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                }
                p = new wkw(tkwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final kj2 a() {
        if (this.o == null) {
            hta0 g = g();
            ukw ukwVar = this.b;
            r3q w = ukwVar.w();
            qyj<ww8, svf> b = b();
            ukwVar.getExperiments().getClass();
            ukwVar.getExperiments().getClass();
            ukwVar.getExperiments().getClass();
            ukwVar.getExperiments().getClass();
            if (!byc0.b) {
                try {
                    Class cls = Boolean.TYPE;
                    Class cls2 = Integer.TYPE;
                    Constructor constructor = AnimatedFactoryV2Impl.class.getConstructor(hta0.class, r3q.class, qyj.class, cls, cls, cls2, cls2, fmi0.class);
                    Boolean bool = Boolean.FALSE;
                    byc0.c = (kj2) constructor.newInstance(g, w, b, bool, bool, 30, 1000, null);
                } catch (Throwable unused) {
                }
                if (byc0.c != null) {
                    byc0.b = true;
                }
            }
            this.o = byc0.c;
        }
        return this.o;
    }

    public final qyj<ww8, svf> b() {
        if (this.e == null) {
            ukw ukwVar = this.b;
            oyj s = ukwVar.s();
            yhn0<o220> r = ukwVar.r();
            g320 h = ukwVar.h();
            qc7 q2 = ukwVar.q();
            ukwVar.getExperiments().getClass();
            ukwVar.getExperiments().getClass();
            s.getClass();
            q900 q900Var = new q900(new nyj(), q2, r, null);
            h.a(q900Var);
            this.e = q900Var;
        }
        return this.e;
    }

    public final r8x<ww8, svf> c() {
        if (this.f == null) {
            qyj<ww8, svf> b = b();
            igw o = this.b.o();
            o.getClass();
            this.f = new r8x<>(b, new s8x(o));
        }
        return this.f;
    }

    public final r8x<ww8, PooledByteBuffer> d() {
        if (this.h == null) {
            ukw ukwVar = this.b;
            ukwVar.getClass();
            if (this.g == null) {
                yhn0<o220> d = ukwVar.d();
                g320 h = ukwVar.h();
                q900 q900Var = new q900(new pip(), ukwVar.p(), d, null);
                h.a(q900Var);
                this.g = q900Var;
            }
            q900 q900Var2 = this.g;
            igw o = ukwVar.o();
            o.getClass();
            this.h = new r8x<>(q900Var2, new sip(o));
        }
        return this.h;
    }

    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, kotlin.Lazy] */
    public final skw e() {
        ukw ukwVar;
        nj2 nj2Var;
        oj2 oj2Var;
        if (q == null) {
            ukw ukwVar2 = this.b;
            ukwVar2.getExperiments().getClass();
            if (this.l == null) {
                ContentResolver contentResolver = ukwVar2.getContext().getApplicationContext().getContentResolver();
                if (this.k == null) {
                    vkw.c cVar = ukwVar2.getExperiments().c;
                    Context context = ukwVar2.getContext();
                    evb0 e = ukwVar2.e();
                    if (e.h == null) {
                        dvb0 dvb0Var = e.a;
                        e.h = new com.facebook.imagepipeline.memory.a(dvb0Var.d, dvb0Var.g, dvb0Var.h);
                    }
                    com.facebook.imagepipeline.memory.a aVar = e.h;
                    if (this.i == null) {
                        kj2 a = a();
                        if (a != null) {
                            oj2Var = a.b();
                            nj2Var = a.c();
                        } else {
                            nj2Var = null;
                            oj2Var = null;
                        }
                        ukwVar2.getExperiments().getClass();
                        if (ukwVar2.k() == null) {
                            this.i = new fgl(oj2Var, nj2Var, h(), null);
                        } else {
                            this.i = new fgl(oj2Var, nj2Var, h(), ukwVar2.k().a);
                            tiw tiwVar = (tiw) tiw.d.getValue();
                            tiwVar.b = ukwVar2.k().b;
                            tiwVar.a();
                        }
                    }
                    niw niwVar = this.i;
                    hsj0 b = ukwVar2.b();
                    DownsampleMode v = ukwVar2.v();
                    boolean u = ukwVar2.u();
                    ukwVar2.getExperiments().getClass();
                    r3q w = ukwVar2.w();
                    b320 b2 = ukwVar2.e().b(ukwVar2.l());
                    ukwVar2.e().c();
                    r8x<ww8, svf> c = c();
                    r8x<ww8, PooledByteBuffer> d = d();
                    ecl t = ukwVar2.t();
                    hta0 g = g();
                    ukwVar2.getExperiments().getClass();
                    ukwVar2.getExperiments().getClass();
                    ukwVar2.getExperiments().getClass();
                    int i = ukwVar2.getExperiments().a;
                    ukwVar2.getExperiments().getClass();
                    ukwVar2.getExperiments().getClass();
                    ukwVar = ukwVar2;
                    this.k = cVar.a(context, aVar, niwVar, b, v, u, w, b2, c, d, this.d, t, g, i, this.c);
                } else {
                    ukwVar = ukwVar2;
                }
                xhd0 xhd0Var = this.k;
                oi6 i2 = ukwVar.i();
                boolean u2 = ukwVar.u();
                ukwVar.getExperiments().getClass();
                DownsampleMode v2 = ukwVar.v();
                ukwVar.getExperiments().getClass();
                boolean c2 = ukwVar.c();
                if (this.j == null) {
                    if (ukwVar.getExperiments().b) {
                        this.j = new arj0(ukwVar.getExperiments().a);
                    } else {
                        int i3 = ukwVar.getExperiments().a;
                        ukwVar.getExperiments().getClass();
                        ukwVar.getExperiments().getClass();
                        this.j = new g540(i3, null, null);
                    }
                }
                gmw gmwVar = this.j;
                ukwVar.getExperiments().getClass();
                ukwVar.getExperiments().getClass();
                ukwVar.getExperiments().getClass();
                this.l = new aid0(contentResolver, xhd0Var, i2, u2, this.a, v2, c2, gmwVar, ukwVar.n());
            } else {
                ukwVar = ukwVar2;
            }
            aid0 aid0Var = this.l;
            EmptySet j = ukwVar.j();
            Set<w7g0> a2 = ukwVar.a();
            din0.a g2 = ukwVar.g();
            r8x<ww8, svf> c3 = c();
            r8x<ww8, PooledByteBuffer> d2 = d();
            ecl t2 = ukwVar.t();
            cin0 cin0Var = ukwVar.getExperiments().d;
            ukwVar.getExperiments().getClass();
            q = new skw(aid0Var, j, a2, g2, c3, d2, this.d, t2, cin0Var, this.b);
        }
        return q;
    }

    public final hta0 g() {
        if (this.m == null) {
            evb0 e = this.b.e();
            h();
            this.m = new lm3(e.a(), this.c);
        }
        return this.m;
    }

    public final ita0 h() {
        if (this.n == null) {
            ukw ukwVar = this.b;
            evb0 e = ukwVar.e();
            ukwVar.getExperiments().getClass();
            ukwVar.getExperiments().getClass();
            jw5 jw5Var = ukwVar.getExperiments().e;
            sc7 a = e.a();
            int i = e.a.c.d;
            vvb0 vvb0Var = new vvb0(i);
            for (int i2 = 0; i2 < i; i2++) {
                n7l.a aVar = n7l.a;
                vvb0Var.a(ByteBuffer.allocate(16384));
            }
            this.n = new oy80(a, vvb0Var, jw5Var);
        }
        return this.n;
    }
}
