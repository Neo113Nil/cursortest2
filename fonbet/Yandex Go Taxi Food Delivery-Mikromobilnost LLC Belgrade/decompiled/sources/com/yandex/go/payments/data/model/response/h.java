package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class h {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AddSbpTokenButtonDto.StateType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
