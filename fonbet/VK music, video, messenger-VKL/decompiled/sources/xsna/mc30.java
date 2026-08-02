package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MoveGestureDetector.java */
/* loaded from: classes17.dex */
public final class mc30 {
    public float a;
    public float b;
    public int c;
    public final View g;
    public long e = -1;
    public int f = 0;
    public int d = 0;

    /* compiled from: MoveGestureDetector.java */
    public interface a {
        void b(float f, float f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mc30(a aVar) {
        this.g = (View) aVar;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [android.view.View, xsna.mc30$a] */
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
            while (r2 < pointerCount2) {
                f += motionEvent.getY(r2);
                r2++;
            }
            this.b = f / pointerCount2;
            this.e = System.currentTimeMillis();
            return;
        }
        if (action != 2) {
            return;
        }
        int pointerCount3 = motionEvent.getPointerCount();
        float f3 = 0.0f;
        for (int i2 = 0; i2 < pointerCount3; i2++) {
            f3 += motionEvent.getX(i2);
        }
        float f4 = f3 / pointerCount3;
        int pointerCount4 = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount4; i3++) {
            f += motionEvent.getY(i3);
        }
        float f5 = f / pointerCount4;
        int pointerCount5 = motionEvent.getPointerCount();
        int i4 = this.d;
        r2 = (i4 == 0 || i4 == pointerCount5) ? 1 : 0;
        if (System.currentTimeMillis() - this.e > this.f && this.c == pointerCount5 && r2 != 0) {
            this.g.b(f4 - this.a, f5 - this.b);
        }
        this.a = f4;
        this.b = f5;
        this.c = pointerCount5;
    }
}
