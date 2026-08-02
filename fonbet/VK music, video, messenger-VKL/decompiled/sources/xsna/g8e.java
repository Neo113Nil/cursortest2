package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkNewsMonotheme;
import com.vkontakte.android.R;
import xsna.mih0;

/* compiled from: ClipsFeedNewsMonothemeBadgesMapper.kt */
/* loaded from: classes17.dex */
public final class g8e {
    public final ClipFeedTab a;
    public final yof b;

    public g8e(ClipFeedTab clipFeedTab, yof yofVar) {
        this.a = clipFeedTab;
        this.b = yofVar;
    }

    public final mih0.k a(SdkClipVideoFile sdkClipVideoFile) {
        SdkNewsMonotheme v1 = sdkClipVideoFile.v1();
        if (v1 == null || (this.a instanceof ClipFeedTab.NewsMonotheme) || !this.b.t().a) {
            return null;
        }
        return new mih0.k(tq.h(tlo0.Companion, R.string.clips_badge_news_monotheme_title), null, false, v1.b, v1.c, false, false);
    }
}
