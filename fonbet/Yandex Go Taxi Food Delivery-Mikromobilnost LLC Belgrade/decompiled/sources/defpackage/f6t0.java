package defpackage;

import android.view.View;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.go.taxi.summary.shared.lifecycle.SummaryElement;
import ru.yandex.taxi.design.button.OrderButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;

/* loaded from: classes6.dex */
public final class f6t0 {
    public final z0a0 a;
    public final CompositePaymentIconsView b;
    public final OrderButtonComponent c;
    public final View d;
    public final zi70 e;

    public f6t0(z0a0 z0a0Var, CompositePaymentIconsView compositePaymentIconsView, OrderButtonComponent orderButtonComponent, View view, zi70 zi70Var, Runnable runnable, Runnable runnable2, Runnable runnable3) {
        this.a = z0a0Var;
        this.b = compositePaymentIconsView;
        this.c = orderButtonComponent;
        this.d = view;
        this.e = zi70Var;
        c.B(compositePaymentIconsView, runnable);
        orderButtonComponent.setDebounceClickListener(runnable2);
        c.B(view, runnable3);
        hg.a(compositePaymentIconsView);
        hg.a(view);
    }

    public final void a(g6t0 g6t0Var) {
        OrderButtonComponent orderButtonComponent = this.c;
        zi70 zi70Var = this.e;
        if (zi70Var != null) {
            wi70 wi70Var = g6t0Var.a;
            ru.yandex.taxi.perf.screen.c cVar = zi70Var.a;
            CharSequence charSequence = wi70Var.a;
            CharSequence charSequence2 = wi70Var.b;
            if (charSequence.length() > 0 || charSequence2.length() > 0) {
                ph91.d(cVar, new wjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT), orderButtonComponent);
            }
            if ((wi70Var.a.length() > 0 || charSequence2.length() > 0) && wi70Var.g) {
                ph91.d(cVar, new wjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT), orderButtonComponent);
                zi70Var.b.a(SummaryElement.ORDER_BUTTON);
            }
        }
        orderButtonComponent.render(g6t0Var.a);
        this.b.setVisibility(g6t0Var.b ? 0 : 8);
        this.d.setVisibility(g6t0Var.c ? 0 : 8);
    }
}
