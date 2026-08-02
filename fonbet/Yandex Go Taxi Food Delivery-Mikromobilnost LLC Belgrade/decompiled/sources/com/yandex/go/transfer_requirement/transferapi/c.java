package com.yandex.go.transfer_requirement.transferapi;

import com.yandex.go.transfer_requirement.transferapi.TransferErrorDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TransferErrorDto.TransferDraftErrorCode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
