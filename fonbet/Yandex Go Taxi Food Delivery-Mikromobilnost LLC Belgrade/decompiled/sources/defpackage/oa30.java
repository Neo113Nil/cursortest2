package defpackage;

import android.view.MotionEvent;

/* loaded from: classes10.dex */
public final class oa30 {
    public static final oa30 a = new oa30();

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040;
    }
}
