package androidx.recyclerview.widget;

import android.util.SparseIntArray;
import defpackage.b64;
import defpackage.bw31;
import defpackage.cw31;
import defpackage.w511;

/* loaded from: classes10.dex */
public final class k1 implements cw31 {
    public final SparseIntArray a = new SparseIntArray(1);
    public final SparseIntArray b = new SparseIntArray(1);
    public final a0 c;
    public final /* synthetic */ bw31 d;

    public k1(bw31 bw31Var, a0 a0Var) {
        this.d = bw31Var;
        this.c = a0Var;
    }

    @Override // defpackage.cw31
    public final int a(int i) {
        SparseIntArray sparseIntArray = this.a;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey > -1) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        bw31 bw31Var = this.d;
        int i2 = bw31Var.b;
        bw31Var.b = i2 + 1;
        bw31Var.a.put(i2, this.c);
        sparseIntArray.put(i, i2);
        this.b.put(i2, i);
        return i2;
    }

    @Override // defpackage.cw31
    public final int b(int i) {
        SparseIntArray sparseIntArray = this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        w511.o(b64.t(i, "requested global type ", " does not belong to the adapter:"), this.c.c);
        return 0;
    }
}
