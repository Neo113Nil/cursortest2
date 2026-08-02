package io.appmetrica.analytics.appsetid.internal;

import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* loaded from: classes8.dex */
public interface AppSetIdListener {
    void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope);

    void onFailure(Throwable th);
}
