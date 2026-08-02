package defpackage;

import com.yandex.go.chargers.order.data.model.ChargersActiveOrderDetailsItemDto$Header;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderDetailsItemDto$Item;
import com.yandex.go.chargers.order.data.model.v;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class gk9 extends xqt {
    public static final gk9 e = new gk9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, v.INSTANCE.serializer(), qoi0.a(v.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("header", ChargersActiveOrderDetailsItemDto$Header.Companion.serializer(), qoi0.a(ChargersActiveOrderDetailsItemDto$Header.class)), new f9("item", ChargersActiveOrderDetailsItemDto$Item.Companion.serializer(), qoi0.a(ChargersActiveOrderDetailsItemDto$Item.class)));
    }
}
