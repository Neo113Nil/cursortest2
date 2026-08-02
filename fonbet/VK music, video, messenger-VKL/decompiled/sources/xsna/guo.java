package xsna;

import java.lang.reflect.Array;
import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Easing.java */
/* loaded from: classes11.dex */
public class guo {
    public static final guo b = new guo();
    public static final String[] c = {"standard", "accelerate", "decelerate", "linear"};
    public String a = "identity";

    /* compiled from: Easing.java */
    public static class a extends guo {
        public final double d;
        public final double e;
        public final double f;
        public final double g;

        public a(String str) {
            this.a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        @Override // xsna.guo
        public final double a(double d) {
            if (d <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d(d4);
            double d6 = d3 + d2;
            double d7 = d(d6);
            double e = e(d4);
            return (((d - d5) * (e(d6) - e)) / (d7 - d5)) + e;
        }

        @Override // xsna.guo
        public final double b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                d3 = d(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (e(d5) - e(d4)) / (d(d5) - d(d4));
        }

        public final double d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.f * d5) + (this.d * d4) + (d * d * d);
        }

        public final double e(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            double d4 = d2 * d3 * d;
            double d5 = d3 * d * d;
            return (this.g * d5) + (this.e * d4) + (d * d * d);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0152, code lost:
    
        if (r19.equals("linear") == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static guo c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        char c2 = 3;
        if (str.startsWith("spline")) {
            p0l0 p0l0Var = new p0l0();
            p0l0Var.a = str;
            double[] dArr = new double[str.length() / 2];
            int indexOf = str.indexOf(40) + 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i = 0;
            while (indexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr, i + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d = 1.0d / length2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i2 = 0; i2 < copyOf.length; i2++) {
                double d2 = copyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][0] = d2;
                double d3 = i2 * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][0] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][0] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
            }
            f830 f830Var = new f830(dArr3, dArr2);
            System.out.println(" 0 " + f830Var.b(ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
            System.out.println(" 1 " + f830Var.b(1.0d));
            p0l0Var.d = f830Var;
            return p0l0Var;
        }
        if (str.startsWith("Schlick")) {
            q9h0 q9h0Var = new q9h0();
            q9h0Var.a = str;
            int indexOf3 = str.indexOf(40);
            int indexOf4 = str.indexOf(44, indexOf3);
            q9h0Var.d = Double.parseDouble(str.substring(indexOf3 + 1, indexOf4).trim());
            int i6 = indexOf4 + 1;
            q9h0Var.e = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return q9h0Var;
        }
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1102672091:
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new a("cubic(1, 1, 0, 0)");
            case 4:
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(c));
                return b;
        }
    }

    public double b(double d) {
        return 1.0d;
    }

    public final String toString() {
        return this.a;
    }

    public double a(double d) {
        return d;
    }
}
