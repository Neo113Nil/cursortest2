package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Action$CloseAndDeeplink;
import com.yandex.go.taxi.order.models.api.response.OrderDetailsCardResponse$CardElement$Action$CopyToClipboard;
import com.yandex.go.taxi.order.models.api.response.l1;
import com.yandex.go.taxi.order.models.api.response.m1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class cs70 extends xqt {
    public static final cs70 e = new cs70();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m1.INSTANCE.serializer(), qoi0.a(m1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_order_support_notification", l1.INSTANCE.serializer(), qoi0.a(l1.class)), new f9("close_and_deeplink", OrderDetailsCardResponse$CardElement$Action$CloseAndDeeplink.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$Action$CloseAndDeeplink.class)), new f9("copy_to_clipboard", OrderDetailsCardResponse$CardElement$Action$CopyToClipboard.Companion.serializer(), qoi0.a(OrderDetailsCardResponse$CardElement$Action$CopyToClipboard.class)));
    }
}
