package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* loaded from: classes10.dex */
public final class i42 {
    public final hfr a;
    public final SparseArray b;

    public i42(hfr hfrVar, SparseArray sparseArray) {
        this.a = hfrVar;
        SparseBooleanArray sparseBooleanArray = hfrVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a = hfrVar.a(i);
            h42 h42Var = (h42) sparseArray.get(a);
            h42Var.getClass();
            sparseArray2.append(a, h42Var);
        }
        this.b = sparseArray2;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }
}
