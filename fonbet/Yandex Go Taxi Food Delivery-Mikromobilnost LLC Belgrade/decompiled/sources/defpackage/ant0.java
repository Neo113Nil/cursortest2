package defpackage;

import android.util.SparseArray;

/* loaded from: classes10.dex */
public final class ant0 {
    public int a;
    public final SparseArray b;
    public final c9e c;

    public ant0(c9e c9eVar) {
        this.b = new SparseArray();
        this.c = c9eVar;
        this.a = -1;
    }

    public final Object a(int i) {
        SparseArray sparseArray;
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

    public ant0() {
        this(new d7g0(28));
    }
}
