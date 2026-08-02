package androidx.cardview.widget;

import defpackage.wp8;
import defpackage.xp8;

/* loaded from: classes10.dex */
public final class b implements xp8 {
    public static RoundRectDrawable a(wp8 wp8Var) {
        return (RoundRectDrawable) ((a) wp8Var).a;
    }

    public final void b(wp8 wp8Var, float f) {
        a(wp8Var).setPadding(f, ((a) wp8Var).b.getUseCompatPadding(), ((a) wp8Var).b.getPreventCornerOverlap());
        c(wp8Var);
    }

    public final void c(wp8 wp8Var) {
        if (!((a) wp8Var).b.getUseCompatPadding()) {
            ((a) wp8Var).a(0, 0, 0, 0);
            return;
        }
        float padding = a(wp8Var).getPadding();
        float radius = a(wp8Var).getRadius();
        a aVar = (a) wp8Var;
        CardView cardView = aVar.b;
        int ceil = (int) Math.ceil(RoundRectDrawableWithShadow.calculateHorizontalPadding(padding, radius, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(RoundRectDrawableWithShadow.calculateVerticalPadding(padding, radius, cardView.getPreventCornerOverlap()));
        aVar.a(ceil, ceil2, ceil, ceil2);
    }
}
