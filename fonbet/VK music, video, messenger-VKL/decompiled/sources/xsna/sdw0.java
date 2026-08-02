package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;

/* compiled from: VoipAnimatorHelper.kt */
/* loaded from: classes7.dex */
public final class sdw0 {
    public static void a(View view, Float f, Float f2, Float f3, Float f4, Float f5, boolean z) {
        if (!z) {
            if (f != null) {
                view.setTranslationX(f.floatValue());
            }
            view.setTranslationY(f2.floatValue());
            if (f3 != null) {
                view.setScaleX(f3.floatValue());
            }
            if (f4 != null) {
                view.setScaleY(f4.floatValue());
            }
            if (f5 != null) {
                view.setRotation(f5.floatValue());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (f3 != null && Math.abs(f3.floatValue() - view.getScaleX()) > 0.001d) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f3.floatValue());
            ofFloat.setDuration(250L);
            arrayList.add(ofFloat);
        }
        if (f4 != null && Math.abs(f4.floatValue() - view.getScaleY()) > 0.001d) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f4.floatValue());
            ofFloat2.setDuration(250L);
            arrayList.add(ofFloat2);
        }
        if (f != null && Math.abs(f.floatValue() - view.getTranslationX()) > 0.01d) {
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationX", f.floatValue());
            ofFloat3.setDuration(250L);
            arrayList.add(ofFloat3);
        }
        if (Math.abs(f2.floatValue() - view.getTranslationY()) > 0.01d) {
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", f2.floatValue());
            ofFloat4.setDuration(250L);
            arrayList.add(ofFloat4);
        }
        if (f5 != null && Math.abs(f5.floatValue() - view.getRotation()) > 0.1d) {
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "rotation", f5.floatValue());
            ofFloat5.setDuration(250L);
            arrayList.add(ofFloat5);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new rdw0());
        animatorSet.start();
    }
}
