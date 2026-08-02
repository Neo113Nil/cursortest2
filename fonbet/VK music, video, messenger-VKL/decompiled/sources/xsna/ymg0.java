package xsna;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RotationGestureDetector.kt */
/* loaded from: classes17.dex */
public final class ymg0 {
    public final Object a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f = -1;
    public int g = -1;
    public float h;

    /* compiled from: RotationGestureDetector.kt */
    public interface a {
        void a(float f, float f2, float f3);

        void c();
    }

    public ymg0(a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, xsna.ymg0$a] */
    public final void a(MotionEvent motionEvent) {
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f = motionEvent.getPointerId(motionEvent.getActionIndex());
            return;
        }
        if (actionMasked == 1) {
            this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f = -1;
            return;
        }
        ?? r4 = this.a;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.f = -1;
                this.g = -1;
                return;
            } else {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                    this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.g = -1;
                    r4.c();
                    return;
                }
                this.g = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.d = motionEvent.getX(motionEvent.findPointerIndex(this.f));
                this.e = motionEvent.getY(motionEvent.findPointerIndex(this.f));
                this.b = motionEvent.getX(motionEvent.findPointerIndex(this.g));
                this.c = motionEvent.getY(motionEvent.findPointerIndex(this.g));
                return;
            }
        }
        int i = this.f;
        if (i == -1 || this.g == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0 || findPointerIndex >= motionEvent.getPointerCount()) {
            return;
        }
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        if (motionEvent.getPointerCount() > 1) {
            float x2 = motionEvent.getX(motionEvent.findPointerIndex(this.g));
            float y2 = motionEvent.getY(motionEvent.findPointerIndex(this.g));
            PointF pointF = new PointF(this.b, this.c);
            PointF pointF2 = new PointF(this.d, this.e);
            PointF pointF3 = new PointF(x2, y2);
            PointF pointF4 = new PointF(x, y);
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(pointF.y - pointF2.y, pointF.x - pointF2.x)) - ((float) Math.atan2(pointF3.y - pointF4.y, pointF3.x - pointF4.x)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            float f = this.h;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f2 = x + x2;
                float f3 = 2;
                r4.a(degrees - f, f2 / f3, (y + y2) / f3);
            }
            this.h = degrees;
        }
    }
}
