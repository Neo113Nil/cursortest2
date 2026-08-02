package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import xsna.t9k0;

/* compiled from: GestureListener.kt */
/* loaded from: classes4.dex */
public final class lot extends GestureDetector.SimpleOnGestureListener {
    public final ViewConfiguration b;
    public t9k0.b c;

    public lot(Context context) {
        this.b = ViewConfiguration.get(context);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer valueOf;
        if (motionEvent != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(f) > this.b.getScaledMinimumFlingVelocity()) {
                if (x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    t9k0.b bVar = this.c;
                    if (bVar != null) {
                        t9k0 t9k0Var = t9k0.this;
                        Float a = t9k0Var.a(false);
                        valueOf = a != null ? Integer.valueOf((int) a.floatValue()) : null;
                        if (valueOf == null) {
                            return false;
                        }
                        t9k0Var.a.smoothScrollTo(valueOf.intValue(), 0);
                        return true;
                    }
                } else {
                    t9k0.b bVar2 = this.c;
                    if (bVar2 != null) {
                        t9k0 t9k0Var2 = t9k0.this;
                        Float a2 = t9k0Var2.a(true);
                        valueOf = a2 != null ? Integer.valueOf((int) a2.floatValue()) : null;
                        if (valueOf != null) {
                            t9k0Var2.a.smoothScrollTo(valueOf.intValue(), 0);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
