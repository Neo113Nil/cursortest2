package ru.ok.android.webrtc.stat.cpu;

import ru.ok.android.webrtc.stat.cpu.processor.ProcessorInfo;
import xsna.epx;

/* loaded from: classes9.dex */
public final class CpuState {
    public final long a;
    public final ProcessorInfo b;

    public CpuState(long j, ProcessorInfo processorInfo) {
        this.a = j;
        this.b = processorInfo;
    }

    public static /* synthetic */ CpuState copy$default(CpuState cpuState, long j, ProcessorInfo processorInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cpuState.a;
        }
        if ((i & 2) != 0) {
            processorInfo = cpuState.b;
        }
        return cpuState.copy(j, processorInfo);
    }

    public final long component1() {
        return this.a;
    }

    public final ProcessorInfo component2() {
        return this.b;
    }

    public final CpuState copy(long j, ProcessorInfo processorInfo) {
        return new CpuState(j, processorInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CpuState)) {
            return false;
        }
        CpuState cpuState = (CpuState) obj;
        return this.a == cpuState.a && epx.f(this.b, cpuState.b);
    }

    public final float getCpuTimeSec(float f) {
        return (this.b.getUTime() + (this.b.getSTime() + (this.b.getCuTime() + this.b.getCsTime()))) / f;
    }

    public final float getProcessTimeSec(float f) {
        return this.a - (this.b.getStartTime() / f);
    }

    public final ProcessorInfo getProcessorInfo() {
        return this.b;
    }

    public final long getUptime() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public String toString() {
        return "CpuState(uptime=" + this.a + ", processorInfo=" + this.b + ")";
    }
}
