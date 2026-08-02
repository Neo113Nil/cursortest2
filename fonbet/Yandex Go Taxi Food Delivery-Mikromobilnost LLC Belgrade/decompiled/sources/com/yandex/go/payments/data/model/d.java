package com.yandex.go.payments.data.model;

import com.yandex.go.payments.data.model.BindGooglePayParams;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BindGooglePayParams.TokenizationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
