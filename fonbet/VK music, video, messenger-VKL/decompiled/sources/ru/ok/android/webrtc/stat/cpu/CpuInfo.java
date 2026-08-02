package ru.ok.android.webrtc.stat.cpu;

import xsna.zcl;

/* loaded from: classes9.dex */
public final class CpuInfo {
    public final Float a;
    public final Long b;
    public final Long c;
    public final int d;

    public CpuInfo(Float f, Long l, Long l2, int i) {
        this.a = f;
        this.b = l;
        this.c = l2;
        this.d = i;
    }

    public final int getCountLogicalCpuCores() {
        return this.d;
    }

    public final Long getCpuAvgScore() {
        return this.c;
    }

    public final Long getCpuMaxScore() {
        return this.b;
    }

    public final Float getUsageFraction() {
        return this.a;
    }

    public /* synthetic */ CpuInfo(Float f, Long l, Long l2, int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? null : f, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : l2, i);
    }
}
