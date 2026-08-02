package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.BrandingCashbackStyle;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class k {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BrandingCashbackStyle.Style.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
