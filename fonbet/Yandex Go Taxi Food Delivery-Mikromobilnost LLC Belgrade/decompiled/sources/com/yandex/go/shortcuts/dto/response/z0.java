package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class z0 extends xqt {
    public static final z0 e = new z0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p1.INSTANCE.serializer(), qoi0.a(p1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("attention", ProductMode$Taxi.AttentionAboveCardObject.Companion.serializer(), qoi0.a(ProductMode$Taxi.AttentionAboveCardObject.class)));
    }
}
