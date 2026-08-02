package xsna;

import com.vk.clips.upload.ui.api.entities.ClipsUploadAnalyticsInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipPublishItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.NoWhenBranchMatchedException;
import xsna.ajh0;

/* compiled from: ClipsUploadAnalytics.kt */
/* loaded from: classes17.dex */
public final class nbf {
    public final irk0 a;
    public ClipsUploadAnalyticsInfo b;

    public nbf(irk0 irk0Var) {
        this.a = irk0Var;
    }

    public final void a(ajh0 ajh0Var) {
        if (!(ajh0Var instanceof ajh0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsUploadAnalyticsInfo clipsUploadAnalyticsInfo = this.b;
        if (clipsUploadAnalyticsInfo == null) {
            return;
        }
        new kze(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PUBLISH, new MobileOfficialAppsClipsStat$TypeClipPublishItem(MobileOfficialAppsClipsStat$TypeClipPublishItem.EventType.SELECT_HASHTAG_TREND_HINT, new MobileOfficialAppsClipsStat$ClipsCreateContext(clipsUploadAnalyticsInfo.c, wrp.a(clipsUploadAnalyticsInfo.b)), null, null, null, null, null, null, null, null, null, 2044, null), this.a).q();
    }
}
