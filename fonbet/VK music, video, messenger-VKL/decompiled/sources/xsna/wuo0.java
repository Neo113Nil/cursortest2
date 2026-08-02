package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: TimePickerView.java */
/* loaded from: classes13.dex */
public final class wuo0 implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector b;

    public wuo0(GestureDetector gestureDetector) {
        this.b = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.b.onTouchEvent(motionEvent);
        }
        return false;
    }
}
