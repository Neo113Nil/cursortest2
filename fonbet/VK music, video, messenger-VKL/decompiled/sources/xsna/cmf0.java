package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import xsna.ikv0;

/* compiled from: RedesignUtils.kt */
/* loaded from: classes6.dex */
public final class cmf0 {
    public static final cmf0 a = new cmf0();

    public static AnimatorSet a(View view) {
        return b(view, 0L);
    }

    public static AnimatorSet b(View view, long j) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.9f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.9f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(200L);
        animatorSet.setStartDelay(j);
        animatorSet.setupStartValues();
        return animatorSet;
    }

    public static void d(Context context, Window window, String str, boolean z, int i, boolean z2) {
        long j = z ? 7000L : 4000L;
        if (z2) {
            context = bwt0.u(context);
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.e = j;
        aVar.o = Integer.valueOf(i);
        if (window != null) {
            aVar.p(window);
        } else {
            aVar.n();
        }
    }

    public static void e(Context context, Window window, String str, int i) {
        d(context, window, str, false, iah0.a(88), true);
    }

    public final void c(Context context, Window window, int i) {
        d(context, window, context.getString(i), false, (48 & 16) != 0 ? iah0.a(88) : 0, (48 & 32) != 0);
    }
}
