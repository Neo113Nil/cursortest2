package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public class br80 {
    public float[] a = new float[0];
    public double[] b = new double[0];
    public double[] c;
    public q630 d;
    public int e;

    public final void a(double d, float f) {
        int length = this.a.length + 1;
        int binarySearch = Arrays.binarySearch(this.b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.b = Arrays.copyOf(this.b, length);
        this.a = Arrays.copyOf(this.a, length);
        this.c = new double[length];
        double[] dArr = this.b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.b[binarySearch] = d;
        this.a[binarySearch] = f;
    }

    public final double b(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        float[] fArr = this.a;
        float f = fArr[binarySearch];
        int i = binarySearch - 1;
        float f2 = fArr[i];
        double d2 = f - f2;
        double[] dArr = this.b;
        double d3 = dArr[binarySearch];
        double d4 = dArr[i];
        double d5 = d2 / (d3 - d4);
        return ((((d * d) - (d4 * d4)) * d5) / 2.0d) + x4e.a(d, d4, f2 - (d5 * d4), this.c[i]);
    }

    public final double c(double d, double d2) {
        double b = b(d) + d2;
        switch (this.e) {
            case 1:
                return Math.signum(0.5d - (b % 1.0d));
            case 2:
                return 1.0d - Math.abs((((b * 4.0d) + 1.0d) % 4.0d) - 2.0d);
            case 3:
                return (((b * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                return 1.0d - (((b * 2.0d) + 1.0d) % 2.0d);
            case 5:
                return Math.cos((d2 + b) * 6.283185307179586d);
            case 6:
                double abs = 1.0d - Math.abs(((b * 4.0d) % 4.0d) - 2.0d);
                return 1.0d - (abs * abs);
            case 7:
                return this.d.b(b % 1.0d);
            default:
                return Math.sin(6.283185307179586d * b);
        }
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.b) + " period=" + Arrays.toString(this.a);
    }
}
