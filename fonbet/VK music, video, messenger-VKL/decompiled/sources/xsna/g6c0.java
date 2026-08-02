package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import xsna.ds60;
import xsna.jm50;

/* compiled from: PostOptionsMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class g6c0 extends evg0<m5c0, on50, x5c0, t5c0, h5c0, d5c0> {
    public final kr60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g6c0(es60 es60Var, g5c0 g5c0Var, nn50 nn50Var) {
        super(r6, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new kr60(es60Var.c, es60Var.e, es60Var.g, es60Var.i, es60Var.j, aVar, new eht(this, g5c0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ds60.e eVar = ((x5c0) hn50Var).b;
        boolean z = eVar instanceof ds60.e.m;
        kr60 kr60Var = this.f;
        if (!z) {
            return kr60Var.d(eVar);
        }
        if (BuildInfo.t()) {
            NewsEntry newsEntry = ((ds60.e.m) eVar).b;
            if (newsEntry instanceof Post) {
                c(new w4c0((Post) newsEntry));
                return null;
            }
        }
        return kr60Var.d(eVar);
    }
}
