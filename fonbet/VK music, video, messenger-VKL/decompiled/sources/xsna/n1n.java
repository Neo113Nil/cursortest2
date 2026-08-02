package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.feed.core.models.cache.CachedNewsEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.newsfeed.impl.discover.repository.TemporaryCache;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: DiscoverCache.kt */
/* loaded from: classes.dex */
public abstract class n1n {
    public static void d(DiscoverId discoverId, NewsEntriesContainer.Info info, List list) {
        if (info.Cb()) {
            return;
        }
        info.Eb();
        e(discoverId, new NewsEntriesContainer(info, list));
    }

    public static void e(DiscoverId discoverId, NewsEntriesContainer newsEntriesContainer) {
        if (newsEntriesContainer.getItems().isEmpty()) {
            return;
        }
        DiscoverId discoverId2 = DiscoverId.i;
        String b = DiscoverId.a.b(discoverId, "info");
        String b2 = DiscoverId.a.b(discoverId, "items");
        wmi0 wmi0Var = wmi0.a;
        wmi0Var.a(b, NewsEntriesContainer.Info.zb(newsEntriesContainer.zb(), discoverId.i(), discoverId.f()));
        wmi0Var.m(b2, up2.t(newsEntriesContainer.getItems()));
        DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
        if (discoverId.g()) {
            TemporaryCache temporaryCache = DiscoverNewsEntriesRepository.d;
            temporaryCache.b.add(b);
            temporaryCache.b.add(b2);
            Serializer.c<TemporaryCache> cVar = TemporaryCache.CREATOR;
            wmi0Var.a("discover_temp_keys", temporaryCache);
        }
    }

    public abstract r1n a(NewsEntriesContainer newsEntriesContainer, boolean z);

    public final io.reactivex.rxjava3.internal.operators.observable.a b(DiscoverId discoverId) {
        io.reactivex.rxjava3.internal.operators.observable.m1 m1Var;
        DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
        if (discoverId.g() && DiscoverNewsEntriesRepository.d.c.compareAndSet(true, false)) {
            Serializer.c<TemporaryCache> cVar = TemporaryCache.CREATOR;
            itg0.m(wmi0.a.h("discover_temp_keys").U(new i630(new f6w(28), 14)));
            m1Var = io.reactivex.rxjava3.core.q.T(new NewsEntriesContainer(discoverId)).a0(asu0.a.d());
        } else {
            m1Var = null;
        }
        if (m1Var != null) {
            return m1Var;
        }
        DiscoverId discoverId2 = DiscoverId.i;
        String b = DiscoverId.a.b(discoverId, "info");
        wmi0 wmi0Var = wmi0.a;
        return m6n.c(io.reactivex.rxjava3.core.q.I0(new io.reactivex.rxjava3.internal.operators.observable.m2(wmi0Var.h(b), io.reactivex.rxjava3.core.q.T(new NewsEntriesContainer.Info(discoverId))), c(wmi0Var.e(DiscoverId.a.b(discoverId, "items"))), new t11(13)).y0(10000L, TimeUnit.MILLISECONDS), String.valueOf(discoverId.e()), new NewsEntriesContainer(discoverId));
    }

    public abstract io.reactivex.rxjava3.core.q<w960> c(io.reactivex.rxjava3.core.q<List<CachedNewsEntry>> qVar);
}
