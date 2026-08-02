package xsna;

import android.animation.ValueAnimator;
import com.vk.core.view.components.badge.VkContentBadge;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((rf0) this.c).R6().setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                mox moxVar = (mox) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator<lox> it = moxVar.f.iterator();
                while (it.hasNext()) {
                    it.next().f = floatValue;
                }
                moxVar.invalidateSelf();
                break;
            case 2:
                m6f0 m6f0Var = (m6f0) this.c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6f0 k6f0Var = m6f0Var.b;
                m3r m3rVar = m6f0Var.a;
                float[] fArr = m6f0Var.j;
                float[] fArr2 = m6f0Var.f;
                int length = k6f0Var.getReactionViews().length;
                for (int i = 0; i < length; i++) {
                    if (i != m6f0Var.n) {
                        w1r w1rVar = k6f0Var.getReactionContainerViews()[i];
                        f3r f3rVar = k6f0Var.getReactionViews()[i];
                        VkContentBadge vkContentBadge = m6f0Var.c[i];
                        f3rVar.setScale(m6f0.a(m6f0Var.e[i], fArr2[i], floatValue2));
                        f3rVar.setTranslationY(m6f0.a(m6f0Var.i[i], fArr[i], floatValue2));
                        vkContentBadge.setTranslationY(m6f0.a(m6f0Var.g[i], m6f0Var.h[i], floatValue2));
                        vkContentBadge.setAlpha(m6f0.a(m6f0Var.k[i], m6f0Var.l[i], floatValue2));
                        m3rVar.g(f3rVar, w1rVar, (f3rVar.getTranslationY() == fArr[i] && f3rVar.getScale() == fArr2[i]) ? false : true);
                    }
                }
                m3rVar.invalidate();
                break;
            default:
                kew kewVar = ((nts0) this.c).b;
                if (kewVar != null) {
                    kewVar.f(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                }
                break;
        }
    }
}
