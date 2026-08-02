package xsna;

import android.app.Activity;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ShareFeedback.kt */
/* loaded from: classes2.dex */
public final class n7j0 extends h6s0 implements w8i {
    public static final n7j0 c;
    public static final Object d;
    public static final e520 e;

    static {
        n7j0 n7j0Var = new n7j0(VideoBottomSheetOptions.FEEDBACK.ordinal());
        c = n7j0Var;
        d = msy.a(LazyThreadSafetyMode.NONE, new pm60(8));
        int i = n7j0Var.b;
        e = new e520(i, R.drawable.vk_icon_rate_outline_28, R.string.video_share_vk_video_feedback, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        boolean z = (s6s0Var.m == null || s6s0Var.n == null || s6s0Var.u != null) ? false : true;
        if (!s6s0Var.b() || z) {
            return null;
        }
        c.getClass();
        if (((u4r0) d.getValue()).b()) {
            return e;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        ((u4r0) d.getValue()).d(activity, s6s0Var.r ? UxPollEntryPointLocation.PlayerFullscreenMenu : s6s0Var.u == VideoScreenMode.PREVIEW ? UxPollEntryPointLocation.SimilarMenu : UxPollEntryPointLocation.PlayerDiscoveryMenu);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof n7j0);
    }

    public final int hashCode() {
        return 1965110573;
    }

    public final String toString() {
        return "ShareFeedback";
    }
}
