package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import xsna.xt0;

/* compiled from: MrcStatsTrackerImpl.kt */
/* loaded from: classes14.dex */
public final class og30 implements ng30 {
    public final xt0 a;
    public final lg30 b;

    public og30(xt0 xt0Var, lg30 lg30Var) {
        this.a = xt0Var;
        this.b = lg30Var;
    }

    @Override // xsna.ng30
    public final void a(NewsEntry newsEntry) {
        this.b.a(newsEntry);
    }

    @Override // xsna.ng30
    public final void b(gzs<xt0.a> gzsVar) {
        xt0.a invoke = gzsVar.invoke();
        if (invoke == null) {
            return;
        }
        this.a.d(invoke);
    }
}
