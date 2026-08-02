package com.yandex.go.taxi.order.models.api.cancel;

import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class a0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CancelSimilarOrdersNotification.ModalType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
