package ru.ok.android.webrtc.stat.cpu;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.stat.cpu.processor.ProcessorStatistics;
import xsna.s3q0;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CpuScoreProvider {
    public final ProcessorStatistics a;
    public final CpuUsagePercentCalculator b;
    public final CpuStore c;
    public long d;
    public long e;
    public int f;
    public final Object g;

    public CpuScoreProvider() {
        this(null, null, null, 7, null);
    }

    public final void a(long j) {
        synchronized (this.g) {
            this.e += j;
            this.f++;
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final Long resetCpuScoreAvg() {
        Long l;
        int i;
        synchronized (this.g) {
            try {
                long j = this.e;
                if (j != 0 && (i = this.f) != 0) {
                    l = Long.valueOf(j / i);
                    this.f = 0;
                    this.e = 0L;
                }
                l = null;
                this.f = 0;
                this.e = 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l;
    }

    public final Long resetCpuScoreMax() {
        Long valueOf;
        synchronized (this.g) {
            long j = this.d;
            valueOf = j == 0 ? null : Long.valueOf(j);
            this.d = 0L;
        }
        return valueOf;
    }

    public final void update() {
        CpuState state;
        Float invoke$webrtc_android_sdk_release;
        CpuState updateState = this.c.updateState();
        if (updateState == null || (state = this.c.getState()) == null || (invoke$webrtc_android_sdk_release = this.b.invoke$webrtc_android_sdk_release(updateState, state)) == null) {
            return;
        }
        long floatValue = (long) (invoke$webrtc_android_sdk_release.floatValue() * 100 * this.a.getClockTickHz() * this.a.getProcessorNumber());
        synchronized (this.g) {
            this.d = Math.max(this.d, floatValue);
            s3q0 s3q0Var = s3q0.a;
        }
        a(floatValue);
    }

    public CpuScoreProvider(ProcessorStatistics processorStatistics, CpuUsagePercentCalculator cpuUsagePercentCalculator, CpuStore cpuStore) {
        this.a = processorStatistics;
        this.b = cpuUsagePercentCalculator;
        this.c = cpuStore;
        this.g = new Object();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CpuScoreProvider(ProcessorStatistics processorStatistics, CpuUsagePercentCalculator cpuUsagePercentCalculator, CpuStore cpuStore, int i, zcl zclVar) {
        this(processorStatistics, (i & 2) != 0 ? new CpuUsagePercentCalculator(processorStatistics) : cpuUsagePercentCalculator, (i & 4) != 0 ? new CpuStore(processorStatistics) : cpuStore);
        processorStatistics = (i & 1) != 0 ? new ProcessorStatistics() : processorStatistics;
    }
}
