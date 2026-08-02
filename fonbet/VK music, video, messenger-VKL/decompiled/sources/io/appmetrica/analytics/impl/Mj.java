package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes8.dex */
public final class Mj implements InterfaceC4753cb {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;

    public Mj(PluginErrorDetails pluginErrorDetails, String str) {
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.getPluginExtension().reportError(this.a, this.b);
    }
}
