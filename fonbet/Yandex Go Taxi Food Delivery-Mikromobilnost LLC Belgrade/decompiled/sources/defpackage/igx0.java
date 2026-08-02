package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.x0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public final class igx0 extends vw4 {
    public final LinkedHashMap y = new LinkedHashMap();

    public igx0() {
        this.c = this.e;
    }

    @Override // defpackage.vw4
    public final ViewPropertyAnimator B(x0 x0Var) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(x0Var.a.getAlpha(), 1.0f);
        ofFloat.addUpdateListener(new mxp0(19, x0Var));
        ofFloat.setStartDelay(200L);
        ofFloat.setDuration(200L);
        ofFloat.start();
        this.y.put(x0Var, ofFloat);
        return x0Var.a.animate().translationX(0.0f).setDuration(400L).setInterpolator(new OvershootInterpolator(1.0f));
    }

    @Override // defpackage.vw4
    public final ViewPropertyAnimator C(x0 x0Var) {
        return x0Var.a.animate().alpha(0.0f).setDuration(200L);
    }

    @Override // defpackage.vw4
    public final void D(x0 x0Var) {
        Animator animator = (Animator) this.y.remove(x0Var);
        if (animator != null) {
            animator.cancel();
            animator.removeAllListeners();
        }
        View view = x0Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
    }

    @Override // defpackage.vw4
    public final void E(x0 x0Var) {
        View view = x0Var.a;
        view.setAlpha(0.0f);
        view.setTranslationX((xw31.n(view.getContext()) ? -view.getWidth() : view.getWidth()) / 2);
    }

    @Override // defpackage.vw4
    public final boolean F() {
        return false;
    }

    @Override // defpackage.vw4
    public final boolean G(x0 x0Var) {
        return x0Var.y == vfh0.card_type_option;
    }

    @Override // defpackage.vw4
    public final boolean H(x0 x0Var) {
        return x0Var.y == vfh0.card_type_option;
    }

    @Override // defpackage.vw4, androidx.recyclerview.widget.h, androidx.recyclerview.widget.RecyclerView.c
    public final void k() {
        super.k();
        LinkedHashMap linkedHashMap = this.y;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) ((Map.Entry) it.next()).getValue();
            animator.cancel();
            animator.removeAllListeners();
        }
        linkedHashMap.clear();
    }

    @Override // androidx.recyclerview.widget.b1
    public final void t(x0 x0Var) {
        Animator animator = (Animator) this.y.remove(x0Var);
        if (animator != null) {
            animator.cancel();
            animator.removeAllListeners();
        }
    }
}
