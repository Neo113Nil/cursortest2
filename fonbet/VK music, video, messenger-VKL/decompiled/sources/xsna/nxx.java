package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: JavaDoubleBitsFromCharSequence.java */
/* loaded from: classes12.dex */
public final class nxx extends ze {
    @Override // xsna.ze
    public final long c() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // xsna.ze
    public final long d() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // xsna.ze
    public final long f() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // xsna.ze
    public final long h(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3) {
        double a;
        if (j == 0) {
            a = z ? -0.0d : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        } else if (z2) {
            if (-325 <= i3 && i3 <= 308) {
                double a2 = wkq.a(i3, j, z);
                double a3 = wkq.a(i3, j + 1, z);
                if (!Double.isNaN(a2) && a3 == a2) {
                    a = a2;
                }
            }
            a = Double.NaN;
        } else {
            if (-325 <= i2 && i2 <= 308) {
                a = wkq.a(i2, j, z);
            }
            a = Double.NaN;
        }
        if (Double.isNaN(a)) {
            a = Double.parseDouble(charSequence.subSequence(0, i).toString());
        }
        return Double.doubleToRawLongBits(a);
    }

    @Override // xsna.ze
    public final long i(CharSequence charSequence, int i, boolean z, long j, int i2, boolean z2, int i3) {
        double d;
        int i4 = z2 ? i3 : i2;
        if (-1022 > i4 || i4 > 1023) {
            d = Double.NaN;
        } else {
            d = Math.scalb(1.0d, i4) * Math.abs(j);
            if (z) {
                d = -d;
            }
        }
        if (Double.isNaN(d)) {
            d = Double.parseDouble(charSequence.subSequence(0, i).toString());
        }
        return Double.doubleToRawLongBits(d);
    }
}
