package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes8.dex */
public final class Ye implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;
    public final /* synthetic */ Ze d;

    public Ye(Ze ze, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.d = ze;
        this.a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC4779db) this.d.d.get()).getPluginExtension().reportError(this.a, this.b, this.c);
    }
}
