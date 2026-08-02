package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: UnFave.kt */
/* loaded from: classes2.dex */
public final class i2q0 extends h6s0 {
    public static final i2q0 c = new i2q0(VideoBottomSheetOptions.UNFAVE.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (!hg10.h(s6s0Var) && s6s0Var.a.X()) {
            return new e520(this.b, lan.a(s6s0Var) ? R.drawable.vk_icon_delete_clock_outline_28 : R.drawable.vk_icon_clock_outline_28, R.string.video_watch_later_delete, this.b, false, 0, 0, false, null, 0, null, false, 8176);
        }
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        Context context;
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.UNFAVE);
        }
        if (s6s0Var.f) {
            dhr0.a.getClass();
            int i = dhr0.u().c;
            context = new l7s(activity, dhr0.u().c);
        } else {
            context = activity;
        }
        hfs0 hfs0Var = s6s0Var.w;
        if (hfs0Var != null) {
            xrk.a(hfs0Var, videoFile, new DiscoveryAction.m(DiscoveryAction.EventSource.ACTION_MENU), s6s0Var.b(), s6s0Var.u);
        }
        g7s0.X(fxc0.B(), context, s6s0Var.a, s6s0Var.b, s6s0Var.i, null, null, 48);
    }
}
