package com.yandex.go.transfer_requirement.transferapi;

import com.yandex.go.transfer_requirement.transferapi.TransferParam;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class f {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TransferParam.TransferType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
