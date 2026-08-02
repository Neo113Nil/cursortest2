package xsna;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R$dimen;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: MaterialSideContainerBackHelper.java */
/* loaded from: classes13.dex */
public final class sm10 extends ml10<View> {
    public final float g;
    public final float h;
    public final float i;

    public sm10(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(R$dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f, int i, boolean z) {
        float interpolation = this.a.getInterpolation(f);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        V v = this.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i, v.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = v.getWidth();
        int height = v.getHeight();
        float f2 = width;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f3 = height;
            if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            float f4 = this.g / f2;
            float f5 = this.h / f2;
            float f6 = this.i / f3;
            if (z2) {
                f2 = 0.0f;
            }
            v.setPivotX(f2);
            if (!z3) {
                f5 = -f4;
            }
            float a = rq2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, interpolation);
            float f7 = a + 1.0f;
            v.setScaleX(f7);
            float a2 = 1.0f - rq2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f6, interpolation);
            v.setScaleY(a2);
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(z2 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z3 ? 1.0f - a : 1.0f;
                    float f9 = a2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (f7 / a2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}
