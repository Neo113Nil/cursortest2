package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes8.dex */
public final class Xl implements M6 {
    public final /* synthetic */ StartupParamsCallback a;
    public final /* synthetic */ Yl b;

    public Xl(Yl yl, StartupParamsCallback startupParamsCallback) {
        this.b = yl;
        this.a = startupParamsCallback;
    }

    @Override // io.appmetrica.analytics.impl.M6
    public final void a(int i, Bundle bundle) {
        this.b.b(bundle, this.a);
    }
}
