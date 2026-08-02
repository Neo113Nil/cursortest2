package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.libvideo.api.NotificationsPermission;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.video.ui.discovery.minimizable.s;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.iut0;

/* compiled from: SimilarSliderDelegate.kt */
/* loaded from: classes7.dex */
public final class znj0 implements c.n, c.i, bb30 {
    public final View b;
    public final a c;
    public final uyq0 d;
    public final gyo0 e;
    public final Object f;
    public final ViewStub g;
    public final io.reactivex.rxjava3.subjects.d<Float> h;
    public final mha i;
    public pan j;
    public final Object k;
    public final Object l;
    public nb30 m;
    public s.e n;
    public final ArrayList o;

    /* compiled from: SimilarSliderDelegate.kt */
    public static final class a {
        public final of a;
        public final iid b;
        public final NotificationsPermission c;
        public final yus0 d;
        public final qyt e;
        public final LayoutInflater f;

        public a(of ofVar, iid iidVar, NotificationsPermission notificationsPermission, yus0 yus0Var, qyt qytVar, LayoutInflater layoutInflater) {
            this.a = ofVar;
            this.b = iidVar;
            this.c = notificationsPermission;
            this.d = yus0Var;
            this.e = qytVar;
            this.f = layoutInflater;
        }
    }

    /* compiled from: SimilarSliderDelegate.kt */
    public static final class b {
        public final View a;
        public final RecyclerPaginatedView b;
        public final View c;
        public final View d;
        public final View e;
        public final VkSubnavigationBar f;
        public final View g;
        public final View h;

        public b(View view) {
            this.a = view;
            this.b = (RecyclerPaginatedView) view.findViewById(R.id.about_video_fullscreen_recycler);
            this.c = view.findViewById(R.id.similar_slider_header);
            this.d = view.findViewById(R.id.close_similar_slider_btn);
            this.e = view.findViewById(R.id.close_similar_slider_btn_tabs);
            this.f = (VkSubnavigationBar) view.findViewById(R.id.slider_tabs);
            this.g = view.findViewById(R.id.similar_slider);
            this.h = view.findViewById(R.id.slider_title);
        }

        public final HorizontalRecyclerPaginationView a() {
            return (HorizontalRecyclerPaginationView) this.a.findViewById(R.id.similar_video_items_recyclerview);
        }
    }

