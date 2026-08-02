package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: NoSwipesLinearLayout.kt */
/* loaded from: classes16.dex */
public final class h470 extends LinearLayout {
    public final double b;
    public float c;
    public float d;

    public h470(Context context) {
        super(context);
        this.b = 0.05d;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent != null ? motionEvent.getX() : 0.0f;
        float y = motionEvent != null ? motionEvent.getY() : 0.0f;
        double width = getWidth() * this.b;
        double d = x;
        requestDisallowInterceptTouchEvent(d < width || d > ((double) getWidth()) - width || Math.abs(this.c - x) / ((float) 2) > Math.abs(this.d - y));
        if ((motionEvent == null || motionEvent.getAction() != 1) && (motionEvent == null || motionEvent.getAction() != 3)) {
            this.c = x;
            this.d = y;
        } else {
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
