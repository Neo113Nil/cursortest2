package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import kotlin.NoWhenBranchMatchedException;
import xsna.t4c0;

/* compiled from: PostOptionsMviActor.kt */
/* loaded from: classes4.dex */
public final class f6c0 extends al50<m5c0, t4c0.f, on50, t5c0, h5c0, d5c0> {
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        if (!(((t4c0.f) lj50Var) instanceof t4c0.f.a)) {
            throw new NoWhenBranchMatchedException();
        }
        NewsEntry newsEntry = ((m5c0) this.b.getCurrentState()).i;
        if (newsEntry != null) {
            c(new e5c0(newsEntry));
        }
    }
}
