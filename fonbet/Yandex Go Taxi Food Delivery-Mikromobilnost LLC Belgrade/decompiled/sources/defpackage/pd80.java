package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.flex.main_screen.data.widgets.orders.OrdersWidgetSection;
import com.yandex.go.flex.main_screen.data.widgets.shimmer.ShimmerWidgetSection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class pd80 implements j4q0 {
    public final /* synthetic */ int a = 0;
    public final i4q0 b;

    public pd80(uur0 uur0Var, o370 o370Var) {
        this.b = new i4q0(ShimmerDivHandler.EXTENSION_ID, qoi0.a(ShimmerWidgetSection.class), ShimmerWidgetSection.Companion.serializer(), uur0Var, new ate0(14, o370Var), Collections.singletonList(new mur0(ShimmerDivHandler.EXTENSION_ID)));
    }

    @Override // defpackage.j4q0
    public final i4q0 create() {
        switch (this.a) {
        }
        return this.b;
    }

    public pd80(jc60 jc60Var, od80 od80Var) {
        this.b = new i4q0("orders_widgets", qoi0.a(OrdersWidgetSection.class), OrdersWidgetSection.Companion.serializer(), od80Var, new weu(18, jc60Var), Collections.singletonList(new hd80("orders_widgets")));
    }
}