    public znj0(h7v h7vVar, View view, a aVar, uyq0 uyq0Var, gyo0 gyo0Var) {
        this.b = view;
        this.c = aVar;
        this.d = uyq0Var;
        this.e = gyo0Var;
        tbe0 tbe0Var = new tbe0(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, tbe0Var);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.similar_video_items_recyclerview_stub);
        this.g = viewStub;
        this.h = io.reactivex.rxjava3.subjects.d.O0(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        this.k = msy.a(lazyThreadSafetyMode, new irc0(this, 7));
        this.l = msy.a(lazyThreadSafetyMode, new fg1(25, this, h7vVar));
        this.o = new ArrayList();
        aVar.a.W2(this);
        viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: xsna.xnj0
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub2, View view2) {
                final znj0 znj0Var = znj0.this;
                RecyclerPaginatedView recyclerPaginatedView = znj0Var.h().b;
                u080 u080Var = new u080() { // from class: xsna.ynj0
                    @Override // xsna.u080
                    public final bqx0 b(View view3, bqx0 bqx0Var) {
                        h4x i = bqx0Var.a.i(128);
                        znj0 znj0Var2 = znj0.this;
                        znj0Var2.f(new wo1(17, znj0Var2, i));
                        return bqx0.b;
                    }
                };
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                iut0.d.c(recyclerPaginatedView, u080Var);
                znj0Var.b.post(new d0(znj0Var, 11));
                bwt0.i0(znj0Var.h().d, new mcj0(znj0Var, 1));
                bwt0.i0(znj0Var.h().e, new lxh0(znj0Var, 2));
            }
        });
        i();
        if (fxc0.B().J().f1().e) {
            bwt0.p0(h().e, true);
            VkSubnavigationBar vkSubnavigationBar = h().f;
            vkSubnavigationBar.setHorizontalFadingEdgeEnabled(true);
            vkSubnavigationBar.setLeftFadingEdgeEnabled(false);
            vkSubnavigationBar.setFadingEdgeLength(iah0.a(16));
            bwt0.p0(h().d, false);
            bwt0.p0(h().h, false);
            this.i = new mha(h().f, new nl30(this, 25), new ie90(this, 15), null, 16);
        }
    }

    @Override // com.vk.lists.c.n
    public final void Fe() {
        f(new dei0(this, 2));
    }

    @Override // com.vk.lists.c.i
    public final boolean I() {
        return g().h.f.isEmpty();
    }

    @Override // com.vk.lists.c.n
    public final void K9() {
        f(new kcj0(this, 1));
    }

    @Override // com.vk.lists.c.n
    public final void M9(df90 df90Var) {
        f(new mh3(26, this, df90Var));
    }

    @Override // com.vk.lists.c.n
    public final void Mk() {
        f(new gkc0(this, 10));
    }

    @Override // com.vk.lists.c.n
    public final void Om(df90 df90Var) {
        f(new com.vk.movika.sdk.base.flow.binding.g(23, this, df90Var));
    }

    @Override // xsna.bb30
    public final void a(nb30 nb30Var) {
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape = DiscoveryScreenMotionStates$Landscape.Fullscreen;
        if (nb30Var == discoveryScreenMotionStates$Landscape) {
            i();
        }
        if (epx.f(this.m, nb30Var)) {
            return;
        }
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape2 = DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar;
        nnj0 nnj0Var = null;
        nnj0Var = null;
        if (nb30Var == discoveryScreenMotionStates$Landscape2) {
            if (gsi0.b().e) {
                mha mhaVar = this.i;
                (mhaVar != null ? mhaVar : null).f.a();
            }
            pan panVar = this.j;
            if (panVar != null) {
                panVar.a();
            }
            nnj0Var = pnj0.a;
        } else if (nb30Var == discoveryScreenMotionStates$Landscape && this.m == discoveryScreenMotionStates$Landscape2) {
            nnj0Var = onj0.a;
        }
        if (nnj0Var != null) {
            j(nnj0Var);
        }
        this.m = nb30Var;
    }

    @Override // xsna.bb30
    public final void c(nb30 nb30Var, nb30 nb30Var2, float f) {
        if (nb30Var2 == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar) {
            if (this.m == DiscoveryScreenMotionStates$Landscape.Fullscreen && f > 0.5f) {
                j(qnj0.a);
            }
            this.h.onNext(Float.valueOf(f));
        }
    }

    @Override // com.vk.lists.c.i
    public final void clear() {
        g().getClass();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(s.e eVar) {
        this.n = eVar;
        if (bwt0.J(this.g)) {
            List<hfz> list = eVar.a;
            List<hfz> list2 = eVar.b;
            List<hfz> list3 = eVar.c;
            if (gsi0.b().e) {
                list2 = list3;
            }
            qoj0 qoj0Var = (qoj0) this.l.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof AboutVideoItem.d) {
                    arrayList.add(obj);
                }
            }
            qoj0Var.setItems(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                hfz hfzVar = (hfz) obj2;
                if ((hfzVar instanceof AboutVideoItem.SimilarVideoRedesign) || (hfzVar instanceof AboutVideoItem.x) || (hfzVar instanceof AboutVideoItem.w.b.C1217b)) {
                    arrayList2.add(obj2);
                }
            }
            g().setItems(arrayList2);
            f0();
        }
    }

    @Override // com.vk.lists.c.n
    public final void e0() {
        f(new nid0(this, 7));
    }

    public final void f(gzs<s3q0> gzsVar) {
        if (bwt0.J(this.g)) {
            gzsVar.invoke();
        } else {
            this.o.add(gzsVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.lists.c.n
    public final void f0() {
        HorizontalRecyclerPaginationView a2;
        if (g().getItemCount() > 0 && (a2 = h().a()) != null) {
            a2.f0();
        }
        if (((qoj0) this.l.getValue()).getItemCount() > 0) {
            h().b.f0();
        }
    }

    @Override // com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        f(new xo8(this, th, gxpVar, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qoj0 g() {
        return (qoj0) this.k.getValue();
    }

    @Override // com.vk.lists.c.n
    public final void gl() {
        f(new io60(this, 29));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final b h() {
        return (b) this.f.getValue();
    }

    public final void i() {
        if (iah0.r(this.b.getContext()) && ((Boolean) this.d.invoke()).booleanValue()) {
            ViewStub viewStub = this.g;
            if (bwt0.J(viewStub)) {
                return;
            }
            LayoutInflater layoutInflater = this.c.f;
            LayoutInflater layoutInflater2 = viewStub.getLayoutInflater();
            try {
                viewStub.setLayoutInflater(layoutInflater);
                viewStub.inflate();
            } finally {
                viewStub.setLayoutInflater(layoutInflater2);
            }
        }
    }

    public final void j(nnj0 nnj0Var) {
        HorizontalRecyclerPaginationView a2;
        RecyclerView recyclerView;
        if ((nnj0Var instanceof onj0) && (a2 = h().a()) != null && (recyclerView = a2.getRecyclerView()) != null) {
            recyclerView.scrollToPosition(0);
        }
        this.e.invoke(nnj0Var);
    }

    @Override // com.vk.lists.c.n
    public final void lb() {
        f(new x1e0(this, 8));
    }

    @Override // com.vk.lists.c.n
    public final void qg(whp whpVar) {
        f(new cg1(24, this, whpVar));
    }

    @Override // com.vk.lists.c.n
    public final void setDataObserver(gzs<s3q0> gzsVar) {
        f(new ni0(19, this, gzsVar));
    }

    @Override // com.vk.lists.c.n
    public final void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
        f(new nh3(28, this, gzsVar));
    }

    @Override // com.vk.lists.c.n
    public final void setOnRefreshListener(gzs<s3q0> gzsVar) {
        f(new yq1(19, this, gzsVar));
    }

    @Override // com.vk.lists.c.n
    public final void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
        f(new km1(18, this, gzsVar));
    }

    @Override // xsna.bb30
    public final void b(nb30 nb30Var, nb30 nb30Var2) {
    }

    @Override // xsna.bb30
    public final void d(nb30 nb30Var, nb30 nb30Var2) {
    }
}
