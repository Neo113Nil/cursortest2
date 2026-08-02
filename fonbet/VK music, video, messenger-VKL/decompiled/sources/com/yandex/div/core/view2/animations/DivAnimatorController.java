package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.View;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.animation.DivVariableAnimatorBuilder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.a;
import com.yandex.div2.g;
import com.yandex.div2.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.air;
import xsna.epx;
import xsna.ikn;
import xsna.j5g;

/* compiled from: DivAnimatorController.kt */
/* loaded from: classes7.dex */
public final class DivAnimatorController {
    private final Div2View divView;
    private final Map<Pair<String, String>, Animator> runningAnimators = new LinkedHashMap();

    public DivAnimatorController(Div2View div2View) {
        this.divView = div2View;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final w0 findAnimator(View view, String str) {
        ikn b;
        if (view instanceof DivHolderView) {
            a div = ((DivHolderView) view).getDiv();
            w0 findAnimator = findAnimator((div == null || (b = div.b()) == null) ? null : b.r(), str);
            if (findAnimator != null) {
                return findAnimator;
            }
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                return findAnimator(view2, str);
            }
        } else {
            if (view instanceof Div2View) {
                DivActionTypedUtilsKt.logWarning(this.divView, new RuntimeException(air.b('\'', "Unable to find animator with id '", str)));
                return null;
            }
            Object parent2 = view.getParent();
            View view3 = parent2 instanceof View ? (View) parent2 : null;
            if (view3 != null) {
                return findAnimator(view3, str);
            }
        }
        return null;
    }

    public final void onDetachedFromWindow() {
        Iterator it = new ArrayList(this.runningAnimators.values()).iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        this.runningAnimators.clear();
    }

    public final void startAnimator(String str, View view, g gVar, ExpressionResolver expressionResolver) {
        Animator remove;
        String str2 = gVar.a;
        w0 findAnimator = findAnimator(view, str2);
        if (findAnimator == null) {
            return;
        }
        final Pair<String, String> pair = new Pair<>(str, str2);
        if (this.runningAnimators.containsKey(pair) && (remove = this.runningAnimators.remove(pair)) != null) {
            remove.cancel();
        }
        Animator build = DivVariableAnimatorBuilder.INSTANCE.build(this.divView, findAnimator, gVar, expressionResolver);
        if (build == null) {
            return;
        }
        build.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Map map;
                map = DivAnimatorController.this.runningAnimators;
                map.remove(pair);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        build.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Map map;
                map = DivAnimatorController.this.runningAnimators;
                map.remove(pair);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.runningAnimators.put(pair, build);
        build.start();
    }

    public final void stopAnimator(String str, String str2) {
        Animator remove = this.runningAnimators.remove(new Pair(str, str2));
        if (remove == null) {
            return;
        }
        remove.cancel();
    }

    private final w0 findAnimator(List<? extends w0> list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (epx.f(((w0) obj).b().getId(), str)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty() && arrayList.size() <= 1) {
            return (w0) j5g.Y(arrayList);
        }
        return null;
    }
}
