package xsna;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MoveGestureDetector.kt */
/* loaded from: classes4.dex */
public final class nc30 {
    public float a;
    public float b;
    public int c;
    public long d = -1;
    public Object e;

    /* compiled from: MoveGestureDetector.kt */
    public interface a {
        void b(float f, float f2);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, xsna.nc30$a] */
    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (action == 0) {
            this.c = motionEvent.getPointerCount();
            int pointerCount = motionEvent.getPointerCount();
            float f2 = 0.0f;
            for (int i = 0; i < pointerCount; i++) {
                f2 += motionEvent.getX(i);
            }
            this.a = f2 / pointerCount;
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount2; i2++) {
                f += motionEvent.getY(i2);
            }
            this.b = f / pointerCount2;
            this.d = System.currentTimeMillis();
            return;
        }
        if (action != 2) {
            return;
        }
        int pointerCount3 = motionEvent.getPointerCount();
        float f3 = 0.0f;
        for (int i3 = 0; i3 < pointerCount3; i3++) {
            f3 += motionEvent.getX(i3);
        }
        float f4 = f3 / pointerCount3;
        int pointerCount4 = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount4; i4++) {
            f += motionEvent.getY(i4);
        }
        float f5 = f / pointerCount4;
        int pointerCount5 = motionEvent.getPointerCount();
        ?? r0 = this.e;
        if (r0 != 0 && System.currentTimeMillis() - this.d > 0 && this.c == pointerCount5) {
            r0.b(f4 - this.a, f5 - this.b);
        }
        this.a = f4;
        this.b = f5;
        this.c = pointerCount5;
    }
}
