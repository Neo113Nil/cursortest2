package com.yandex.go.shortcuts.dto.response;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.v8f0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class p1 extends y0 {
    public static final p1 INSTANCE = new p1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v8f0(5));

    @Override // com.yandex.go.shortcuts.dto.response.y0
    public final ProductMode$Taxi.AboveCardObjectType a() {
        return ProductMode$Taxi.AboveCardObjectType.UNKNOWN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
