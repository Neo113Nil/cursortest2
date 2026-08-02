package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: SwipeTouchListenerFactory.kt */
/* loaded from: classes16.dex */
public final class nmn0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ omn0 b;

    public nmn0(omn0 omn0Var) {
        this.b = omn0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
            int i = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2 : 1;
            omn0 omn0Var = this.b;
            omn0Var.a.invoke();
            omn0Var.b.invoke(Integer.valueOf(i));
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }
}
