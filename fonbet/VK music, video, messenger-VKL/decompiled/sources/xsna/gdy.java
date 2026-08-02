package xsna;

import androidx.constraintlayout.widget.ConstraintAttribute;
import com.ironsource.X3;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: classes11.dex */
public abstract class gdy {
    public a a;
    public String b;
    public int c;
    public String d;
    public int e;
    public ArrayList<b> f;

    /* compiled from: KeyCycleOscillator.java */
    public static class a {
        public hz80 a;
        public float[] b;
        public double[] c;
        public float[] d;
        public float[] e;
        public float[] f;
        public emk g;
        public double[] h;
    }

    /* compiled from: KeyCycleOscillator.java */
    public static class b {
        public final int a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;

        public b(float f, float f2, float f3, float f4, int i) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        double d;
        char c;
        double signum;
        double abs;
        a aVar = this.a;
        emk emkVar = aVar.g;
        if (emkVar != null) {
            emkVar.c(f, aVar.h);
        } else {
            double[] dArr = aVar.h;
            dArr[0] = aVar.e[0];
            dArr[1] = aVar.f[0];
            dArr[2] = aVar.b[0];
        }
        double[] dArr2 = aVar.h;
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        hz80 hz80Var = aVar.a;
        double d4 = f;
        hz80Var.getClass();
        double d5 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (d4 <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            c = 2;
        } else {
            if (d4 < 1.0d) {
                int binarySearch = Arrays.binarySearch(hz80Var.b, d4);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                float[] fArr = hz80Var.a;
                float f2 = fArr[binarySearch];
                int i = binarySearch - 1;
                float f3 = fArr[i];
                d = 2.0d;
                double d6 = f2 - f3;
                double[] dArr3 = hz80Var.b;
                double d7 = dArr3[binarySearch];
                double d8 = dArr3[i];
                double d9 = d6 / (d7 - d8);
                c = 2;
                d5 = ((((d4 * d4) - (d8 * d8)) * d9) / 2.0d) + ((d4 - d8) * (f3 - (d9 * d8))) + hz80Var.c[i];
                double d10 = d5 + d3;
                switch (hz80Var.e) {
                    case 1:
                        signum = Math.signum(0.5d - (d10 % 1.0d));
                        break;
                    case 2:
                        abs = Math.abs((((d10 * 4.0d) + 1.0d) % 4.0d) - d);
                        signum = 1.0d - abs;
                        break;
                    case 3:
                        signum = (((d10 * d) + 1.0d) % d) - 1.0d;
                        break;
                    case 4:
                        signum = 1.0d - (((d10 * d) + 1.0d) % d);
                        break;
                    case 5:
                        signum = Math.cos((d3 + d10) * 6.283185307179586d);
                        break;
                    case 6:
                        double abs2 = 1.0d - Math.abs(((d10 * 4.0d) % 4.0d) - d);
                        abs = abs2 * abs2;
                        signum = 1.0d - abs;
                        break;
                    case 7:
                        signum = hz80Var.d.b(d10 % 1.0d);
                        break;
                    default:
                        signum = Math.sin(6.283185307179586d * d10);
                        break;
                }
                return (float) ((signum * aVar.h[c]) + d2);
            }
            c = 2;
            d5 = 1.0d;
        }
        d = 2.0d;
        double d102 = d5 + d3;
        switch (hz80Var.e) {
        }
        return (float) ((signum * aVar.h[c]) + d2);
    }

