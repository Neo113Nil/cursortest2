package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.u3m;

/* compiled from: DesignDemoReducer.kt */
/* loaded from: classes18.dex */
public final class v3m extends dm50<y3m, u3m, x3m> {
    @Override // xsna.dm50
    public final x3m c(x3m x3mVar, u3m u3mVar) {
        u3m u3mVar2 = u3mVar;
        if (u3mVar2 instanceof u3m.a) {
            return new x3m(((u3m.a) u3mVar2).b);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final y3m d() {
        return new y3m(e(new md(22)));
    }

    @Override // xsna.dm50
    public final void h(x3m x3mVar, y3m y3mVar) {
        f(y3mVar.a, x3mVar);
    }
}
