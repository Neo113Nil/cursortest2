package xsna;

import android.os.Bundle;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.lists.c;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.newsfeed.impl.config.FeedTabsDelayConfig;
import com.vk.newsfeed.impl.discover.media.DiscoverMediaTabFragment;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded;
import com.vkontakte.android.data.b;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiscoverMediaTabPresenter.kt */
/* loaded from: classes4.dex */
public final class k5n extends EntriesListPresenter implements c.m<f2c0<x960>>, f2n {
    public final DiscoverMediaTabFragment d0;
    public DiscoverId e0;
    public String f0;
    public NewsEntriesContainer g0;
    public boolean h0;
    public btl<x960> i0;
    public final Object j0;
    public final Object k0;
    public final Object l0;
    public final lu0 m0;
    public final io.reactivex.rxjava3.disposables.b n0;
    public final io.reactivex.rxjava3.disposables.b o0;
    public final jse0 p0;
    public boolean q0;
    public boolean r0;
    public NewsEntriesContainer.Info s0;
    public a t0;
    public final int u0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DiscoverMediaTabPresenter.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a RESPONSE;
        public static final a UNKNOWN;

        static {
            a aVar = new a(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = aVar;
            a aVar2 = new a("RESPONSE", 1);
            RESPONSE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public k5n(DiscoverMediaTabFragment discoverMediaTabFragment) {
        super(discoverMediaTabFragment);
        this.d0 = discoverMediaTabFragment;
        this.e0 = DiscoverId.i;
        this.f0 = "unknown";
        jg0 jg0Var = new jg0(15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j0 = msy.a(lazyThreadSafetyMode, jg0Var);
        this.k0 = msy.a(lazyThreadSafetyMode, new nm0(12));
        this.l0 = msy.a(lazyThreadSafetyMode, new obh(this, 6));
        this.m0 = new lu0();
        this.n0 = new io.reactivex.rxjava3.disposables.b();
        this.o0 = new io.reactivex.rxjava3.disposables.b();
        this.p0 = new jse0(new wnh(this, 10));
        this.u0 = 3;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void D0(Bundle bundle) {
        DiscoverId discoverId;
        String str;
        boolean z = false;
        if (bundle != null && bundle.getBoolean("tab_mode", false)) {
            z = true;
        }
        this.q0 = z;
        if (bundle == null || (discoverId = (DiscoverId) bundle.getParcelable("discover_id")) == null) {
            DiscoverId discoverId2 = DiscoverId.i;
            discoverId = DiscoverId.i;
        }
        this.e0 = discoverId;
        if (bundle == null || (str = bundle.getString("ref")) == null) {
            str = "unknown";
        }
        this.f0 = str;
        super.D0(bundle);
    }

    @Override // xsna.dw60
    public final void Nb(boolean z) {
        if (z) {
            com.vk.lists.c cVar = this.g;
            if (cVar != null) {
                cVar.p(true);
                return;
            }
            return;
        }
        btl<x960> btlVar = this.i0;
        if (btlVar != null) {
            btlVar.M0();
        }
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<f2c0<x960>> O9(String str, com.vk.lists.c cVar) {
        if (str.equals("0")) {
            str = null;
        }
        DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
        return e0(DiscoverNewsEntriesRepository.c(this.e0, str, this.h0 ? DiscoverCustomIntent.PRELOAD : DiscoverCustomIntent.NEXT_PAGE, new krk0(4, MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA)), false);
    }

    @Override // xsna.f2n
    public final void Sa() {
        a aVar = this.t0;
        if (aVar == null) {
            return;
        }
        b.d dVar = new b.d("topics_show_no_items");
        dVar.b(this.e0.b, "feed_id");
        dVar.b(cqm0.m(aVar.name()), "reason");
        dVar.e();
        this.t0 = null;
    }

    @Override // xsna.dqp
    public final String a() {
        return this.f0;
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    public final void c0(boolean z, com.vk.lists.c cVar, f2c0<x960> f2c0Var) {
        x960 x960Var = f2c0Var.a;
        NewsEntriesContainer a2 = x960Var.a();
        if (this.d0.d0.G) {
            NewsEntriesContainer.Info info = a2.b;
            if (!info.g) {
                info.g = true;
            }
        }
        if (z) {
            this.s0 = a2.b;
        }
        NewsEntriesContainer.Info info2 = a2.b;
        List<NewsEntry> list = a2.c;
        this.h0 = info2.n;
        this.t0 = (z && list.isEmpty()) ? a.RESPONSE : a.UNKNOWN;
        String str = info2.b;
        cVar.s(str);
        String str2 = info2.e;
        if (str2 != null && str2.length() != 0 && epx.f(this.f0, "unknown")) {
            this.f0 = str2;
        }
        List<NewsEntry> list2 = x960Var.a().c;
        awq b = x960Var.b();
        MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason reason = (str == null || str.length() == 0) ? MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason.EMPTY_NEXT_FROM : list2.isEmpty() ? MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason.EMPTY_PAGE : null;
        if (reason != null && b != null) {
            b.k(list2.size(), reason);
        }
        cVar.r(!(reason != null));
        awq b2 = x960Var.b();
        List<? extends NewsEntry> list3 = f2c0Var.b;
        ArrayList arrayList = f2c0Var.c;
        q(list3);
        ArrayList<NewsEntry> arrayList2 = this.d;
        int size = arrayList2.size();
        arrayList2.addAll(list3);
        com.vk.lists.b<u1c0> bVar = this.c;
        Z(size, bVar.d.size(), arrayList);
        if (size == 0) {
            fqp fqpVar = this.b;
            fqpVar.Q9(false);
            fqpVar.va();
        }
        bVar.n0(arrayList);
        s(arrayList, b2);
        q1n q1nVar = (q1n) this.l0.getValue();
        DiscoverId discoverId = this.e0;
        NewsEntriesContainer newsEntriesContainer = this.g0;
        q1nVar.getClass();
        if (!list.isEmpty()) {
            q1nVar.b.getClass();
            newsEntriesContainer = new NewsEntriesContainer(a2.b, list);
            n1n.e(discoverId, newsEntriesContainer);
        }
        this.g0 = newsEntriesContainer;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    public final mx6<x960> d0(com.vk.lists.c cVar, boolean z) {
        cVar.r(true);
        this.t0 = a.UNKNOWN;
        mx6<x960> d = DiscoverNewsEntriesRepository.a.d(this.e0, z, this.r0, (q1n) this.l0.getValue(), z ? DiscoverCustomIntent.PTR : DiscoverCustomIntent.PRELOAD, new m6o0(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA));
        io.reactivex.rxjava3.core.q<x960> qVar = d.b;
        b60 b60Var = new b60(new n3i(this, 9), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        d.b = qVar.E(b60Var, lVar, kVar, kVar).F(new c60(new mmf(this, 23), 23));
        if (z) {
            this.d0.Q9(true);
            itg0.m(com.vkontakte.android.data.b.d());
        }
        return d;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.b0 e0(mx6 mx6Var, boolean z) {
        io.reactivex.rxjava3.core.q<T> qVar = mx6Var.b;
        j41 j41Var = new j41(new po1(mx6Var, 6), 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.core.q<R> L = ou0.a(qVar.E(j41Var, lVar, kVar, kVar), this.m0, z).L(new gv(new grp(this, !z), 17), false);
        xz xzVar = new xz(new j9(mx6Var, 11), 7);
        L.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z(L, xzVar).F(new k41(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(mx6Var, 8), 5)).E(lVar, lVar, kVar, new lx6(mx6Var, 0));
    }

    @Override // xsna.dqp, xsna.kvh
    public final String getRef() {
        return this.f0;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return VideoAutoPlayDelayType.FEED;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<f2c0<x960>> hj(com.vk.lists.c cVar, boolean z) {
        jse0 jse0Var = this.p0;
        if (jse0Var != null) {
            jse0Var.a();
        }
        if (z || !this.q0) {
            return e0(d0(cVar, z), true);
        }
        mx6<x960> d0 = d0(cVar, false);
        btl<x960> btlVar = new btl<>(d0.b, ((FeedTabsDelayConfig) this.j0.getValue()).b, true);
        this.i0 = btlVar;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = btlVar.a0(asu0.a.d());
        lcb lcbVar = new lcb(this, 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        d0.b = a0.E(lVar, lVar, io.reactivex.rxjava3.internal.functions.a.c, lcbVar);
        return e0(d0, true);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void onDestroy() {
        super.onDestroy();
        this.n0.dispose();
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final boolean s0() {
        return true;
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void u0(boolean z) {
        this.r0 = z;
        hg1.e(this.n0, wjs0.b.subscribe(new com.vk.im.ui.components.dialogs_list.b(new p4f(this, 22), 21)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final void v0(FragmentImpl fragmentImpl) {
        super.v0(fragmentImpl);
        NewsEntriesContainer newsEntriesContainer = this.g0;
        NewsEntriesContainer.Info info = newsEntriesContainer != null ? newsEntriesContainer.b : null;
        if (info == null) {
            return;
        }
        List<NewsEntry> list = newsEntriesContainer != null ? newsEntriesContainer.c : null;
        if (list == null) {
            return;
        }
        NewsEntriesContainer newsEntriesContainer2 = new NewsEntriesContainer(info, list);
        q1n q1nVar = (q1n) this.l0.getValue();
        DiscoverId discoverId = this.e0;
        q1nVar.getClass();
        n1n.e(discoverId, newsEntriesContainer2);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final boolean w() {
        return !this.q0;
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<f2c0<x960>> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new n20(new h5n(this, z, cVar, 0), 22), new f60(new i5n(z, this, 0), 24));
        this.o0.b(subscribe);
        this.d0.eo(subscribe);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter, xsna.dqp
    public final MobileOfficialAppsCoreNavStat$EventScreen x0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.f2n
    public final void yg() {
        NewsEntriesContainer newsEntriesContainer = this.g0;
        NewsEntriesContainer.Info info = newsEntriesContainer != null ? newsEntriesContainer.b : null;
        if (info == null) {
            return;
        }
        List<NewsEntry> list = newsEntriesContainer != null ? newsEntriesContainer.c : null;
        if (list == null) {
            return;
        }
        q1n q1nVar = (q1n) this.l0.getValue();
        DiscoverId discoverId = this.e0;
        q1nVar.getClass();
        n1n.d(discoverId, info, list);
    }

    @Override // com.vk.newsfeed.impl.presenters.EntriesListPresenter
    public final com.vk.lists.c z() {
        c.h hVar = new c.h(this);
        hVar.c = 25;
        hVar.s = this.u0;
        hVar.t = v();
        hVar.l = false;
        hVar.q = false;
        hVar.x = false;
        hVar.r = new jcg(this, 12);
        return this.d0.fn(hVar);
    }

    @Override // xsna.dw60
    public final void nd(boolean z) {
    }
}
