package com.yandex.go.shortcuts.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.vye0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class o0 extends t1 {
    public static final o0 INSTANCE = new o0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vye0(18));

    @Override // com.yandex.go.shortcuts.dto.response.t1
    public final Mode a() {
        return Mode.DELIVERY;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
