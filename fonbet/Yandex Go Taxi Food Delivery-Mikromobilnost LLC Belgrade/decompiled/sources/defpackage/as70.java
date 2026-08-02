package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$AttributedText;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Button;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$AccessoryResponse$Chevron;
import com.yandex.go.taxi.order.models.api.response.h1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class as70 extends xqt {
    public static final as70 e = new as70();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, h1.INSTANCE.serializer(), qoi0.a(h1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("button", OrderDetailsCardResponse$AccessoryResponse$Button.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$AccessoryResponse$Button.class)), new f9("chevron", OrderDetailsCardResponse$AccessoryResponse$Chevron.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$AccessoryResponse$Chevron.class)), new f9("attributed_text", OrderDetailsCardResponse$AccessoryResponse$AttributedText.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$AccessoryResponse$AttributedText.class)));
    }
}
