package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: ScrollGestureListener.kt */
/* loaded from: classes6.dex */
public final class kfh0 extends GestureDetector.SimpleOnGestureListener {
    public final int b;

    public kfh0(Context context) {
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float abs = Math.abs(f);
        return abs > Math.abs(f2) && abs > ((float) this.b);
    }
}
