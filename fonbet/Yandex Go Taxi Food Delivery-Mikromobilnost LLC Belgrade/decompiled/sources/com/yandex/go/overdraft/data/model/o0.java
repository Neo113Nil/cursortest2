package com.yandex.go.overdraft.data.model;

import defpackage.dvw0;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class o0 extends t0 {
    public static final o0 INSTANCE = new o0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dvw0(17));

    @Override // com.yandex.go.overdraft.data.model.t0
    public final ButtonActionType a() {
        return ButtonActionType.PLUS_TOGGLE;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
