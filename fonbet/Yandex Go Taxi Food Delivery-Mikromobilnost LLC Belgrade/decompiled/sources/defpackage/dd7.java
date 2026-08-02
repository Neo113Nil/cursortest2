package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class dd7 {
    public final int a;
    public final String b;
    public final TreeSet c;
    public final ArrayList d;
    public f9h e;

    public dd7(int i, String str, f9h f9hVar) {
        this.a = i;
        this.b = str;
        this.e = f9hVar;
        this.c = new TreeSet();
        this.d = new ArrayList();
    }

    public final void a(fds0 fds0Var) {
        this.c.add(fds0Var);
    }

    public final boolean b(che cheVar) {
        this.e = this.e.b(cheVar);
        return !r2.equals(r0);
    }

    public final long c(long j, long j2) {
        d6z.l(j >= 0);
        d6z.l(j2 >= 0);
        fds0 e = e(j, j2);
        long j3 = e.c;
        boolean z = e.w;
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
        long j6 = e.b + j3;
        if (j6 < j4) {
            for (fds0 fds0Var : this.c.tailSet(e, false)) {
                long j7 = fds0Var.b;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + fds0Var.c);
                if (j6 >= j4) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final f9h d() {
        return this.e;
    }

    public final fds0 e(long j, long j2) {
        fds0 fds0Var = new fds0(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        fds0 fds0Var2 = (fds0) treeSet.floor(fds0Var);
        if (fds0Var2 != null && fds0Var2.b + fds0Var2.c > j) {
            return fds0Var2;
        }
        fds0 fds0Var3 = (fds0) treeSet.ceiling(fds0Var);
        if (fds0Var3 != null) {
            long j3 = fds0Var3.b - j;
            if (j2 != -1) {
                j3 = Math.min(j3, j2);
            }
            j2 = j3;
        }
        return fds0.d(j, j2, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dd7.class == obj.getClass()) {
            dd7 dd7Var = (dd7) obj;
            if (this.a == dd7Var.a && this.b.equals(dd7Var.b) && this.c.equals(dd7Var.c) && this.e.equals(dd7Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final TreeSet f() {
        return this.c;
    }

    public final boolean g() {
        return this.c.isEmpty();
    }

    public final boolean h(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            cd7 cd7Var = (cd7) arrayList.get(i);
            long j3 = cd7Var.a;
            long j4 = cd7Var.b;
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
        return this.e.hashCode() + unr0.b(this.a * 31, 31, this.b);
    }

    public final boolean i() {
        return this.d.isEmpty();
    }

    public final boolean j(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                arrayList.add(new cd7(j, j2));
                return true;
            }
            cd7 cd7Var = (cd7) arrayList.get(i);
            long j3 = cd7Var.a;
            if (j3 > j) {
                if (j2 == -1 || j + j2 > j3) {
                    break;
                }
                i++;
            } else {
                long j4 = cd7Var.b;
                if (j4 == -1 || j3 + j4 > j) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean k(lc7 lc7Var) {
        if (!this.c.remove(lc7Var)) {
            return false;
        }
        File file = lc7Var.x;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public final fds0 l(fds0 fds0Var, long j, boolean z) {
        long j2;
        File file;
        TreeSet treeSet = this.c;
        d6z.x(treeSet.remove(fds0Var));
        File file2 = fds0Var.x;
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            j2 = j;
            File e = fds0.e(parentFile, this.a, fds0Var.b, j2);
            if (file2.renameTo(e)) {
                file = e;
                d6z.x(fds0Var.w);
                fds0 fds0Var2 = new fds0(fds0Var.a, fds0Var.b, fds0Var.c, j2, file);
                treeSet.add(fds0Var2);
                return fds0Var2;
            }
            lk91.j("Failed to rename " + file2 + " to " + e);
        } else {
            j2 = j;
        }
        file = file2;
        d6z.x(fds0Var.w);
        fds0 fds0Var22 = new fds0(fds0Var.a, fds0Var.b, fds0Var.c, j2, file);
        treeSet.add(fds0Var22);
        return fds0Var22;
    }

    public final void m(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                ny61.k();
                return;
            } else {
                if (((cd7) arrayList.get(i)).a == j) {
                    arrayList.remove(i);
                    return;
                }
                i++;
            }
        }
    }

    public dd7(int i, String str) {
        this(i, str, f9h.c);
    }
}
