package com.yandex.go.dto.response;

import defpackage.ar;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class m1 extends q1 {
    public static final m1 INSTANCE = new m1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(4));

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.TAXI_PROCEED;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
