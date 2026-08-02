package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.Card;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class u {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Card.VerifyStrategy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
