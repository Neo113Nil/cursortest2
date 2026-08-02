package xsna;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MoveGestureDetector.kt */
/* loaded from: classes17.dex */
public final class lc30 {
    public final Object a;
    public float b;
    public float c;
    public int d;
    public long e = -1;
    public int f;

    /* compiled from: MoveGestureDetector.kt */
    public static final class a {
    }

    /* compiled from: MoveGestureDetector.kt */
    public interface b {
        void b(float f, float f2);
    }

    public lc30(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, xsna.lc30$b] */
    public final void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i = 0;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (action == 0) {
            this.d = motionEvent.getPointerCount();
            int pointerCount = motionEvent.getPointerCount();
            float f2 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                f2 += motionEvent.getX(i2);
            }
            this.b = f2 / pointerCount;
            int pointerCount2 = motionEvent.getPointerCount();
            while (i < pointerCount2) {
                f += motionEvent.getY(i);
                i++;
            }
            this.c = f / pointerCount2;
            this.e = System.currentTimeMillis();
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
        while (i < pointerCount4) {
            f += motionEvent.getY(i);
            i++;
        }
        float f5 = f / pointerCount4;
        int pointerCount5 = motionEvent.getPointerCount();
        if (System.currentTimeMillis() - this.e > this.f && this.d == pointerCount5) {
            this.a.b(f4 - this.b, f5 - this.c);
        }
        this.b = f4;
        this.c = f5;
        this.d = pointerCount5;
    }
}
