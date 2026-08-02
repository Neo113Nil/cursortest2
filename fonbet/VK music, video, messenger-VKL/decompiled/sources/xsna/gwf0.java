package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: Remove.kt */
/* loaded from: classes2.dex */
public final class gwf0 extends h6s0 {
    public static final gwf0 c = new gwf0(VideoBottomSheetOptions.REMOVE.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (hg10.g(s6s0Var) || s6s0Var.k) {
            return null;
        }
        if (epx.f(s6s0Var.b, "VOIP_CALL_RECORDINGS")) {
            int i = this.b;
            return new e520(i, R.drawable.vk_icon_delete_outline_android_28, R.string.video_remove, i, false, R.color.vk_red, 0, false, null, 0, null, false, 8144);
        }
        if (hg10.m(s6s0Var) && (videoFile.j0() || (videoFile.t0() && hg10.j(s6s0Var, false)))) {
            return new e520(this.b, lan.a(s6s0Var) ? R.drawable.vk_icon_delete_outline_28 : R.drawable.vk_icon_delete_outline_android_28, R.string.video_remove_from_added, this.b, false, lan.a(s6s0Var) ? R.color.vk_red : 0, lan.a(s6s0Var) ? R.color.vk_red : 0, false, null, 0, null, false, 8080);
        }
        if (!videoFile.F4().j() || !o25.a().a(videoFile.I0())) {
            return null;
        }
        int i2 = this.b;
        return new e520(i2, R.drawable.vk_icon_delete_outline_android_28, R.string.video_remove, i2, false, R.color.vk_red, 0, false, null, 0, null, false, 8144);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.REMOVE);
        }
        hfs0 hfs0Var = s6s0Var.w;
        if (hfs0Var != null) {
            xrk.a(hfs0Var, videoFile, new DiscoveryAction.a(DiscoveryAction.EventSource.ACTION_MENU), s6s0Var.b(), s6s0Var.u);
        }
        Integer valueOf = Integer.valueOf(R.string.video_alert_title);
        k78 k78Var = s6s0Var.e;
        bfs0.c(activity, valueOf, R.string.video_confirm_remove, k78Var != null ? new l78(k78Var) : null, new fw00(activity, s6s0Var, y6s0Var, 3));
    }
}
