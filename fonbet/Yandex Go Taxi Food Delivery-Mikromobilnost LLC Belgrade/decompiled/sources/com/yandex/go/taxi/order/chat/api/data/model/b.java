package com.yandex.go.taxi.order.chat.api.data.model;

import com.yandex.go.taxi.order.chat.api.data.model.Message;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Message.Action.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
