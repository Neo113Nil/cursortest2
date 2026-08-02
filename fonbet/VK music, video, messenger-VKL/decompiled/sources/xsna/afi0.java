package xsna;

import android.content.ComponentCallbacks2;
import android.text.Editable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.attachpicker.stickers.selection.views.GifSearchSkeletonView;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.b6l0;

/* compiled from: SelectionStickerSearchDelegate.kt */
/* loaded from: classes15.dex */
public final class afi0 {
    public final acw0 A;
    public final CoordinatorLayout a;
    public final View b;
    public final ViewPager c;
    public final SelectionStickerView.OpenFrom d;
    public final uei0 e;
    public final izs<RecyclerView, Boolean> f;
    public final bpn0 g;
    public final io.reactivex.rxjava3.disposables.b h;
    public VkSearchView i;
    public RecyclerPaginatedView j;
    public GifSearchSkeletonView k;
    public ylh0 l;
    public boolean m;
    public boolean n;
    public com.vk.lists.c o;
    public com.vk.lists.c p;
    public final gws q;
    public final fws r;
    public final czt s;
    public final bzt t;
    public final io.reactivex.rxjava3.subjects.f<s3q0> u;
    public final yvh0 v;
    public SearchMode w;
    public final aws x;
    public final zyt y;
    public final EmptyDisposable z;

