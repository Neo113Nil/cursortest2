package com.yandex.go.taxi.order.models.api.cancel;

import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pn0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes14.dex */
public final class s extends t {
    public static final s INSTANCE = new s();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(21));

    @Override // com.yandex.go.taxi.order.models.api.cancel.t
    public final AfterCancelPopupButton.ActionType a() {
        return AfterCancelPopupButton.ActionType.UNKNOWN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
