package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: DominantColorRepositoryImplOld.kt */
@ozl
/* loaded from: classes14.dex */
public final class awn implements wvn {
    public io.reactivex.rxjava3.subjects.a<Integer> a;
    public NewsEntry b;

    @Override // xsna.wvn
    public final void a(int i, NewsEntry newsEntry) {
        this.b = newsEntry;
        if (this.a.N0()) {
            this.a = new io.reactivex.rxjava3.subjects.a<>();
        }
        this.a.onNext(Integer.valueOf(i));
        this.a.onComplete();
    }

    @Override // xsna.wvn
    public final io.reactivex.rxjava3.core.q<Integer> b(NewsEntry newsEntry) {
        if (!newsEntry.equals(this.b)) {
            this.a = new io.reactivex.rxjava3.subjects.a<>();
        }
        return this.a;
    }

    @Override // xsna.wvn
    public final void remove() {
    }
}
