package xsna;

import android.app.Activity;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.tracker.ScreenModeVideoStatMapper;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoReportButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;

/* compiled from: Report.kt */
/* loaded from: classes2.dex */
public final class v4g0 extends h6s0 {
    public static final v4g0 c = new v4g0(VideoBottomSheetOptions.REPORT.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        boolean Y0 = fxc0.B().J().Y0();
        VideoFile videoFile = s6s0Var.a;
        if ((videoFile instanceof MusicVideoFile) && !Y0) {
            return null;
        }
        boolean z = (hg10.n(s6s0Var) || hg10.k(s6s0Var)) && !fxc0.B().b0().e(s6s0Var.a);
        if (hg10.j(s6s0Var, true) || !z || videoFile.k1() != 0) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_report_outline_28, R.string.report_content, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        MobileOfficialAppsVideoStat$TypeScreenMode mobileOfficialAppsVideoStat$TypeScreenMode = (MobileOfficialAppsVideoStat$TypeScreenMode) new ScreenModeVideoStatMapper(rts0.b.a()).a(videoFile.o0(), videoFile.I0().b, new iq(25));
        if (mobileOfficialAppsVideoStat$TypeScreenMode != null) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoReportButtonClick(null, mobileOfficialAppsVideoStat$TypeScreenMode, 1, 0 == true ? 1 : 0), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b, uzp0Var.a).q();
        }
        fxc0.B().d0(activity, new sf4(20, s6s0Var, y6s0Var));
    }
}
