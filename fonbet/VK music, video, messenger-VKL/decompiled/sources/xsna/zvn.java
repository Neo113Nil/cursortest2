package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.LinkedHashMap;

/* compiled from: DominantColorRepositoryImplNew.kt */
/* loaded from: classes14.dex */
public final class zvn implements wvn {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // xsna.wvn
    public final void a(int i, NewsEntry newsEntry) {
        ((io.reactivex.rxjava3.subjects.d) this.a.computeIfAbsent(newsEntry, new xvn(new qt(25)))).onNext(Integer.valueOf(i));
    }

    @Override // xsna.wvn
    public final io.reactivex.rxjava3.core.q<Integer> b(NewsEntry newsEntry) {
        return (io.reactivex.rxjava3.core.q) this.a.computeIfAbsent(newsEntry, new yvn(new ol(21)));
    }

    @Override // xsna.wvn
    public final void remove() {
        this.a.clear();
    }
}
