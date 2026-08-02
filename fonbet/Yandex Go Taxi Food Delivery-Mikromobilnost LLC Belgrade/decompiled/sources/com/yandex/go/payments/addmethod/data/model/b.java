package com.yandex.go.payments.addmethod.data.model;

import com.adjust.sdk.Constants;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class b extends xqt {
    public static final b e = new b();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, AddPaymentHomeResponse.CloseAction.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.CloseAction.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("close", AddPaymentHomeResponse.CloseAction.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.CloseAction.class)), new f9("start_binding", AddPaymentHomeResponse.StartBindingAction.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.StartBindingAction.class)), new f9("open_link", AddPaymentHomeResponse.OpenLinkAction.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.OpenLinkAction.class)), new f9("open_bind_url", AddPaymentHomeResponse.OpenBindUrlAction.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.OpenBindUrlAction.class)), new f9("close_flow_and_open_bind_url", AddPaymentHomeResponse.CloseFlowAndOpenBindUrlAction.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.CloseFlowAndOpenBindUrlAction.class)), new f9(Constants.DEEPLINK, AddPaymentHomeResponse.DeeplinkAction.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.DeeplinkAction.class)));
    }
}
