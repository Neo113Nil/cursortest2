package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: SaveToGallery.kt */
/* loaded from: classes2.dex */
public final class f1h0 extends h6s0 {
    public static final f1h0 c;
    public static final e520 d;

    static {
        int ordinal = VideoBottomSheetOptions.SAVE_TO_GALLERY.ordinal();
        c = new f1h0(ordinal);
        d = new e520(ordinal, R.drawable.vk_icon_download_outline_28, R.string.video_save_to_gallery, ordinal, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        pkd f = g620.f();
        VideoFile videoFile = s6s0Var.a;
        if (!f.c(videoFile) && videoFile.F4().j() && s6s0Var.z) {
            return d;
        }
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(s6s0Var.a, VideoBottomSheetOptions.DOWNLOAD);
        }
        g7s0.e(fxc0.B(), activity, s6s0Var.a, s6s0Var.u, s6s0Var.f, null, 112);
    }
}
