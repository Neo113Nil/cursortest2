package xsna;

import java.lang.ref.WeakReference;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StoryViewDelegateProvider.kt */
/* loaded from: classes6.dex */
public final class plm0 {
    public final q7r a;
    public final fw b;
    public final Object c;
    public final rot d;
    public final atu e;
    public final kl20 f;
    public final eza0 g;
    public final n3e0 h;
    public final bdl0 i;
    public final Object j;
    public final mq50 k;
    public final iq50 l;
    public final wcq0 m;
    public final om3 n;
    public final a3s o;
    public final x4m0 p;
    public final tp80 q;
    public final p5z r;
    public final s7v s;

    public plm0(com.vk.story.api.a aVar, zb80 zb80Var, mkm0 mkm0Var, mkm0 mkm0Var2, mkm0 mkm0Var3, WeakReference weakReference, vu50 vu50Var, h7v h7vVar, boolean z, boolean z2) {
        q7r q7rVar = new q7r(aVar, zb80Var, mkm0Var, mkm0Var2, mkm0Var3, weakReference, z);
        this.a = q7rVar;
        fw fwVar = new fw();
        this.b = fwVar;
        dac0 dac0Var = new dac0(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, dac0Var);
        rot rotVar = new rot();
        this.d = rotVar;
        atu atuVar = new atu();
        this.e = atuVar;
        ezt0 ezt0Var = new ezt0(new hri0(this, 5));
        kl20 kl20Var = new kl20();
        this.f = kl20Var;
        jz50 jz50Var = new jz50(ezt0Var);
        eza0 eza0Var = new eza0();
        this.g = eza0Var;
        n3e0 n3e0Var = new n3e0();
        n3e0Var.a = z2;
        this.h = n3e0Var;
        bdl0 bdl0Var = new bdl0();
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().h();
        this.i = bdl0Var;
        this.j = msy.a(lazyThreadSafetyMode, new mll0(this, 4));
        mq50 mq50Var = new mq50(q7rVar);
        this.k = mq50Var;
        iq50 iq50Var = new iq50(q7rVar);
        this.l = iq50Var;
        wcq0 wcq0Var = new wcq0();
        this.m = wcq0Var;
        om3 om3Var = new om3(q7rVar);
        this.n = om3Var;
        jz8 jz8Var = new jz8(q7rVar);
        a3s a3sVar = new a3s();
        this.o = a3sVar;
        yxt yxtVar = new yxt(q7rVar, kl20Var, eza0Var, jz50Var);
        x4m0 x4m0Var = new x4m0(vu50Var, mkm0Var2, mkm0Var3, mkm0Var, q7rVar);
        this.p = x4m0Var;
        this.q = new tp80(q7rVar, jz8Var);
        p5z p5zVar = new p5z(q7rVar, om3Var, jz8Var, a(), atuVar, eza0Var, ezt0Var);
        this.r = p5zVar;
        this.s = new s7v(h7vVar, q7rVar);
        q7rVar.e0 = yxtVar;
        q7rVar.r0 = jz50Var;
        q7rVar.s0 = a();
        q7rVar.t0 = mq50Var;
        q7rVar.u0 = iq50Var;
        q7rVar.v0 = om3Var;
        q7rVar.w0 = b();
        q7rVar.x0 = atuVar;
        q7rVar.y0 = a3sVar;
        q7rVar.z0 = p5zVar;
        fwVar.a = q7rVar;
        fwVar.b = jz50Var;
        fwVar.c = b();
        fwVar.d = eza0Var;
        fwVar.e = a();
        fwVar.f = kl20Var;
        io.reactivex.rxjava3.subjects.f<n8o> fVar = vao.c.a;
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        int i = 0;
        fwVar.a.i0.a(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar.a0(asu0.i()), new gv(fwVar, i)).U(new pb(fwVar, 1)).a0(asu0Var.d()).subscribe(new hv(fwVar, i), new rao()));
        a3sVar.a = q7rVar;
        a3sVar.b = b();
        a3sVar.c = eza0Var;
        rotVar.a = q7rVar;
        rotVar.b = b();
        rotVar.c = jz50Var;
        atuVar.a = q7rVar;
        atuVar.b = b();
        atuVar.c = a();
        atuVar.d = a3sVar;
        atuVar.e = new skm0(atuVar.a.i0.getDependencies().o);
        kl20Var.a = q7rVar;
        jz50Var.c = x4m0Var;
        jz50Var.b = q7rVar;
        jz50Var.d = kl20Var;
        jz50Var.e = b();
        jz50Var.f = eza0Var;
        eza0Var.a = q7rVar;
        n3e0Var.b = q7rVar;
        n3e0Var.c = a();
        n3e0Var.d = eza0Var;
        bdl0Var.a = q7rVar;
        wcq0Var.a = q7rVar;
        wcq0Var.b = a();
        wcq0Var.c = b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final q50 a() {
        return (q50) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final f0q0 b() {
        return (f0q0) this.j.getValue();
    }
}
