package yads;

import android.net.Uri;
import java.util.Iterator;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class i7 implements qh0 {
    public final i13 a;

    public i7(i13 i13Var) {
        this.a = i13Var;
    }

    @Override // yads.qh0
    public final boolean a(Uri uri) {
        k7 k7Var;
        if (!epx.f(uri.getHost(), "showNextAd")) {
            return false;
        }
        g7 g7Var = (g7) this.a;
        int i = g7Var.m - 1;
        if (i == g7Var.d.c && !g7Var.n) {
            g7Var.n = true;
            g7Var.b.b();
        }
        if (g7Var.m < g7Var.j.size()) {
            af1 af1Var = (af1) j5g.b0(i, g7Var.j);
            if (af1Var != null) {
                af1Var.b();
            }
            j7 j7Var = (j7) j5g.b0(i, g7Var.k);
            if (((j7Var == null || (k7Var = j7Var.b) == null) ? null : k7Var.a) == t13.c) {
                int size = g7Var.j.size() - 1;
                g7Var.m = size;
                Iterator it = g7Var.k.subList(i, size).iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((j7) it.next()).a;
                }
                g7Var.g.a += j;
                lw lwVar = g7Var.h;
                lwVar.a += lwVar.b;
                lwVar.b = 0L;
                int i2 = g7Var.m;
                g7Var.m = i2 + 1;
                if (((af1) g7Var.j.get(i2)).a()) {
                    g7Var.a();
                    g7Var.i.a(g7Var.e, g7Var.l, g7Var.g.a);
                } else if (g7Var.m >= g7Var.j.size()) {
                    g7Var.c.e();
                } else {
                    g7Var.b();
                }
            } else {
                g7Var.b();
            }
        }
        return true;
    }
}
