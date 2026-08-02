package defpackage;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import yads.gp3;

/* loaded from: classes7.dex */
public final class ae71 implements bz61 {
    public final InitializationListener a;

    public ae71(InitializationListener initializationListener) {
        this.a = initializationListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ae71) && jl40.l(((ae71) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bz61
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new gp3(this));
    }
}
