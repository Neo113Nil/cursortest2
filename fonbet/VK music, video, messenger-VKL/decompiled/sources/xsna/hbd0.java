package xsna;

import java.util.AbstractList;
import java.util.Arrays;

/* compiled from: PrimitiveLongList.java */
/* loaded from: classes8.dex */
public final class hbd0 extends AbstractList<Long> {
    public final long[] b;

    public hbd0(long[] jArr) {
        this.b = jArr;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (!(obj instanceof hbd0)) {
            return super.equals(obj);
        }
        return Arrays.equals(this.b, ((hbd0) obj).b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(this.b[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.length;
    }
}
