package xsna;

import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.feature.music.holders.di.MusicCatalogComponent;
import io.reactivex.rxjava3.internal.functions.a;
import xsna.x2a;

/* compiled from: CatalogCatalogPresenter.kt */
/* loaded from: classes16.dex */
public final class g3a implements w8i {
    public final CatalogConfiguration b;
    public final u4a c;
    public final jda d;
    public final x2a<hda> e;
    public final zda f;
    public final boolean g;
    public final boolean h;
    public gda i;
    public final gzs<s3q0> j;
    public final io.reactivex.rxjava3.core.w k;
    public final io.reactivex.rxjava3.core.w l;
    public final io.reactivex.rxjava3.disposables.b m;
    public io.reactivex.rxjava3.disposables.c n;
    public final z2a o;
    public final z2a p;
    public xzh0 q;
    public acd r;
    public jn2 s;
    public CatalogVh t;

    public g3a() {
        throw null;
    }

    public g3a(CatalogConfiguration catalogConfiguration, u4a u4aVar, jda jdaVar, x2a x2aVar, w2a w2aVar, vga vgaVar, e740 e740Var, zda zdaVar, gda gdaVar, t66 t66Var, int i) {
        x2aVar = (i & 8) != 0 ? new x2a.e() : x2aVar;
        Object obj = null;
        w2aVar = (i & 16) != 0 ? null : w2aVar;
        vgaVar = (i & 32) != 0 ? null : vgaVar;
        e740Var = (i & 64) != 0 ? null : e740Var;
        zdaVar = (i & 256) != 0 ? null : zdaVar;
        boolean z = (i & 1024) != 0;
        gdaVar = (i & 2048) != 0 ? null : gdaVar;
        t66Var = (i & 4096) != 0 ? null : t66Var;
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.core.w c = asu0Var.c();
        io.reactivex.rxjava3.core.w d = asu0Var.d();
        this.b = catalogConfiguration;
        this.c = u4aVar;
        this.d = jdaVar;
        this.e = x2aVar;
        this.f = zdaVar;
        this.g = false;
        this.h = z;
        this.i = gdaVar;
        this.j = t66Var;
        this.k = c;
        this.l = d;
        this.m = new io.reactivex.rxjava3.disposables.b();
        z2a z2aVar = new z2a(w2aVar, e740Var);
        this.o = z2aVar;
        z2a z2aVar2 = new z2a(vgaVar, obj);
        this.p = z2aVar2;
        if (z) {
            return;
        }
        String t = catalogConfiguration.t();
        z2aVar.a(t);
        z2aVar2.a(t);
    }

    public static void a(g3a g3aVar, CatalogVh catalogVh) {
        g3aVar.t = catalogVh;
        g3aVar.c(catalogVh);
        g3aVar.e();
    }

    public final void b() {
        this.t = null;
        this.m.e();
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
        this.n = null;
    }

    public final void c(CatalogViewHolder catalogViewHolder) {
        mzp0 mzp0Var = this.c.c.g;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        int i = 9;
        io.reactivex.rxjava3.core.q<R> L = io.reactivex.rxjava3.core.q.T(this.e).L(new y34(new ns1(this, 15), i), false);
        com.vk.movika.sdk.base.flow.binding.c cVar = new com.vk.movika.sdk.base.flow.binding.c(new k9(this, 18), i);
        L.getClass();
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.o1(L, cVar).U(new ed(new w5(this, 13), 7)).r0(this.k).a0(this.l);
        ew ewVar = new ew(new k00(this, 13), 6);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.m.b(new io.reactivex.rxjava3.internal.operators.observable.a0(new io.reactivex.rxjava3.internal.operators.observable.c0(a0, ewVar, kVar).E(new defpackage.i0(new n40(this, 13), 8), io.reactivex.rxjava3.internal.functions.a.d, kVar, kVar).F(new y00(new com.vk.movika.sdk.base.hooks.p(this, 21), 7)), new f3a(this, 0)).subscribe(new ea(new na7(4, this, catalogViewHolder), 9), new el6(new op1(this, 11), 6)));
    }

    public final void d() {
        CatalogVh catalogVh = this.t;
        if (catalogVh != null) {
            qro0.c(new jd(catalogVh, 14));
            c(catalogVh);
        }
    }

    public final void e() {
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar == null) {
            rfc Jd = ((MusicCatalogComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MusicCatalogComponent.class))).Jd();
            u4a u4aVar = this.c;
            cVar = new io.reactivex.rxjava3.disposables.b(u4aVar.b.e.a().b0(a9s0.class).subscribe(new xn(new p1(this, 15), 5)), u4aVar.b.e.a().b0(snn0.class).subscribe(new wn(new g22(3, this, Jd), 10)));
        }
        this.n = cVar;
    }
}
