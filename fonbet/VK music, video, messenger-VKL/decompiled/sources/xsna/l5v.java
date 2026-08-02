package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vkontakte.android.R;
import xsna.hfz;

/* compiled from: HighlightViewHolder.kt */
/* loaded from: classes16.dex */
public abstract class l5v<T extends hfz> extends vfz<T> {
    public final int l;

    public l5v(View view) {
        super(view);
        this.l = n8g.l(dhr0.t.c(R.attr.vk_ui_track_buffer), 38);
    }

    public final void h6(boolean z) {
        if (z) {
            this.itemView.setForeground(new ColorDrawable(this.l));
            return;
        }
        Drawable foreground = this.itemView.getForeground();
        ColorDrawable colorDrawable = foreground instanceof ColorDrawable ? (ColorDrawable) foreground : null;
        if (colorDrawable != null) {
            ValueAnimator ofArgb = ValueAnimator.ofArgb(colorDrawable.getColor(), 0);
            ofArgb.addUpdateListener(new vnb(colorDrawable, 2));
            ofArgb.addListener(new b());
            ofArgb.addListener(new a());
            ofArgb.start();
        }
    }

    @Override // xsna.vfz
    public void g6() {
    }

    /* compiled from: Animator.kt */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            l5v.this.itemView.setForeground(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            l5v.this.itemView.setForeground(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
