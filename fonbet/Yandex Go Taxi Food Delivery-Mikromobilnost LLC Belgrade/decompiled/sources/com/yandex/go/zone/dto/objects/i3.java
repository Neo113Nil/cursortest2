package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.PopupUiControl;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class i3 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PopupUiControl.OpenSummaryAddress.FocusField.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
