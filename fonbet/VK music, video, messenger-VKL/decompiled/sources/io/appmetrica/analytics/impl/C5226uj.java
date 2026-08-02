package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.uj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5226uj {
    public final String a;
    public final Context b;
    public final CounterConfigurationReporterType c;
    public final C5301xj d;

    public C5226uj(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C5301xj c5301xj) {
        this.a = str;
        this.b = context;
        int i = AbstractC5200tj.a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.c = null;
        } else {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.d = c5301xj;
    }
}
