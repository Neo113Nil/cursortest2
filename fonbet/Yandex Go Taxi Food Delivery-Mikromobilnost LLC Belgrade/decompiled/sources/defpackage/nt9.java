package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsActivateDiscountItemDto$DiscountItemDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsActivateDiscountItemDto$PromocodeItemDto;
import com.yandex.go.chargers.discounts.data.models.h;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class nt9 extends xqt {
    public static final nt9 e = new nt9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, h.INSTANCE.serializer(), qoi0.a(h.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("discount", ChargersDiscountsActivateDiscountItemDto$DiscountItemDto.Companion.serializer(), qoi0.a(ChargersDiscountsActivateDiscountItemDto$DiscountItemDto.class)), new f9("promocode", ChargersDiscountsActivateDiscountItemDto$PromocodeItemDto.Companion.serializer(), qoi0.a(ChargersDiscountsActivateDiscountItemDto$PromocodeItemDto.class)));
    }
}
