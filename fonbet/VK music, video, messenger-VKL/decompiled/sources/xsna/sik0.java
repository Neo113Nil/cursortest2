package xsna;

import android.util.SparseArray;

/* compiled from: SpannedData.java */
/* loaded from: classes12.dex */
public final class sik0<V> {
    public final wq c;
    public final SparseArray<V> b = new SparseArray<>();
    public int a = -1;

    public sik0(wq wqVar) {
        this.c = wqVar;
    }

    public final V a(int i) {
        SparseArray<V> sparseArray;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            sparseArray = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.a + 1)) {
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }
}
