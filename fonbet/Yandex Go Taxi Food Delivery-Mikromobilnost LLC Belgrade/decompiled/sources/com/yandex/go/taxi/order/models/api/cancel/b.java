package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class b extends n {
    public static final b INSTANCE = new b();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(17));

    @Override // com.yandex.go.taxi.order.models.api.cancel.n
    public final Action$Type a() {
        return Action$Type.CHANGE_DRIVER;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
