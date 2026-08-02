package com.yandex.messaging.core.net.entities;

import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import defpackage.ngz;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/UpdateOrganizationError;", "Lngz;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateOrganizationError extends ngz {
    public final UpdateOrganizationResult.BaseError e;

    public UpdateOrganizationError(UpdateOrganizationResult.BaseError baseError) {
        super(UpdateOrganizationResult.BaseError.UNPROCESSABLE_ENTITY, baseError.getCode(), "");
        this.e = baseError;
    }
}
