package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jn;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class a extends q1 {
    public static final a INSTANCE = new a();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(1));

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.CAR_TECH;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
