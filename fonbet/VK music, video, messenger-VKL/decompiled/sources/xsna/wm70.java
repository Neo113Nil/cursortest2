package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: NullLayer.java */
/* loaded from: classes12.dex */
public final class wm70 extends com.airbnb.lottie.model.layer.a {
    @Override // com.airbnb.lottie.model.layer.a, xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        super.g(rectF, matrix, z);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void k(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
    }
}
