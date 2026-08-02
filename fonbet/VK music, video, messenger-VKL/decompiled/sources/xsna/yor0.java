package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: VerticalScrollGestureListener.kt */
/* loaded from: classes4.dex */
public final class yor0 extends GestureDetector.SimpleOnGestureListener {
    public final int b;

    public yor0(Context context) {
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float abs = Math.abs(f2);
        return abs > Math.abs(f) && abs > ((float) this.b);
    }
}
