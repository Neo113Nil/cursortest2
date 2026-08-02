package xsna;

import android.animation.ValueAnimator;
import android.view.Window;
import com.vk.avatar.api.VKAvatarView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lrb0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lrb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                mrb0 mrb0Var = (mrb0) obj;
                mrb0Var.setLevel(((Integer) valueAnimator.getAnimatedValue()).intValue());
                mrb0Var.invalidateSelf();
                break;
            case 1:
                pac0 pac0Var = (pac0) obj;
                pac0Var.f.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                pac0Var.a.invalidate();
                break;
            case 2:
                ((okc0) obj).f.invoke();
                break;
            case 3:
                ((com.vk.photo.editor.views.shimmer.a) obj).invalidateSelf();
                break;
            case 4:
                nov novVar = (nov) obj;
                novVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue() / novVar.getCommons().c(), novVar.getCenterX(), novVar.getCenterY());
                gzs<s3q0> invalidator = novVar.getInvalidator();
                if (invalidator != null) {
                    invalidator.invoke();
                    break;
                }
                break;
            case 5:
                ((Window) obj).setNavigationBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                int i2 = VKAvatarView.r;
                ((VKAvatarView) obj).invalidate();
                break;
        }
    }
}
