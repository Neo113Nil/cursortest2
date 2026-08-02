package xsna;

import android.app.Activity;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDraftClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;

/* compiled from: Edit.kt */
/* loaded from: classes2.dex */
public final class uyo extends h6s0 {
    public static final uyo c = new uyo(VideoBottomSheetOptions.EDIT.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        boolean m = hg10.m(s6s0Var);
        if (!videoFile.t0() || ((fxc0.B().J().a2() && videoFile.T1()) || !hg10.o(s6s0Var) || !m)) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_edit_outline_28, R.string.video_edit, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        boolean g = hg10.g(s6s0Var);
        VideoFile videoFile = s6s0Var.a;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(g ? SchemeStat$EventItem.Type.CLIP : SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, null, null, 56, null), (BuildInfo.q() && videoFile.Z1()) ? new MobileOfficialAppsVideoStat$TypeVideoDraftClick(MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType.EDIT_DRAFT, MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventSubtype.DRAFT) : (BuildInfo.q() && g && videoFile.k1() > 0) ? new MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick(MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventType.EDIT_POSTPONED, null, MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventSubtype.POSTPONED, 2, null) : new MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick(MobileOfficialAppsVideoStat$TypeVideoAdditionalActionsClick.EventType.EDIT_VIDEO, null, 2, 0 == true ? 1 : 0), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, b, uzp0Var.a).q();
        if (!hg10.g(s6s0Var)) {
            fxc0.B().S(activity, videoFile);
        } else if (y6s0Var != null) {
            y6s0Var.b(VideoBottomSheetSideEffectOptions.EDIT, videoFile);
        }
    }
}
