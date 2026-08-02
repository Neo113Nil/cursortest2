package xsna;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: SubtitlesTouchDelegate.kt */
/* loaded from: classes17.dex */
public final class n1n0 implements View.OnTouchListener {
    public final /* synthetic */ o1n0 b;

    public n1n0(o1n0 o1n0Var) {
        this.b = o1n0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        o1n0 o1n0Var = this.b;
        if (action == 0) {
            return o1n0Var.b.contains(motionEvent.getX(), motionEvent.getY());
        }
        if (action != 1 || !o1n0Var.b.contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        view.performClick();
        View.OnClickListener onClickListener = o1n0Var.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        return true;
    }
}
