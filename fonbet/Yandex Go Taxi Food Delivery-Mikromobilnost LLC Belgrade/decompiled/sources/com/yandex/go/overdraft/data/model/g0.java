package com.yandex.go.overdraft.data.model;

import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class g0 extends t0 {
    public static final g0 INSTANCE = new g0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(12));

    @Override // com.yandex.go.overdraft.data.model.t0
    public final ButtonActionType a() {
        return ButtonActionType.CONTINUE_CREATE_ORDER;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
