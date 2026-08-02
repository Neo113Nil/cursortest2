package com.yandex.go.dto.response;

import defpackage.ar;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class l1 extends q1 {
    public static final l1 INSTANCE = new l1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(3));

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.TAXI_MAIN_SCREEN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
