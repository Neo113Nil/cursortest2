package com.yandex.go.dto.response;

import com.yandex.go.dto.response.Action$TaxiExpectedDestination;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class k1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Action$TaxiExpectedDestination.Prefetch.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
