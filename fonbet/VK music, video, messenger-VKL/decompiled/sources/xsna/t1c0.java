package xsna;

import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1c0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        DiscoverGridItem discoverGridItem = (DiscoverGridItem) obj;
        return (discoverGridItem instanceof VideoDiscoverGridItem) && ((VideoDiscoverGridItem) discoverGridItem).j.j;
    }
}
