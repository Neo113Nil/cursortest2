package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.ui.SubsShowBlocker;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import java.util.LinkedHashSet;

/* compiled from: SubsVisibilityController.kt */
/* loaded from: classes3.dex */
public final class yum0 {
    public final View a;
    public final LinkedHashSet b = new LinkedHashSet();

    public yum0(NoStyleSubtitleView noStyleSubtitleView) {
        this.a = noStyleSubtitleView;
    }

    public static void a(yum0 yum0Var, SubsShowBlocker subsShowBlocker) {
        yum0Var.b.remove(subsShowBlocker);
        yum0Var.b(true);
    }

    public final void b(boolean z) {
        boolean isEmpty = this.b.isEmpty();
        View view = this.a;
        if (isEmpty) {
            if (z) {
                d3m.c(this.a, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            } else {
                bwt0.p0(view, true);
                return;
            }
        }
        if (z) {
            d3m.e(this.a, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        } else {
            bwt0.p0(view, false);
        }
    }
}
