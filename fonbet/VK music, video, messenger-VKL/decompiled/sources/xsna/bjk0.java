package xsna;

import android.util.SparseArray;

/* compiled from: SparseArray.kt */
/* loaded from: classes11.dex */
public final class bjk0 extends z8x {
    public int b;
    public final /* synthetic */ SparseArray<Object> c;

    public bjk0(SparseArray<Object> sparseArray) {
        this.c = sparseArray;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.size();
    }

    @Override // xsna.z8x
    public final int nextInt() {
        int i = this.b;
        this.b = i + 1;
        return this.c.keyAt(i);
    }
}
