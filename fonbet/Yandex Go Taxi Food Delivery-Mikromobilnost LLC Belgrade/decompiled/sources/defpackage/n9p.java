package defpackage;

import com.yandex.go.flex.main_screen.data.widgets.orders.OrdersWidgetSection;
import com.yandex.go.flex.main_screen.data.widgets.plaque.PlaqueWidgetSection;
import com.yandex.go.flex.main_screen.data.widgets.shimmer.ShimmerWidgetSection;
import com.yandex.go.flex.main_screen.experiments.j;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes.dex */
public final class n9p {
    public final j a;

    public n9p(j jVar) {
        this.a = jVar;
    }

    public final ywl a(boolean z) {
        this.a.getClass();
        czp0 czp0Var = new czp0(true, new bzp0(null));
        ListBuilder a = rcc.a();
        a.add(new OrdersWidgetSection(60));
        if (z) {
            a.add(new PlaqueWidgetSection(0));
        }
        a.add(new ShimmerWidgetSection(4));
        return new ywl(new dzp0(czp0Var, a.j(), null, null, null, null), null, cnr0.b, new uwl(null, null, r6s0.INSTANCE, null, null, null), null, null);
    }
}
