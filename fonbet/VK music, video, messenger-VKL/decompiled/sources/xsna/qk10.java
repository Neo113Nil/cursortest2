package xsna;

import org.opencv.core.Mat;

/* compiled from: MatOfDouble.java */
/* loaded from: classes8.dex */
public final class qk10 extends Mat {
    public qk10(double... dArr) {
        if (dArr.length == 0) {
            return;
        }
        int length = dArr.length;
        if (length > 0) {
            f(length, wpk.b(6, 1));
        }
        q(0, 0, dArr);
    }
}
