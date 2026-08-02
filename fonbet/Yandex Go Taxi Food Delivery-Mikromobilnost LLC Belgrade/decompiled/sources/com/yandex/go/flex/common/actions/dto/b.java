package com.yandex.go.flex.common.actions.dto;

import com.yandex.go.flex.common.actions.dto.HapticAction;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = HapticAction.HapticType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
