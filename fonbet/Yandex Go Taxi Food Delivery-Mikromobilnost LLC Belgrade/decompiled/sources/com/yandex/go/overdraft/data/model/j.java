package com.yandex.go.overdraft.data.model;

import com.yandex.go.overdraft.data.model.DebtDetail;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class j {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DebtDetail.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
