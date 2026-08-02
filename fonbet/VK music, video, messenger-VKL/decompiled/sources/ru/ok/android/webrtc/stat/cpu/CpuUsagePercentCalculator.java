package ru.ok.android.webrtc.stat.cpu;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Lazy;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import xsna.bpn0;
import xsna.wqf;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CpuUsagePercentCalculator {
    public final ProcessorStatistics a;
    public final Lazy b;

    /* JADX WARN: Multi-variable type inference failed */
    public CpuUsagePercentCalculator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final float a(CpuUsagePercentCalculator cpuUsagePercentCalculator) {
        return cpuUsagePercentCalculator.a.getClockTickHz();
    }

    public final Float invoke$webrtc_android_sdk_release(CpuState cpuState, CpuState cpuState2) {
        float cpuTimeSec = cpuState2.getCpuTimeSec(((Number) this.b.getValue()).floatValue()) - cpuState.getCpuTimeSec(((Number) this.b.getValue()).floatValue());
        float processTimeSec = cpuState2.getProcessTimeSec(((Number) this.b.getValue()).floatValue()) - cpuState.getProcessTimeSec(((Number) this.b.getValue()).floatValue());
        if (Math.abs(processTimeSec) > Float.MAX_VALUE || processTimeSec == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return null;
        }
        float processorNumber = (cpuTimeSec / processTimeSec) / this.a.getProcessorNumber();
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > processorNumber || processorNumber > 1.0f) {
            return null;
        }
        return Float.valueOf(processorNumber);
    }

    public CpuUsagePercentCalculator(ProcessorStatistics processorStatistics) {
        this.a = processorStatistics;
        this.b = new bpn0(new wqf(this, 8));
    }

    public /* synthetic */ CpuUsagePercentCalculator(ProcessorStatistics processorStatistics, int i, zcl zclVar) {
        this((i & 1) != 0 ? new ProcessorStatistics() : processorStatistics);
    }
}
