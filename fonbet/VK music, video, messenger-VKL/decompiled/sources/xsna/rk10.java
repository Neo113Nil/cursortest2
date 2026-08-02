package xsna;

import java.util.Arrays;
import java.util.List;
import org.opencv.core.Mat;

/* compiled from: MatOfKeyPoint.java */
/* loaded from: classes8.dex */
public final class rk10 extends Mat {
    public final List<xdy> A() {
        int x = (int) x();
        xdy[] xdyVarArr = new xdy[x];
        if (x != 0) {
            float[] fArr = new float[x * 7];
            l(fArr);
            for (int i = 0; i < x; i++) {
                int i2 = i * 7;
                xdyVarArr[i] = new xdy(fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3], (int) fArr[i2 + 5], (int) fArr[i2 + 6], fArr[i2 + 4]);
            }
        }
        return Arrays.asList(xdyVarArr);
    }
}
