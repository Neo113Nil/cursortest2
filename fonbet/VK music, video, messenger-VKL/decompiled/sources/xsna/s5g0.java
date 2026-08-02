package xsna;

import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: ReportRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class s5g0 implements r5g0 {
    public NewsEntry a;
    public NewsEntry b;

    @Override // xsna.r5g0
    public final NewsEntry a(Integer num) {
        NewsEntry newsEntry = this.b;
        if (newsEntry == null) {
            return null;
        }
        if (num.intValue() == newsEntry.hashCode()) {
            return newsEntry;
        }
        return null;
    }

    @Override // xsna.r5g0
    public final void b(NewsEntry newsEntry) {
        this.b = newsEntry;
    }

    @Override // xsna.r5g0
    public final NewsEntry c(Integer num) {
        NewsEntry newsEntry = this.a;
        if (newsEntry != null) {
            int hashCode = newsEntry.hashCode();
            if (num != null && num.intValue() == hashCode) {
                return newsEntry;
            }
        }
        return null;
    }

    @Override // xsna.r5g0
    public final void clear() {
        this.a = null;
        this.b = null;
    }

    @Override // xsna.r5g0
    public final void d(NewsEntry newsEntry) {
        this.a = newsEntry;
    }
}
