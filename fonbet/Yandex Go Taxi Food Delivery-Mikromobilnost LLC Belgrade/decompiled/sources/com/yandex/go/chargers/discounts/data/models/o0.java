package com.yandex.go.chargers.discounts.data.models;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class o0 extends xqt {
    public static final o0 e = new o0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p0.INSTANCE.serializer(), qoi0.a(p0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("select_discount", n0.INSTANCE.serializer(), qoi0.a(n0.class)), new f9("paymentmethods", m0.INSTANCE.serializer(), qoi0.a(m0.class)), new f9("close", k0.INSTANCE.serializer(), qoi0.a(k0.class)));
    }
}
