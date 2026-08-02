package com.yandex.go.overdraft.data.model;

import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class i0 extends t0 {
    public static final i0 INSTANCE = new i0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(14));

    @Override // com.yandex.go.overdraft.data.model.t0
    public final ButtonActionType a() {
        return ButtonActionType.OPEN_PAYMENT_METHODS_TO_PAY_DEBT;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