    /* compiled from: SelectionStickerSearchDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: SelectionStickerSearchDelegate.kt */
    public static final class b extends rno0 {
        @Override // xsna.rno0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ucp ucpVar = ucp.a;
            ucp.i(editable);
        }
    }

    /* compiled from: SelectionStickerSearchDelegate.kt */
    public static final class c extends GridLayoutManager.c {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            ylh0 ylh0Var = afi0.this.l;
            if (ylh0Var == null) {
                return 1;
            }
            int itemViewType = ylh0Var.getItemViewType(i);
            return (itemViewType == 2 || itemViewType == 3) ? 3 : 1;
        }
    }

    public afi0(CoordinatorLayout coordinatorLayout, View view, ViewPager viewPager, SelectionStickerView.OpenFrom openFrom, uei0 uei0Var, izs izsVar) {
        this.a = coordinatorLayout;
        this.b = view;
        this.c = viewPager;
        this.d = openFrom;
        this.e = uei0Var;
        this.f = izsVar;
        bpn0 bpn0Var = new bpn0(new u210(this, 25));
        this.g = bpn0Var;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.h = bVar;
        gws gwsVar = new gws(null);
        this.q = gwsVar;
        zvs zvsVar = new zvs(gwsVar);
        fws fwsVar = new fws(gwsVar, zvsVar, (syt) bpn0Var.getValue(), new irc0(this, 6), bVar, openFrom, new os30(this, 21), new qah0(this, 2), new ah7(this, 8), new gqh0(this, 1), new sy50(this, 29));
        this.r = fwsVar;
        czt cztVar = new czt(null);
        this.s = cztVar;
        this.t = new bzt(cztVar, (syt) bpn0Var.getValue(), bVar, new bbb0(this, 14), new b6f0(this, 4), new kld0(this, 8));
        this.u = new io.reactivex.rxjava3.subjects.f<>();
        this.v = new yvh0(gwsVar, cztVar, new stg0(this, 3), new yei0(this, 0));
        hg1.e(bVar, y9l0.a.a0(asu0.a.c()).subscribe(new qz(new wpg(fwsVar, 16), 17)));
        coordinatorLayout.addOnAttachStateChangeListener(new zei0(this));
        this.w = SearchMode.FULL;
        this.x = new aws(gwsVar, zvsVar, bVar, new fm20(this, 26), new p00(this, 10), new jw30(this, 25));
        this.y = new zyt(cztVar, (syt) bpn0Var.getValue(), bVar, new so40(this, 22), new no3(this, 9), new gd70(this, 26));
        this.z = EmptyDisposable.INSTANCE;
        this.A = new acw0(new e810(this, 26));
    }

    public final void a() {
        int i = this.n ? R.string.sticker_search_gif_mode : R.string.vk_search;
        VkSearchView vkSearchView = this.i;
        if (vkSearchView != null) {
            vkSearchView.setHint(i);
        }
        VkSearchView vkSearchView2 = this.i;
        if (vkSearchView2 != null) {
            vkSearchView2.U4();
        }
        VkSearchView vkSearchView3 = this.i;
        if (vkSearchView3 != null) {
            vkSearchView3.d0();
        }
        VkSearchView vkSearchView4 = this.i;
        if (vkSearchView4 != null) {
            vkSearchView4.f5(false);
        }
        if (this.n) {
            SearchMode searchMode = SearchMode.GIF;
            if (searchMode != this.w) {
                this.w = searchMode;
                f();
            }
            this.r.m.onNext("");
        } else {
            SearchMode searchMode2 = SearchMode.FULL;
            if (searchMode2 != this.w) {
                this.w = searchMode2;
                f();
            }
        }
        j(false);
    }

    public final String b() {
        VkSearchView vkSearchView = this.i;
        String query = vkSearchView != null ? vkSearchView.getQuery() : null;
        return query == null ? "" : query;
    }

    public final void c() {
        VkSearchView vkSearchView = this.i;
        if (vkSearchView != null) {
            vkSearchView.d0();
        }
    }

    public final void d() {
        RecyclerView recyclerView;
        CoordinatorLayout coordinatorLayout = this.a;
        VkSearchView vkSearchView = (VkSearchView) coordinatorLayout.findViewById(R.id.search_view);
        vkSearchView.f5(false);
        vkSearchView.setOnBackClickListener(new nid0(this, 5));
        orl.a(vkSearchView);
        vkSearchView.setOnActionClearListener(new x1e0(this, 6));
        vkSearchView.getEditView().addTextChangedListener(new b());
        this.i = vkSearchView;
        this.j = (RecyclerPaginatedView) coordinatorLayout.findViewById(R.id.rv_search);
        this.k = (GifSearchSkeletonView) coordinatorLayout.findViewById(R.id.gif_skeleton);
        RecyclerPaginatedView recyclerPaginatedView = this.j;
        if (recyclerPaginatedView != null) {
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
            dVar.c(3);
            dVar.e = new c();
            dVar.a();
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.j;
        if (recyclerPaginatedView2 != null && (recyclerView = recyclerPaginatedView2.getRecyclerView()) != null) {
            ylh0 ylh0Var = new ylh0(this.e, this.d, recyclerView, new jcf0(this, 2));
            this.l = ylh0Var;
            RecyclerPaginatedView recyclerPaginatedView3 = this.j;
            if (recyclerPaginatedView3 != null) {
                recyclerPaginatedView3.setAdapter(ylh0Var);
            }
            this.f.invoke(recyclerView);
            recyclerView.setHasFixedSize(false);
            recyclerView.setItemAnimator(new androidx.recyclerview.widget.g());
        }
        this.o = new com.vk.lists.c(this.x, null, this.l, null, true, 5, true, 30, 1073741823, null, "0", null, null, null, false, false, true, true, true);
        this.p = new com.vk.lists.c(null, this.y, this.l, null, true, 5, true, 30, 1073741823, null, "0", null, null, null, false, false, true, true, true);
        f();
        fws fwsVar = this.r;
        hg1.e(fwsVar.e, y9l0.a.subscribe(new is1(new rmg(fwsVar, 13), 27)));
    }

    public final boolean e() {
        RecyclerPaginatedView recyclerPaginatedView = this.j;
        return recyclerPaginatedView != null && recyclerPaginatedView.getVisibility() == 0;
    }

    public final void f() {
        RecyclerPaginatedView recyclerPaginatedView = this.j;
        if (recyclerPaginatedView == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[this.w.ordinal()];
        if (i == 1) {
            com.vk.lists.c cVar = this.p;
            if (cVar != null) {
                cVar.v();
            }
            com.vk.lists.c cVar2 = this.o;
            if (cVar2 != null) {
                cVar2.b(recyclerPaginatedView, false, false, 0L, null);
            }
            com.vk.lists.c cVar3 = this.o;
            if (cVar3 != null) {
                cVar3.p(false);
                return;
            }
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        com.vk.lists.c cVar4 = this.o;
        if (cVar4 != null) {
            cVar4.v();
        }
        com.vk.lists.c cVar5 = this.p;
        if (cVar5 != null) {
            cVar5.b(recyclerPaginatedView, false, false, 0L, null);
        }
        com.vk.lists.c cVar6 = this.p;
        if (cVar6 != null) {
            cVar6.p(false);
        }
    }

    public final void g(boolean z, final boolean z2) {
        if (!z) {
            j(z2);
            return;
        }
        RecyclerPaginatedView recyclerPaginatedView = this.j;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.post(new Runnable() { // from class: xsna.xei0
                @Override // java.lang.Runnable
                public final void run() {
                    afi0.this.j(z2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        boolean z;
        if (this.l == null) {
            L.l("Can't initialize searcher for search of stickers");
            VkSearchView vkSearchView = this.i;
            if (vkSearchView != null) {
                vkSearchView.setVisibility(8);
                return;
            }
            return;
        }
        fws fwsVar = this.r;
        io.reactivex.rxjava3.subjects.f<String> fVar = fwsVar.m;
        io.reactivex.rxjava3.disposables.b bVar = fwsVar.e;
        io.reactivex.rxjava3.observables.a aVar = (io.reactivex.rxjava3.observables.a) fwsVar.g.invoke();
        if (aVar != null) {
            if (((Boolean) fwsVar.d.invoke()).booleanValue()) {
                nr4.a().getClass();
                if (o0m0.e(WebStickerType.GIF)) {
                    z = true;
                    io.reactivex.rxjava3.core.q X = io.reactivex.rxjava3.core.q.X(aVar, fVar);
                    iw3 iw3Var = new iw3(new cvh(fwsVar, 8), 13);
                    X.getClass();
                    io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(X, iw3Var);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    io.reactivex.rxjava3.core.q<R> s0 = i0Var.y(200L, timeUnit).s0(new u5(new zxo(fwsVar, 7), 16));
                    asu0 asu0Var = asu0.a;
                    hg1.e(bVar, s0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new bw(new dws(fwsVar, z, 0), 27), new om1(new z13(22), 19)));
                    io.reactivex.rxjava3.core.q X2 = io.reactivex.rxjava3.core.q.X(aVar, fVar);
                    jo3 jo3Var = new jo3(new f1j(fwsVar, 14), 15);
                    X2.getClass();
                    hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.observable.i0(X2, jo3Var).y(300L, timeUnit).s0(new e05(new l2k(fwsVar, 15), 23)).r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new y00(new tnd(fwsVar, z), 22), new vl0(new wq3(26), 23)));
                    io.reactivex.rxjava3.core.q X3 = io.reactivex.rxjava3.core.q.X(aVar, fVar);
                    pb pbVar = new pb(new wcj(fwsVar, 13), 20);
                    X3.getClass();
                    hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.observable.i0(X3, pbVar).a0(asu0Var.d()).subscribe(new ir0(new igh(fwsVar, 15), 16), new v8(new bws(0), 22)));
                    if (z) {
                        hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.observable.i0(aVar, new dg1(new frg(fwsVar, 13), 20)).a0(asu0Var.d()).subscribe(new defpackage.n(new eph(fwsVar, 19), 29), new bf2(new af2(20), 18)));
                        hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.observable.i0(aVar, new sj4(new cws(fwsVar, 0), 14)).y(400L, timeUnit).s0(new do3(new d9j(fwsVar, 11), 16)).r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new defpackage.x(new ifg(fwsVar, 20), 23), new k41(new dam(8), 19)));
                    }
                    io.reactivex.rxjava3.internal.util.d dVar = new io.reactivex.rxjava3.internal.util.d();
                    aVar.N0(dVar);
                    hg1.e(bVar, dVar.b);
                }
            }
            z = false;
            io.reactivex.rxjava3.core.q X4 = io.reactivex.rxjava3.core.q.X(aVar, fVar);
            iw3 iw3Var2 = new iw3(new cvh(fwsVar, 8), 13);
            X4.getClass();
            io.reactivex.rxjava3.internal.operators.observable.i0 i0Var2 = new io.reactivex.rxjava3.internal.operators.observable.i0(X4, iw3Var2);
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            io.reactivex.rxjava3.core.q<R> s02 = i0Var2.y(200L, timeUnit2).s0(new u5(new zxo(fwsVar, 7), 16));
            asu0 asu0Var2 = asu0.a;
            hg1.e(bVar, s02.r0(asu0Var2.c()).a0(asu0Var2.d()).subscribe(new bw(new dws(fwsVar, z, 0), 27), new om1(new z13(22), 19)));
            io.reactivex.rxjava3.core.q X22 = io.reactivex.rxjava3.core.q.X(aVar, fVar);
            jo3 jo3Var2 = new jo3(new f1j(fwsVar, 14), 15);
            X22.getClass();
            hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.observable.i0(X22, jo3Var2).y(300L, timeUnit2).s0(new e05(new l2k(fwsVar, 15), 23)).r0(asu0Var2.c()).a0(asu0Var2.d()).subscribe(new y00(new tnd(fwsVar, z), 22), new vl0(new wq3(26), 23)));
            io.reactivex.rxjava3.core.q X32 = io.reactivex.rxjava3.core.q.X(aVar, fVar);
            pb pbVar2 = new pb(new wcj(fwsVar, 13), 20);
            X32.getClass();
            hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.observable.i0(X32, pbVar2).a0(asu0Var2.d()).subscribe(new ir0(new igh(fwsVar, 15), 16), new v8(new bws(0), 22)));
            if (z) {
            }
            io.reactivex.rxjava3.internal.util.d dVar2 = new io.reactivex.rxjava3.internal.util.d();
            aVar.N0(dVar2);
            hg1.e(bVar, dVar2.b);
        }
        bzt bztVar = this.t;
        io.reactivex.rxjava3.disposables.b bVar2 = bztVar.c;
        io.reactivex.rxjava3.observables.a aVar2 = (io.reactivex.rxjava3.observables.a) bztVar.d.invoke();
        if (aVar2 == null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.observable.s y = aVar2.y(400L, TimeUnit.MILLISECONDS);
        asu0 asu0Var3 = asu0.a;
        hg1.e(bVar2, y.r0(asu0Var3.c()).a0(asu0Var3.d()).subscribe(new cz(new uoh(bztVar, 20), 23), new ez(new azt(0), 23)));
        io.reactivex.rxjava3.internal.util.d dVar3 = new io.reactivex.rxjava3.internal.util.d();
        aVar2.N0(dVar3);
        hg1.e(bVar2, dVar3.b);
    }

    public final void i() {
        hg1.f(this.h);
        ComponentCallbacks2 h = e3m.h(this.a.getContext());
        if (h instanceof aeg0) {
            vtk0.d().a((aeg0) h, this.A);
        }
    }

    public final void j(boolean z) {
        b6l0.a aVar;
        RecyclerPaginatedView recyclerPaginatedView;
        x820<Object> a2 = this.v.a(this.w);
        ylh0 ylh0Var = this.l;
        if (ylh0Var != null) {
            ylh0Var.i = b();
            ylh0Var.g.b(a2, null);
        }
        SearchMode searchMode = this.w;
        SearchMode searchMode2 = SearchMode.FULL;
        if (searchMode == searchMode2 && (((aVar = this.q.d) == null || (aVar.b.isEmpty() && aVar.c.isEmpty())) && !z && (recyclerPaginatedView = this.j) != null)) {
            recyclerPaginatedView.postDelayed(new or4(this, 12), 200L);
        }
        ylh0 ylh0Var2 = this.l;
        String str = ylh0Var2 != null ? ylh0Var2.i : null;
        boolean z2 = str == null || str.length() == 0;
        SearchMode searchMode3 = this.w;
        View view = this.b;
        if (searchMode3 == searchMode2) {
            GifSearchSkeletonView gifSearchSkeletonView = this.k;
            if (gifSearchSkeletonView != null) {
                gifSearchSkeletonView.setVisibility(8);
            }
            if (z2) {
                d3m.c(this.c, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                d3m.e(this.j, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new hv1(this, 16), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                if (view.getVisibility() != 0) {
                    d3m.c(this.b, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            } else {
                d3m.c(this.j, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                d3m.e(this.c, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                view.setVisibility(8);
            }
        } else if (searchMode3 == SearchMode.GIF) {
            if (z2) {
                d3m.c(this.c, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (view.getVisibility() != 0) {
                    d3m.c(this.b, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                GifSearchSkeletonView gifSearchSkeletonView2 = this.k;
                if (gifSearchSkeletonView2 != null) {
                    d3m.e(gifSearchSkeletonView2, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                d3m.e(this.j, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                VkSearchView vkSearchView = this.i;
                if (vkSearchView != null) {
                    vkSearchView.f5(false);
                }
            } else {
                d3m.e(this.c, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                view.setVisibility(8);
                czt cztVar = this.s;
                if (cztVar.d) {
                    GifSearchSkeletonView gifSearchSkeletonView3 = this.k;
                    if (gifSearchSkeletonView3 != null) {
                        gifSearchSkeletonView3.a(cztVar.a.size(), z2);
                    }
                    d3m.c(this.k, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    d3m.e(this.j, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                } else {
                    d3m.e(this.k, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    d3m.c(this.j, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                VkSearchView vkSearchView2 = this.i;
                if (vkSearchView2 != null) {
                    vkSearchView2.f5(true);
                }
            }
        }
        if (this.w == SearchMode.GIF) {
            this.u.onNext(s3q0.a);
        }
    }
}
