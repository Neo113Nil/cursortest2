package defpackage;

/* loaded from: classes10.dex */
public abstract class mif {
    public static mif a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new q630(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            lif lifVar = new lif();
            lifVar.a = d;
            lifVar.b = dArr3;
            return lifVar;
        }
        miy miyVar = new miy();
        miyVar.c = true;
        int length = dArr2[0].length;
        miyVar.d = new double[length];
        miyVar.a = dArr;
        miyVar.b = dArr2;
        if (length > 2) {
            for (int i2 = 0; i2 < dArr.length; i2++) {
                double d2 = dArr2[i2][0];
            }
        }
        return miyVar;
    }

    public abstract double b(double d);

    public abstract void c(double d, double[] dArr);

    public abstract void d(double d, float[] fArr);

    public abstract double e(double d);

    public abstract void f(double d, double[] dArr);

    public abstract double[] g();
}
