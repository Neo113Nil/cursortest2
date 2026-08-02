package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.vs60;

/* compiled from: NewsfeedCacheActor.kt */
/* loaded from: classes4.dex */
public final class kd60 extends al50<qz60, vs60.a, on50, r070, jv60, xh60> {
    public final sj50<qz60, on50, r070, jv60, xh60> c;
    public final qn60 d;
    public final Lazy e;

    public kd60(sj50<qz60, on50, r070, jv60, xh60> sj50Var, qn60 qn60Var, Lazy<? extends NewsFeedComponent> lazy) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = qn60Var;
        this.e = lazy;
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        if (!(((vs60.a) lj50Var) instanceof vs60.a.C3901a)) {
            throw new NoWhenBranchMatchedException();
        }
        qz60 qz60Var = (qz60) this.b.getCurrentState();
        if (qz60Var.h.a.indexOfKey(qz60Var.c) >= 0) {
            return;
        }
        LinkedHashSet c = this.d.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : c) {
            if (obj instanceof NewsEntry) {
                arrayList.add(obj);
            }
        }
        ((NewsFeedComponent) this.e.getValue()).Aa().b(qz60Var.c, qz60Var.b.d, epx.f(qz60Var.d, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP)), arrayList);
    }
}
