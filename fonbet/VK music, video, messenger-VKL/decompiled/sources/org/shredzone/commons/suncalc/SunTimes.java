package org.shredzone.commons.suncalc;

import defpackage.q0;
import edu.umd.cs.findbugs.annotations.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Calendar;
import java.util.Date;
import org.shredzone.commons.suncalc.param.TimeResultParameter$Unit;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dn10;
import xsna.efz;
import xsna.o76;
import xsna.on8;
import xsna.sby;
import xsna.soe0;
import xsna.ukr0;
import xsna.vbq;
import xsna.xto0;

/* loaded from: classes8.dex */
public final class SunTimes {

    @Nullable
    public final Date a;

    @Nullable
    public final Date b;

    @Nullable
    public final Date c;

    @Nullable
    public final Date d;
    public final boolean e;
    public final boolean f;

    public enum Twilight {
        VISUAL(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Double.valueOf(1.0d)),
        VISUAL_LOWER(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Double.valueOf(-1.0d)),
        HORIZON(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, null),
        CIVIL(-6.0d, null),
        NAUTICAL(-12.0d, null),
        ASTRONOMICAL(-18.0d, null),
        GOLDEN_HOUR(6.0d, null),
        BLUE_HOUR(-4.0d, null),
        NIGHT_HOUR(-8.0d, null);

        private final double angle;
        private final double angleRad;

        @Nullable
        private final Double position;

        Twilight() {
            throw null;
        }

        Twilight(double d, @Nullable Double d2) {
            this.angle = d;
            this.angleRad = Math.toRadians(d);
            this.position = d2;
        }

        public static Double a(Twilight twilight) {
            return twilight.position;
        }

        public final double h() {
            return this.angleRad;
        }
    }

    public interface a extends xto0<a>, on8<SunTimes> {
    }

    public static class b extends o76<a> implements a {
        public final double f;

        @Nullable
        public final Double g;
        public final double h;

        public b() {
            Twilight twilight = Twilight.VISUAL;
            this.f = twilight.h();
            this.g = Twilight.a(twilight);
            int i = vbq.a;
            this.h = 3.141592653589793d / (Math.tan(Math.toRadians(1.6613636363636362d)) * 10800.0d);
        }

