package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;
import xsna.cec;

/* compiled from: CircularRevealCompat.java */
/* loaded from: classes13.dex */
public final class aec {
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static AnimatorSet a(@NonNull cec cecVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cecVar, cec.b.a, cec.a.b, new cec.d(f, f2, f3));
        cec.d revealInfo = cecVar.getRevealInfo();
        if (revealInfo == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cecVar, (int) f, (int) f2, revealInfo.c, f3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }
}
