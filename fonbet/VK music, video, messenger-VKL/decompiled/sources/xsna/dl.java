package xsna;

import android.graphics.PointF;

/* compiled from: AccessibilityIterators.android.kt */
/* loaded from: classes11.dex */
public abstract class dl {
    public Object a;
    public final Object b;

    public dl(int i) {
        switch (i) {
            case 1:
                this.a = new PointF();
                this.b = new PointF();
                break;
            default:
                this.b = new int[2];
                break;
        }
    }

    public abstract int[] a(int i);

    public int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public abstract int[] c(int i);
}
