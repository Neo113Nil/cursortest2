package xsna;

import android.view.View;
import android.view.animation.Animation;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ShineAnimator.kt */
/* loaded from: classes18.dex */
public final class xdj0 {
    public final View a;
    public boolean b;
    public final a c = new a();
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new ig(29));

    public xdj0(View view) {
        this.a = view;
    }

    /* compiled from: ShineAnimator.kt */
    public static final class a implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            if (animation != null) {
                animation.setStartOffset(2000L);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }
}
