package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: CachedContent.java */
/* loaded from: classes12.dex */
public final class fy8 {
    public final int a;
    public final String b;
    public final TreeSet<qpj0> c;
    public final ArrayList<a> d;
    public adl e;

    /* compiled from: CachedContent.java */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public fy8(int i, String str) {
        this(i, str, adl.c);
    }

    public final void a(qpj0 qpj0Var) {
        this.c.add(qpj0Var);
    }

    public final boolean b(dij dijVar) {
        this.e = this.e.c(dijVar);
        return !r2.equals(r0);
    }

    public final long c(long j, long j2) {
        fxc0.p(j >= 0);
        fxc0.p(j2 >= 0);
        qpj0 e = e(j, j2);
        long j3 = e.d;
        if (!e.e) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = e.c + j3;
        if (j6 < j5) {
            for (qpj0 qpj0Var : this.c.tailSet(e, false)) {
                long j7 = qpj0Var.c;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + qpj0Var.d);
                if (j6 >= j5) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final adl d() {
        return this.e;
    }

    public final qpj0 e(long j, long j2) {
        long j3 = j2;
        qpj0 qpj0Var = new qpj0(this.b, j, -1L, C.TIME_UNSET, null);
        TreeSet<qpj0> treeSet = this.c;
        qpj0 floor = treeSet.floor(qpj0Var);
        if (floor != null && floor.c + floor.d > j) {
            return floor;
        }
        qpj0 ceiling = treeSet.ceiling(qpj0Var);
        if (ceiling != null) {
            long j4 = ceiling.c - j;
            j3 = j3 == -1 ? j4 : Math.min(j4, j3);
        }
        return new qpj0(this.b, j, j3, C.TIME_UNSET, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fy8.class == obj.getClass()) {
            fy8 fy8Var = (fy8) obj;
            if (this.a == fy8Var.a && this.b.equals(fy8Var.b) && this.c.equals(fy8Var.c) && this.e.equals(fy8Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final TreeSet<qpj0> f() {
        return this.c;
    }

    public final boolean g() {
        return this.c.isEmpty();
    }

    public final boolean h(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            a aVar = arrayList.get(i);
            long j3 = aVar.a;
            long j4 = aVar.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(this.a * 31, 31, this.b);
    }

    public final boolean i() {
        return this.d.isEmpty();
    }

    public final boolean j(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.d;
            if (i >= arrayList.size()) {
                arrayList.add(new a(j, j2));
                return true;
            }
            a aVar = arrayList.get(i);
            long j3 = aVar.a;
            if (j3 > j) {
                if (j2 == -1 || j + j2 > j3) {
                    break;
                }
                i++;
            } else {
                long j4 = aVar.b;
                if (j4 == -1 || j3 + j4 > j) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean k(qx8 qx8Var) {
        if (!this.c.remove(qx8Var)) {
            return false;
        }
        File file = qx8Var.f;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final qpj0 l(qpj0 qpj0Var, long j, boolean z) {
        long j2;
        File file;
        TreeSet<qpj0> treeSet = this.c;
        fxc0.z(treeSet.remove(qpj0Var));
        File file2 = qpj0Var.f;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            j2 = j;
            File c = qpj0.c(parentFile, this.a, qpj0Var.c, j2);
            if (file2.renameTo(c)) {
                file = c;
                fxc0.z(qpj0Var.e);
                qpj0 qpj0Var2 = new qpj0(qpj0Var.b, qpj0Var.c, qpj0Var.d, j2, file);
                treeSet.add(qpj0Var2);
                return qpj0Var2;
            }
            ahn.F("Failed to rename " + file2 + " to " + c);
        } else {
            j2 = j;
        }
        file = file2;
        fxc0.z(qpj0Var.e);
        qpj0 qpj0Var22 = new qpj0(qpj0Var.b, qpj0Var.c, qpj0Var.d, j2, file);
        treeSet.add(qpj0Var22);
        return qpj0Var22;
    }

    public final void m(long j) {
        int i = 0;
        while (true) {
            ArrayList<a> arrayList = this.d;
            if (i >= arrayList.size()) {
                throw new IllegalStateException();
            }
            if (arrayList.get(i).a == j) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    public fy8(int i, String str, adl adlVar) {
        this.a = i;
        this.b = str;
        this.e = adlVar;
        this.c = new TreeSet<>();
        this.d = new ArrayList<>();
    }
}
