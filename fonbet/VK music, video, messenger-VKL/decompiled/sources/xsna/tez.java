package xsna;

import android.animation.ValueAnimator;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tez implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tez(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                float f = ListGroupCallView.o0;
                ((ListGroupCallView) obj).f5();
                break;
            case 1:
                p6f0 p6f0Var = (p6f0) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6f0 k6f0Var = p6f0Var.b;
                int length = k6f0Var.getReactionViews().length;
                int i2 = p6f0Var.h;
                if (i2 >= 0 && i2 < length) {
                    f3r f3rVar = k6f0Var.getReactionViews()[p6f0Var.h];
                    float f2 = p6f0Var.g;
                    f3rVar.d(f2 / 2.0f, f2);
                    float f3 = p6f0Var.k;
                    f3rVar.setScale(((UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3) * floatValue) + f3);
                    VkContentBadge vkContentBadge = p6f0Var.c[p6f0Var.h];
                    vkContentBadge.setPivotX(vkContentBadge.getWidth() / 2.0f);
                    vkContentBadge.setPivotY(vkContentBadge.getHeight());
                    float f4 = 1.0f - floatValue;
                    vkContentBadge.setScaleX(f4);
                    vkContentBadge.setScaleY(f4);
                    break;
                }
                break;
            default:
                ((Window) obj).setNavigationBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
