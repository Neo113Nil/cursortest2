package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class n1 extends xqt {
    public static final n1 e = new n1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, r1.INSTANCE.serializer(), qoi0.a(r1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("round_button", ProductMode$Taxi.TopScreenRoundButton.Companion.serializer(), qoi0.a(ProductMode$Taxi.TopScreenRoundButton.class)), new f9("icon_button", ProductMode$Taxi.TopScreenIconButton.Companion.serializer(), qoi0.a(ProductMode$Taxi.TopScreenIconButton.class)));
    }
}
