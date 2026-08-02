package defpackage;

import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$Banner;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$Button;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$ButtonsGroup;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$ListItem;
import com.yandex.go.chargers.order.data.model.d0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class ik9 extends xqt {
    public static final ik9 e = new ik9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d0.INSTANCE.serializer(), qoi0.a(d0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("list_item", ChargersActiveOrderItemDto$ListItem.Companion.serializer(), qoi0.a(ChargersActiveOrderItemDto$ListItem.class)), new f9("button", ChargersActiveOrderItemDto$Button.Companion.serializer(), qoi0.a(ChargersActiveOrderItemDto$Button.class)), new f9("buttons_group", ChargersActiveOrderItemDto$ButtonsGroup.Companion.serializer(), qoi0.a(ChargersActiveOrderItemDto$ButtonsGroup.class)), new f9("banner", ChargersActiveOrderItemDto$Banner.Companion.serializer(), qoi0.a(ChargersActiveOrderItemDto$Banner.class)));
    }
}
