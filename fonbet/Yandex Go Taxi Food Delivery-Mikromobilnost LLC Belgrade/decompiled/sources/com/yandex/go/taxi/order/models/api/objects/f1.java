package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class f1 extends xqt {
    public static final f1 e = new f1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, l1.INSTANCE.serializer(), qoi0.a(l1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("icon", RouteInfo.ImageIcon.Companion.serializer(), qoi0.a(RouteInfo.ImageIcon.class)), new f9("pin", RouteInfo.PinIcon.Companion.serializer(), qoi0.a(RouteInfo.PinIcon.class)));
    }
}
