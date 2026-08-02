package com.yandex.go.payments.addmethod.data.model;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class r extends xqt {
    public static final r e = new r();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, AddPaymentHomeResponse.TrailButtonLink.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.TrailButtonLink.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("link", AddPaymentHomeResponse.TrailButtonLink.Companion.serializer(), qoi0.a(AddPaymentHomeResponse.TrailButtonLink.class)));
    }
}
