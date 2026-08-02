package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import xsna.p52;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class quw implements GestureDetector.OnGestureListener {
    public final /* synthetic */ ruw b;

    public quw(ruw ruwVar) {
        this.b = ruwVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ruw ruwVar = this.b;
        p52.k kVar = ruwVar.a;
        if (!ruwVar.c) {
            int i = ruwVar.b;
            if (i == 1) {
                if (Math.abs(f) > Math.abs(f2)) {
                    p52.this.getFocusOwner().g(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : 2, false);
                    s3q0 s3q0Var = s3q0.a;
                    return true;
                }
            } else if (i == 2 && Math.abs(f2) > Math.abs(f)) {
                p52.this.getFocusOwner().g(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : 2, false);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
