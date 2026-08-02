package yads;

import android.util.SparseBooleanArray;

/* loaded from: classes10.dex */
public final class ew0 {
    public final SparseBooleanArray a;

    public ew0(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        ni.a(i, this.a.size());
        return this.a.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew0)) {
            return false;
        }
        ew0 ew0Var = (ew0) obj;
        if (mc3.a >= 24) {
            return this.a.equals(ew0Var.a);
        }
        if (this.a.size() != ew0Var.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (a(i) != ew0Var.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (mc3.a >= 24) {
            return this.a.hashCode();
        }
        int size = this.a.size();
        for (int i = 0; i < this.a.size(); i++) {
            size = (size * 31) + a(i);
        }
        return size;
    }

    public final int a() {
        return this.a.size();
    }
}
