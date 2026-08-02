package xsna;

import android.app.Activity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;

/* compiled from: PublishNow.kt */
/* loaded from: classes2.dex */
public final class cee0 extends h6s0 {
    public static final cee0 c = new cee0(VideoBottomSheetOptions.PUBLISH_NOW.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (!videoFile.t0() || !hg10.o(s6s0Var) || videoFile.k1() <= 0) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_arrow_up_circle_outline_28, R.string.video_publish_now, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        boolean g = hg10.g(s6s0Var);
        VideoFile videoFile = s6s0Var.a;
        long o0 = videoFile.o0();
        long j = videoFile.I0().b;
        SchemeStat$EventItem.Type type = g ? SchemeStat$EventItem.Type.CLIP : SchemeStat$EventItem.Type.VIDEO;
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, Long.valueOf(o0), Long.valueOf(j), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick(MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventType.PUBLISH_POSTPONED, null, MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventSubtype.POSTPONED, 2, null), 2)).q();
        w1s0.d(videoFile, 0, true, new fzp(y6s0Var, s6s0Var, g, activity));
    }
}
