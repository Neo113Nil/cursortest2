package xsna;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: LayoutForMany.java */
/* loaded from: classes2.dex */
public final class yny {
    public final int[] a = new int[4];
    public final float[] b = new float[4];
    public final float[][] c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 4, 10);
    public int d = 0;

    public final int a() {
        int i = 0;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (int) (i + this.b[i2]);
        }
        return i;
    }

    public final String toString() {
        return "Layout{lines=" + this.d + ", itemsCount=" + Arrays.toString(this.a) + '}';
    }
}
