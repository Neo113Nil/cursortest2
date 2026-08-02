package defpackage;

import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption;
import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption;
import com.yandex.go.taxi.order.models.api.response.i8;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class d9z0 extends xqt {
    public static final d9z0 e = new d9z0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, i8.INSTANCE.serializer(), qoi0.a(i8.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("change_due", TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.Companion.serializer(), qoi0.a(TimelineAdditionalOrderOption$ChangeDueAdditionalOrderOption.class)), new f9("change_additional_payment", TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.Companion.serializer(), qoi0.a(TimelineAdditionalOrderOption$ChangePriceAdditionalOrderOption.class)));
    }
}
