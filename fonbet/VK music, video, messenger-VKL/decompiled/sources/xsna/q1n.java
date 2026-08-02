package xsna;

import com.vk.feed.core.models.cache.CachedNewsEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.r1n;

/* compiled from: DiscoverCacheV2Impl.kt */
/* loaded from: classes4.dex */
public final class q1n extends n1n {
    public static final long c = TimeUnit.HOURS.toSeconds(3);
    public final y2n a;
    public final o1n b = new o1n();

    public q1n(y2n y2nVar) {
        this.a = y2nVar;
    }

    @Override // xsna.n1n
    public final r1n a(NewsEntriesContainer newsEntriesContainer, boolean z) {
        boolean isEmpty = newsEntriesContainer.c.isEmpty();
        return (isEmpty || !z) ? isEmpty ? r1n.a.a : f(newsEntriesContainer.b) : r1n.c.a;
    }

    @Override // xsna.n1n
    public final io.reactivex.rxjava3.core.q<w960> c(io.reactivex.rxjava3.core.q<List<CachedNewsEntry>> qVar) {
        return qVar.L(new h7(new s6k(this, 6), 18), false);
    }

    public final r1n f(NewsEntriesContainer.Info info) {
        long j = info.f;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a.getClass();
        NewsEntriesContainer.NewsPageCacheConfig newsPageCacheConfig = info.m;
        long millis = timeUnit.toMillis(newsPageCacheConfig != null ? newsPageCacheConfig.b : c);
        long currentTimeMillis = System.currentTimeMillis() - j;
        return currentTimeMillis < 0 ? r1n.b.a : currentTimeMillis < millis ? r1n.c.a : r1n.b.a;
    }
}