        @Override // xsna.on8
        public final SunTimes a() {
            double d;
            double d2;
            double d3;
            double d4;
            double d5;
            boolean z;
            Double d6;
            Double d7;
            Double d8;
            Double d9;
            int i;
            boolean z2;
            sby sbyVar = new sby((Calendar) this.d.clone());
            double d10 = 0;
            double d11 = 1.0d;
            double d12 = d(sbyVar.a(d10 - 1.0d));
            double d13 = d(sbyVar.a(d10));
            double d14 = d(sbyVar.a(d10 + 1.0d));
            double d15 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            int i2 = 1;
            if (d13 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                z = false;
                d = d14;
                d2 = d12;
                d3 = d13;
                d4 = 0.0d;
                d5 = 0.0d;
                z2 = true;
                d6 = null;
                d7 = null;
                d8 = null;
                d9 = null;
                i = 0;
            } else {
                d = d14;
                d2 = d12;
                d3 = d13;
                d4 = 0.0d;
                d5 = 0.0d;
                z = true;
                d6 = null;
                d7 = null;
                d8 = null;
                d9 = null;
                i = 0;
                z2 = false;
            }
            while (i <= 24) {
                soe0 soe0Var = new soe0(d2, d3, d);
                double d16 = d11;
                double d17 = d15;
                double d18 = soe0Var.d;
                int i3 = i;
                double d19 = soe0Var.c;
                double d20 = soe0Var.b;
                int i4 = soe0Var.e;
                if (i4 == i2) {
                    if (d19 >= -1.0d) {
                        d18 = d19;
                    }
                    double d21 = d18 + i3;
                    if (d2 < d17) {
                        if (d6 == null && d21 >= d17) {
                            d6 = Double.valueOf(d21);
                        }
                    } else if (d7 == null && d21 >= d17) {
                        d7 = Double.valueOf(d21);
                    }
                } else if (i4 == 2) {
                    if (d6 == null) {
                        double d22 = i3 + ((d20 >= d17 && d19 >= -1.0d) ? d19 : d18);
                        if (d22 >= d17) {
                            d6 = Double.valueOf(d22);
                        }
                    }
                    if (d7 == null) {
                        double d23 = i3;
                        if (d20 < d17 && d19 >= -1.0d) {
                            d18 = d19;
                        }
                        double d24 = d23 + d18;
                        if (d24 >= d17) {
                            d7 = Double.valueOf(d24);
                        }
                    }
                }
                if (i3 <= 24) {
                    double d25 = soe0Var.a;
                    if (Math.abs(d25) <= d16) {
                        double d26 = d25 + i3;
                        if (d26 >= d17 && d26 < 24.0d) {
                            if (soe0Var.f) {
                                if (d8 == null || d20 > d5) {
                                    d8 = Double.valueOf(d26);
                                    d5 = d20;
                                }
                            } else if (d9 == null || d20 < d4) {
                                d9 = Double.valueOf(d26);
                                d4 = d20;
                            }
                        }
                    }
                }
                if (i3 == 23) {
                    if (d6 != null) {
                        z = false;
                    }
                    if (d7 != null) {
                        z2 = false;
                    }
                }
                if (i3 >= 24 && d6 != null && d7 != null) {
                    break;
                }
                i = i3 + 1;
                d2 = d3;
                d3 = d;
                d15 = d17;
                i2 = 1;
                d = d(sbyVar.a(i + d16));
                d11 = d16;
            }
            boolean z3 = z2;
            boolean z4 = z;
            if (d6 != null && d6.doubleValue() >= 24.0d) {
                d6 = null;
            }
            if (d7 != null && d7.doubleValue() >= 24.0d) {
                d7 = null;
            }
            TimeResultParameter$Unit timeResultParameter$Unit = this.e;
            return new SunTimes(d6 != null ? sbyVar.a(d6.doubleValue()).b(timeResultParameter$Unit) : null, d7 != null ? sbyVar.a(d7.doubleValue()).b(timeResultParameter$Unit) : null, d8 != null ? sbyVar.a(d8.doubleValue()).b(timeResultParameter$Unit) : null, d9 != null ? sbyVar.a(d9.doubleValue()).b(timeResultParameter$Unit) : null, z3, z4);
        }

