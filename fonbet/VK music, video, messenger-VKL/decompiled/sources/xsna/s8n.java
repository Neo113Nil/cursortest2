package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.jm50;
import xsna.z8n;

/* compiled from: DiscoverSimilarFeedMviStoriesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class s8n extends evg0<l8n, on50, z8n.b, z8n, j8n, t7n> {
    public final cs60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s8n(qn60 qn60Var, pn60 pn60Var, nn50 nn50Var) {
        super(r0, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new cs60(qn60Var, pn60Var, aVar, new r8n(this));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        z8n.b bVar = (z8n.b) hn50Var;
        if (!(bVar instanceof z8n.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f.s(((z8n.b.a) bVar).b);
        return null;
    }
}
