package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ClipsFeedAnalyticRefHolder.kt */
/* loaded from: classes17.dex */
public final class z5e {
    public final ClipFeedTab a;

    public z5e(ClipFeedTab clipFeedTab) {
        this.a = clipFeedTab;
    }

    public final String a() {
        ClipFeedTab clipFeedTab = this.a;
        if (clipFeedTab.Db()) {
            return com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.SHOPS_FEED_CLIPS);
        }
        return (((clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) && ((ClipFeedTab.SingleClipFromBlock) clipFeedTab).d == ClipFeedTab.SingleClipFromBlock.SourceBlockType.RETENTION) || (clipFeedTab instanceof ClipFeedTab.ClipsFromTrendsSource)) ? com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TAB_TRENDS) : clipFeedTab instanceof ClipFeedTab.NewsMonotheme ? com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MONOTOPIC) : com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS);
    }
}
