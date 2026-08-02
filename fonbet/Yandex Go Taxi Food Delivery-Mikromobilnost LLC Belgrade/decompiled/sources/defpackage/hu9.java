package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction;
import com.yandex.go.chargers.discounts.data.models.n;
import com.yandex.go.chargers.discounts.data.models.p;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class hu9 extends xqt {
    public static final hu9 e = new hu9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p.INSTANCE.serializer(), qoi0.a(p.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction.Companion.serializer(), qoi0.a(ChargersDiscountsButtonDto$ChargersPromocodesAction$DeeplinkAction.class)), new f9("promocode_input", n.INSTANCE.serializer(), qoi0.a(n.class)), new f9("select_discount", ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction.Companion.serializer(), qoi0.a(ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction.class)));
    }
}
