package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;

/* compiled from: CameraRepostOnboardingDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class hl9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hl9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                i0q0.i(5000L, new q86(((kl9) this.c).f, 1));
                break;
            case 1:
                ((lch) this.c).d.a.invoke(CommunityProfileAction.g.d.c.b);
                break;
            default:
                ((ExpandableTransformationBehavior) this.c).c = null;
                break;
        }
    }
}
