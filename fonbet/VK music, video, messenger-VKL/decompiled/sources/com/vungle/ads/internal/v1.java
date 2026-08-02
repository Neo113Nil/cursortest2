package com.vungle.ads.internal;

import android.content.Context;

/* loaded from: classes7.dex */
public final class v1 {
    public final ServiceLocator a(Context context) {
        ServiceLocator serviceLocator;
        ServiceLocator serviceLocator2;
        serviceLocator = ServiceLocator.INSTANCE;
        if (serviceLocator != null) {
            return serviceLocator;
        }
        synchronized (this) {
            serviceLocator2 = ServiceLocator.INSTANCE;
            if (serviceLocator2 == null) {
                serviceLocator2 = new ServiceLocator(context, 0);
                ServiceLocator.INSTANCE = serviceLocator2;
            }
        }
        return serviceLocator2;
    }
}
