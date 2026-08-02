package ru.ok.android.webrtc.stat.cpu;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorInfo;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CpuStore {
    public final ProcessorStatistics a;
    public volatile CpuState b;

    /* JADX WARN: Multi-variable type inference failed */
    public CpuStore() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final CpuState getState() {
        return this.b;
    }

    public final CpuState updateState() {
        if (!this.a.sanityCheck()) {
            return null;
        }
        CpuState cpuState = this.b;
        ProcessorInfo processorInfo = this.a.getProcessorInfo();
        this.b = processorInfo != null ? new CpuState(TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()), processorInfo) : null;
        return cpuState;
    }

    public CpuStore(ProcessorStatistics processorStatistics) {
        this.a = processorStatistics;
    }

    public /* synthetic */ CpuStore(ProcessorStatistics processorStatistics, int i, zcl zclVar) {
        this((i & 1) != 0 ? new ProcessorStatistics() : processorStatistics);
    }
}
