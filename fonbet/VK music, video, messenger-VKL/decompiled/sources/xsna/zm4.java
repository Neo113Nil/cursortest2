package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import xsna.gp6;
import xsna.ym4;

/* compiled from: AudioEditingScroller.kt */
/* loaded from: classes18.dex */
public final class zm4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ym4 b;
    public final /* synthetic */ l6n0 c;

    public zm4(ym4 ym4Var, l6n0 l6n0Var) {
        this.b = ym4Var;
        this.c = l6n0Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (((Boolean) this.c.invoke()).booleanValue()) {
            ym4 ym4Var = this.b;
            if (ym4.a(ym4Var, motionEvent)) {
                ym4Var.d = 0;
                mwo0 mwo0Var = ym4Var.a;
                ywo0 ywo0Var = mwo0Var.d;
                oy4 e = ywo0Var.e();
                if (e != null) {
                    int d = (int) ywo0Var.r.d(e.b);
                    int d2 = (int) ywo0Var.r.d(e.g - e.getDuration());
                    boolean z = d == 0 && f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    boolean z2 = d == d2 && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !z && !z2) {
                        ym4Var.e(ym4.a.FLING);
                        ym4Var.h.fling(d, 0, -((int) f), 0, 0, d2, 0, 0);
                        mwo0Var.a();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!((Boolean) this.c.invoke()).booleanValue()) {
            return false;
        }
        ym4 ym4Var = this.b;
        if (!ym4.a(ym4Var, motionEvent)) {
            return false;
        }
        int i = (int) f;
        if (ym4Var.c == ym4.a.FLING) {
            ym4Var.h.forceFinished(true);
        }
        boolean d = ym4Var.d(i);
        ym4Var.e(d ? ym4.a.TOUCH_SCROLL : ym4.a.IDLE);
        return d;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Long l;
        ym4 ym4Var = this.b;
        mwo0 mwo0Var = ym4Var.a;
        oy4 e = mwo0Var.d.e();
        if (e == null || (l = e.q) == null) {
            return false;
        }
        long longValue = l.longValue();
        if (!ym4Var.b(motionEvent)) {
            return false;
        }
        ywo0 ywo0Var = mwo0Var.d;
        long j = longValue - e.b;
        ywo0Var.getClass();
        if (!ywo0.j(e, j)) {
            return true;
        }
        rwo0 rwo0Var = mwo0Var.j;
        if (rwo0Var != null) {
            rwo0Var.i(gp6.a.a(e), e.b, e.c);
        }
        mwo0Var.a();
        rwo0 rwo0Var2 = mwo0Var.j;
        if (rwo0Var2 == null) {
            return true;
        }
        rwo0Var2.e();
        return true;
    }
}
