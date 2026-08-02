package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DiscoverMediaSkeletonPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class s4n extends de {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new cj4(16));

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final /* bridge */ /* synthetic */ String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, NewsEntry newsEntry) {
        DiscoverNewsEntriesRepository discoverNewsEntriesRepository = DiscoverNewsEntriesRepository.a;
        DiscoverId a = m3n.a();
        return ((n1n) this.b.getValue()).b(a).L(new dg1(new frg(a, 9), 17), false).U(new nb(new ire(newsEntry, 13), 13));
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
