package ru.ok.android.webrtc.stat.utils;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class Ema {
    public final double a;
    public final double b;
    public final double c;
    public double d;

    public Ema(double d) {
        this(d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 6, null);
    }

    public final double getValue() {
        return this.d;
    }

    public final void reset() {
        this.d = this.c;
    }

    public final void setValue(double d) {
        this.d = d;
    }

    public final void submit(double d) {
        double d2 = this.d;
        if (!Double.isNaN(d2)) {
            double d3 = d > d2 ? this.a : this.b;
            d = (d * d3) + ((1.0d - d3) * d2);
        }
        this.d = d;
    }

    public Ema(double d, double d2) {
        this(d, d2, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 4, null);
    }

    public Ema(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d3;
    }

    public /* synthetic */ Ema(double d, double d2, double d3, int i, zcl zclVar) {
        this(d, (i & 2) != 0 ? d : d2, (i & 4) != 0 ? Double.NaN : d3);
    }
}
