package ru.ok.android.webrtc.stat.cpu;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CpuUsagePercentProvider {
    public final CpuUsagePercentCalculator a;
    public final CpuStore b;
    public volatile Float c;

    public CpuUsagePercentProvider() {
        this(null, null, null, 7, null);
    }

    public final Float getUsageFraction() {
        return this.c;
    }

    public final void update() {
        CpuState state;
        CpuState updateState = this.b.updateState();
        if (updateState == null || (state = this.b.getState()) == null) {
            return;
        }
        this.c = this.a.invoke$webrtc_android_sdk_release(updateState, state);
    }

    public CpuUsagePercentProvider(ProcessorStatistics processorStatistics, CpuUsagePercentCalculator cpuUsagePercentCalculator, CpuStore cpuStore) {
        this.a = cpuUsagePercentCalculator;
        this.b = cpuStore;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CpuUsagePercentProvider(ProcessorStatistics processorStatistics, CpuUsagePercentCalculator cpuUsagePercentCalculator, CpuStore cpuStore, int i, zcl zclVar) {
        this(processorStatistics, (i & 2) != 0 ? new CpuUsagePercentCalculator(processorStatistics) : cpuUsagePercentCalculator, (i & 4) != 0 ? new CpuStore(processorStatistics) : cpuStore);
        processorStatistics = (i & 1) != 0 ? new ProcessorStatistics() : processorStatistics;
    }
}
