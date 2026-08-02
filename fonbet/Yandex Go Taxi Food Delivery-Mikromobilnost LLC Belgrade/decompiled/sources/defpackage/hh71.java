package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes7.dex */
public final class hh71 {
    public final SparseBooleanArray a;

    public hh71(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.a;
        cha1.a(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh71)) {
            return false;
        }
        hh71 hh71Var = (hh71) obj;
        SparseBooleanArray sparseBooleanArray = hh71Var.a;
        int i = rf71.a;
        SparseBooleanArray sparseBooleanArray2 = this.a;
        if (i >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
            if (a(i2) != hh71Var.a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = rf71.a;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + a(i2);
        }
        return size;
    }
}
