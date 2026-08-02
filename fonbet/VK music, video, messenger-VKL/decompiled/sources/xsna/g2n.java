package xsna;

import com.ironsource.InterfaceC4319fe;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.TextDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.community.CommunityMediaDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.community.CommunityMediaGeoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DiscoverGridHoldersFactory.kt */
/* loaded from: classes4.dex */
public final class g2n {
    public static int a(NewsEntry newsEntry, DiscoverGridItem discoverGridItem) {
        if (newsEntry.d) {
            return 1204;
        }
        if (discoverGridItem instanceof VideoDiscoverGridItem) {
            VideoDiscoverGridItem videoDiscoverGridItem = (VideoDiscoverGridItem) discoverGridItem;
            VideoRestriction O = videoDiscoverGridItem.j.k.O();
            if (O != null && O.d) {
                return 1205;
            }
            if (videoDiscoverGridItem.k) {
                return 1207;
            }
            return InterfaceC4319fe.a.c;
        }
        if (discoverGridItem instanceof PhotoDiscoverGridItem) {
            PhotoRestriction photoRestriction = ((PhotoDiscoverGridItem) discoverGridItem).j.l.L;
            if (photoRestriction == null || !photoRestriction.d) {
                return InterfaceC4319fe.a.e;
            }
            return 1205;
        }
        if (discoverGridItem instanceof TextDiscoverGridItem) {
            return InterfaceC4319fe.a.g;
        }
        if (!(discoverGridItem instanceof CommunityMediaDiscoverGridItem)) {
            return discoverGridItem instanceof CommunityMediaGeoDiscoverGridItem ? 1209 : -1;
        }
        CommunityMediaDiscoverGridItem.RestrictionState restrictionState = ((CommunityMediaDiscoverGridItem) discoverGridItem).p;
        if (restrictionState instanceof CommunityMediaDiscoverGridItem.RestrictionState.None) {
            return 1208;
        }
        if ((restrictionState instanceof CommunityMediaDiscoverGridItem.RestrictionState.Blocked) || (restrictionState instanceof CommunityMediaDiscoverGridItem.RestrictionState.Blurred)) {
            return InterfaceC4319fe.a.j;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DiscoverGridHoldersFactory.kt */
    public static final class a extends uc6<DiscoverGridItem> {
        @Override // xsna.uc6
        public final void U6(DiscoverGridItem discoverGridItem) {
        }
    }
}
