package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: Clickable.kt */
/* loaded from: classes11.dex */
public final class pjc implements yzs<q630, androidx.compose.runtime.a, Integer, q630> {
    public final /* synthetic */ buw b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ plg0 d;
    public final /* synthetic */ gzs e;
    public final /* synthetic */ gzs f;

    public pjc(buw buwVar, boolean z, plg0 plg0Var, gzs gzsVar, gzs gzsVar2) {
        this.b = buwVar;
        this.c = z;
        this.d = plg0Var;
        this.e = gzsVar;
        this.f = gzsVar2;
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
        q630 g = cuw.a(q630.a.a, sg50Var, this.b).g(new v9g(sg50Var, null, false, this.c, null, this.d, this.e, this.f));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return g;
    }
}
