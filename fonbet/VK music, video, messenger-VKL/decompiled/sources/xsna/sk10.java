package xsna;

import java.util.List;
import org.opencv.core.Mat;

/* compiled from: MatOfPoint2f.java */
/* loaded from: classes8.dex */
public final class sk10 extends Mat {
    public final void A(List<hlb0> list) {
        hlb0[] hlb0VarArr = (hlb0[]) list.toArray(new hlb0[0]);
        if (hlb0VarArr == null || hlb0VarArr.length == 0) {
            return;
        }
        int length = hlb0VarArr.length;
        if (length > 0) {
            f(length, wpk.b(5, 2));
        }
        float[] fArr = new float[length * 2];
        for (int i = 0; i < length; i++) {
            hlb0 hlb0Var = hlb0VarArr[i];
            int i2 = i * 2;
            fArr[i2] = (float) hlb0Var.a;
            fArr[i2 + 1] = (float) hlb0Var.b;
        }
        s(fArr);
    }
}
