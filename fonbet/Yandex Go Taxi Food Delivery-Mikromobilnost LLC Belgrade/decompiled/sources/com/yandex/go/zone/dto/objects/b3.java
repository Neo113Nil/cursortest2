package com.yandex.go.zone.dto.objects;

import com.adjust.sdk.Constants;
import com.yandex.go.zone.dto.objects.PopupUiControl;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes15.dex */
public final class b3 extends xqt {
    public static final b3 e = new b3();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e3.INSTANCE.serializer(), qoi0.a(e3.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("close_order_popup", e3.INSTANCE.serializer(), qoi0.a(e3.class)), new f9(Constants.DEEPLINK, PopupUiControl.Deeplink.Companion.serializer(), qoi0.a(PopupUiControl.Deeplink.class)), new f9("open_summary_address", PopupUiControl.OpenSummaryAddress.Companion.serializer(), qoi0.a(PopupUiControl.OpenSummaryAddress.class)), new f9("open_tariff_card", j3.INSTANCE.serializer(), qoi0.a(j3.class)), new f9("cancel_orders", PopupUiControl.CancelOrders.Companion.serializer(), qoi0.a(PopupUiControl.CancelOrders.class)));
    }
}
