package xsna;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: ChangeScroll.java */
/* loaded from: classes12.dex */
public final class usa extends vlp0 {
    public static final String[] b = {"android:changeScroll:x", "android:changeScroll:y"};

    public static void a(gnp0 gnp0Var) {
        HashMap hashMap = gnp0Var.a;
        View view = gnp0Var.b;
        hashMap.put("android:changeScroll:x", Integer.valueOf(view.getScrollX()));
        gnp0Var.a.put("android:changeScroll:y", Integer.valueOf(view.getScrollY()));
    }

    @Override // xsna.vlp0
    public final void captureEndValues(gnp0 gnp0Var) {
        a(gnp0Var);
    }

    @Override // xsna.vlp0
    public final void captureStartValues(gnp0 gnp0Var) {
        a(gnp0Var);
    }

    @Override // xsna.vlp0
    public final Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (gnp0Var == null) {
            return null;
        }
        HashMap hashMap = gnp0Var.a;
        if (gnp0Var2 == null) {
            return null;
        }
        HashMap hashMap2 = gnp0Var2.a;
        View view = gnp0Var2.b;
        int intValue = ((Integer) hashMap.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) hashMap2.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) hashMap.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) hashMap2.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return enp0.b(objectAnimator, objectAnimator2);
    }

    @Override // xsna.vlp0
    public final String[] getTransitionProperties() {
        return b;
    }

    @Override // xsna.vlp0
    public final boolean isSeekingSupported() {
        return true;
    }
}
