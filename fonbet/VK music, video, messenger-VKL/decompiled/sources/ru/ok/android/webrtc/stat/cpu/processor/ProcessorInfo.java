package ru.ok.android.webrtc.stat.cpu.processor;

/* loaded from: classes9.dex */
public final class ProcessorInfo {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public ProcessorInfo(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final long getCsTime() {
        return this.d;
    }

    public final long getCuTime() {
        return this.c;
    }

    public final long getResidentSetSize() {
        return this.f;
    }

    public final long getSTime() {
        return this.b;
    }

    public final long getStartTime() {
        return this.e;
    }

    public final long getUTime() {
        return this.a;
    }
}
