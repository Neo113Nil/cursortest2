package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes15.dex */
public final class q {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BulletsOrderPopup.HeaderAppearance.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
