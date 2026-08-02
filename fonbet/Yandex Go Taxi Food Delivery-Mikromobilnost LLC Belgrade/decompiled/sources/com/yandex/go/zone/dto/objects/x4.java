package com.yandex.go.zone.dto.objects;

import com.adjust.sdk.Constants;
import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes15.dex */
public final class x4 extends xqt {
    public static final x4 e = new x4();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, v4.INSTANCE.serializer(), qoi0.a(v4.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(Constants.DEEPLINK, ServiceLevel$TariffCard$BulletAction$Deeplink.Companion.serializer(), qoi0.a(ServiceLevel$TariffCard$BulletAction$Deeplink.class)));
    }
}
