package xsna;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: StorySendMessageDialog.kt */
/* loaded from: classes6.dex */
public final class qcm0 implements View.OnTouchListener {
    public final /* synthetic */ tcm0 b;

    public qcm0(tcm0 tcm0Var) {
        this.b = tcm0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ycm0 ycm0Var = this.b.m;
        if (ycm0Var == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            ycm0Var.k = true;
        } else if (action == 1 || action == 3) {
            ycm0Var.k = false;
        }
        vu4 vu4Var = ycm0Var.e;
        if (vu4Var == null) {
            vu4Var = null;
        }
        return vu4Var.c1(motionEvent);
    }
}
