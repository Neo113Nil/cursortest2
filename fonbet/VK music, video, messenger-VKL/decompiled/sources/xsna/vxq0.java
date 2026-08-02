package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.attachments.MarketAttachment;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.dxq0;
import xsna.hux;
import xsna.pvq0;
import xsna.wnq0;
import xsna.xn60;
import xsna.yo60;

/* compiled from: UserProfileWallViewMvi.kt */
/* loaded from: classes4.dex */
public final class vxq0 implements nxq0, oxq0, enq0, obs, pds, ohh0 {
    public static final /* synthetic */ qcy<Object>[] C;
    public final Object A;
    public kvq0 B;
    public final FragmentImpl b;
    public final RecyclerPaginatedView c;
    public final xwq0 d;
    public final Object e;
    public final a f;
    public final Object g;
    public final bpn0 h;
    public final Object i;
    public final foq0 j;
    public final foq0 k;
    public final c l;
    public bin0<Context> m;
    public final rxq0 n;
    public boolean o;
    public RecyclerView p;
    public final Object q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final Object u;
    public final nzw v;
    public final wt60 w;
    public final bpn0 x;
    public final bpn0 y;
    public final b z;

    /* compiled from: UserProfileWallViewMvi.kt */
    public static final class a implements fo60 {
        public a() {
        }

