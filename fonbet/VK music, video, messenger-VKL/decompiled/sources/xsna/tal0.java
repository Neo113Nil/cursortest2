package xsna;

import android.animation.ValueAnimator;

/* compiled from: Stickers.kt */
/* loaded from: classes15.dex */
public final class tal0 {
    public static final void a(float f, nov novVar) {
        ValueAnimator duration = ValueAnimator.ofFloat(novVar.getCommons().c(), f).setDuration(300L);
        duration.setInterpolator(qq2.f);
        duration.addUpdateListener(new lrb0(novVar, 4));
        duration.start();
    }
}
