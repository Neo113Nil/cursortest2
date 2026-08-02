package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wj5 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ wj5(FrameLayout frameLayout, int i) {
        this.b = i;
        this.c = frameLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                    this.c.getChildAt(0).dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return ((y9n) this.c).e.onTouch(view, motionEvent);
        }
    }
}
