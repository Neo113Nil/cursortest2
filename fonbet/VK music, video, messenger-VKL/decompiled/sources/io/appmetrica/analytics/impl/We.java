package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes8.dex */
public final class We implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ Ze b;

    public We(Ze ze, PluginErrorDetails pluginErrorDetails) {
        this.b = ze;
        this.a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4779db) this.b.d.get()).getPluginExtension().reportUnhandledException(this.a);
    }
}
