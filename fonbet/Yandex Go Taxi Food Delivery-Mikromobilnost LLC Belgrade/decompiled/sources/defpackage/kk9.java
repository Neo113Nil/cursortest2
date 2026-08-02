package defpackage;

import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemMetadataDto$Promo;
import com.yandex.go.chargers.order.data.model.g0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class kk9 extends xqt {
    public static final kk9 e = new kk9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g0.INSTANCE.serializer(), qoi0.a(g0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("promo", ChargersActiveOrderItemMetadataDto$Promo.Companion.serializer(), qoi0.a(ChargersActiveOrderItemMetadataDto$Promo.class)));
    }
}
