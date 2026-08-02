package ru.ok.android.webrtc.stat.cpu.ram;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.stat.cpu.CpuState;
import ru.ok.android.webrtc.stat.cpu.CpuStore;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import xsna.s3q0;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class MemoryUsageProvider {
    public final ProcessorStatistics a;
    public final CpuStore b;
    public long c;
    public long d;
    public int e;
    public final Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public MemoryUsageProvider() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void a(long j) {
        synchronized (this.f) {
            this.d += j;
            this.e++;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final Long resetMemoryUsageKbAvg() {
        Long l;
        synchronized (this.f) {
            try {
                long j = this.d;
                int i = this.e;
                if (j != 0 && i != 0) {
                    l = Long.valueOf(j / i);
                    this.e = 0;
                    this.d = 0L;
                }
                l = null;
                this.e = 0;
                this.d = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l;
    }

    public final Long resetMemoryUsageKbMax() {
        Long valueOf;
        synchronized (this.f) {
            long j = this.c;
            valueOf = j == 0 ? null : Long.valueOf(j);
            this.c = 0L;
        }
        return valueOf;
    }

    public final void update() {
        this.b.updateState();
        CpuState state = this.b.getState();
        if (state == null) {
            return;
        }
        long pageSizeKb = this.a.getPageSizeKb() * state.getProcessorInfo().getResidentSetSize();
        synchronized (this.f) {
            this.c = Math.max(pageSizeKb, this.c);
            s3q0 s3q0Var = s3q0.a;
        }
        a(pageSizeKb);
    }

    public MemoryUsageProvider(ProcessorStatistics processorStatistics, CpuStore cpuStore) {
        this.a = processorStatistics;
        this.b = cpuStore;
        this.f = new Object();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MemoryUsageProvider(ProcessorStatistics processorStatistics, CpuStore cpuStore, int i, zcl zclVar) {
        this(processorStatistics, (i & 2) != 0 ? new CpuStore(processorStatistics) : cpuStore);
        processorStatistics = (i & 1) != 0 ? new ProcessorStatistics() : processorStatistics;
    }
}
