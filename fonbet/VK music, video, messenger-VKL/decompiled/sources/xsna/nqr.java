package xsna;

import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: FloatAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class nqr implements aqr {
    public final float a;
    public final wmk0 b;

    public nqr(float f, float f2, float f3) {
        this.a = f3;
        wmk0 wmk0Var = new wmk0();
        wmk0Var.a = 1.0f;
        wmk0Var.b = Math.sqrt(50.0d);
        wmk0Var.c = 1.0f;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ixc0.a("Damping ratio must be non-negative");
        }
        wmk0Var.c = f;
        double d = wmk0Var.b;
        if (((float) (d * d)) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ixc0.a("Spring stiffness constant must be positive.");
        }
        wmk0Var.b = Math.sqrt(f2);
        this.b = wmk0Var;
    }

    @Override // xsna.aqr
    public final float b(long j, float f, float f2, float f3) {
        wmk0 wmk0Var = this.b;
        wmk0Var.a = f2;
        return Float.intBitsToFloat((int) (wmk0Var.a(j / 1000000, f, f3) & 4294967295L));
    }

    @Override // xsna.aqr
    public final long c(float f, float f2, float f3) {
        double d;
        int i;
        long j;
        wmk0 wmk0Var = this.b;
        double d2 = wmk0Var.b;
        float f4 = (float) (d2 * d2);
        float f5 = wmk0Var.c;
        float f6 = this.a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            j = 9223372036854L;
        } else {
            double d3 = f4;
            double d4 = f5;
            double d5 = f8;
            double d6 = f7;
            double d7 = 1.0f;
            double sqrt = d4 * 2.0d * Math.sqrt(d3);
            double d8 = (sqrt * sqrt) - (d3 * 4.0d);
            double sqrt2 = d8 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? 0.0d : Math.sqrt(d8);
            double d9 = -sqrt;
            double d10 = (d9 + sqrt2) * 0.5d;
            double sqrt3 = (d8 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? Math.sqrt(Math.abs(d8)) : 0.0d) * 0.5d;
            double d11 = (d9 - sqrt2) * 0.5d;
            if (d6 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE && d5 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                j = 0;
            } else {
                if (d6 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    d5 = -d5;
                }
                double abs = Math.abs(d6);
                double d12 = Double.MAX_VALUE;
                if (d4 > 1.0d) {
                    double d13 = (d10 * abs) - d5;
                    double d14 = d10 - d11;
                    double d15 = d13 / d14;
                    double d16 = abs - d15;
                    d = Math.log(Math.abs(d7 / d16)) / d10;
                    double log = Math.log(Math.abs(d7 / d15)) / d11;
                    if ((Double.doubleToRawLongBits(d) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        d = log;
                    } else if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                        d = Math.max(d, log);
                    }
                    double d17 = d16 * d10;
                    double log2 = Math.log(d17 / ((-d15) * d11)) / (d11 - d10);
                    if (Double.isNaN(log2) || log2 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        d7 = -d7;
                    } else {
                        if (log2 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            if ((-((Math.exp(log2 * d11) * d15) + (Math.exp(d10 * log2) * d16))) < d7) {
                                d7 = -d7;
                                d = (d15 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE || d16 >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) ? d : 0.0d;
                            }
                        }
                        d = Math.log((-((d15 * d11) * d11)) / (d17 * d10)) / d14;
                    }
                    double d18 = d15 * d11;
                    if (Math.abs((Math.exp(d11 * d) * d18) + (Math.exp(d10 * d) * d17)) >= 1.0E-4d) {
                        int i2 = 0;
                        while (d12 > 0.001d && i2 < 100) {
                            i2++;
                            double d19 = d10 * d;
                            double d20 = d11 * d;
                            double exp = d - ((((Math.exp(d20) * d15) + (Math.exp(d19) * d16)) + d7) / ((Math.exp(d20) * d18) + (Math.exp(d19) * d17)));
                            d12 = Math.abs(d - exp);
                            d = exp;
                        }
                    }
                } else if (d4 < 1.0d) {
                    double d21 = (d5 - (d10 * abs)) / sqrt3;
                    d = Math.log(d7 / Math.sqrt((d21 * d21) + (abs * abs))) / d10;
                } else {
                    double d22 = d10 * abs;
                    double d23 = d5 - d22;
                    double log3 = Math.log(Math.abs(d7 / abs)) / d10;
                    double log4 = Math.log(Math.abs(d7 / d23));
                    double d24 = log4;
                    for (int i3 = 0; i3 < 6; i3++) {
                        d24 = log4 - Math.log(Math.abs(d24 / d10));
                    }
                    double d25 = d24 / d10;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        log3 = d25;
                    } else if ((Double.doubleToRawLongBits(d25) & Long.MAX_VALUE) < 9218868437227405312L) {
                        log3 = Math.max(log3, d25);
                    }
                    double d26 = (-(d22 + d23)) / (d10 * d23);
                    double d27 = d10 * d26;
                    double exp2 = (Math.exp(d27) * d23 * d26) + (Math.exp(d27) * abs);
                    if (!Double.isNaN(d26) && d26 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        if (d26 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE || (-exp2) >= d7) {
                            log3 = (-(2.0d / d10)) - (abs / d23);
                            d = log3;
                            i = 0;
                            while (d12 > 0.001d && i < 100) {
                                i++;
                                double d28 = d10 * d;
                                double exp3 = d - (((Math.exp(d28) * ((d23 * d) + abs)) + d7) / (Math.exp(d28) * (((1 + d28) * d23) + d22)));
                                d12 = Math.abs(d - exp3);
                                d = exp3;
                            }
                        } else if (d23 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE && abs > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            log3 = 0.0d;
                        }
                    }
                    d7 = -d7;
                    d = log3;
                    i = 0;
                    while (d12 > 0.001d) {
                        i++;
                        double d282 = d10 * d;
                        double exp32 = d - (((Math.exp(d282) * ((d23 * d) + abs)) + d7) / (Math.exp(d282) * (((1 + d282) * d23) + d22)));
                        d12 = Math.abs(d - exp32);
                        d = exp32;
                    }
                }
                j = (long) (d * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // xsna.aqr
    public final float d(float f, float f2, float f3) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.aqr
    public final float e(long j, float f, float f2, float f3) {
        wmk0 wmk0Var = this.b;
        wmk0Var.a = f2;
        return Float.intBitsToFloat((int) (wmk0Var.a(j / 1000000, f, f3) >> 32));
    }
}
