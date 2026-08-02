package xsna;

import android.app.Activity;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;

/* compiled from: CreateClipFromVideo.kt */
/* loaded from: classes2.dex */
public final class k7k extends h6s0 {
    public static final k7k c = new k7k(VideoBottomSheetOptions.CREATE_CLIP_FROM_VIDEO.ordinal());
    public static final bpn0 d = new bpn0(new pr1(14));

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        if (kk0.c.a(s6s0Var) != null) {
            return null;
        }
        gpt0 gpt0Var = gpt0.a;
        if (gpt0.B(s6s0Var.a)) {
            return (e520) d.getValue();
        }
        return null;
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.CREATE_CLIP_FROM_VIDEO);
        }
        fxc0.B().M(activity, videoFile);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k7k);
    }

    public final int hashCode() {
        return -632715314;
    }

    public final String toString() {
        return "CreateClipFromVideo";
    }
}
