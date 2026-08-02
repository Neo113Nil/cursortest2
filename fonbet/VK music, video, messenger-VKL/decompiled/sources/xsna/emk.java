package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: CurveFit.java */
/* loaded from: classes11.dex */
public abstract class emk {

    /* compiled from: CurveFit.java */
    public static class a extends emk {
        public double a;
        public double[] b;

        @Override // xsna.emk
        public final double b(double d) {
            return this.b[0];
        }

        @Override // xsna.emk
        public final void c(double d, double[] dArr) {
            double[] dArr2 = this.b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // xsna.emk
        public final void d(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.b;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // xsna.emk
        public final void e(double d, double[] dArr) {
            for (int i = 0; i < this.b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // xsna.emk
        public final double[] f() {
            return new double[]{this.a};
        }
    }

    public static emk a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new f830(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            a aVar = new a();
            aVar.a = d;
            aVar.b = dArr3;
            return aVar;
        }
        v7z v7zVar = new v7z();
        int length = dArr2[0].length;
        v7zVar.c = new double[length];
        v7zVar.a = dArr;
        v7zVar.b = dArr2;
        if (length > 2) {
            double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return v7zVar;
    }

    public abstract double b(double d);

    public abstract void c(double d, double[] dArr);

    public abstract void d(double d, float[] fArr);

    public abstract void e(double d, double[] dArr);

    public abstract double[] f();
}
