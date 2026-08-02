package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;

/* compiled from: PostingHorizontalScrollView.kt */
/* loaded from: classes18.dex */
public final class yfc0 extends HorizontalScrollView {
    public e00 b;
    public final GestureDetector c;

    /* compiled from: PostingHorizontalScrollView.kt */
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        public final int b;

        public a(Context context) {
            this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float abs = Math.abs(f2);
            return abs > Math.abs(f) && abs > ((float) this.b);
        }
    }

    public yfc0(Context context) {
        super(context, null, 0);
        this.c = new GestureDetector(context, new a(context));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = motionEvent != null ? this.c.onTouchEvent(motionEvent) : false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!onTouchEvent);
        }
        if (!onTouchEvent && motionEvent != null && motionEvent.getAction() == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
            e00 e00Var = this.b;
            if (e00Var != null) {
                e00Var.a(motionEvent);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setActionDownListener(e00 e00Var) {
        this.b = e00Var;
    }
}
