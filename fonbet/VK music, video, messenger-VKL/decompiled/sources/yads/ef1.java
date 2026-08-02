package yads;

import java.util.TreeSet;
import xsna.s5k;

/* loaded from: classes10.dex */
public final class ef1 implements ur {
    public final long a;
    public final TreeSet b = new TreeSet(new s5k(2));
    public long c;

    public ef1(long j) {
        this.a = j;
    }

    public static int a(zr zrVar, zr zrVar2) {
        long j = zrVar.g;
        long j2 = zrVar2.g;
        if (j - j2 != 0) {
            return j < j2 ? -1 : 1;
        }
        if (!zrVar.b.equals(zrVar2.b)) {
            return zrVar.b.compareTo(zrVar2.b);
        }
        long j3 = zrVar.c - zrVar2.c;
        if (j3 == 0) {
            return 0;
        }
        return j3 < 0 ? -1 : 1;
    }

    public final void a(nr nrVar, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            zr zrVar = (zr) this.b.first();
            zz2 zz2Var = (zz2) nrVar;
            synchronized (zz2Var) {
                zz2Var.b(zrVar);
            }
        }
    }
}
