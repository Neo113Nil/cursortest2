package defpackage;

import java.util.Iterator;

/* loaded from: classes7.dex */
public final class imz implements a6c, Iterable, xfx {
    public static final imz w = new imz(1, 0, false);
    public final long a;
    public final long b;
    public final long c;

    public imz(long j, long j2, boolean z) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
        this.c = 1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a6c
    public final boolean b(Comparable comparable) {
        long longValue = ((Number) comparable).longValue();
        return this.a <= longValue && longValue <= this.b;
    }

    @Override // defpackage.a6c
    public final Comparable d() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.a6c
    public final Comparable e() {
        return Long.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof imz)) {
            return false;
        }
        if (isEmpty() && ((imz) obj).isEmpty()) {
            return true;
        }
        imz imzVar = (imz) obj;
        return this.a == imzVar.a && this.b == imzVar.b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.a6c
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hmz(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }

    public imz(long j, long j2) {
        this(j, j2, false);
    }
}
