package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.core.view.components.badge.VkContentBadge;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class l6f0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l6f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                m6f0 m6f0Var = (m6f0) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i = m6f0Var.n;
                m3r m3rVar = m6f0Var.a;
                k6f0 k6f0Var = m6f0Var.b;
                if (i >= 0) {
                    w1r w1rVar = k6f0Var.getReactionContainerViews()[m6f0Var.n];
                    f3r[] reactionViews = k6f0Var.getReactionViews();
                    int i2 = m6f0Var.n;
                    f3r f3rVar = reactionViews[i2];
                    VkContentBadge vkContentBadge = m6f0Var.c[i2];
                    f3rVar.setScale(m6f0.a(m6f0Var.o, m6f0Var.p, floatValue));
                    f3rVar.setTranslationY(m6f0.a(m6f0Var.q, m6f0Var.r, floatValue));
                    vkContentBadge.setTranslationY(m6f0.a(m6f0Var.s, m6f0Var.t, floatValue));
                    vkContentBadge.setAlpha(m6f0.a(m6f0Var.u, m6f0Var.v, floatValue));
                    m3rVar.g(f3rVar, w1rVar, (f3rVar.getTranslationY() == m6f0Var.j[m6f0Var.n] && f3rVar.getScale() == m6f0Var.f[m6f0Var.n]) ? false : true);
                }
                m3rVar.invalidate();
                break;
            case 1:
                ((View) this.c).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                com.vk.story.viewer.impl.presentation.stories.c cVar = (com.vk.story.viewer.impl.presentation.stories.c) this.c;
                cVar.getClass();
                cVar.n.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