        @Override // xsna.fo60
        public final void a(xn60 xn60Var) {
            lj50 qvq0Var;
            hvq0 hvq0Var = (hvq0) vxq0.this.x.getValue();
            if (xn60Var instanceof xn60.a) {
                qvq0Var = new pvq0.a((xn60.a) xn60Var);
            } else if (xn60Var instanceof xn60.d) {
                qvq0Var = new pvq0.c((xn60.d) xn60Var);
            } else if (xn60Var instanceof xn60.b) {
                qvq0Var = new pvq0.b((xn60.b) xn60Var);
            } else {
                if (!(xn60Var instanceof xn60.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                qvq0Var = new qvq0((xn60.c) xn60Var);
            }
            ewq0 q = ((vxq0) hvq0Var.a.c).q();
            if (q != null) {
                q.b(qvq0Var);
            }
        }
    }

    /* compiled from: UserProfileWallViewMvi.kt */
    public static final class b implements bq60 {
        public b() {
        }

        @Override // xsna.bq60
        public final void a(yo60 yo60Var) {
            mvq0 mvq0Var = (mvq0) vxq0.this.y.getValue();
            kvq0 n = ((vxq0) mvq0Var.a.c).n();
            nvq0 nvq0Var = n.y;
            FragmentImpl fragmentImpl = ((vxq0) mvq0Var.b.c).b;
            Activity invoke = mvq0Var.c.invoke();
            RecyclerView invoke2 = mvq0Var.d.invoke();
            nvq0Var.getClass();
            fq60 a = n.a();
            mo60 mo60Var = n.a;
            if (!(yo60Var instanceof yo60.j)) {
                a.b(mo60Var, fragmentImpl, invoke, invoke2, yo60Var);
                return;
            }
            gq60 gq60Var = mo60Var.i0;
            a.getClass();
            fq60.c((yo60.j) yo60Var, gq60Var);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* compiled from: UserProfileWallViewMvi.kt */
    public static final class c implements d3f0 {
        public c() {
        }

        @Override // xsna.d3f0
        public final void a(gii0 gii0Var) {
            if (gii0Var.c.a) {
                io.reactivex.rxjava3.core.a b = fsk.c.b(InAppReviewConditionKey.LIKE_3_MORE_POSTS, jgp.b);
                int i = kwg0.a;
                itg0.c(b.subscribe(io.reactivex.rxjava3.internal.functions.a.c, new hwg0()), vxq0.this.b);
            }
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(vxq0.class, X3.i.U, "getStore()Lcom/vk/newsfeed/impl/user/presentation/feature/UserProfileWallMviStore;", 0);
        fpf0.a.getClass();
        C = new qcy[]{propertyReference1Impl};
    }

    public vxq0(FragmentImpl fragmentImpl, RecyclerPaginatedView recyclerPaginatedView, xwq0 xwq0Var) {
        this.b = fragmentImpl;
        this.c = recyclerPaginatedView;
        this.d = xwq0Var;
        prq0 prq0Var = new prq0(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, prq0Var);
        fragmentImpl.D.a(this);
        this.f = new a();
        this.g = msy.a(lazyThreadSafetyMode, new t970(13));
        this.h = new bpn0(new wzb0(this, 24));
        this.i = msy.a(lazyThreadSafetyMode, new odc0(this, 24));
        this.j = xwq0Var.f;
        this.k = xwq0Var.g;
        this.l = new c();
        this.m = new bin0() { // from class: xsna.qxq0
            @Override // xsna.bin0
            public final Object get() {
                return vxq0.this.b.mo2getContext();
            }
        };
        this.n = new rxq0(this);
        this.q = msy.a(lazyThreadSafetyMode, new rme0(this, 14));
        this.r = new bpn0(new sxq0(this, 0));
        this.s = new bpn0(new ajd0(this, 16));
        this.t = new bpn0(new vpn0(this, 5));
        this.u = msy.a(lazyThreadSafetyMode, new vpj0(this, 11));
        this.v = new nzw("UserProfileWallMviStore_" + xwq0Var.c + '_' + xwq0Var.a, fragmentImpl, new qkd0(this, 17));
        this.w = l370.t();
        this.x = new bpn0(new hbj0(this, 15));
        this.y = new bpn0(new pwh0(this, 16));
        this.z = new b();
        this.A = msy.a(lazyThreadSafetyMode, new v5n0(this, 7));
    }

    @Override // xsna.pds
    public final void J0() {
        o().f(false);
    }

    @Override // xsna.ohh0
    public final void Y1(int i, int i2) {
        RecyclerView recyclerView;
        FragmentActivity activity = this.b.getActivity();
        if ((activity == null || !p90.f(activity)) && (recyclerView = this.c.getRecyclerView()) != null) {
            recyclerView.post(new muj0(i, i2, 1, this));
        }
    }

    @Override // xsna.sjg
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        o().d.b(cVar);
    }

    @Override // xsna.obs
    public final void b() {
        MarketAttachment.g = CommonMarketStat$TypeRefSource.POST;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nxq0
    public final void d() {
        RecyclerPaginatedView recyclerPaginatedView = this.c;
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        this.p = recyclerView;
        FragmentImpl fragmentImpl = this.b;
        if (recyclerView != null) {
            kvq0 n = n();
            odq.b(m7m.d(fragmentImpl), fragmentImpl, fragmentImpl.getActivity(), fragmentImpl.mo2getContext(), recyclerView, n().a.j0, false, true);
            ((dui) n.p.getValue()).l((or60) n.j.getValue());
            a4r a4rVar = n.a.n;
            a4rVar.f = new ghl(recyclerView, recyclerPaginatedView, new fhl(recyclerView, recyclerPaginatedView));
            a4rVar.g(hux.c.d.a);
            a4rVar.g(hux.f.c.a);
        }
        ((yl60) n().v.getValue()).c();
        this.w.b.g.a(new ece0(this, 17));
        s3q0 s3q0Var = s3q0.a;
        ad0.c(y22.a(fragmentImpl.getViewLifecycleOwner()), new jan0(this, 5));
        o().a().i();
    }

    @Override // xsna.nxq0
    public final void f(boolean z) {
        hvq0 hvq0Var = (hvq0) this.x.getValue();
        pvq0.c cVar = z ? new pvq0.c(xn60.d.b.b) : new pvq0.c(xn60.d.a.b);
        ewq0 q = ((vxq0) hvq0Var.a.c).q();
        if (q != null) {
            q.b(cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nxq0
    public final RecyclerView.Adapter<RecyclerView.e0> getAdapter() {
        return (ho60) n().i.getValue();
    }

    @Override // xsna.sjg
    public final String getRef() {
        return (String) ((AtomicReference) this.h.getValue()).get();
    }

    @Override // xsna.enq0
    public final void i() {
        this.k.v6(wnq0.a.C3945a.a);
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        ar60 o = o();
        boolean isResumed = this.b.isResumed();
        gzs<s3q0> gzsVar2 = o.h;
        if (isResumed) {
            gzsVar.invoke();
            gzsVar = gzsVar2;
        }
        o.h = gzsVar;
    }

    @Override // xsna.enq0
    public final void j() {
        this.k.v6(wnq0.a.b.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nxq0
    public final void j3(boolean z) {
        wwq0 wwq0Var = (wwq0) this.u.getValue();
        wwq0Var.e = z;
        if (z) {
            wwq0Var.d();
        } else {
            lap lapVar = wwq0Var.h;
            if (lapVar != null) {
                RecyclerView recyclerView = wwq0Var.g;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(lapVar);
                }
                wwq0Var.g = null;
                wwq0Var.h = null;
                wwq0Var.d = false;
            }
        }
        if (!z) {
            onPause();
        } else {
            onResume();
            wjf0.d(this.c.getRecyclerView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nxq0
    public final void l(int i) {
        RecyclerView recyclerView = this.p;
        if (recyclerView != null) {
            ((dui) n().a.T.getValue()).onScrollStateChanged(recyclerView, i);
        }
        if (i == 0) {
            ((wwq0) this.u.getValue()).d();
            return;
        }
        wo60 wo60Var = (wo60) n().o.getValue();
        VkContextMenu vkContextMenu = wo60Var.g;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        wo60Var.g = null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final kvq0 n() {
        kvq0 kvq0Var = this.B;
        if (kvq0Var != null) {
            return kvq0Var;
        }
        bin0<Context> bin0Var = this.m;
        mo60 mo60Var = new mo60(new ju4((AtomicReference) this.s.getValue(), (AtomicReference) this.h.getValue()), this.t, this.b.D, (tr60) this.g.getValue(), this.f, this.z, o().d, msy.a(LazyThreadSafetyMode.NONE, new fem0(this, 4)), new txq0(), this.l);
        mo60Var.e = this.m;
        kvq0 kvq0Var2 = new kvq0(bin0Var, mo60Var);
        if (!this.o) {
            this.B = kvq0Var2;
        }
        return kvq0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ar60 o() {
        return (ar60) this.i.getValue();
    }

    @Override // xsna.pds
    public final void o1() {
        o().h((Activity) this.n.get(), this.p);
    }

    @Override // xsna.obs
    public final void onConfigurationChanged(Configuration configuration) {
        n().a.n.g(hux.f.c.a);
        FragmentActivity activity = this.b.getActivity();
        if (activity != null) {
            mhy.b(activity);
        }
    }

    @Override // xsna.obs
    public final void onCreate(Bundle bundle) {
        this.b.D.a(this);
        o().c();
    }

    @Override // xsna.obs
    public final void onDestroy() {
        doq doqVar = lmc.c;
        o().d();
        q().clear();
        kvq0 kvq0Var = this.B;
        if (kvq0Var != null) {
            kvq0Var.a.a();
        }
        this.B = null;
        this.o = true;
        mvq0 mvq0Var = (mvq0) this.y.getValue();
        mvq0Var.c = lvq0.b;
        mvq0Var.d = glt.d;
        this.m = doqVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.obs
    public final void onDestroyView() {
        this.w.clear();
        wwq0 wwq0Var = (wwq0) this.u.getValue();
        lap lapVar = wwq0Var.h;
        if (lapVar != null) {
            RecyclerView recyclerView = wwq0Var.g;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(lapVar);
            }
            wwq0Var.g = null;
            wwq0Var.h = null;
            wwq0Var.d = false;
        }
        wwq0Var.f = null;
        wwq0Var.d = false;
        o170 o170Var = (o170) n().r.getValue();
        o170Var.c.m(o170Var.b);
        o170Var.a.e();
        pv60 pv60Var = o170Var.h;
        if (pv60Var != null) {
            pv60Var.a.clear();
        }
        o170Var.h = null;
        o().e(this.p);
        this.p = null;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.obs
    public final void onPause() {
        ar60 o = o();
        o.b().f().g();
        ((yl60) o.b().b0.getValue()).a();
        J0();
        ar60 o2 = o();
        o2.a().d();
        ehv ehvVar = (ehv) o2.b().p.b;
        if (ehvVar != null) {
            ehvVar.n();
        }
        ((o170) n().r.getValue()).a.h();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.obs
    public final void onResume() {
        o1();
        o().g();
        ((o170) n().r.getValue()).a.f();
        View view = this.b.getView();
        if (view != null) {
            view.post(new jk9(this, 15));
        }
    }

    public final a4r p() {
        return n().a.n;
    }

    public final ewq0 q() {
        qcy<Object> qcyVar = C[0];
        return (ewq0) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void r(eip eipVar) {
        dxq0 dxq0Var;
        boolean z;
        if (eipVar.d || eipVar.e || !eipVar.b) {
            dxq0Var = null;
        } else if (eipVar.a > 0) {
            dxq0Var = dxq0.a.c.a;
        } else {
            WallGetMode wallGetMode = eipVar.c;
            if (wallGetMode == WallGetMode.ALL || wallGetMode == WallGetMode.OWNER) {
                ?? r3 = this.e;
                if (((b25) r3.getValue()).b() && ((b25) r3.getValue()).a(this.d.c)) {
                    z = true;
                    dxq0Var = new dxq0.a.b(z);
                }
            }
            z = false;
            dxq0Var = new dxq0.a.b(z);
        }
        if (dxq0Var != null) {
            this.j.x6(dxq0Var);
        }
    }

    @Override // xsna.nxq0
    public final void F1() {
    }

    @Override // xsna.obs
    public final void c() {
    }

    @Override // xsna.obs
    public final void onStop() {
    }

    @Override // xsna.nxq0
    public final void e(WallGetMode wallGetMode) {
    }

    @Override // xsna.nxq0
    public final void g(foq0 foq0Var) {
    }

    @Override // xsna.nxq0
    public final void k(UserId userId) {
    }

    @Override // xsna.nxq0
    public final void m(foq0 foq0Var) {
    }

    @Override // xsna.nxq0
    public final void h(Pair pair, boolean z) {
    }

    @Override // xsna.obs
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
