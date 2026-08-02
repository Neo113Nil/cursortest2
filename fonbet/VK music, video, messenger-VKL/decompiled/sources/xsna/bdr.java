package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: FilterItemHolder.kt */
/* loaded from: classes16.dex */
public final class bdr extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ cdr b;

    public bdr(cdr cdrVar) {
        this.b = cdrVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.b.itemView.performClick();
        return true;
    }
}
