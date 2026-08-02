package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.api.data.discover.a;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.p1n;
import xsna.r1n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6n implements izs {
    public final /* synthetic */ n1n b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ DiscoverId d;
    public final /* synthetic */ DiscoverCustomIntent e;
    public final /* synthetic */ m6o0 f;
    public final /* synthetic */ bwq g;

    public /* synthetic */ f6n(n1n n1nVar, boolean z, DiscoverId discoverId, DiscoverCustomIntent discoverCustomIntent, m6o0 m6o0Var, bwq bwqVar) {
        this.b = n1nVar;
        this.c = z;
        this.d = discoverId;
        this.e = discoverCustomIntent;
        this.f = m6o0Var;
        this.g = bwqVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj;
        boolean z = this.b.a(newsEntriesContainer, this.c) instanceof r1n.c;
        DiscoverId discoverId = this.d;
        if (z && m6n.b(discoverId, newsEntriesContainer)) {
            return io.reactivex.rxjava3.core.q.T(new ovz(newsEntriesContainer)).a0(asu0.a.d());
        }
        DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) this.f.b;
        vrk0 vrk0Var = DiscoverNewsEntriesRepository.f;
        r1n.c cVar = r1n.c.a;
        com.vk.newsfeed.api.data.discover.a aVar = newsEntriesContainer.b.o;
        vrk0Var.getClass();
        mx6 b = DiscoverNewsEntriesRepository.b(discoverNewsEntriesRepository, discoverId, this.e, new krk0(true, mobileOfficialAppsCoreNavStat$EventScreen, aVar instanceof a.b ? p1n.c.a : p1n.b.a), 8);
        b.M0(this.g);
        return b.b;
    }
}
