package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;
import xsna.n9k;
import xsna.rky;
import xsna.te9;

/* loaded from: classes8.dex */
public final class L0 {
    public final IHandlerExecutor a = C5030n4.l().g().a();
    public final C5332z0 b;
    public final C4731bf c;
    public final C4808ef d;

    public L0() {
        C5332z0 c5332z0 = new C5332z0();
        this.b = c5332z0;
        this.c = new C4731bf(c5332z0);
        this.d = new C4808ef();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        C4731bf c4731bf = this.c;
        c4731bf.a.a(null);
        c4731bf.b.a(pluginErrorDetails);
        this.d.getClass();
        this.a.execute(new te9(4, this, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        C4731bf c4731bf = this.c;
        c4731bf.a.a(null);
        c4731bf.b.a(pluginErrorDetails);
        if (c4731bf.d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).a) {
            this.d.getClass();
            this.a.execute(new n9k(this, pluginErrorDetails, str, 1));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C4731bf c4731bf = this.c;
        c4731bf.a.a(null);
        c4731bf.c.a(str);
        this.d.getClass();
        this.a.execute(new rky(this, str, str2, pluginErrorDetails, 0));
    }

    public static final void a(L0 l0, PluginErrorDetails pluginErrorDetails, String str) {
        l0.b.getClass();
        C5307y0.e.f().i().a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(L0 l0, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        l0.b.getClass();
        C5307y0.e.f().i().a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(L0 l0, PluginErrorDetails pluginErrorDetails) {
        l0.b.getClass();
        C5307y0.e.f().i().a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
