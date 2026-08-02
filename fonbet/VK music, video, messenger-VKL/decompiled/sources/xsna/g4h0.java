package xsna;

import com.ironsource.X3;
import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Scalar.java */
/* loaded from: classes8.dex */
public final class g4h0 {
    public double[] a;

    public final Object clone() throws CloneNotSupportedException {
        double[] dArr = this.a;
        g4h0 g4h0Var = new g4h0();
        if (dArr != null && dArr.length == 4) {
            g4h0Var.a = (double[]) dArr.clone();
            return g4h0Var;
        }
        double[] dArr2 = new double[4];
        g4h0Var.a = dArr2;
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (dArr == null) {
            dArr2[3] = 0.0d;
            dArr2[2] = 0.0d;
            dArr2[1] = 0.0d;
            dArr2[0] = 0.0d;
            return g4h0Var;
        }
        dArr2[0] = dArr.length > 0 ? dArr[0] : 0.0d;
        dArr2[1] = dArr.length > 1 ? dArr[1] : 0.0d;
        dArr2[2] = dArr.length > 2 ? dArr[2] : 0.0d;
        if (dArr.length > 3) {
            d = dArr[3];
        }
        dArr2[3] = d;
        return g4h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g4h0) && Arrays.equals(this.a, ((g4h0) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        double[] dArr = this.a;
        sb.append(dArr[0]);
        sb.append(", ");
        sb.append(dArr[1]);
        sb.append(", ");
        sb.append(dArr[2]);
        sb.append(", ");
        sb.append(dArr[3]);
        sb.append(X3.j.e);
        return sb.toString();
    }
}
