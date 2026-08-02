package com.yandex.go.taxi.order.models.api.response.driver;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class g extends xqt {
    public static final g e = new g();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, h.INSTANCE.serializer(), qoi0.a(h.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("linear_gradient", DriverInfoBadgesBlock$Badge$Background$LinearGradient.Companion.serializer(), qoi0.a(DriverInfoBadgesBlock$Badge$Background$LinearGradient.class)), new f9("fill", DriverInfoBadgesBlock$Badge$Background$Fill.Companion.serializer(), qoi0.a(DriverInfoBadgesBlock$Badge$Background$Fill.class)));
    }
}
