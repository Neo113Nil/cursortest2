package xsna;

import kotlin.Lazy;
import xsna.jm50;

/* compiled from: DiscoverSimilarFeedMviExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class w7n extends evg0<l8n, on50, u8n, z8n, j8n, t7n> {
    public final kq60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w7n(hap hapVar, qn60 qn60Var, pn60 pn60Var, Lazy lazy, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new kq60(qn60Var, pn60Var, lazy, aVar, new eht(this, hapVar));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        this.f.s(((u8n) hn50Var).b);
        return null;
    }
}
