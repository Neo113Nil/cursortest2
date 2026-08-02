package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.state.ToggleableState;
import xsna.q630;

/* compiled from: Clickable.kt */
/* loaded from: classes11.dex */
public final class c1p0 implements yzs<q630, androidx.compose.runtime.a, Integer, q630> {
    public final /* synthetic */ buw b;
    public final /* synthetic */ ToggleableState c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ plg0 e;
    public final /* synthetic */ gzs f;

    public c1p0(buw buwVar, ToggleableState toggleableState, boolean z, plg0 plg0Var, gzs gzsVar) {
        this.b = buwVar;
        this.c = toggleableState;
        this.d = z;
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
        q630 g = cuw.a(q630.a.a, sg50Var, this.b).g(new cqp0(this.c, sg50Var, null, false, this.d, this.e, this.f));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar2.j();
        return g;
    }
}
