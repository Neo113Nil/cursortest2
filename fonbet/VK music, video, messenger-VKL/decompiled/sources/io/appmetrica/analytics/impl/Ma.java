package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;

/* loaded from: classes8.dex */
public interface Ma extends SimpleAdvertisingIdGetter, InterfaceC5229um {
    AdvertisingIdsHolder a();

    AdvertisingIdsHolder a(Qi qi);

    @Override // io.appmetrica.analytics.impl.InterfaceC5229um
    /* synthetic */ void a(@NonNull C5100pm c5100pm);

    void b(boolean z);

    void c(boolean z);

    AdvertisingIdsHolder getIdentifiers();

    void init();
}
