package com.yandex.go.chargers.subscription.data.model;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes12.dex */
public final class q extends t {
    public static final q INSTANCE = new q();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(4));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q);
    }

    public final int hashCode() {
        return -244194250;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ChargersSubscription";
    }
}
