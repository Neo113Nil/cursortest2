package org.opencv.tracking;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import xsna.yhf0;

/* loaded from: classes8.dex */
public class Tracker extends Algorithm {
    private static native void delete(long j);

    private static native boolean init_0(long j, long j2, double d, double d2, double d3, double d4);

    private static native boolean update_0(long j, long j2, double[] dArr);

    public final void a(Mat mat, yhf0 yhf0Var) {
        init_0(this.a, mat.a, yhf0Var.a, yhf0Var.b, yhf0Var.c, yhf0Var.d);
    }

    public final boolean b(Mat mat, yhf0 yhf0Var) {
        double[] dArr = new double[4];
        boolean update_0 = update_0(this.a, mat.a, dArr);
        yhf0Var.a = dArr[0];
        yhf0Var.b = dArr[1];
        yhf0Var.c = dArr[2];
        yhf0Var.d = dArr[3];
        return update_0;
    }

    @Override // org.opencv.core.Algorithm
    public void finalize() throws Throwable {
        delete(this.a);
    }
}
