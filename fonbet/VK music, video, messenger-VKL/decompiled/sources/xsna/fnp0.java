package xsna;

import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TransitionUtils.java */
/* loaded from: classes13.dex */
public final class fnp0 {
    public static final RectF a = new RectF();

    public static View a(int i, View view) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(fo8.a(resourceName, " is not a valid ancestor"));
    }

    public static RectF b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    public static float c(float f, float f2, float f3) {
        return u11.b(f2, f, f3, f);
    }

    public static float d(float f, float f2, float f3, float f4, float f5, boolean z) {
        return (!z || (f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : c(f, f2, (f5 - f3) / (f4 - f3)) : c(f, f2, f5);
    }

    public static int e(float f, float f2, float f3, int i, int i2) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) c(i, i2, (f3 - f) / (f2 - f));
    }
}
