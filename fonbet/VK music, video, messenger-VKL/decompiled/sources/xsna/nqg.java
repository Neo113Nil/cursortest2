package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.mqg;

/* compiled from: CommunityAddDescriptionReducer.kt */
/* loaded from: classes5.dex */
public final class nqg extends dm50<sqg, mqg, pqg> {
    @Override // xsna.dm50
    public final pqg c(pqg pqgVar, mqg mqgVar) {
        pqg pqgVar2 = pqgVar;
        mqg mqgVar2 = mqgVar;
        if (!(mqgVar2 instanceof mqg.a)) {
            if (mqgVar2.equals(mqg.b.b)) {
                return pqgVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str = ((mqg.a) mqgVar2).b;
        if (str == null) {
            str = "";
        }
        return new pqg(str, pqgVar2.c);
    }

    @Override // xsna.dm50
    public final sqg d() {
        return new sqg(e(new on(this, 26)));
    }

    @Override // xsna.dm50
    public final void h(pqg pqgVar, sqg sqgVar) {
        f(sqgVar.a, pqgVar);
    }
}
