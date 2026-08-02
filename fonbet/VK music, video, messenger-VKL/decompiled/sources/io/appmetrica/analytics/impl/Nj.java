package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes8.dex */
public final class Nj implements InterfaceC4753cb {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;

    public Nj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4753cb
    public final void a(InterfaceC4779db interfaceC4779db) {
        interfaceC4779db.getPluginExtension().reportError(this.a, this.b, this.c);
    }
}
