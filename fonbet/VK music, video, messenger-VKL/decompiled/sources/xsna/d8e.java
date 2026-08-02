package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedCacheInfo;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.api.utils.performance.StartScreenType;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationPaginationKey;
import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ScreenSpinnerViewState;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import com.vk.clips.sdk.shared.feed.recycler.manager.ClipsFeedLinearLayoutManager;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.mvi.MviViewContainer;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import xsna.gm50;
import xsna.mk50;
import xsna.q7e;
import xsna.qvq;
import xsna.s4r;
import xsna.s7e;
import xsna.u6e;
import xsna.v7e;
import xsna.xn50;

/* compiled from: ClipsFeedMviView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class d8e extends MviViewContainer<u6e, e5r, qvq> implements v7e.b, v7e.a {
    public final p7e f;
    public final q7e g;
    public final mbs h;
    public final s7e.a i;
    public final r8e j;
    public final bpn0 k;
    public final myc l;
    public final qvq.f m;
    public final List<FeedItem> n;
    public List<? extends FeedItem> o;
    public final q8e p;
    public final bpn0 q;
    public final bpn0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    public d8e(Context context, p7e p7eVar, q7e q7eVar, mbs mbsVar, s7e.a aVar, r8e r8eVar) {
        super(context, null, 6, 0);
        qvq.f fVar;
        List<FeedItem> list;
        Pair pair;
        Object[] objArr = 0;
        this.f = p7eVar;
        this.g = q7eVar;
        this.h = mbsVar;
        this.i = aVar;
        this.j = r8eVar;
        this.k = new bpn0(new j70(this, 23));
        q7e.a aVar2 = q7eVar.r;
        z5e z5eVar = aVar2.b;
        y5e y5eVar = aVar2.c;
        v6e v6eVar = p7eVar.a;
        myc mycVar = new myc(z5eVar, y5eVar, v6eVar.b, q7eVar.h, aVar2.a, q7eVar.i);
        this.l = mycVar;
        i4r i4rVar = q7eVar.b;
        Pair pair2 = new Pair(getUiTracker(), kaf.a);
        ilh0 ilh0Var = (ilh0) pair2.d();
        hlh0 hlh0Var = (hlh0) pair2.g();
        ClipFeedTab clipFeedTab = v6eVar.b;
        kwc kwcVar = v6eVar.a;
        if (kwcVar != null && ((clipFeedTab instanceof ClipFeedTab.SingleClip) || (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) || (clipFeedTab instanceof ClipFeedTab.SingleAdv) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || (clipFeedTab instanceof ClipFeedTab.NewsMonotheme))) {
            hlh0Var.b(new IllegalArgumentException("Initial data will not be used for tab = " + clipFeedTab + ". Probably, you misuse initialData api?"));
        }
        SdkVideoFile a = u6e.a.a(v6eVar);
        boolean z = (kwcVar != null && (kwcVar.c < e43.h(kwcVar.a) || !(kwcVar.b instanceof PaginationKey.LoadedFull))) || (!(clipFeedTab instanceof ClipFeedTab.SingleAdv) && ((clipFeedTab instanceof ClipFeedTab.SingleClip) || (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) || (clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) || ((clipFeedTab instanceof ClipFeedTab.NewsMonotheme) && ((ClipFeedTab.NewsMonotheme) clipFeedTab).d != null)));
        if (a != null) {
            ilh0Var.a(clipFeedTab, a);
            if (clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) {
                ClipFeedTab.SingleClipWithDecoration singleClipWithDecoration = (ClipFeedTab.SingleClipWithDecoration) clipFeedTab;
                ClipsDecorationPaginationKey clipsDecorationPaginationKey = singleClipWithDecoration.g;
                PaginationKey.NextPageWithDecoration nextPageWithDecoration = clipsDecorationPaginationKey != null ? new PaginationKey.NextPageWithDecoration(clipsDecorationPaginationKey) : null;
                ClipsDecorationPaginationKey clipsDecorationPaginationKey2 = singleClipWithDecoration.h;
                pair = new Pair(nextPageWithDecoration, clipsDecorationPaginationKey2 != null ? new PaginationKey.NextPageWithDecoration(clipsDecorationPaginationKey2) : null);
            } else {
                pair = new Pair(kwcVar != null ? kwcVar.b : null, null);
            }
            ClipFeedTab.SingleAdv singleAdv = clipFeedTab instanceof ClipFeedTab.SingleAdv ? (ClipFeedTab.SingleAdv) clipFeedTab : null;
            fVar = new qvq.f.d(Collections.singletonList(myc.d(mycVar, a, singleAdv != null ? singleAdv.c : null, 4)), z, pair.j() != null, (PaginationKey) pair.i(), (PaginationKey) pair.j());
        } else {
            if (clipFeedTab instanceof ClipFeedTab.TopVideo) {
                Random.b.getClass();
                int l = Random.c.l(1, Integer.MAX_VALUE);
                io.reactivex.rxjava3.internal.operators.maybe.h0 o = new io.reactivex.rxjava3.internal.operators.maybe.o(new io.reactivex.rxjava3.internal.operators.observable.e0(i4rVar.e.c()), new tt0(new qt0(27), 18)).o(10L, TimeUnit.MILLISECONDS);
                f60 f60Var = new f60(new e60(26), 27);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                List list2 = (List) new io.reactivex.rxjava3.internal.operators.maybe.y(new io.reactivex.rxjava3.internal.operators.maybe.b0(o, lVar, lVar, f60Var, kVar, kVar), new aa6(new leq(3), 19)).c();
                list2 = list2 == null ? EmptyList.b : list2;
                List list3 = list2;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SdkVideoFile) it.next()).r1());
                }
                ArrayList h = mycVar.h(list2, new ClipFeedCacheInfo(arrayList, l));
                if (!h.isEmpty()) {
                    fVar = new qvq.f.b(h, l);
                }
            }
            fVar = qvq.f.a.b;
        }
        this.m = fVar;
        if (fVar instanceof qvq.f.b) {
            list = ((qvq.f.b) fVar).b;
        } else if (fVar instanceof qvq.f.d) {
            list = ((qvq.f.d) fVar).b;
        } else {
            if (!(fVar instanceof qvq.f.a) && !(fVar instanceof qvq.f.c)) {
                throw new NoWhenBranchMatchedException();
            }
            list = null;
        }
        this.n = list;
        this.o = EmptyList.b;
        r8e r8eVar2 = this.j;
        r8eVar2.getClass();
        q8e q8eVar = new q8e(context, null);
        q8eVar.c = true;
        q8eVar.setId(((Number) r8eVar2.j.getValue()).intValue());
        q8eVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ClipsFeedLinearLayoutManager clipsFeedLinearLayoutManager = new ClipsFeedLinearLayoutManager(context, new com.vk.stat.recycler.d(r8eVar2.d));
        clipsFeedLinearLayoutManager.t = new t5(r8eVar2, 25);
        clipsFeedLinearLayoutManager.l = true;
        q8eVar.setLayoutManager(clipsFeedLinearLayoutManager);
        RecyclerView.l itemAnimator = q8eVar.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.s();
        }
        RecyclerView.l itemAnimator2 = q8eVar.getItemAnimator();
        androidx.recyclerview.widget.g gVar = itemAnimator2 instanceof androidx.recyclerview.widget.g ? (androidx.recyclerview.widget.g) itemAnimator2 : null;
        if (gVar != null) {
            gVar.g = false;
        }
        ClipFeedAdapter clipFeedAdapter = (ClipFeedAdapter) r8eVar2.k.getValue();
        clipFeedAdapter.h.d.add(new j0f(q8eVar));
        q8eVar.setAdapter(clipFeedAdapter);
        q8eVar.setRecycledViewPool(((androidx.recyclerview.widget.t0) r8eVar2.c.invoke()).d.o());
        y5e y5eVar2 = r8eVar2.g;
        okh0 okh0Var = r8eVar2.f;
        te0 te0Var = r8eVar2.i;
        mbs mbsVar2 = r8eVar2.h;
        dmc dmcVar = new dmc(y5eVar2, okh0Var, te0Var);
        q8eVar.addOnScrollListener(dmcVar);
        mbsVar2.a(new cmc(q8eVar, dmcVar));
        this.p = q8eVar;
        this.q = new bpn0(new eg1(3, context, this));
        this.r = new bpn0(new yh(this, 25));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setNestedScrollingEnabled(true);
        addView(q8eVar);
        if (list != null) {
            this.o = list;
            ClipFeedAdapter clipFeedAdapter2 = (ClipFeedAdapter) this.j.k.getValue();
            xzz xzzVar = clipFeedAdapter2.j;
            if (xzzVar.b.get()) {
                xzzVar.execute(new boy0(clipFeedAdapter2, list, objArr == true ? 1 : 0));
            } else {
                androidx.recyclerview.widget.d<hfz> dVar = clipFeedAdapter2.h;
                dVar.b(null, null);
                dVar.b(list, null);
            }
        }
        this.h.a(new c8e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n4r getSpinnerRenderDelegate() {
        return (n4r) this.q.getValue();
    }

    private final waf getUiTracker() {
        return (waf) this.k.getValue();
    }

    public static s3q0 h(d8e d8eVar, ScreenSpinnerViewState screenSpinnerViewState) {
        d8eVar.getSpinnerRenderDelegate().b(screenSpinnerViewState);
        return s3q0.a;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return mk50.a.a;
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((e5r) ao50Var).a, new e5(this, 29));
    }

    @Override // com.vk.mvi.MviViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((u6e) vk50Var).h.a(new u8(this, 26), getViewOwner());
    }

    @Override // xsna.v7e.a
    public final void a(qvq qvqVar) {
        xn50.a.c(this, qvqVar);
    }

    @Override // xsna.v7e.b
    public final d8e b() {
        if (!i0q0.b()) {
            q7e.e eVar = this.g.s;
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("address clips feed view from background thread"));
        }
        return this;
    }

    @Override // xsna.v7e.b
    public final boolean c() {
        View view;
        bpn0 bpn0Var = this.r;
        return bpn0Var.isInitialized() && (view = ((bsr) bpn0Var.getValue()).i) != null && view.getVisibility() == 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.v7e.b
    public ClipFeedAdapter getAdapter() {
        return (ClipFeedAdapter) this.j.k.getValue();
    }

    public final List<FeedItem> getCachedCurrentItems() {
        return this.o;
    }

    @Override // xsna.xxq
    public List<FeedItem> getCurrentItems() {
        return this.o;
    }

    public final myc getItemsProducer() {
        return this.l;
    }

    @Override // xsna.v7e.b
    public q8e getRecycler() {
        if (!i0q0.b()) {
            this.g.s.getClass();
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("address clips feed view from background thread"));
        }
        return this.p;
    }

    public final void setCachedCurrentItems(List<? extends FeedItem> list) {
        this.o = list;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        StartScreenType startScreenType;
        q7e q7eVar = this.g;
        yof yofVar = q7eVar.j;
        q7e.e eVar = q7eVar.s;
        q7e.a aVar = q7eVar.r;
        q7e.d dVar = q7eVar.t;
        q7e.c cVar = q7eVar.q;
        hwc hwcVar = cVar.a;
        gbq gbqVar = q7eVar.k;
        fqe fqeVar = dVar.a;
        okh0 okh0Var = aVar.d;
        e25 e25Var = q7eVar.l;
        bpn0 bpn0Var = q7eVar.m;
        ClipFeedListFragment.i iVar = q7eVar.n;
        vjx vjxVar = cVar.b;
        m0x m0xVar = cVar.c;
        bkw bkwVar = eVar.a;
        tih0 tih0Var = q7eVar.u;
        wyq wyqVar = new wyq(yofVar, hwcVar, gbqVar, fqeVar, okh0Var, e25Var, bpn0Var, iVar, c7b0.a, vjxVar, m0xVar, bkwVar, q7eVar.o, tih0Var, q7eVar.v, aVar.c, aVar.e);
        qvq.f fVar = this.m;
        if (fVar instanceof qvq.f.d) {
            startScreenType = StartScreenType.StartedWithArguments;
        } else if (fVar instanceof qvq.f.c) {
            startScreenType = StartScreenType.StartedWithArguments;
        } else if (fVar instanceof qvq.f.b) {
            startScreenType = StartScreenType.StartedTabCache;
        } else {
            if (!(fVar instanceof qvq.f.a)) {
                throw new NoWhenBranchMatchedException();
            }
            startScreenType = StartScreenType.StartedTabNetwork;
        }
        okh0Var.a(startScreenType);
        p7e p7eVar = this.f;
        g5r g5rVar = new g5r(p7eVar.a.b);
        String str = p7eVar.c;
        return new u6e(p7eVar.a, new s8e(g5rVar, this.n, str != null ? new s4r.b(str) : null), q7eVar.b, this.l, wyqVar, this.m, q7eVar.g);
    }
}
