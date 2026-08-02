package yads;

import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.epx;

/* loaded from: classes10.dex */
public final class e63 extends FrameLayout {
    public final SurfaceView a;
    public float b;
    public jk1 c;
    public li d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ik1 a = this.c.a(i, i2);
        super.onMeasure(a.a, a.b);
        li liVar = this.d;
        if (liVar != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = measuredWidth;
            float f2 = measuredHeight;
            float f3 = liVar.a;
            if ((f3 / (f / f2)) - 1 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                measuredHeight = (int) (f / f3);
            } else {
                measuredWidth = (int) (f2 * f3);
            }
            liVar.b.a = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            liVar.b.b = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            ik1 ik1Var = liVar.b;
            if (ik1Var == null) {
                return;
            }
            this.a.measure(ik1Var.a, ik1Var.b);
        }
    }

    public final void setAspectRatio(float f) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == this.b) {
            return;
        }
        this.b = f;
        this.d = new li(f, new ik1());
        this.c = new pl2(f);
        requestLayout();
    }

    public final void setPlayer(nj3 nj3Var) {
        if (epx.f(null, nj3Var) || nj3Var == null || !nj3Var.a()) {
            return;
        }
        nj3Var.setVideoSurfaceView(this.a);
    }
}
