package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import xsna.trk0;

/* renamed from: io.appmetrica.analytics.impl.r2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5131r2 {
    public static final boolean a(Throwable th) {
        return true;
    }

    public final Ra a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC4830fb interfaceC4830fb) {
        return new Lh(new C5141rc(interfaceC4830fb, appMetricaConfig), new trk0(8), appMetricaConfig.crashTransformer, new Y9(context));
    }
}
