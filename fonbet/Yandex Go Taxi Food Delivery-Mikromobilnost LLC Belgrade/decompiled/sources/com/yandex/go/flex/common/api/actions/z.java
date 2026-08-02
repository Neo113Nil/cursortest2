package com.yandex.go.flex.common.api.actions;

import defpackage.d540;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class z extends n {
    public static final z INSTANCE = new z();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d540(25));

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }
}
