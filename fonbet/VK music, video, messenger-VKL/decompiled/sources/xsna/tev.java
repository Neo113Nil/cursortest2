package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;

/* compiled from: HorizontalOrientationHelper.kt */
/* loaded from: classes2.dex */
public final class tev implements vy80 {
    public static final tev a = new tev();
    public static final int[] b = {0, 0};
    public static final Rect c = new Rect();

    @Override // xsna.vy80
    public final float a(View view) {
        if (view == null || !view.isAttachedToWindow()) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        try {
            view.getGlobalVisibleRect(c);
            return view.getWidth() == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Math.min(1.0f, r1.width() / (view.getWidth() * view.getScaleX()));
        } catch (Throwable th) {
            L.i(th);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // xsna.vy80
    public final int b(RecyclerView recyclerView, View view) {
        if (view != null && view.isAttachedToWindow()) {
            try {
                int[] iArr = b;
                recyclerView.getLocationOnScreen(iArr);
                int i = iArr[0];
                int width = recyclerView.getWidth() + i;
                view.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                return Math.abs((i2 + (((view.getWidth() + i2) - i2) / 2)) - (i + ((width - i) / 2)));
            } catch (Throwable th) {
                L.i(th);
            }
        }
        return -1;
    }

    @Override // xsna.vy80
    public final boolean c(RecyclerView recyclerView) {
        return !recyclerView.canScrollHorizontally(1);
    }

    @Override // xsna.vy80
    public final boolean d(RecyclerView recyclerView) {
        return !recyclerView.canScrollHorizontally(-1);
    }
}
