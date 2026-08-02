package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import xsna.i9q0;

/* compiled from: MrcRepositoryImpl.kt */
/* loaded from: classes14.dex */
public final class mg30 implements lg30 {
    public final io.reactivex.rxjava3.subjects.f<i9q0> a = new io.reactivex.rxjava3.subjects.f<>();
    public NewsEntry b;

    @Override // xsna.lg30
    public final void a(NewsEntry newsEntry) {
        this.a.onNext(new i9q0.a(newsEntry));
        this.b = newsEntry;
    }

    @Override // xsna.lg30
    public final NewsEntry b() {
        return this.b;
    }

    @Override // xsna.lg30
    public final io.reactivex.rxjava3.subjects.f c() {
        return this.a;
    }

    @Override // xsna.lg30
    public final void d() {
        this.a.onNext(i9q0.b.a);
    }

    @Override // xsna.lg30
    public final void e() {
        this.b = null;
    }
}
