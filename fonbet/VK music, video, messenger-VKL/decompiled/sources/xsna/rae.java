package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/* compiled from: ClipsGridBlockAnimationDelegate.kt */
/* loaded from: classes17.dex */
public final class rae extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ gzs e;

    public /* synthetic */ rae(Object obj, Object obj2, gzs gzsVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = gzsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.b) {
            case 1:
                super.onAnimationCancel(animator);
                ImageView imageView = (ImageView) this.d;
                ViewParent parent = imageView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(imageView);
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                View view = (View) this.c;
                float f = ((sae) this.d).i;
                view.setScaleX(f);
                view.setScaleY(f);
                ((com.vk.movika.sdk.android.defaultplayer.interactive.a) this.e).invoke();
                break;
            default:
                ImageView imageView = (ImageView) this.d;
                ViewParent parent = imageView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(imageView);
                }
                ((xsd) this.e).invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.b) {
            case 1:
                super.onAnimationStart(animator);
                ((y3l0) this.c).invoke();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
