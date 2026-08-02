package xsna;

import java.util.RandomAccess;

/* compiled from: _ArraysJvm.kt */
/* loaded from: classes8.dex */
public final class ql3 extends ff<Integer> implements RandomAccess {
    public final /* synthetic */ int[] b;

    public ql3(int[] iArr) {
        this.b = iArr;
    }

    @Override // xsna.qd, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return rl3.E(((Number) obj).intValue(), this.b);
        }
        return false;
    }

    @Override // xsna.ff, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.b[i]);
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.b.length;
    }

    @Override // xsna.ff, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return rl3.T(((Number) obj).intValue(), this.b);
        }
        return -1;
    }

    @Override // xsna.qd, java.util.Collection
    public final boolean isEmpty() {
        return this.b.length == 0;
    }

    @Override // xsna.ff, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.b;
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (intValue == iArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }
}
