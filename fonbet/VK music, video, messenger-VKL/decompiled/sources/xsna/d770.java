package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;
import java.util.Locale;
import xsna.lgj0;

/* compiled from: NotInterested.kt */
/* loaded from: classes2.dex */
public final class d770 extends h6s0 {
    public static final d770 c = new d770(VideoBottomSheetOptions.NOT_INTERESTED.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        String str;
        VideoFile videoFile = s6s0Var.a;
        if (!hg10.j(s6s0Var, true)) {
            hg10.g(s6s0Var);
        }
        if (hg10.j(s6s0Var, true) || hg10.g(s6s0Var) || hg10.h(s6s0Var) || (str = s6s0Var.b) == null || str.equals("im") || videoFile.O9() || videoFile.j0() || hg10.u(s6s0Var) || fxc0.B().s().k(videoFile)) {
            return null;
        }
        if ((BuildInfo.q() && s6s0Var.r) || !s6s0Var.v || !videoFile.D5()) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_remove_circle_outline_28, R.string.video_not_interested, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        ContextWrapper contextWrapper;
        String name;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(s6s0Var.a, VideoBottomSheetOptions.NOT_INTERESTED);
        }
        VideoFile videoFile = s6s0Var.a;
        String str = null;
        if (hg10.g(s6s0Var)) {
            rsg0.y0(yfb.x(lgj0.a.m(videoFile.o0(), videoFile.I0(), null)), null, null, 3).subscribe(new wnt(new cqv(videoFile, 23), 14), new c120(new zb60(videoFile, 3), 12));
            return;
        }
        if (s6s0Var.f) {
            dhr0.a.getClass();
            int i = dhr0.u().c;
            contextWrapper = new l7s(activity, dhr0.u().c);
        } else {
            contextWrapper = activity;
        }
        boolean G = rl3.G(new String[]{"VIDEO_DISCOVERY", "VIDEO_PLAYLIST", "CATALOG"}, s6s0Var.p);
        VideoScreenMode videoScreenMode = s6s0Var.u;
        if (videoScreenMode != null && (name = videoScreenMode.name()) != null) {
            str = name.toLowerCase(Locale.ROOT);
        }
        fxc0.B().F(contextWrapper, videoFile, G, s6s0Var.i, str);
    }
}
