package xsna;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: Range.java */
/* loaded from: classes8.dex */
public final class jhy0 {
    public final long a;
    public final long b;

    /* compiled from: Range.java */
    public class a implements Supplier<Long> {
        public long b;

        @Override // java.util.function.Supplier
        public final /* synthetic */ Long get() {
            long j = this.b;
            this.b = j - 1;
            return Long.valueOf(j);
        }
    }

    public jhy0(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException();
        }
        this.a = j;
        this.b = j2;
    }

    public static void a(ArrayList arrayList, long j) {
        jhy0 jhy0Var;
        jhy0 jhy0Var2;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            jhy0 jhy0Var3 = (jhy0) it.next();
            long j2 = jhy0Var3.a;
            long j3 = jhy0Var3.b;
            if (j >= j2 && j <= j3) {
                return;
            }
            if (j == j2 - 1 || j == j3 + 1) {
                jhy0 jhy0Var4 = it.hasNext() ? (jhy0) it.next() : null;
                if (jhy0Var4 != null) {
                    long j4 = jhy0Var4.b;
                    long j5 = jhy0Var4.a;
                    if (j == j5 - 1 || j == j4 + 1) {
                        jhy0 jhy0Var5 = (jhy0) arrayList.get(i);
                        if (j == j4 + 1 && jhy0Var5.a - 1 == j) {
                            jhy0Var2 = new jhy0(j5, jhy0Var5.b);
                        } else {
                            if (jhy0Var5.b + 1 != j || j != j5 - 1) {
                                throw new IllegalArgumentException();
                            }
                            jhy0Var2 = new jhy0(jhy0Var5.a, j4);
                        }
                        arrayList.set(i, jhy0Var2);
                        arrayList.remove(i + 1);
                        return;
                    }
                }
                jhy0 jhy0Var6 = (jhy0) arrayList.get(i);
                long j6 = jhy0Var6.b;
                long j7 = jhy0Var6.a;
                long j8 = j6 + 1;
                if (j == j8) {
                    jhy0Var = new jhy0(j7, j8);
                } else {
                    long j9 = j7 - 1;
                    if (j != j9) {
                        throw new IllegalArgumentException(defpackage.k0.a(j, "Range cannot be extended with that number "));
                    }
                    jhy0Var = new jhy0(j9, j6);
                }
                arrayList.set(i, jhy0Var);
                return;
            }
            if (j3 < j) {
                arrayList.add(i, new jhy0(j));
                return;
            }
            i++;
        }
        arrayList.add(i, new jhy0(j));
    }

    public final boolean b(jhy0 jhy0Var) {
        return this.a < jhy0Var.a && this.b > jhy0Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhy0)) {
            return false;
        }
        jhy0 jhy0Var = (jhy0) obj;
        return Long.valueOf(this.a).equals(Long.valueOf(jhy0Var.a)) && Long.valueOf(this.b).equals(Long.valueOf(jhy0Var.b));
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public final String toString() {
        return efz.b(this.a, X3.j.e, fp.b(this.b, X3.j.d, ".."));
    }

    public jhy0(long j) {
        this.a = j;
        this.b = j;
    }
}
