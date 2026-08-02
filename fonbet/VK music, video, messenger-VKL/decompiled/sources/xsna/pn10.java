package xsna;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.api.ui.VideoResizer;

/* compiled from: MatrixPositionAnimator.kt */
/* loaded from: classes3.dex */
public final class pn10 extends ValueAnimator {
    public /* synthetic */ pn10(Rect rect, Rect rect2, VideoResizer.VideoFitType videoFitType, int i, Rect rect3, VideoResizer.VideoFitType videoFitType2, int i2, boolean z, tn10 tn10Var, int i3) {
        this(rect, rect2, videoFitType, i, rect3, videoFitType2, i2, z, tn10Var);
    }

    public pn10(Rect rect, Rect rect2, VideoResizer.VideoFitType videoFitType, int i, Rect rect3, VideoResizer.VideoFitType videoFitType2, int i2, boolean z, tn10 tn10Var) {
        if (z) {
            setFloatValues(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            setFloatValues(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        }
        rn10 rn10Var = new rn10(rect, rect2, videoFitType, i, rect3, videoFitType2, i2, tn10Var);
        addUpdateListener(new lbd(rn10Var, 1));
        addListener(new on10(tn10Var, rn10Var));
    }
}
