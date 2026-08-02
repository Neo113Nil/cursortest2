package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jn;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class r0 extends q1 {
    public static final r0 INSTANCE = new r0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(20));

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.SCOOTERS_COUPONS;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
