package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.analytics.DeeplinkFinalizedOrderAddressAnalyticsData;
import com.yandex.go.analytics.ListBasedOrderAddressAnalyticsData;
import com.yandex.go.analytics.PinDropOrderAddressAnalyticsData;
import com.yandex.go.analytics.PositionChoicesOrderAddressAnalyticsData;
import com.yandex.go.analytics.ShortcutOrderAddressAnalyticsData;
import com.yandex.go.analytics.SimpleOrderAddressAnalyticsData;
import com.yandex.go.analytics.TransportAddressAnalyticsData;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class jh70 extends xqt {
    public static final jh70 e = new jh70();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, SimpleOrderAddressAnalyticsData.Companion.serializer(), qoi0.a(SimpleOrderAddressAnalyticsData.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("simple", SimpleOrderAddressAnalyticsData.Companion.serializer(), qoi0.a(SimpleOrderAddressAnalyticsData.class)), new f9(Constants.DEEPLINK, DeeplinkFinalizedOrderAddressAnalyticsData.Companion.serializer(), qoi0.a(DeeplinkFinalizedOrderAddressAnalyticsData.class)), new f9("pin_drop", PinDropOrderAddressAnalyticsData.Companion.serializer(), qoi0.a(PinDropOrderAddressAnalyticsData.class)), new f9("shortcut", ShortcutOrderAddressAnalyticsData.Companion.serializer(), qoi0.a(ShortcutOrderAddressAnalyticsData.class)), new f9("position_choices", PositionChoicesOrderAddressAnalyticsData.Companion.serializer(), qoi0.a(PositionChoicesOrderAddressAnalyticsData.class)), new f9("list_based", ListBasedOrderAddressAnalyticsData.Companion.serializer(), qoi0.a(ListBasedOrderAddressAnalyticsData.class)), new f9("transport", TransportAddressAnalyticsData.Companion.serializer(), qoi0.a(TransportAddressAnalyticsData.class)));
    }
}
