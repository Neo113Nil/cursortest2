package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes12.dex */
public final class hvq0 {
    public static ValueAnimator a(View view, long j, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new wd2(view, 12));
        return ofFloat;
    }
}
