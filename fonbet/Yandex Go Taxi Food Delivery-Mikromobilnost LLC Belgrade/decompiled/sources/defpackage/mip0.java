package defpackage;

import android.view.View;
import androidx.core.view.b;
import com.yandex.go.payments_widgets.section.payments.PaymentWidgetsView;
import core.flex.ui.OrientationAwareRecyclerView;
import java.util.WeakHashMap;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class mip0 {
    public final OrientationAwareRecyclerView a;
    public final zbw0 b;
    public t1w c;
    public final lp2 d;
    public final lip0 e;
    public boolean f;

    public mip0(OrientationAwareRecyclerView orientationAwareRecyclerView, zbw0 zbw0Var, tse tseVar) {
        this.a = orientationAwareRecyclerView;
        this.b = zbw0Var;
        WeakHashMap weakHashMap = b.a;
        n751 a = op31.a(orientationAwareRecyclerView);
        t1w t1wVar = null;
        if (a != null) {
            k751 k751Var = a.a;
            u1w g = k751Var.g(519);
            t1wVar = qke.j(new t1w(g.a, g.b, g.c, g.d, k751Var.q(8) ? Integer.valueOf(k751Var.g(8).d) : null), orientationAwareRecyclerView.getLayoutDirection());
        }
        this.c = t1w.a(t1wVar == null ? t1w.h : t1wVar, ((Number) e.d(((acw0) zbw0Var).a).a.getValue()).intValue());
        this.d = new lp2(2, this);
        this.e = new lip0(this);
    }

    public final void a(t1w t1wVar) {
        View view;
        OrientationAwareRecyclerView orientationAwareRecyclerView = this.a;
        PaymentWidgetsView p = wwg.p(orientationAwareRecyclerView);
        View view2 = null;
        if (orientationAwareRecyclerView.getChildCount() > 0) {
            view = orientationAwareRecyclerView.getChildAt(0);
            if (view == null) {
                ny61.s();
                return;
            }
        } else {
            view = null;
        }
        if (orientationAwareRecyclerView.getChildCount() > 0) {
            view2 = orientationAwareRecyclerView.getChildAt(0);
            if (view2 == null) {
                ny61.s();
                return;
            }
            int i = 1;
            while (i < orientationAwareRecyclerView.getChildCount()) {
                int i2 = i + 1;
                View childAt = orientationAwareRecyclerView.getChildAt(i);
                if (childAt == null) {
                    ny61.s();
                    return;
                } else {
                    i = i2;
                    view2 = childAt;
                }
            }
        }
        int bottom = (view == null || view2 == null) ? -1 : (view2.getBottom() + (t1wVar.b + t1wVar.g)) - view.getTop();
        int height = bottom - orientationAwareRecyclerView.getHeight();
        int fixedHeight = (p == null || bottom < 0 || height >= p.getFixedHeight()) ? 0 : p.getFixedHeight() - height;
        int paddingTop = orientationAwareRecyclerView.getPaddingTop();
        orientationAwareRecyclerView.setPadding(orientationAwareRecyclerView.getPaddingLeft(), t1wVar.b, orientationAwareRecyclerView.getPaddingRight(), t1wVar.g + fixedHeight);
        int i3 = t1wVar.b - paddingTop;
        if (i3 != 0) {
            orientationAwareRecyclerView.scrollBy(0, -i3);
        }
    }
}
