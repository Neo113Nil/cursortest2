package xsna;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashSet;

/* compiled from: EditorSlide.kt */
/* loaded from: classes4.dex */
public final class a5p extends a0k0 {
    public final LinkedHashSet l;
    public final elj0 m = new elj0();

    public a5p(LinkedHashSet linkedHashSet) {
        this.l = linkedHashSet;
    }

    @Override // xsna.p4u0, xsna.vlp0
    public final Animator createAnimator(ViewGroup viewGroup, gnp0 gnp0Var, gnp0 gnp0Var2) {
        View view;
        View view2;
        View view3 = gnp0Var2 != null ? gnp0Var2.b : null;
        LinkedHashSet linkedHashSet = this.l;
        int i = 48;
        if (!j5g.P(linkedHashSet, view3)) {
            Object parent = (gnp0Var2 == null || (view2 = gnp0Var2.b) == null) ? null : view2.getParent();
            if (!j5g.P(linkedHashSet, parent instanceof View ? (View) parent : null)) {
                if (!j5g.P(linkedHashSet, gnp0Var != null ? gnp0Var.b : null)) {
                    Object parent2 = (gnp0Var == null || (view = gnp0Var.b) == null) ? null : view.getParent();
                    if (!j5g.P(linkedHashSet, parent2 instanceof View ? (View) parent2 : null)) {
                        i = 80;
                    }
                }
            }
        }
        a(i);
        int i2 = this.c;
        elj0 elj0Var = this.m;
        elj0Var.c = i2;
        setPropagation(elj0Var);
        return super.createAnimator(viewGroup, gnp0Var, gnp0Var2);
    }
}
