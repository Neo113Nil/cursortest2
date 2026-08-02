package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wrp0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class l0 extends n {
    public static final l0 INSTANCE = new l0();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(20));

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }
}
