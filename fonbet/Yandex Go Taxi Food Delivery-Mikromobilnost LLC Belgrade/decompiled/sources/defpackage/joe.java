package defpackage;

import android.view.MotionEvent;
import androidx.customview.widget.a;

/* loaded from: classes11.dex */
public final class joe {
    public boolean a;
    public MotionEvent b;

    public final void a() {
        MotionEvent motionEvent = this.b;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.b = null;
    }

    public final void b(MotionEvent motionEvent, a aVar) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            MotionEvent motionEvent2 = this.b;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.b = MotionEvent.obtain(motionEvent);
        }
        if (actionMasked == 2 && this.a) {
            MotionEvent motionEvent3 = this.b;
            if (motionEvent3 != null) {
                aVar.s(motionEvent3);
                motionEvent3.recycle();
            }
            this.b = null;
        }
        this.a = actionMasked == 3;
    }

    public final void c(MotionEvent motionEvent) {
        this.a = motionEvent.getActionMasked() == 3;
    }
}
