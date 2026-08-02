package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mko0 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mko0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((GestureDetector) ((oko0) obj).d.getValue()).onTouchEvent(motionEvent);
            default:
                hix0 hix0Var = (hix0) obj;
                int i2 = hix0.l1;
                int action = motionEvent.getAction();
                if (action == 0) {
                    hix0Var.j1 = true;
                } else if (action == 1 || action == 3) {
                    hix0Var.j1 = false;
                }
                return true;
        }
    }
}
