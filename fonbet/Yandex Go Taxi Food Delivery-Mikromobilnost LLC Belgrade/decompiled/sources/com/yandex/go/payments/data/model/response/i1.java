package com.yandex.go.payments.data.model.response;

import com.adjust.sdk.Constants;
import com.yandex.go.payments.data.model.response.PaymentsNotification;
import defpackage.f9;
import defpackage.qoi0;
import defpackage.wqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class i1 extends wqt {
    public static final i1 e = new i1();

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, PaymentsNotification.DeeplinkTapAction.Companion.serializer(), qoi0.a(PaymentsNotification.DeeplinkTapAction.class)));
    }
}
