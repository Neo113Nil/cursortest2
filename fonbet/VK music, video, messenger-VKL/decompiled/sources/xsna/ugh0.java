package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: ScrollTouchDetector.kt */
/* loaded from: classes18.dex */
public final class ugh0 {
    public final int a;
    public Float b;
    public Float c;

    public ugh0() {
        Context context = e43.a;
        this.a = ViewConfiguration.get(context == null ? null : context).getScaledTouchSlop();
    }

    public final boolean a(MotionEvent motionEvent) {
        Float f;
        Float f2 = this.b;
        Float f3 = this.c;
        if (f2 == null || f3 == null) {
            f = null;
        } else {
            float floatValue = f2.floatValue() - motionEvent.getRawX();
            float floatValue2 = f3.floatValue() - motionEvent.getRawY();
            f = Float.valueOf((float) Math.sqrt((floatValue2 * floatValue2) + (floatValue * floatValue)));
        }
        return f != null && f.floatValue() > ((float) this.a);
    }
}
