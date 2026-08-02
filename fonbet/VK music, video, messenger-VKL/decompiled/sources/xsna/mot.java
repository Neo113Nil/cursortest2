package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import xsna.u9k0;

/* compiled from: GestureListener.java */
/* loaded from: classes4.dex */
public final class mot extends GestureDetector.SimpleOnGestureListener {
    public final ViewConfiguration b;
    public u9k0.b c;

    public mot(Context context) {
        this.b = ViewConfiguration.get(context);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(@NonNull MotionEvent motionEvent, @NonNull MotionEvent motionEvent2, float f, float f2) {
        try {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(f) > this.b.getScaledMinimumFlingVelocity()) {
                if (x > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    u9k0.b bVar = this.c;
                    if (bVar != null) {
                        return bVar.b();
                    }
                } else {
                    u9k0.b bVar2 = this.c;
                    if (bVar2 != null) {
                        return bVar2.a();
                    }
                }
            }
            return false;
        } catch (Exception e) {
            L.g("error on swipe ", e);
            return false;
        }
    }
}
