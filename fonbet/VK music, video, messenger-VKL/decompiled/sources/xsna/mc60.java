package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import kotlin.Lazy;

/* compiled from: NewsfeedAnalyticsTracker.kt */
/* loaded from: classes4.dex */
public final class mc60 {
    public final eq60 a;
    public final Lazy b;

    public mc60(p4r p4rVar, po40 po40Var, eq60 eq60Var, Lazy lazy) {
        this.a = eq60Var;
        this.b = lazy;
    }

    public final void a(NewsEntry newsEntry, Integer num, MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action) {
        UserId o = k9q0.o(newsEntry);
        int n = di60.n(newsEntry);
        p4r.d(action, o, Integer.valueOf(n), newsEntry.Cb().b, num);
    }
}
