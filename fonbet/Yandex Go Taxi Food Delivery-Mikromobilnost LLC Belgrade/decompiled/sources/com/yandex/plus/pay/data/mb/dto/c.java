package com.yandex.plus.pay.data.mb.dto;

import com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SubscriptionInfoDto.SubscriptionStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
