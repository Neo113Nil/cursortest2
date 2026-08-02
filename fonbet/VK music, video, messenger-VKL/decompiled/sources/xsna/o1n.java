package xsna;

import com.vk.feed.core.models.cache.CachedNewsEntry;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import java.util.List;
import xsna.r1n;

/* compiled from: DiscoverCacheImpl.kt */
/* loaded from: classes.dex */
public final class o1n extends n1n {
    @Override // xsna.n1n
    public final r1n a(NewsEntriesContainer newsEntriesContainer, boolean z) {
        boolean isEmpty = newsEntriesContainer.getItems().isEmpty();
        if (!isEmpty && z) {
            return r1n.c.a;
        }
        if (isEmpty) {
            return r1n.a.a;
        }
        if (newsEntriesContainer.zb().Ab() <= s200.w()) {
            return r1n.b.a;
        }
        NewsEntriesContainer.Info zb = newsEntriesContainer.zb();
        if (zb.Ab() > s200.w()) {
            if (s200.A(zb.Ab(), zb.Db(), zb.Bb(), zb.Cb())) {
                return r1n.c.a;
            }
        }
        return r1n.b.a;
    }

    @Override // xsna.n1n
    public final io.reactivex.rxjava3.core.q<w960> c(io.reactivex.rxjava3.core.q<List<CachedNewsEntry>> qVar) {
        return qVar.U(new bk1(new nk(19), 13));
    }
}
