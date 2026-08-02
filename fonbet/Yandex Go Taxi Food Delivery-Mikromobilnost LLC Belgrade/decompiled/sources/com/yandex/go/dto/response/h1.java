package com.yandex.go.dto.response;

import defpackage.ar;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class h1 extends q1 {
    public static final h1 INSTANCE = new h1();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(0));

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.SUPERAPP_SEARCH;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
