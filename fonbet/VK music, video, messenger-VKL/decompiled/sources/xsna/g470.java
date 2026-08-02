package xsna;

import android.content.Context;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: NoSwipesConstraintLayout.kt */
/* loaded from: classes16.dex */
public final class g470 extends ConstraintLayout {
    public final double t;
    public float u;
    public float v;

    public g470(Context context) {
        super(context);
        this.t = 0.05d;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent != null ? motionEvent.getX() : 0.0f;
        float y = motionEvent != null ? motionEvent.getY() : 0.0f;
        double width = getWidth() * this.t;
        double d = x;
        requestDisallowInterceptTouchEvent(d < width || d > ((double) getWidth()) - width || Math.abs(this.u - x) / ((float) 2) > Math.abs(this.v - y));
        if ((motionEvent == null || motionEvent.getAction() != 1) && (motionEvent == null || motionEvent.getAction() != 3)) {
            this.u = x;
            this.v = y;
        } else {
            this.u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
