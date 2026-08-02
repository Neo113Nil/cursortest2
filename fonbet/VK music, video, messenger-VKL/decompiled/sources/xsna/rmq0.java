package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.CommonProfileStat$ContentType;

/* compiled from: UserProfileContentAnalyticsDelegate.kt */
/* loaded from: classes5.dex */
public final class rmq0 {
    public final lyd0 a;

    public rmq0(lyd0 lyd0Var) {
        this.a = lyd0Var;
    }

    public static CommonProfileStat$ContentType a(CommunityProfileContentItem communityProfileContentItem) {
        if (communityProfileContentItem instanceof b9x0) {
            return CommonProfileStat$ContentType.WALL;
        }
        if (communityProfileContentItem instanceof hg3) {
            return CommonProfileStat$ContentType.ARCHIVE_WALL;
        }
        if (communityProfileContentItem instanceof fq3) {
            return CommonProfileStat$ContentType.ARTICLES;
        }
        if (communityProfileContentItem instanceof j15) {
            return CommonProfileStat$ContentType.MUSIC;
        }
        if (communityProfileContentItem instanceof Clips) {
            return CommonProfileStat$ContentType.CLIPS;
        }
        if (communityProfileContentItem instanceof uu50) {
            return CommonProfileStat$ContentType.NARRATIVE;
        }
        if (communityProfileContentItem instanceof iea0) {
            return CommonProfileStat$ContentType.PHOTO;
        }
        if (communityProfileContentItem instanceof sst0) {
            return CommonProfileStat$ContentType.VIDEO;
        }
        if (communityProfileContentItem instanceof mzt) {
            return CommonProfileStat$ContentType.GIFTS;
        }
        return null;
    }
}
