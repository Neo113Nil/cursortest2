package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import xsna.hb60;

/* compiled from: NewsfeedCarouselPrefetchWatcherCallback.kt */
/* loaded from: classes4.dex */
public final class td60 implements hb60.a {
    public final a4r a;

    public td60(a4r a4rVar) {
        this.a = a4rVar;
    }

    @Override // xsna.hb60.a
    public final long a() {
        return 300L;
    }

    @Override // xsna.hb60.a
    public final void b(NewsEntry newsEntry, List<? extends qi6<?>> list) {
        this.a.i(new kr50(list, 2));
    }

    @Override // xsna.hb60.a
    public final void dispose() {
    }
}
