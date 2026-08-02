package xsna;

import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Movie.java */
/* loaded from: classes13.dex */
public final class pc30 {
    public cn10 a;
    public LinkedList b;

    public static long b(long j, long j2) {
        return j2 == 0 ? j : b(j2, j % j2);
    }

    public final void a(ci ciVar) {
        uep0 uep0Var;
        long j = ciVar.i3().i;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                uep0Var = null;
                break;
            }
            uep0 uep0Var2 = (uep0) it.next();
            if (uep0Var2.i3().i == j) {
                uep0Var = uep0Var2;
                break;
            }
        }
        if (uep0Var != null) {
            hgp0 i3 = ciVar.i3();
            long j2 = 0;
            for (uep0 uep0Var3 : this.b) {
                if (j2 < uep0Var3.i3().i) {
                    j2 = uep0Var3.i3().i;
                }
            }
            i3.i = j2 + 1;
        }
        this.b.add(ciVar);
    }

    public final String toString() {
        String str = "Movie{ ";
        for (uep0 uep0Var : this.b) {
            str = String.valueOf(str) + "track_" + uep0Var.i3().i + " (" + uep0Var.getHandler() + ") ";
        }
        return String.valueOf(str).concat("}");
    }
}