        public final double d(sby sbyVar) {
            double doubleValue;
            double radians = Math.toRadians(this.b);
            double radians2 = Math.toRadians(this.c);
            int i = vbq.a;
            double d = (sbyVar.b - 51544.5d) / 36525.0d;
            double radians3 = Math.toRadians(23.43929111d - (((((5.9E-4d - (0.001813d * d)) * d) + 46.815d) * d) / 3600.0d));
            double sin = Math.sin(radians3);
            double cos = Math.cos(radians3);
            char c = '\b';
            double[] dArr = {1.0d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, cos, sin, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, -sin, cos};
            dn10 dn10Var = new dn10();
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = 0;
                while (i3 < 3) {
                    if (i3 >= 0) {
                        char c2 = c;
                        if (i3 <= 2 && i2 >= 0 && i2 <= 2) {
                            double d2 = dArr[(i3 * 3) + i2];
                            if (i2 < 0 || i2 > 2 || i3 < 0 || i3 > 2) {
                                throw new IllegalArgumentException(efz.a(i2, i3, "row/column out of range: ", StringUtils.PROCESS_POSTFIX_DELIMITER));
                            }
                            dn10Var.a[(i2 * 3) + i3] = d2;
                            i3++;
                            c = c2;
                        }
                    }
                    throw new IllegalArgumentException(efz.a(i3, i2, "row/column out of range: ", StringUtils.PROCESS_POSTFIX_DELIMITER));
                }
            }
            char c3 = c;
            double d3 = (sbyVar.b - 51544.5d) / 36525.0d;
            int i4 = vbq.a;
            double d4 = (((99.997361d * d3) + 0.993133d) % 1.0d) * 6.283185307179586d;
            ukr0 a = dn10Var.a(ukr0.c((((((d3 * 6191.2d) + ((Math.sin(d4 * 2.0d) * 72.0d) + (Math.sin(d4) * 6893.0d))) / 1296000.0d) + ((d4 / 6.283185307179586d) + 0.7859453d)) % 1.0d) * 6.283185307179586d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, (1.0d - (Math.cos(((((sbyVar.a.get(6) - 1) - 4.0d) / 365.256363d) % 1.0d) * 6.283185307179586d) * 0.016718d)) * 1.49598E8d));
            double d5 = sbyVar.b;
            double floor = Math.floor(d5);
            double d6 = (d5 - floor) * 86400.0d;
            double d7 = (d5 - 51544.5d) / 36525.0d;
            double d8 = ((((((0.093104d - (6.2E-6d * d7)) * d7) * d7) + ((d6 * 1.0027379093d) + ((((floor - 51544.5d) / 36525.0d) * 8640184.812866d) + 24110.54841d))) % 86400.0d) * 7.27220521664304E-5d) + radians2;
            ukr0.a aVar = a.d;
            synchronized (aVar) {
                try {
                    if (aVar.a == null) {
                        if (vbq.a(ukr0.this.a) && vbq.a(ukr0.this.b)) {
                            aVar.a = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                        } else {
                            ukr0 ukr0Var = ukr0.this;
                            aVar.a = Double.valueOf(Math.atan2(ukr0Var.b, ukr0Var.a));
                        }
                        if (aVar.a.doubleValue() < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            aVar.a = Double.valueOf(aVar.a.doubleValue() + 6.283185307179586d);
                        }
                    }
                    doubleValue = aVar.a.doubleValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            double b = a.b();
            double a2 = a.a();
            double d9 = 1.5707963267948966d - radians;
            double sin2 = Math.sin(d9);
            double cos2 = Math.cos(d9);
            double[] dArr2 = new double[9];
            dArr2[0] = cos2;
            dArr2[1] = 0.0d;
            dArr2[2] = -sin2;
            dArr2[3] = 0.0d;
            dArr2[4] = 1.0d;
            dArr2[5] = 0.0d;
            dArr2[6] = sin2;
            dArr2[7] = 0.0d;
            dArr2[c3] = cos2;
            ukr0 a3 = new dn10(dArr2).a(ukr0.c(d8 - doubleValue, b, a2));
            double d10 = this.f;
            if (this.g != null) {
                d10 = (((Math.asin(6371.0d / a3.a()) - Math.acos(1.0d)) + d10) - this.h) - (Math.asin(695700.0d / a3.a()) * this.g.doubleValue());
            }
            return a3.b() - d10;
        }
    }

    public SunTimes(Date date, Date date2, Date date3, Date date4, boolean z, boolean z2) {
        this.a = date;
        this.b = date2;
        this.c = date3;
        this.d = date4;
        this.e = z;
        this.f = z2;
    }

    public static b a() {
        return new b();
    }

    @Nullable
    public final Date b() {
        Date date = this.a;
        if (date != null) {
            return new Date(date.getTime());
        }
        return null;
    }

    @Nullable
    public final Date c() {
        Date date = this.b;
        if (date != null) {
            return new Date(date.getTime());
        }
        return null;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SunTimes[rise=");
        sb.append(this.a);
        sb.append(", set=");
        sb.append(this.b);
        sb.append(", noon=");
        sb.append(this.c);
        sb.append(", nadir=");
        sb.append(this.d);
        sb.append(", alwaysUp=");
        sb.append(this.e);
        sb.append(", alwaysDown=");
        return q0.a(sb, this.f, ']');
    }
}
