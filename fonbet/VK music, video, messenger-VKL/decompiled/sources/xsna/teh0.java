package xsna;

import android.annotation.SuppressLint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* compiled from: ScrollBlockingSwipeListener.kt */
/* loaded from: classes16.dex */
public final class teh0 implements View.OnTouchListener {
    public final GestureDetector b;
    public float c;
    public float d;
    public boolean e;

    public teh0(GestureDetector gestureDetector) {
        this.b = gestureDetector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        if (r1 != 3) goto L18;
     */
    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (Math.abs(motionEvent.getY() - this.d) > Math.abs(motionEvent.getX() - this.c)) {
                        this.e = false;
                    }
                }
            }
            this.e = false;
        } else {
            this.c = motionEvent.getX();
            this.d = motionEvent.getY();
            this.e = true;
        }
        this.b.onTouchEvent(motionEvent);
        if (view != null && (parent = view.getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(this.e);
        }
        return this.e;
    }
}
