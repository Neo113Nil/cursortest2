package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kz60;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class e0 extends n {
    public static final e0 INSTANCE = new e0();
    public static final /* synthetic */ i3y b = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(6));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e0);
    }

    public final int hashCode() {
        return 2643863;
    }

    public final KSerializer serializer() {
        return (KSerializer) b.getValue();
    }

    public final String toString() {
        return "OpenSuperappSearchAction";
    }
}
