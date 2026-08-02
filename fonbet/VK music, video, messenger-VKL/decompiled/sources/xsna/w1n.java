package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.dto.newsfeed.discover.DiscoverCategoryType;
import com.vk.newsfeed.impl.discover.repository.DiscoverNewsEntriesRepository;
import com.vk.newsfeed.impl.discover.repository.TemporaryCache;
import com.vkontakte.android.R;
import java.util.List;
import xsna.c63;

/* compiled from: DiscoverDataProvider.kt */
/* loaded from: classes.dex */
public final class w1n extends c63.b {
    public static final w1n b = new w1n();

    public static List E() {
        return e43.l(new DiscoverCategory("discover_media", m3n.b(), DiscoverCategoryType.DISCOVER_MEDIA, new DiscoverCategory.Ref("discover_media", "discover_media_post")), new DiscoverCategory("discover_category_trends/trends", y8g0.e(R.string.home_tabs_news), DiscoverCategoryType.DISCOVER_FULL, new DiscoverCategory.Ref("discover_category_trends", "discover_category_trends_post")));
    }

    public final synchronized void D() {
        synchronized (DiscoverNewsEntriesRepository.a) {
            DiscoverNewsEntriesRepository.c.clear();
            DiscoverNewsEntriesRepository.b.clear();
            DiscoverNewsEntriesRepository.d.b.clear();
        }
    }

    @Override // xsna.c63.b
    public final void z(boolean z) {
        TemporaryCache temporaryCache = DiscoverNewsEntriesRepository.d;
        if (!z) {
            temporaryCache.c.set(true);
            return;
        }
        temporaryCache.getClass();
        Serializer.c<TemporaryCache> cVar = TemporaryCache.CREATOR;
        int i = 29;
        wmi0.a.h("discover_temp_keys").subscribe(new gl30(new xc50(temporaryCache, 27), i), new afs(new t9o0(0), i));
    }
}
