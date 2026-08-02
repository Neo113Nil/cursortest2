package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: Selectable.kt */
/* loaded from: classes11.dex */
public final class lai0 {

    /* compiled from: Clickable.kt */
    public static final class a implements yzs<q630, androidx.compose.runtime.a, Integer, q630> {
        public final /* synthetic */ buw b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ plg0 e;
        public final /* synthetic */ gzs f;

        public a(buw buwVar, boolean z, boolean z2, plg0 plg0Var, gzs gzsVar) {
            this.b = buwVar;
            this.c = z;
            this.d = z2;
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
            q630 g = cuw.a(q630.a.a, sg50Var, this.b).g(new gai0(this.c, sg50Var, null, false, this.d, this.e, this.f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2.j();
            return g;
        }
    }

    public static final q630 a(q630 q630Var, boolean z, sg50 sg50Var, buw buwVar, boolean z2, plg0 plg0Var, gzs<s3q0> gzsVar) {
        q630 a2;
        if (buwVar instanceof guw) {
            a2 = new gai0(z, sg50Var, (guw) buwVar, false, z2, plg0Var, gzsVar);
        } else if (buwVar == null) {
            a2 = new gai0(z, sg50Var, null, false, z2, plg0Var, gzsVar);
        } else {
            q630.a aVar = q630.a.a;
            if (sg50Var != null) {
                a2 = cuw.a(aVar, sg50Var, buwVar).g(new gai0(z, sg50Var, null, false, z2, plg0Var, gzsVar));
            } else {
                a2 = qri.a(aVar, a5x.a, new a(buwVar, z, z2, plg0Var, gzsVar));
            }
        }
        return q630Var.g(a2);
    }

    public static q630 b(q630 q630Var, boolean z, boolean z2, plg0 plg0Var, gzs gzsVar) {
        return q630Var.g(new gai0(z, null, null, true, z2, plg0Var, gzsVar));
    }
}
