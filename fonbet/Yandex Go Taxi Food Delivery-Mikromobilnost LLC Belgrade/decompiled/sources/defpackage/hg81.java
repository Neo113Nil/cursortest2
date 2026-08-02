package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public final class hg81 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public g581 e;

    public hg81(int i, String str, g581 g581Var) {
        this.a = i;
        this.b = str;
        this.e = g581Var;
    }

    public final long a(long j, long j2) {
        if (j < 0) {
            w511.q();
            return 0L;
        }
        if (j2 < 0) {
            w511.q();
            return 0L;
        }
        c871 b = b(j, j2);
        long j3 = b.c;
        boolean z = b.w;
        long j4 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        if (!z) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j4 = j5;
        }
        long j6 = b.b + j3;
        if (j6 < j4) {
            for (c871 c871Var : this.c.tailSet(b, false)) {
                long j7 = c871Var.b;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + c871Var.c);
                if (j6 >= j4) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final c871 b(long j, long j2) {
        long j3;
        long j4 = j2;
        c871 c871Var = new c871(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        c871 c871Var2 = (c871) treeSet.floor(c871Var);
        if (c871Var2 != null && c871Var2.b + c871Var2.c > j) {
            return c871Var2;
        }
        c871 c871Var3 = (c871) treeSet.ceiling(c871Var);
        if (c871Var3 != null) {
            long j5 = c871Var3.b - j;
            if (j4 == -1) {
                j3 = j5;
                return new c871(this.b, j, j3, -9223372036854775807L, null);
            }
            j4 = Math.min(j5, j4);
        }
        j3 = j4;
        return new c871(this.b, j, j3, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            hd81 hd81Var = (hd81) arrayList.get(i);
            long j3 = hd81Var.b;
            long j4 = hd81Var.a;
            if (j3 == -1) {
                if (j >= j4) {
                    return true;
                }
            } else if (j2 != -1 && j4 <= j && j + j2 <= j4 + j3) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hg81.class == obj.getClass()) {
            hg81 hg81Var = (hg81) obj;
            if (this.a == hg81Var.a && this.b.equals(hg81Var.b) && this.c.equals(hg81Var.c) && this.e.equals(hg81Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + z2a1.a(this.a * 31, this.b);
    }
}
