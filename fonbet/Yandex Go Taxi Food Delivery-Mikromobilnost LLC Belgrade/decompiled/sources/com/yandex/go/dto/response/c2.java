package com.yandex.go.dto.response;

import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class c2 extends d2 {
    public static final c2 INSTANCE = new c2();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(12));

    @Override // com.yandex.go.dto.response.d2
    public final UnavailabilityActionType a() {
        return UnavailabilityActionType.OPEN_TARIFF_CARD;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
