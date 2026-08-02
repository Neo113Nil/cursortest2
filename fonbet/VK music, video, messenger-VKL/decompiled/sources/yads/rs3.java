package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import xsna.epx;

/* loaded from: classes10.dex */
public final class rs3 implements l00 {
    public final InitializationListener a;

    public rs3(InitializationListener initializationListener) {
        this.a = initializationListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rs3) && epx.f(((rs3) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // yads.l00
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new qs3(this));
    }
}
