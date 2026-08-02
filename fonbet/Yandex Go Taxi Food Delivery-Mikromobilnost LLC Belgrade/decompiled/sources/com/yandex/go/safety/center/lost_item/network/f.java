package com.yandex.go.safety.center.lost_item.network;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class f extends xqt {
    public static final f e = new f();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g.INSTANCE.serializer(), qoi0.a(g.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("call_to_driver", LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto.Companion.serializer(), qoi0.a(LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto.class)), new f9("open_rides_list", e.INSTANCE.serializer(), qoi0.a(e.class)));
    }
}
