package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PagerOnTouchListener.kt */
/* loaded from: classes6.dex */
public final class ub90 extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public final g880 b;
    public final GestureDetector c;

    public ub90(Context context, g880 g880Var) {
        this.b = g880Var;
        this.c = new GestureDetector(context, this);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.b.invoke();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.c.onTouchEvent(motionEvent);
        return false;
    }
}
