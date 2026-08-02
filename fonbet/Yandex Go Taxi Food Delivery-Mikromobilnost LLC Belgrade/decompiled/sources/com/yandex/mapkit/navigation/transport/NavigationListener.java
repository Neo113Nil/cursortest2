package com.yandex.mapkit.navigation.transport;

import com.yandex.runtime.Error;

/* loaded from: classes8.dex */
public interface NavigationListener {
    void onResetRoutes();

    void onRoutesBuilt();

    void onRoutingError(Error error);
}
