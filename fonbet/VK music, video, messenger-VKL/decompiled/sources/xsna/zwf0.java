package xsna;

import android.app.Activity;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDraftClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;

/* compiled from: RemoveFromCommunity.kt */
/* loaded from: classes2.dex */
public final class zwf0 extends h6s0 {
    public static final zwf0 c = new zwf0(VideoBottomSheetOptions.REMOVE_FROM_COMMUNITY.ordinal());

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r17.d.b < 0) goto L15;
     */
    @Override // xsna.h6s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e520 a(s6s0 s6s0Var) {
        boolean z;
        int i = BuildInfo.q() ? R.string.video_remove : R.string.video_remove_from_community;
        if (s6s0Var.a.t0()) {
            z = true;
            if (!hg10.j(s6s0Var, true)) {
            }
        }
        z = false;
        hg10.g(s6s0Var);
        if (!z || !hg10.m(s6s0Var)) {
            return null;
        }
        int i2 = this.b;
        return new e520(i2, R.drawable.vk_icon_delete_outline_android_28, i, i2, false, R.color.vk_red, 0, false, null, 0, null, false, 8144);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (BuildInfo.q() && videoFile.Z1()) {
            UiTracker uiTracker = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoDraftClick(MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.DELETE_DRAFT, MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventSubtype.DRAFT), 2)).q();
        }
        if (hg10.g(s6s0Var) && videoFile.k1() > 0) {
            UiTracker uiTracker2 = UiTracker.a;
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick(MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventType.DELETE_POSTPONED, null, MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventSubtype.POSTPONED, 2, null), 2)).q();
        }
        boolean m = hg10.m(s6s0Var);
        int i = m ? R.string.video_alert_title : R.string.delete_clip_confirm;
        int i2 = BuildInfo.q() ? m ? R.string.video_confirm_remove_from_channel : R.string.delete_clip_confirm_message : R.string.video_confirm_remove_from_community;
        Integer valueOf = Integer.valueOf(i);
        k78 k78Var = s6s0Var.e;
        bfs0.c(activity, valueOf, i2, k78Var != null ? new l78(k78Var) : null, new h24(activity, s6s0Var, y6s0Var, 3));
    }
}
