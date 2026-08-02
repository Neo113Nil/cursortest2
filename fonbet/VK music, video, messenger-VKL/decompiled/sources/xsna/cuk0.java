package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes13.dex */
public final class cuk0 {
    public final ArrayList<b> a = new ArrayList<>();

    @Nullable
    public ValueAnimator b = null;
    public final a c = new a();

    /* compiled from: StateListAnimator.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            cuk0 cuk0Var = cuk0.this;
            if (cuk0Var.b == animator) {
                cuk0Var.b = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    public static class b {
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b();
        valueAnimator.addListener(this.c);
        this.a.add(bVar);
    }
}
