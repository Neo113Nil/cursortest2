package com.yandex.plus.pay.repository.api.model.offers;

import com.yandex.plus.pay.repository.api.model.offers.RichText;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class a {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RichText.Item.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
