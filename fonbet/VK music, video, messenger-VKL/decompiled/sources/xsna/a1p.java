package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;

/* compiled from: EditPublicationDate.kt */
/* loaded from: classes2.dex */
public final class a1p extends h6s0 {
    public static final a1p c = new a1p(VideoBottomSheetOptions.EDIT_PUBLICATION_DATE.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        if (!videoFile.t0() || !hg10.o(s6s0Var) || videoFile.k1() <= 0) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_clock_outline_28, R.string.video_edit_publication_date, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        fxc0.B().H(activity, s6s0Var.a, s6s0Var.c, new com.vk.movika.sdk.base.ui.s(8, y6s0Var, s6s0Var));
    }
}
