package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;

/* compiled from: Fave.kt */
/* loaded from: classes2.dex */
public final class hmq extends h6s0 {
    public static final hmq c = new hmq(VideoBottomSheetOptions.FAVE.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        boolean g = hg10.g(s6s0Var);
        VideoFile videoFile = s6s0Var.a;
        if (g || hg10.h(s6s0Var) || !hg10.n(s6s0Var) || videoFile.X()) {
            return null;
        }
        if (!videoFile.J8() && o25.a().b()) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_clock_outline_28, R.string.video_watch_later, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        Context context;
        s60 s60Var = s6s0Var.o;
        VideoFile videoFile = s6s0Var.a;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.FAVE);
        }
        if (s6s0Var.f) {
            dhr0.a.getClass();
            int i = dhr0.u().c;
            context = new l7s(activity, dhr0.u().c);
        } else {
            context = activity;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_ACTION_AFTER_LOGIN;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            o25.a().getClass();
        } else {
            o25.a().getClass();
        }
        hfs0 hfs0Var = s6s0Var.w;
        if (hfs0Var != null) {
            xrk.a(hfs0Var, videoFile, new DiscoveryAction.m(DiscoveryAction.EventSource.ACTION_MENU), s6s0Var.b(), s6s0Var.u);
        }
        g7s0.X(fxc0.B(), context, s6s0Var.a, s6s0Var.b, s6s0Var.i, null, null, 48);
        s3q0 s3q0Var = s3q0.a;
    }
}
