package com.yandex.go.chargers.partner_subscription.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nba;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class b extends f {
    public static final b INSTANCE = new b();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(6));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof b);
    }

    public final int hashCode() {
        return -1800416608;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Close";
    }
}
