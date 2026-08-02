package xsna;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RotationGestureDetector.java */
/* loaded from: classes17.dex */
public final class zmg0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final b h;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public int e = -1;
    public int f = -1;

    /* compiled from: RotationGestureDetector.java */
    public interface b {
        void a(float f, float f2, float f3);

        void c();
    }

    public zmg0(b bVar) {
        this.h = bVar;
    }

    public final void a(MotionEvent motionEvent) {
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.e = motionEvent.getPointerId(motionEvent.getActionIndex());
            return;
        }
        if (actionMasked == 1) {
            this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.e = -1;
            return;
        }
        b bVar = this.h;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.e = -1;
                this.f = -1;
                return;
            } else {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                    this.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.f = -1;
                    bVar.c();
                    return;
                }
                this.f = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.c = motionEvent.getX(motionEvent.findPointerIndex(this.e));
                this.d = motionEvent.getY(motionEvent.findPointerIndex(this.e));
                this.a = motionEvent.getX(motionEvent.findPointerIndex(this.f));
                this.b = motionEvent.getY(motionEvent.findPointerIndex(this.f));
                return;
            }
        }
        int i = this.e;
        if (i == -1 || this.f == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0 || findPointerIndex >= motionEvent.getPointerCount()) {
            return;
        }
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        if (motionEvent.getPointerCount() > 1) {
            float x2 = motionEvent.getX(motionEvent.findPointerIndex(this.f));
            float y2 = motionEvent.getY(motionEvent.findPointerIndex(this.f));
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.b - this.d, this.a - this.c)) - ((float) Math.atan2(y2 - y, x2 - x)))) % 360.0f;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            float f = this.g;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                bVar.a(degrees - f, (x + x2) / 2.0f, (y + y2) / 2.0f);
            }
            this.g = degrees;
        }
    }

    /* compiled from: RotationGestureDetector.java */
    public static class a implements b {
        @Override // xsna.zmg0.b
        public final void c() {
        }
    }
}
