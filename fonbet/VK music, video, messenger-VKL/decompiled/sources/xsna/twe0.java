package xsna;

import com.ironsource.X3;
import java.util.Iterator;

/* compiled from: RangesList.java */
/* loaded from: classes7.dex */
public final class twe0 implements Iterable<a> {
    public a b;

    /* compiled from: RangesList.java */
    public static class a {
        public a a = null;
        public a b = null;
        public long c;
        public long d;

        public a(long j, long j2) {
            this.c = j;
            this.d = j2;
        }

        public final boolean a(long j) {
            return j >= this.c && j <= this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(X3.j.d);
            sb.append(this.c);
            sb.append(',');
            return vu5.a(']', this.d, sb);
        }
    }

    /* compiled from: RangesList.java */
    public static class b implements Iterator<a> {
        public a b;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != null;
        }

        @Override // java.util.Iterator
        public final a next() {
            a aVar = this.b;
            if (aVar != null) {
                this.b = aVar.b;
            }
            return aVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("RangesList#iterator() does not support remove()");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if ((r14 - 1) != r7.d) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("from > to");
        }
        a aVar = this.b;
        if (aVar == null) {
            this.b = new a(j, j2);
            return;
        }
        a aVar2 = null;
        a aVar3 = null;
        while (true) {
            if (aVar == null) {
                break;
            }
            if (aVar2 == null) {
                if (!aVar.a(j)) {
                    long j3 = j + 1;
                    long j4 = aVar.c;
                    if (j3 != j4 && j - 1 != aVar.d) {
                        if (j < j4) {
                            aVar2 = new a(j, j);
                            a aVar4 = aVar.a;
                            if (aVar == this.b) {
                                this.b = aVar2;
                            }
                            aVar.a = aVar2;
                            aVar2.b = aVar;
                            if (aVar2 == this.b && aVar4 != null) {
                                this.b = aVar4;
                            }
                            aVar2.a = aVar4;
                            if (aVar4 != null) {
                                aVar4.b = aVar2;
                            }
                        }
                    }
                }
                aVar.c = Math.min(aVar.c, j);
                aVar.d = Math.max(aVar.d, j);
                aVar2 = aVar;
            }
            if (aVar3 == null) {
                a aVar5 = aVar.b;
                if (aVar5 != null) {
                    if (!aVar5.a(j2)) {
                        long j5 = j2 + 1;
                        a aVar6 = aVar.b;
                        if (j5 != aVar6.c) {
                        }
                    }
                }
                if (!aVar.a(j2)) {
                    long j6 = j2 + 1;
                    long j7 = aVar.c;
                    if (j6 != j7 && j2 - 1 != aVar.d) {
                        if (j2 < j7) {
                            aVar3 = new a(j2, j2);
                            a aVar7 = aVar.a;
                            if (aVar == this.b) {
                                this.b = aVar3;
                            }
                            aVar.a = aVar3;
                            aVar3.b = aVar;
                            if (aVar3 == this.b && aVar7 != null) {
                                this.b = aVar7;
                            }
                            aVar3.a = aVar7;
                            if (aVar7 != null) {
                                aVar7.b = aVar3;
                            }
                        }
                    }
                }
                aVar.c = Math.min(aVar.c, j2);
                aVar.d = Math.max(aVar.d, j2);
                aVar3 = aVar;
            }
            a aVar8 = aVar.b;
            if (aVar8 == null && aVar3 == null) {
                if (aVar2 != null) {
                    j = j2;
                }
                aVar3 = new a(j, j2);
                aVar.b = aVar3;
                aVar3.a = aVar;
            } else {
                aVar = aVar8;
            }
        }
        if (aVar2 == null || aVar3 == null || aVar2 == aVar3) {
            return;
        }
        aVar2.d = aVar3.d;
        a aVar9 = aVar3.b;
        aVar2.b = aVar9;
        if (aVar9 != null) {
            aVar9.a = aVar2;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<a> iterator() {
        b bVar = new b();
        bVar.b = this.b;
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        Iterator<a> it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            a aVar = (a) bVar.next();
            sb.append('[');
            sb.append(aVar.c);
            sb.append(',');
            sb.append(aVar.d);
            sb.append(']');
        }
    }
}
