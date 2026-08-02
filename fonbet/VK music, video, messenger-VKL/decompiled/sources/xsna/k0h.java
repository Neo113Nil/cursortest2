package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.List;
import xsna.hb60;

/* compiled from: CommunityCreationOnboardingWatcher.kt */
/* loaded from: classes4.dex */
public final class k0h implements hb60.a {
    public final a4r a;
    public final wja b;
    public boolean c;

    public k0h(a4r a4rVar, wja wjaVar) {
        this.a = a4rVar;
        this.b = wjaVar;
    }

    @Override // xsna.hb60.a
    public final long a() {
        return 500L;
    }

    @Override // xsna.hb60.a
    public final void b(NewsEntry newsEntry, List<? extends qi6<?>> list) {
        if (newsEntry instanceof Post) {
            this.a.i(new tx(7, list, this));
        }
    }

    @Override // xsna.hb60.a
    public final void dispose() {
    }
}
