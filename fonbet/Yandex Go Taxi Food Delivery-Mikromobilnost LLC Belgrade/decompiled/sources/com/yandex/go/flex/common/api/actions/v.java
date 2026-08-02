package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class v extends r {
    public static final v INSTANCE = new v("current_a");
    public static final /* synthetic */ i3y c = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(22));

    public final KSerializer serializer() {
        return (KSerializer) c.getValue();
    }
}
