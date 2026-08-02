package xsna;

import android.app.Activity;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoToClipAttach;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;

/* compiled from: AttachClips.kt */
/* loaded from: classes2.dex */
public final class b14 extends h6s0 {
    public static final b14 c = new b14(VideoBottomSheetOptions.ATTACH_CLIPS.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        boolean q = BuildInfo.q();
        boolean z = false;
        boolean z2 = fxc0.B().J().a2() && videoFile.T1();
        if (videoFile.t0() && hg10.o(s6s0Var) && hg10.m(s6s0Var)) {
            z = true;
        }
        if (!q || z2 || !z) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_clips_attach_outline_28, R.string.video_attach_clip, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(r10.o0()), Long.valueOf(s6s0Var.a.I0().b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoToClipAttach(MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventType.TRY_TO_ATTACH_CLIP, MobileOfficialAppsVideoStat$TypeVideoToClipAttach.EventSubtype.FROM_CHANNEL, null, 4, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, b, uzp0Var.a).q();
        fxc0.B().getClass();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b14);
    }

    public final int hashCode() {
        return 994576071;
    }

    public final String toString() {
        return "AttachClips";
    }
}
