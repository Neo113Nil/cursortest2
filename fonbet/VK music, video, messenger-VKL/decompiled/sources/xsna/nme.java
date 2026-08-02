package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import java.util.List;
import java.util.Map;

/* compiled from: ClipsNegativeFeedbackAnalyticsHelper.kt */
/* loaded from: classes17.dex */
public final class nme {
    public final ClipFeedTab a;
    public final ki0 b;

    public nme(ClipFeedTab clipFeedTab, ki0 ki0Var) {
        this.a = clipFeedTab;
        this.b = ki0Var;
    }

    public static void a(MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype eventSubtype, SchemeStat$TypeClipViewerItem.EventType eventType, SchemeStat$TypeClipViewerItem.ScreenType screenType, SdkVideoFile sdkVideoFile) {
        new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem(sdkVideoFile.I0().b, sdkVideoFile.o0(), eventSubtype, sdkVideoFile.r()), null, null, null, null, null, null, null, null, 1071644668, null)).q();
    }

    public final void b(SdkVideoFile sdkVideoFile) {
        ki0 ki0Var;
        SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
        Map<AdStatPixel.Type, List<AdStatPixel>> f6 = sdkClipVideoFile != null ? sdkClipVideoFile.f6() : null;
        if (f6 == null || f6.isEmpty() || (ki0Var = this.b) == null) {
            return;
        }
        ki0Var.m(f6);
    }
}
