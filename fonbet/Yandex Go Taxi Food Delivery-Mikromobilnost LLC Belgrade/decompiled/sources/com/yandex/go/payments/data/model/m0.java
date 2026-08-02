package com.yandex.go.payments.data.model;

import com.yandex.go.payments.data.model.SharedAccountDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class m0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SharedAccountDto.MemberRole.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