    public final void c() {
        int i;
        int i2;
        int i3;
        int i4;
        double d;
        int i5;
        ArrayList<b> arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new fdy());
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i6 = this.c;
        String str = this.d;
        a aVar = new a();
        hz80 hz80Var = new hz80();
        hz80Var.a = new float[0];
        hz80Var.b = new double[0];
        aVar.a = hz80Var;
        hz80Var.e = i6;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            i3 = 3;
            int indexOf = str.indexOf(40) + 1;
            i4 = 0;
            i2 = 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i7 = 0;
            d = 1.0d;
            while (indexOf2 != -1) {
                dArr3[i7] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i7++;
            }
            dArr3[i7] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr3, i7 + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d2 = 1.0d / length2;
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            i = 2;
            int i8 = 0;
            while (i8 < copyOf.length) {
                double d3 = copyOf[i8];
                int i9 = i8 + length2;
                dArr4[i9][0] = d3;
                double d4 = d2;
                double d5 = i8 * d4;
                dArr5[i9] = d5;
                if (i8 > 0) {
                    int i10 = (length2 * 2) + i8;
                    dArr4[i10][0] = d3 + 1.0d;
                    dArr5[i10] = d5 + 1.0d;
                    int i11 = i8 - 1;
                    dArr4[i11][0] = (d3 - 1.0d) - d4;
                    dArr5[i11] = (d5 - 1.0d) - d4;
                }
                i8++;
                d2 = d4;
            }
            hz80Var.d = new f830(dArr5, dArr4);
        } else {
            i = 2;
            i2 = 1;
            i3 = 3;
            i4 = 0;
            d = 1.0d;
        }
        aVar.b = new float[size];
        aVar.c = new double[size];
        aVar.d = new float[size];
        aVar.e = new float[size];
        aVar.f = new float[size];
        float[] fArr = new float[size];
        this.a = aVar;
        Iterator<b> it = arrayList.iterator();
        int i12 = i4;
        while (it.hasNext()) {
            b next = it.next();
            float f = next.d;
            dArr[i12] = f * 0.01d;
            double[] dArr6 = dArr2[i12];
            float f2 = next.b;
            dArr6[i4] = f2;
            float f3 = next.c;
            dArr6[i2] = f3;
            float f4 = next.e;
            dArr6[i] = f4;
            a aVar2 = this.a;
            aVar2.c[i12] = next.a / 100.0d;
            aVar2.d[i12] = f;
            aVar2.e[i12] = f3;
            aVar2.f[i12] = f4;
            aVar2.b[i12] = f2;
            i12++;
        }
        a aVar3 = this.a;
        float[] fArr2 = aVar3.d;
        hz80 hz80Var2 = aVar3.a;
        double[] dArr7 = aVar3.c;
        int length3 = dArr7.length;
        int i13 = i;
        int[] iArr = new int[i13];
        iArr[i2] = i3;
        iArr[i4] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = aVar3.b;
        aVar3.h = new double[fArr3.length + i13];
        double[] dArr9 = new double[fArr3.length + i13];
        double d6 = dArr7[i4];
        double d7 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (d6 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            hz80Var2.a(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, fArr2[i4]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            hz80Var2.a(d, fArr2[length4]);
        }
        for (int i14 = i4; i14 < dArr8.length; i14++) {
            double[] dArr10 = dArr8[i14];
            dArr10[i4] = aVar3.e[i14];
            dArr10[i2] = aVar3.f[i14];
            dArr10[2] = fArr3[i14];
            hz80Var2.a(dArr7[i14], fArr2[i14]);
        }
        double d8 = 0.0d;
        int i15 = i4;
        while (true) {
            if (i15 >= hz80Var2.a.length) {
                break;
            }
            d8 += r10[i15];
            i15++;
        }
        double d9 = 0.0d;
        int i16 = i2;
        while (true) {
            float[] fArr4 = hz80Var2.a;
            if (i16 >= fArr4.length) {
                break;
            }
            int i17 = i16 - 1;
            float f5 = (fArr4[i17] + fArr4[i16]) / 2.0f;
            double d10 = d7;
            double[] dArr11 = hz80Var2.b;
            d9 = ((dArr11[i16] - dArr11[i17]) * f5) + d9;
            i16++;
            d7 = d10;
        }
        double d11 = d7;
        int i18 = i4;
        while (true) {
            float[] fArr5 = hz80Var2.a;
            if (i18 >= fArr5.length) {
                break;
            }
            fArr5[i18] = fArr5[i18] * ((float) (d8 / d9));
            i18++;
        }
        hz80Var2.c[i4] = d11;
        int i19 = i2;
        while (true) {
            float[] fArr6 = hz80Var2.a;
            if (i19 >= fArr6.length) {
                break;
            }
            int i20 = i19 - 1;
            float f6 = (fArr6[i20] + fArr6[i19]) / 2.0f;
            double[] dArr12 = hz80Var2.b;
            double d12 = dArr12[i19] - dArr12[i20];
            double[] dArr13 = hz80Var2.c;
            dArr13[i19] = (d12 * f6) + dArr13[i20];
            i19++;
        }
        if (dArr7.length > i2) {
            i5 = i4;
            aVar3.g = emk.a(i5, dArr7, dArr8);
        } else {
            i5 = i4;
            aVar3.g = null;
        }
        emk.a(i5, dArr, dArr2);
    }

    public final String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f.iterator();
        while (it.hasNext()) {
            b next = it.next();
            StringBuilder b2 = ho8.b(str, X3.j.d);
            b2.append(next.a);
            b2.append(" , ");
            b2.append(decimalFormat.format(next.b));
            b2.append("] ");
            str = b2.toString();
        }
        return str;
    }

    public void b(ConstraintAttribute constraintAttribute) {
    }
}
