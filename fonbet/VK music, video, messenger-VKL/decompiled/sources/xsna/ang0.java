package xsna;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RotationGestureDetector.kt */
/* loaded from: classes4.dex */
public final class ang0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public int e = -1;
    public int f = -1;
    public float g;
    public Object h;

    /* compiled from: RotationGestureDetector.kt */
    public interface a {
        void a(float f, float f2, float f3);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, xsna.ang0$a] */
    public final void a(MotionEvent motionEvent) {
        int findPointerIndex;
        ?? r1;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = motionEvent.getPointerId(motionEvent.getActionIndex());
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = this.e;
                if (i == -1 || this.f == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0 || findPointerIndex >= motionEvent.getPointerCount()) {
                    return;
                }
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                if (motionEvent.getPointerCount() > 1) {
                    float x2 = motionEvent.getX(motionEvent.findPointerIndex(this.f));
                    float y2 = motionEvent.getY(motionEvent.findPointerIndex(this.f));
                    float atan2 = (((((float) Math.atan2(this.b - this.d, this.a - this.c)) - ((float) Math.atan2(y - y2, x - x2))) * 180) / 3.1415927f) % 360.0f;
                    if (atan2 < -180.0f) {
                        atan2 += 360.0f;
                    }
                    if (atan2 > 180.0f) {
                        atan2 -= 360.0f;
                    }
                    float f = this.g;
                    if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (r1 = this.h) != 0) {
                        float f2 = x2 + x;
                        float f3 = 2;
                        r1.a(f - atan2, f2 / f3, (y2 + y) / f3);
                    }
                    this.g = atan2;
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                    this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    if (pointerId == this.e) {
                        this.e = -1;
                        return;
                    } else {
                        if (pointerId == this.f) {
                            this.f = -1;
                            return;
                        }
                        return;
                    }
                }
                int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (-1 == this.e) {
                    this.e = pointerId2;
                } else if (-1 == this.f) {
                    this.f = pointerId2;
                }
                if (this.f == -1) {
                    this.f = this.e;
                }
                this.a = motionEvent.getX(motionEvent.findPointerIndex(this.e));
                this.b = motionEvent.getY(motionEvent.findPointerIndex(this.e));
                this.c = motionEvent.getX(motionEvent.findPointerIndex(this.f));
                this.d = motionEvent.getY(motionEvent.findPointerIndex(this.f));
                return;
            }
        }
        this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = -1;
        this.f = -1;
    }
}
