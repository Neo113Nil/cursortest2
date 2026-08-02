package xsna;

import android.content.Context;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiscoverMediaDependencies.kt */
/* loaded from: classes4.dex */
public final class a3n {
    public final mo60 a;
    public final a b;
    public final bpn0 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final fh9 g;
    public final a4r h;
    public final bpn0 i;
    public final Object j;
    public final ysg0<Object> k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final pn0 o;
    public final Object p;
    public final Object q;

    /* compiled from: DiscoverMediaDependencies.kt */
    public static final class a implements fo60 {
        public final /* synthetic */ n2n a;

        public a(n2n n2nVar) {
            this.a = n2nVar;
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            this.a.a(x3n.a(xn60Var));
        }
    }

    public a3n(mo60 mo60Var, bin0<Context> bin0Var, n2n n2nVar) {
        this.a = mo60Var;
        this.b = new a(n2nVar);
        this.c = mo60Var.l;
        this.d = mo60Var.m;
        this.e = mo60Var.i;
        this.f = mo60Var.j;
        this.g = mo60Var.p;
        this.h = mo60Var.n;
        this.i = mo60Var.D;
        this.j = mo60Var.K;
        this.k = mo60Var.S;
        this.l = mo60Var.Y;
        n5i n5iVar = new n5i(this, 7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, n5iVar);
        this.n = msy.a(lazyThreadSafetyMode, new jcg(this, 11));
        this.o = new pn0(mo60Var.v, mo60Var.i0);
        this.p = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.props.c(12));
        this.q = msy.a(lazyThreadSafetyMode, new z0h(this, 6));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final ho60 a() {
        return (ho60) this.a.s.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final bs60 b() {
        return (bs60) this.a.d0.getValue();
    }
}
