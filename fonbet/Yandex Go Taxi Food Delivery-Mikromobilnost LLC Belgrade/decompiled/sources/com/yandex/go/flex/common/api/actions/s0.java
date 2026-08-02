package com.yandex.go.flex.common.api.actions;

import defpackage.gjx0;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class s0 extends n {
    public static final s0 INSTANCE = new s0();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gjx0(17));

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }
}
