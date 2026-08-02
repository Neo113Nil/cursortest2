package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.ui.VideoPlayerAdsPanel;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DonutDelegate.kt */
/* loaded from: classes14.dex */
public final class kzn {
    public final DonutVideoComponent a;
    public final xqt0 b;

    public kzn(DonutVideoComponent donutVideoComponent, xqt0 xqt0Var, View.OnClickListener onClickListener) {
        this.a = donutVideoComponent;
        this.b = xqt0Var;
        DonutBadge donutBadge = xqt0Var.E;
        bwt0.h0(onClickListener, donutBadge);
        donutBadge.setTag("donut_badge_tag");
    }

    public final void a(dzn dznVar) {
        VideoFile videoFile;
        FrameLayout frameLayout;
        Integer num;
        VideoResizer.VideoFitType videoFitType;
        Integer num2 = dznVar.d;
        if (dznVar.f || (videoFile = dznVar.a) == null || !e5o.a(videoFile)) {
            return;
        }
        xqt0 xqt0Var = this.b;
        DonutBadge donutBadge = xqt0Var.E;
        DonutBadge donutBadge2 = xqt0Var.E;
        if (donutBadge.getVisibility() != 0 || (frameLayout = dznVar.b) == null || (num = dznVar.c) == null || num2 == null) {
            return;
        }
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int[] iArr = new int[2];
        int i = akp0.$EnumSwitchMapping$0[dznVar.e.ordinal()];
        if (i == 1) {
            videoFitType = VideoResizer.VideoFitType.FIT;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            videoFitType = VideoResizer.VideoFitType.CROP;
        }
        VideoResizer.a.c(iArr, videoFitType, frameLayout.getWidth(), frameLayout.getHeight(), intValue, intValue2);
        donutBadge2.setTranslationX((frameLayout.getWidth() - iArr[0]) / 2.0f);
        donutBadge2.setTranslationY(-((frameLayout.getHeight() - iArr[1]) / 2.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (xsna.e5o.a(r5) == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(VideoFile videoFile, boolean z) {
        boolean z2;
        if (this.a.J().a() && !z && videoFile != null) {
            z2 = true;
        }
        z2 = false;
        xqt0 xqt0Var = this.b;
        xqt0Var.E.setVisibility(z2 ? 0 : 8);
        xqt0Var.z.setVisibility(!z2 ? 0 : 8);
        VideoPlayerAdsPanel videoPlayerAdsPanel = xqt0Var.I;
        if (videoPlayerAdsPanel != null) {
            videoPlayerAdsPanel.setVisibility(z2 ? 8 : 0);
        }
    }
}
