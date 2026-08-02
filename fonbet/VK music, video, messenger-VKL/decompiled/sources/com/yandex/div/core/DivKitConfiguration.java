package com.yandex.div.core;

import com.yandex.div.core.dagger.ExternalOptional;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.storage.DivStorageComponent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import xsna.e9e0;
import xsna.ihi0;
import xsna.rmn;
import xsna.smn;
import xsna.zcl;

/* compiled from: DivKitConfiguration.kt */
/* loaded from: classes7.dex */
public final class DivKitConfiguration {
    private final e9e0<DivRequestExecutor> divRequestExecutor;
    private final e9e0<DivStorageComponent> divStorageComponent;
    private final ExecutorService executorService;
    private final e9e0<HistogramConfiguration> histogramConfiguration;
    private final e9e0<ihi0> sendBeaconConfiguration;

    /* compiled from: DivKitConfiguration.kt */
    public static final class Builder {
        private e9e0<DivStorageComponent> divStorageComponent;
        private ExecutorService executorService;
        private e9e0<ihi0> sendBeaconConfiguration;
        private e9e0<HistogramConfiguration> histogramConfiguration = new rmn();
        private e9e0<DivRequestExecutor> divRequestExecutor = new smn();

        public final DivKitConfiguration build() {
            e9e0<ihi0> e9e0Var = this.sendBeaconConfiguration;
            ExecutorService executorService = this.executorService;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
            }
            return new DivKitConfiguration(e9e0Var, executorService, this.histogramConfiguration, this.divStorageComponent, this.divRequestExecutor, null);
        }
    }

    public /* synthetic */ DivKitConfiguration(e9e0 e9e0Var, ExecutorService executorService, e9e0 e9e0Var2, e9e0 e9e0Var3, e9e0 e9e0Var4, zcl zclVar) {
        this(e9e0Var, executorService, e9e0Var2, e9e0Var3, e9e0Var4);
    }

    public final CpuUsageHistogramReporter cpuUsageHistogramReporter() {
        return this.histogramConfiguration.get().getCpuUsageHistogramReporter().get();
    }

    public final DivRequestExecutor divRequestExecutor() {
        return this.divRequestExecutor.get();
    }

    public final ExecutorService executorService() {
        return this.executorService;
    }

    public final ExternalOptional<DivStorageComponent> externalDivStorageComponent() {
        ExternalOptional.Companion companion = ExternalOptional.Companion;
        e9e0<DivStorageComponent> e9e0Var = this.divStorageComponent;
        return companion.ofNullable(e9e0Var != null ? e9e0Var.get() : null);
    }

    public final HistogramConfiguration histogramConfiguration() {
        return this.histogramConfiguration.get();
    }

    public final HistogramRecordConfiguration histogramRecordConfiguration() {
        return this.histogramConfiguration.get();
    }

    public final HistogramRecorder histogramRecorder() {
        return new HistogramRecorder(this.histogramConfiguration.get().getHistogramBridge().get());
    }

    public final ihi0 sendBeaconConfiguration() {
        e9e0<ihi0> e9e0Var = this.sendBeaconConfiguration;
        if (e9e0Var != null) {
            return e9e0Var.get();
        }
        return null;
    }

    private DivKitConfiguration(e9e0<ihi0> e9e0Var, ExecutorService executorService, e9e0<HistogramConfiguration> e9e0Var2, e9e0<DivStorageComponent> e9e0Var3, e9e0<DivRequestExecutor> e9e0Var4) {
        this.sendBeaconConfiguration = e9e0Var;
        this.executorService = executorService;
        this.histogramConfiguration = e9e0Var2;
        this.divStorageComponent = e9e0Var3;
        this.divRequestExecutor = e9e0Var4;
    }
}
