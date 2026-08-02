package xsna;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PostingRoundingUtils.kt */
/* loaded from: classes4.dex */
public final class hlc0 {
    public static final void a(Path path, View view, float[] fArr, u0u0 u0u0Var) {
        float a;
        float f;
        float f2;
        float f3;
        path.reset();
        if (u0u0Var != null) {
            int paddingTop = ((ViewGroup) view.getParent()).getPaddingTop();
            int paddingLeft = ((ViewGroup) view.getParent()).getPaddingLeft();
            f3 = u0u0Var.b + paddingLeft;
            a = u0u0Var.c + paddingTop;
            f = paddingLeft + u0u0Var.d;
            f2 = paddingTop + u0u0Var.e;
        } else {
            float scaleX = view.getScaleX();
            float width = view.getWidth() * scaleX;
            float height = view.getHeight() * view.getScaleY();
            float f4 = 2;
            float translationX = view.getTranslationX() + view.getLeft() + ((view.getWidth() - width) / f4);
            a = wq.a(view.getHeight(), height, f4, view.getTranslationY() + view.getTop());
            f = translationX + width;
            f2 = height + a;
            f3 = translationX;
        }
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || a != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            path.addRoundRect(new RectF(f3, a, f, f2), fArr, Path.Direction.CW);
        }
        path.close();
    }
}
