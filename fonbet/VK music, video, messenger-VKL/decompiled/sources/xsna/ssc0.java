package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.jm50;
import xsna.zsc0;

/* compiled from: PostponedPostsMviStoriesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class ssc0 extends evg0<nsc0, on50, zsc0.b, zsc0, lsc0, wrc0> {
    public final cs60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ssc0(qn60 qn60Var, pn60 pn60Var, esc0 esc0Var, nn50 nn50Var) {
        super(r0, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new cs60(qn60Var, pn60Var, aVar, new eht(this, esc0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        zsc0.b bVar = (zsc0.b) hn50Var;
        if (!(bVar instanceof zsc0.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f.s(((zsc0.b.a) bVar).b);
        return null;
    }
}
