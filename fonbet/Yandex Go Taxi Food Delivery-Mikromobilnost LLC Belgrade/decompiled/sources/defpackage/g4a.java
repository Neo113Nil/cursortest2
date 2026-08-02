package defpackage;

import com.yandex.go.chargers.order.data.model.ChargersMultiOrderItemDto$Button;
import com.yandex.go.chargers.order.data.model.ChargersMultiOrderItemDto$Orders;
import com.yandex.go.chargers.order.data.model.p0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class g4a extends xqt {
    public static final g4a e = new g4a();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p0.INSTANCE.serializer(), qoi0.a(p0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("orders", ChargersMultiOrderItemDto$Orders.Companion.serializer(), qoi0.a(ChargersMultiOrderItemDto$Orders.class)), new f9("button", ChargersMultiOrderItemDto$Button.Companion.serializer(), qoi0.a(ChargersMultiOrderItemDto$Button.class)));
    }
}
