package com.yandex.go.taxi.order.models.api.response;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class o6 extends xqt {
    public static final o6 e = new o6();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m6.INSTANCE.serializer(), qoi0.a(m6.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("image", RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentImage.Companion.serializer(), qoi0.a(RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentImage.class)), new f9("animation", RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentAnimation.Companion.serializer(), qoi0.a(RideCardItemDto$Timeline$TimelineItem$TimelineItemContent$TimelineItemContentAnimation.class)));
    }
}
