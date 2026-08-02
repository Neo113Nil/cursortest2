package xsna;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: Matrix.java */
/* loaded from: classes8.dex */
public final class dn10 {
    public final double[] a;

    public dn10() {
        this.a = new double[9];
    }

    public final ukr0 a(ukr0 ukr0Var) {
        double[] dArr = {ukr0Var.a, ukr0Var.b, ukr0Var.c};
        double[] dArr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            for (int i2 = 0; i2 < 3; i2++) {
                if (i < 0 || i > 2 || i2 < 0 || i2 > 2) {
                    throw new IllegalArgumentException(efz.a(i, i2, "row/column out of range: ", StringUtils.PROCESS_POSTFIX_DELIMITER));
                }
                d += this.a[(i * 3) + i2] * dArr[i2];
            }
            dArr2[i] = d;
        }
        return new ukr0(dArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dn10)) {
            return false;
        }
        return Arrays.equals(this.a, ((dn10) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        for (int i = 0; i < 9; i++) {
            int i2 = i % 3;
            if (i2 == 0) {
                sb.append('[');
            }
            sb.append(this.a[i]);
            if (i2 == 2) {
                sb.append(']');
            }
            if (i < 8) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public dn10(double... dArr) {
        if (dArr.length == 9) {
            this.a = dArr;
            return;
        }
        throw new IllegalArgumentException("requires 9 values");
    }
}
