package ru.ok.android.webrtc.stat.cpu;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.schedulers.a;
import java.util.concurrent.TimeUnit;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import ru.ok.android.webrtc.stat.cpu.ram.MemoryInfo;
import ru.ok.android.webrtc.stat.cpu.ram.MemoryUsageProvider;
import xsna.cbz0;
import xsna.gcz0;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class HardwareInfoPeriodicRetriever {
    public final ProcessorStatistics a;
    public final CpuScoreProvider b;
    public final CpuUsagePercentProvider c;
    public final MemoryUsageProvider d;
    public b e;

    /* JADX WARN: Multi-variable type inference failed */
    public HardwareInfoPeriodicRetriever() {
        ProcessorStatistics processorStatistics = new ProcessorStatistics();
        this.a = processorStatistics;
        int i = 6;
        zcl zclVar = null;
        CpuStore cpuStore = null;
        this.b = new CpuScoreProvider(processorStatistics, null, cpuStore, i, zclVar);
        this.c = new CpuUsagePercentProvider(processorStatistics, 0 == true ? 1 : 0, cpuStore, i, zclVar);
        this.d = new MemoryUsageProvider(processorStatistics, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        this.e = new b();
    }

    public static /* synthetic */ void start$default(HardwareInfoPeriodicRetriever hardwareInfoPeriodicRetriever, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 5000;
        }
        if ((i & 2) != 0) {
            j2 = 1000;
        }
        hardwareInfoPeriodicRetriever.start(j, j2);
    }

    public final CpuInfo getCpuInfo() {
        return new CpuInfo(this.c.getUsageFraction(), this.b.resetCpuScoreMax(), this.b.resetCpuScoreAvg(), this.a.getCountLogicalCpuCores());
    }

    public final MemoryInfo getMemoryInfo() {
        return new MemoryInfo(this.d.resetMemoryUsageKbMax(), this.d.resetMemoryUsageKbAvg());
    }

    public final void start(long j, long j2) {
        stop();
        b bVar = this.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.b(q.Q(j, j, timeUnit, a.b()).subscribe(new cbz0(this)));
        this.e.b(q.Q(j2, j2, timeUnit, a.b()).subscribe(new gcz0(this)));
    }

    public final void stop() {
        this.e.dispose();
        this.e = new b();
    }
}
