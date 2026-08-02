package xsna;

import android.R;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.List;
import xsna.wn2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ao2 implements gzs {
    public final /* synthetic */ co2 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ wn2.b d;
    public final /* synthetic */ gzs e;
    public final /* synthetic */ List f;

    public /* synthetic */ ao2(co2 co2Var, View view, wn2.b bVar, gzs gzsVar, List list) {
        this.b = co2Var;
        this.c = view;
        this.d = bVar;
        this.e = gzsVar;
        this.f = list;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        final Size size;
        final co2 co2Var = this.b;
        ViewGroup viewGroup = co2Var.a;
        xwt0.a(iah0.f().widthPixels, (int) (iah0.f().widthPixels / co2Var.b), viewGroup);
        final wn2.b bVar = this.d;
        boolean z = bVar.b;
        boolean z2 = bVar.c;
        final View view = this.c;
        if (z && z2) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            float f = measuredHeight;
            float f2 = co2Var.b;
            float f3 = measuredWidth;
            float f4 = (f * f2) / f3;
            float f5 = (f3 / f2) / f;
            size = f5 < f4 ? new Size(measuredWidth, (int) (f * f5)) : new Size((int) (f3 * f4), measuredHeight);
        } else {
            size = z ? new Size((int) (view.getMeasuredHeight() * co2Var.b), view.getMeasuredHeight()) : z2 ? new Size(view.getMeasuredWidth(), (int) (view.getMeasuredWidth() / co2Var.b)) : new Size(viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
        }
        xwt0.a(size.getWidth(), size.getHeight(), view);
        final gzs gzsVar = this.e;
        final List list = this.f;
        view.addOnLayoutChangeListener(new mwt0(view, new gzs() { // from class: xsna.bo2
            @Override // xsna.gzs
            public final Object invoke() {
                float width = size.getWidth();
                ViewGroup viewGroup2 = co2Var.a;
                float measuredWidth2 = width / viewGroup2.getMeasuredWidth();
                float y = view.getY();
                boolean z3 = bVar.a;
                gzs gzsVar2 = gzsVar;
                if (z3) {
                    viewGroup2.clearAnimation();
                    viewGroup2.animate().scaleX(measuredWidth2).scaleY(measuredWidth2).y(y).setDuration(r2.getContext().getResources().getInteger(R.integer.config_shortAnimTime)).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new yn2(gzsVar2, 0)).start();
                } else {
                    viewGroup2.setScaleX(measuredWidth2);
                    viewGroup2.setScaleY(measuredWidth2);
                    viewGroup2.setY(y);
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                    }
                }
                for (View view2 : list) {
                    view2.setPivotX(viewGroup2.getPivotX());
                    view2.setPivotY(viewGroup2.getPivotY());
                    view2.setScaleX(measuredWidth2);
                    view2.setScaleY(measuredWidth2);
                    view2.setY(y);
                }
                return s3q0.a;
            }
        }));
        return s3q0.a;
    }
}
