package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import defpackage.b8h0;
import defpackage.cma1;
import defpackage.hzk;
import defpackage.iot0;
import defpackage.umg0;

/* loaded from: classes.dex */
public final class c extends e {
    public final boolean b;
    public boolean c;
    public hzk d;

    public c(iot0 iot0Var, boolean z) {
        super(iot0Var);
        this.b = z;
    }

    public final hzk b(Context context) {
        Animation loadAnimation;
        hzk hzkVar;
        if (this.c) {
            return this.d;
        }
        iot0 iot0Var = this.a;
        Fragment fragment = iot0Var.c;
        boolean z = iot0Var.a == SpecialEffectsController$Operation$State.VISIBLE;
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = this.b ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        hzk hzkVar2 = null;
        if (viewGroup != null && viewGroup.getTag(b8h0.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(b8h0.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
            if (onCreateAnimation != null) {
                hzkVar2 = new hzk(onCreateAnimation);
            } else {
                Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
                if (onCreateAnimator != null) {
                    hzkVar2 = new hzk(onCreateAnimator);
                } else {
                    if (popEnterAnim == 0 && nextTransition != 0) {
                        popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z ? cma1.B0(R.attr.activityOpenEnterAnimation, context) : cma1.B0(R.attr.activityOpenExitAnimation, context) : z ? umg0.fragment_fade_enter : umg0.fragment_fade_exit : z ? cma1.B0(R.attr.activityCloseEnterAnimation, context) : cma1.B0(R.attr.activityCloseExitAnimation, context) : z ? umg0.fragment_close_enter : umg0.fragment_close_exit : z ? umg0.fragment_open_enter : umg0.fragment_open_exit;
                    }
                    if (popEnterAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    hzkVar = new hzk(loadAnimation);
                                    hzkVar2 = hzkVar;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                            if (loadAnimator != null) {
                                hzkVar = new hzk(loadAnimator);
                                hzkVar2 = hzkVar;
                            }
                        } catch (RuntimeException e2) {
                            if (equals) {
                                throw e2;
                            }
                            Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                            if (loadAnimation2 != null) {
                                hzkVar2 = new hzk(loadAnimation2);
                            }
                        }
                    }
                }
            }
        }
        this.d = hzkVar2;
        this.c = true;
        return hzkVar2;
    }
}
