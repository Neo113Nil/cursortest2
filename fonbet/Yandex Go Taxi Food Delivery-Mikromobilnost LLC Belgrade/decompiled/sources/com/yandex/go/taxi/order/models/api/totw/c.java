package com.yandex.go.taxi.order.models.api.totw;

import com.adjust.sdk.Constants;
import com.yandex.go.taxi.order.models.api.totw.TotwUpsellResponse;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class c extends xqt {
    public static final c e = new c();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g.INSTANCE.serializer(), qoi0.a(g.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, TotwUpsellResponse.Deeplink.Companion.serializer(), qoi0.a(TotwUpsellResponse.Deeplink.class)));
    }
}
