package xsna;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ct60.a;

/* compiled from: NewsfeedMainDependencies.kt */
/* loaded from: classes4.dex */
public final class ct60 {
    public final xk2 A;
    public final h7m B;
    public final AtomicInteger a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final mo60 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final bpn0 g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final a4r k;
    public final Object l;
    public final fh9 m;
    public final Object n;
    public final bpn0 o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final vh8 y;
    public final Object z;

    /* compiled from: NewsfeedMainDependencies.kt */
    public static final class a {
        public a() {
        }
    }

    /* compiled from: NewsfeedMainDependencies.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<String> {
        @Override // xsna.gzs
        public final String invoke() {
            return (String) ((AtomicReference) this.receiver).get();
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    public ct60(AtomicInteger atomicInteger, final mbs mbsVar, final bin0<Boolean> bin0Var, final at60 at60Var, io.reactivex.rxjava3.disposables.b bVar, mo60 mo60Var) {
        this.a = atomicInteger;
        this.b = bVar;
        this.c = mo60Var;
        this.d = mo60Var.i;
        this.e = mo60Var.j;
        this.f = mo60Var.k;
        this.g = mo60Var.l;
        this.h = mo60Var.m;
        hc1 hc1Var = new hc1(16, at60Var, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, hc1Var);
        Lazy a2 = msy.a(lazyThreadSafetyMode, new b410(this, 8));
        this.j = a2;
        this.k = mo60Var.n;
        this.l = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.c(24));
        this.m = mo60Var.p;
        this.n = msy.a(lazyThreadSafetyMode, new cy20(3));
        this.o = mo60Var.D;
        this.p = mo60Var.K;
        this.q = msy.a(lazyThreadSafetyMode, new e550(at60Var, 4));
        this.r = msy.a(lazyThreadSafetyMode, new j4(18, at60Var, this));
        this.s = mo60Var.a0;
        this.t = msy.a(lazyThreadSafetyMode, new gzv(this, 22));
        Lazy a3 = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.bt60
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                ct60 ct60Var = this;
                return new wc60(mbs.this, bin0Var, ct60Var.b(), at60Var, ct60Var.new a(), (ts60) ct60Var.c.W.getValue());
            }
        });
        this.u = a3;
        this.v = mo60Var.X;
        this.w = mo60Var.Y;
        this.x = msy.a(lazyThreadSafetyMode, new y84(13));
        this.y = new vh8(5);
        this.z = msy.a(lazyThreadSafetyMode, new m130(this, 11));
        this.A = new xk2(a3, a2, mo60Var.v, mo60Var.i0);
        this.B = mo60Var.c();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final ho60 a() {
        return (ho60) this.c.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final dui b() {
        return (dui) this.c.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final wc60 c() {
        return (wc60) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final rw60 d() {
        return (rw60) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final bs60 e() {
        return (bs60) this.c.d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final d070 f() {
        return (d070) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f170 g() {
        return (f170) this.j.getValue();
    }
}
