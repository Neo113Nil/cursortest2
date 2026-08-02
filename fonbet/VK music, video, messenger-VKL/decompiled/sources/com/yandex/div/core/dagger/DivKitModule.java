package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.internal.viewpool.ViewCreator;
import xsna.ihi0;
import xsna.khi0;

/* compiled from: DivKitModule.kt */
/* loaded from: classes7.dex */
public final class DivKitModule {
    public static final DivKitModule INSTANCE = new DivKitModule();

    private DivKitModule() {
    }

    public static final khi0 provideSendBeaconManager(Context context, ihi0 ihi0Var) {
        if (ihi0Var == null) {
            return null;
        }
        return new khi0(context, ihi0Var);
    }

    public static final ViewCreator provideViewCreator(CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        return new ViewCreator(cpuUsageHistogramReporter);
    }
}
