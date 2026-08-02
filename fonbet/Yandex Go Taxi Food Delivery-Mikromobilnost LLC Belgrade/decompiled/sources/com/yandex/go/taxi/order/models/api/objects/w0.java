package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.taxi.order.models.api.objects.PickupPointPinNotification;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class w0 extends xqt {
    public static final w0 e = new w0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a1.INSTANCE.serializer(), qoi0.a(a1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_modal", PickupPointPinNotification.OpenModalAction.Companion.serializer(), qoi0.a(PickupPointPinNotification.OpenModalAction.class)));
    }
}
