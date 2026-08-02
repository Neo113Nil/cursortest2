package xsna;

import android.app.Activity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;

/* compiled from: HideAuthor.kt */
/* loaded from: classes2.dex */
public final class m3v extends h6s0 {
    public static final m3v c = new m3v(VideoBottomSheetOptions.HIDE_AUTHOR.ordinal());

    public static void e(long j) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), new MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick(MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType.HIDE_CREATOR_FROM_SUBSCRIPTIONS), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, b, uzp0Var.a).q();
    }

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        Boolean m3 = videoFile.m3();
        if (m3 == null) {
            return null;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_HIDE_CREATOR_FROM_SUBSCRIPTIONS;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures) || !videoFile.U() || !epx.f(s6s0Var.b, "video_subscriptions_creators") || m3.booleanValue()) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_hide_outline_24, R.string.video_hide_author, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        activity.getApplication();
        b25 s = ((BridgeComponent) m7m.e().a(fpf0.a(BridgeComponent.class))).s();
        VideoFile videoFile = s6s0Var.a;
        Owner s2 = videoFile.s();
        UserId userId = s2 != null ? s2.b : null;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.HIDE_AUTHOR);
        }
        if (!s.b() || userId == null) {
            return;
        }
        fxc0.B().getClass();
        e(userId.b);
    }
}
