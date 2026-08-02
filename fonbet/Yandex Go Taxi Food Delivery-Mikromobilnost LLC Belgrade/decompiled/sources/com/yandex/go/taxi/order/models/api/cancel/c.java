package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class c extends n {
    public static final c INSTANCE = new c();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(18));

    @Override // com.yandex.go.taxi.order.models.api.cancel.n
    public final Action$Type a() {
        return Action$Type.CHANGE_POINT_A;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
