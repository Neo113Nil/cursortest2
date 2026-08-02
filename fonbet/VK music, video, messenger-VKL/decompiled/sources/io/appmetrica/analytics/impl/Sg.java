package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes8.dex */
public final class Sg implements Ul {
    public final Km a;

    public Sg(@NonNull Km km) {
        this.a = km;
    }

    @Override // io.appmetrica.analytics.impl.Ul
    public final void a() {
        NetworkTask c = this.a.c();
        if (c != null) {
            C5342za.I.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(c);
        }
    }
}
