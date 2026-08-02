package xsna;

import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/* compiled from: PostingHorizontalScrollView.kt */
@ozl
/* loaded from: classes18.dex */
public final class zfc0 extends HorizontalScrollView {
    public f00 b;

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        f00 f00Var;
        if (motionEvent != null && motionEvent.getAction() == 0 && (f00Var = this.b) != null) {
            f00Var.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setActionDownListener(f00 f00Var) {
        this.b = f00Var;
    }
}
