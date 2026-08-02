package xsna;

import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BaseAnimationDialogCallback.kt */
/* loaded from: classes2.dex */
public abstract class c56 implements io2 {
    @Override // xsna.io2
    public final boolean G() {
        View f = f();
        if (f != null && f.isAttachedToWindow()) {
            int[] iArr = new int[2];
            f.getLocationOnScreen(iArr);
            if (iArr[0] != 0 || iArr[1] != 0) {
                return true;
            }
        }
        return false;
    }

    public abstract View f();

    @Override // xsna.io2
    public final boolean f0() {
        return true;
    }

    @Override // xsna.io2
    public final Rect g0() {
        View f = f();
        return f == null ? new Rect() : !f.isAttachedToWindow() ? new Rect() : w11.d(f);
    }

    @Override // xsna.io2
    public float i0() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.io2
    public final Rect t0() {
        View f = f();
        if (f == null) {
            return new Rect();
        }
        if (!f.isAttachedToWindow()) {
            return new Rect();
        }
        int[] iArr = new int[2];
        f.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], (int) Math.rint((f.getScaleX() * f.getWidth()) + r2), (int) Math.rint((f.getScaleY() * f.getHeight()) + r1));
    }
}
