package xsna;

import android.view.KeyEvent;
import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: Clickable.kt */
/* loaded from: classes11.dex */
public final class ojc {

    /* compiled from: Clickable.kt */
    public static final class a implements yzs<q630, androidx.compose.runtime.a, Integer, q630> {
        public final /* synthetic */ buw b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;
        public final /* synthetic */ plg0 e;
        public final /* synthetic */ gzs f;

        public a(buw buwVar, boolean z, String str, plg0 plg0Var, gzs gzsVar) {
            this.b = buwVar;
            this.c = z;
            this.d = str;
            this.e = plg0Var;
            this.f = gzsVar;
        }

        @Override // xsna.yzs
        public final q630 invoke(q630 q630Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            aVar2.K(-1525724089);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1525724089, intValue, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:637)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = ir.h(aVar2);
            }
            sg50 sg50Var = (sg50) x;
            q630 g = cuw.a(q630.a.a, sg50Var, this.b).g(new mjc(sg50Var, null, false, this.c, this.d, this.e, this.f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
            return g;
        }
    }

    public static final q630 a(q630 q630Var, sg50 sg50Var, buw buwVar, boolean z, String str, plg0 plg0Var, gzs<s3q0> gzsVar) {
        q630 a2;
        if (buwVar instanceof guw) {
            a2 = new mjc(sg50Var, (guw) buwVar, false, z, str, plg0Var, gzsVar);
        } else if (buwVar == null) {
            a2 = new mjc(sg50Var, null, false, z, str, plg0Var, gzsVar);
        } else {
            q630.a aVar = q630.a.a;
            if (sg50Var != null) {
                a2 = cuw.a(aVar, sg50Var, buwVar).g(new mjc(sg50Var, null, false, z, str, plg0Var, gzsVar));
            } else {
                a2 = qri.a(aVar, a5x.a, new a(buwVar, z, str, plg0Var, gzsVar));
            }
        }
        return q630Var.g(a2);
    }

    public static /* synthetic */ q630 b(q630 q630Var, sg50 sg50Var, buw buwVar, boolean z, plg0 plg0Var, gzs gzsVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            plg0Var = null;
        }
        return a(q630Var, sg50Var, buwVar, z2, null, plg0Var, gzsVar);
    }

    public static q630 c(q630 q630Var, boolean z, String str, plg0 plg0Var, gzs gzsVar, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return q630Var.g(new mjc(null, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : plg0Var, gzsVar));
    }

    public static q630 d(q630 q630Var, sg50 sg50Var, guw guwVar, boolean z, plg0 plg0Var, gzs gzsVar, gzs gzsVar2, int i) {
        q630 g;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        plg0 plg0Var2 = (i & 16) != 0 ? null : plg0Var;
        gzs gzsVar3 = (i & 64) != 0 ? null : gzsVar;
        if (guwVar != null) {
            g = new v9g(sg50Var, guwVar, false, z2, null, plg0Var2, gzsVar2, gzsVar3);
        } else if (guwVar == null) {
            g = new v9g(sg50Var, null, false, z2, null, plg0Var2, gzsVar2, gzsVar3);
        } else {
            q630.a aVar = q630.a.a;
            g = sg50Var != null ? cuw.a(aVar, sg50Var, guwVar).g(new v9g(sg50Var, null, false, z2, null, plg0Var2, gzsVar2, gzsVar3)) : qri.a(aVar, a5x.a, new pjc(guwVar, z2, plg0Var2, gzsVar2, gzsVar3));
        }
        return q630Var.g(g);
    }

    public static q630 e(int i, String str, gzs gzsVar, gzs gzsVar2, q630 q630Var) {
        if ((i & 2) != 0) {
            str = null;
        }
        return q630Var.g(new v9g(null, null, true, true, str, null, gzsVar2, gzsVar));
    }

    public static final boolean f(KeyEvent keyEvent) {
        long u = zq70.u(keyEvent);
        int i = bdy.O;
        return bdy.a(u, bdy.h) || bdy.a(u, bdy.r) || bdy.a(u, bdy.E) || bdy.a(u, bdy.q);
    }
}
