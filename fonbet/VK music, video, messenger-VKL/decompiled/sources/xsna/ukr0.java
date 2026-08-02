package xsna;

import edu.umd.cs.findbugs.annotations.Nullable;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Vector.java */
/* loaded from: classes8.dex */
public final class ukr0 {
    public final double a;
    public final double b;
    public final double c;
    public final a d = new a();

    /* compiled from: Vector.java */
    public class a {

        @Nullable
        public Double a = null;

        @Nullable
        public Double b = null;

        @Nullable
        public Double c = null;

        public a() {
        }
    }

    public ukr0(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public static ukr0 c(double d, double d2, double d3) {
        double cos = Math.cos(d2);
        ukr0 ukr0Var = new ukr0(Math.cos(d) * d3 * cos, Math.sin(d) * d3 * cos, Math.sin(d2) * d3);
        a aVar = ukr0Var.d;
        synchronized (aVar) {
            aVar.a = Double.valueOf(d);
            aVar.b = Double.valueOf(d2);
            aVar.c = Double.valueOf(d3);
        }
        return ukr0Var;
    }

    public final double a() {
        double doubleValue;
        a aVar = this.d;
        synchronized (aVar) {
            try {
                if (aVar.c == null) {
                    ukr0 ukr0Var = ukr0.this;
                    double d = ukr0Var.a;
                    double d2 = ukr0Var.b;
                    double d3 = ukr0Var.c;
                    double d4 = d3 * d3;
                    aVar.c = Double.valueOf(Math.sqrt(d4 + (d2 * d2) + (d * d)));
                }
                doubleValue = aVar.c.doubleValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return doubleValue;
    }

    public final double b() {
        double doubleValue;
        a aVar = this.d;
        synchronized (aVar) {
            try {
                if (aVar.b == null) {
                    ukr0 ukr0Var = ukr0.this;
                    double d = ukr0Var.a;
                    double d2 = ukr0Var.b;
                    double d3 = (d2 * d2) + (d * d);
                    if (vbq.a(ukr0Var.c) && vbq.a(d3)) {
                        aVar.b = Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
                    } else {
                        aVar.b = Double.valueOf(Math.atan2(ukr0.this.c, Math.sqrt(d3)));
                    }
                }
                doubleValue = aVar.b.doubleValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return doubleValue;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ukr0)) {
            ukr0 ukr0Var = (ukr0) obj;
            if (Double.compare(this.a, ukr0Var.a) == 0 && Double.compare(this.b, ukr0Var.b) == 0 && Double.compare(this.c, ukr0Var.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Double.valueOf(this.a).hashCode() ^ Double.valueOf(this.b).hashCode()) ^ Double.valueOf(this.c).hashCode();
    }

    public final String toString() {
        return "(x=" + this.a + ", y=" + this.b + ", z=" + this.c + ")";
    }

    public ukr0(double[] dArr) {
        if (dArr.length == 3) {
            this.a = dArr[0];
            this.b = dArr[1];
            this.c = dArr[2];
            return;
        }
        throw new IllegalArgumentException("invalid vector length");
    }
}
