package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public final class hs {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public jc0 e;

    public hs(int i, String str, jc0 jc0Var) {
        this.a = i;
        this.b = str;
        this.e = jc0Var;
    }

    public final long a(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        if (j2 < 0) {
            throw new IllegalArgumentException();
        }
        c03 b = b(j, j2);
        if (!b.e) {
            long j3 = b.d;
            return -Math.min(j3 != -1 ? j3 : Long.MAX_VALUE, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = b.c + b.d;
        if (j6 < j5) {
            for (c03 c03Var : this.c.tailSet(b, false)) {
                long j7 = c03Var.c;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + c03Var.d);
                if (j6 >= j5) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final c03 b(long j, long j2) {
        long j3;
        long j4 = j2;
        c03 c03Var = new c03(this.b, j, -1L, C.TIME_UNSET, null);
        c03 c03Var2 = (c03) this.c.floor(c03Var);
        if (c03Var2 != null && c03Var2.c + c03Var2.d > j) {
            return c03Var2;
        }
        c03 c03Var3 = (c03) this.c.ceiling(c03Var);
        if (c03Var3 != null) {
            long j5 = c03Var3.c - j;
            if (j4 == -1) {
                j3 = j5;
                return new c03(this.b, j, j3, C.TIME_UNSET, null);
            }
            j4 = Math.min(j5, j4);
        }
        j3 = j4;
        return new c03(this.b, j, j3, C.TIME_UNSET, null);
    }

    public final boolean c(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            gs gsVar = (gs) this.d.get(i);
            long j3 = gsVar.b;
            if (j3 == -1) {
                if (j >= gsVar.a) {
                    return true;
                }
            } else if (j2 == -1) {
                continue;
            } else {
                long j4 = gsVar.a;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hs.class == obj.getClass()) {
            hs hsVar = (hs) obj;
            if (this.a == hsVar.a && this.b.equals(hsVar.b) && this.c.equals(hsVar.c) && this.e.equals(hsVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + k4.a(this.b, this.a * 31, 31);
    }
}
