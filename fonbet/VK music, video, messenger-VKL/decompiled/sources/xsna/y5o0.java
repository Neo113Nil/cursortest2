package xsna;

import xsna.ds60;
import xsna.jm50;

/* compiled from: TaskExecutors.kt */
/* loaded from: classes4.dex */
public final class y5o0 extends evg0<Object, on50, Object, Object, Object, Object> {
    public final br60 f;

    public y5o0(es60 es60Var, yt60 yt60Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = new br60(es60Var.e, es60Var.k, new eht(this, yt60Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return this.f.d((ds60.d) ((sn50) hn50Var).e());
    }
}
