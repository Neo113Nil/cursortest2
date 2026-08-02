package com.yandex.passport.common.network;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BackendError.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
