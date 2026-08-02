package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5317ya implements InterfaceC5252vk {
    @Override // io.appmetrica.analytics.impl.InterfaceC5252vk
    public final void onCreate() {
        NetworkServiceLocator.getInstance().onCreate();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5252vk
    public final void onDestroy() {
        NetworkServiceLocator.getInstance().onDestroy();
    }
}
