package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes8.dex */
public final class Xe implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Ze c;

    public Xe(Ze ze, PluginErrorDetails pluginErrorDetails, String str) {
        this.c = ze;
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4779db) this.c.d.get()).getPluginExtension().reportError(this.a, this.b);
    }
}
