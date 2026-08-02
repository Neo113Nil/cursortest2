package xsna;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DisableRecyclerView.kt */
/* loaded from: classes17.dex */
public class b0n extends RecyclerView implements c0n {
    public boolean b;
    public boolean c;

    public final boolean a() {
        return this.b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.c && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.c) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (mnh0.m(motionEvent)) {
                this.b = true;
            } else if (mnh0.r(motionEvent)) {
                this.b = false;
            }
            if (onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    public final void setInTouch(boolean z) {
        this.b = z;
    }

    @Override // xsna.c0n
    public void setTouchEnabled(boolean z) {
        this.c = z;
    }
}
