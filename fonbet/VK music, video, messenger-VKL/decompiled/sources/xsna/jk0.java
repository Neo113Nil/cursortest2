package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: Add.kt */
/* loaded from: classes2.dex */
public final class jk0 extends h6s0 {
    public static final jk0 c = new jk0(VideoBottomSheetOptions.ADD.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        boolean z = videoFile.i9() && !videoFile.j0();
        if (fxc0.B().J().Q0() || !z || !hg10.o(s6s0Var) || hg10.a(s6s0Var) || hg10.h(s6s0Var) || !videoFile.J8()) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_add_outline_28, R.string.video_add_to_added, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.ADD);
        }
        hfs0 hfs0Var = s6s0Var.w;
        if (hfs0Var != null) {
            xrk.a(hfs0Var, videoFile, new DiscoveryAction.a(DiscoveryAction.EventSource.ACTION_MENU), s6s0Var.b(), s6s0Var.u);
        }
        g7s0 B = fxc0.B();
        String str = s6s0Var.b;
        int i = g7s0.G7;
        B.l0(activity, videoFile, str, null);
    }
}
