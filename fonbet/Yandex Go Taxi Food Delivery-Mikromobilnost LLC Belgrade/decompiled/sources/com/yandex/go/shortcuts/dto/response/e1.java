package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class e1 extends xqt {
    public static final e1 e = new e1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, q1.INSTANCE.serializer(), qoi0.a(q1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("round_button", ProductMode$Taxi.BottomScreenRoundButton.Companion.serializer(), qoi0.a(ProductMode$Taxi.BottomScreenRoundButton.class)), new f9("icon_button", ProductMode$Taxi.BottomScreenIconButton.Companion.serializer(), qoi0.a(ProductMode$Taxi.BottomScreenIconButton.class)));
    }
}
