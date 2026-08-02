package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class d extends n {
    public static final d INSTANCE = new d();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(16));

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }
}
