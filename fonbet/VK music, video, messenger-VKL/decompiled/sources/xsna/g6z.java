package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: LikeAnimator.kt */
/* loaded from: classes17.dex */
public final class g6z {
    public static final Set<View> a = Collections.newSetFromMap(new WeakHashMap());

    public static AnimatorSet a(View view, Property property) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f).setDuration(0L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.8f).setDuration(170L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f).setDuration(170L));
        return animatorSet;
    }

    public static AnimatorSet b(View view, Property property, float f) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f).setDuration(0L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f).setDuration(75L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.91f).setDuration(140L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.03f).setDuration(165L), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f).setDuration(100L));
        return animatorSet;
    }

    public static void c(View view, View view2, boolean z, boolean z2, int i) {
        float f = (i & 16) != 0 ? 1.45f : 1.25f;
        Long l = (i & 32) != 0 ? null : 200L;
        view.setSelected(z);
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (l != null) {
                animatorSet.setDuration(l.longValue());
            }
            if (z) {
                animatorSet.playTogether(b(view2, View.SCALE_X, f), b(view2, View.SCALE_Y, f));
            } else {
                animatorSet.playTogether(a(view2, View.SCALE_X), a(view2, View.SCALE_Y));
            }
            Set<View> set = a;
            if (set.contains(view2)) {
                return;
            }
            animatorSet.addListener(new f6z(view2));
            animatorSet.start();
            set.add(view2);
        }
    }
}
