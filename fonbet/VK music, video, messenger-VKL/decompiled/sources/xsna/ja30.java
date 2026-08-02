package xsna;

import android.view.MotionEvent;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class ja30 {
    public static final ja30 a = new ja30();

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if ((Float.floatToRawIntBits(rawX) & Integer.MAX_VALUE) >= 2139095040) {
            return false;
        }
        rawY = motionEvent.getRawY(i);
        return (Float.floatToRawIntBits(rawY) & Integer.MAX_VALUE) < 2139095040;
    }
}
