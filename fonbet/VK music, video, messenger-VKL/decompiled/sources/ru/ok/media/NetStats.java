package ru.ok.media;

import xsna.xq;

/* loaded from: classes9.dex */
public class NetStats {
    public final float loss;
    public final int mtu;
    public final float netOverhead;
    public final int rttMS;

    public NetStats(int i, float f, int i2, float f2) {
        this.mtu = i;
        this.loss = f;
        this.rttMS = i2;
        this.netOverhead = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetStats{mtu=");
        sb.append(this.mtu);
        sb.append(", loss=");
        sb.append(this.loss);
        sb.append(", rttMS=");
        sb.append(this.rttMS);
        sb.append(", netOverhead=");
        return xq.c('}', this.netOverhead, sb);
    }
}
