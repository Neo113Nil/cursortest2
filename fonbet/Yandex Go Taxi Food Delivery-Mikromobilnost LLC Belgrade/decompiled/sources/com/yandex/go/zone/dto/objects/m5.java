package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.SummaryCardPromo;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes15.dex */
public final class m5 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SummaryCardPromo.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
