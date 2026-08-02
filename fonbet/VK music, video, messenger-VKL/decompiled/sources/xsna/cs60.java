package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.ds60;

/* compiled from: NewsfeedListStoriesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class cs60 extends evg0<ur60, on50, ds60.g, ds60, qr60, yo60> {
    public final qn60 f;
    public final pn60 g;

    public cs60(qn60 qn60Var, pn60 pn60Var, jm50 jm50Var, nn50<ur60, on50, ds60, qr60, yo60> nn50Var) {
        super(jm50Var, nn50Var);
        this.f = qn60Var;
        this.g = pn60Var;
    }

    @Override // xsna.mn50
    public final /* bridge */ /* synthetic */ jn50 d(hn50 hn50Var) {
        s((ds60.g) hn50Var);
        return null;
    }

    public final void s(ds60.g gVar) {
        if (!(gVar instanceof ds60.g.a)) {
            throw new NoWhenBranchMatchedException();
        }
        fs60.b(this, new pk(15, this, (ds60.g.a) gVar));
    }
}
