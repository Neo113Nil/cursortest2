package com.yandex.go.taxi.order.chat.api.data.model;

import com.yandex.go.taxi.order.chat.api.data.model.Sender;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class h {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Sender.Role.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
