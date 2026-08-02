package xsna;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;

/* compiled from: MatOfPoint3f.java */
/* loaded from: classes8.dex */
public final class tk10 extends Mat {
    public final void A(List<flb0> list) {
        flb0[] flb0VarArr = (flb0[]) ((ArrayList) list).toArray(new flb0[0]);
        if (flb0VarArr == null || flb0VarArr.length == 0) {
            return;
        }
        int length = flb0VarArr.length;
        if (length > 0) {
            f(length, wpk.b(5, 3));
        }
        float[] fArr = new float[length * 3];
        for (int i = 0; i < length; i++) {
            flb0 flb0Var = flb0VarArr[i];
            int i2 = i * 3;
            fArr[i2] = (float) flb0Var.a;
            fArr[i2 + 1] = (float) flb0Var.b;
            fArr[i2 + 2] = (float) flb0Var.c;
        }
        s(fArr);
    }
}
