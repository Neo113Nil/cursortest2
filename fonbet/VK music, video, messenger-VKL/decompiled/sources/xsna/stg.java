package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.rtg;

/* compiled from: CommunityCategorySuggestionInfoReducer.kt */
/* loaded from: classes5.dex */
public final class stg extends dm50<wtg, rtg, vtg> {
    @Override // xsna.dm50
    public final vtg c(vtg vtgVar, rtg rtgVar) {
        rtg rtgVar2 = rtgVar;
        if (!(rtgVar2 instanceof rtg.a)) {
            throw new NoWhenBranchMatchedException();
        }
        rtg.a aVar = (rtg.a) rtgVar2;
        return new vtg(aVar.b, aVar.c);
    }

    @Override // xsna.dm50
    public final wtg d() {
        return new wtg(e(new mo1(18)));
    }

    @Override // xsna.dm50
    public final void h(vtg vtgVar, wtg wtgVar) {
        f(wtgVar.a, vtgVar);
    }
}
