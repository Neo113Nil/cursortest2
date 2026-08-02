package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: NewsfeedInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class dm60 implements izs {
    public final /* synthetic */ NewsEntry b;

    public dm60(NewsEntry newsEntry) {
        this.b = newsEntry;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NewsEntry newsEntry = this.b;
        newsEntry.d = false;
        return newsEntry;
    }
}
