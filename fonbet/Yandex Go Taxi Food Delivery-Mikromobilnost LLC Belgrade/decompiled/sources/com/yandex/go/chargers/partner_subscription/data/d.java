package com.yandex.go.chargers.partner_subscription.data;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class d extends xqt {
    public static final d e = new d();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e.INSTANCE.serializer(), qoi0.a(e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("close", b.INSTANCE.serializer(), qoi0.a(b.class)));
    }
}
