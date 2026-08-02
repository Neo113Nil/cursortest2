package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import xsna.ds60;
import xsna.k8q0;

/* compiled from: NewsfeedSearchNotificationCenterListener.kt */
/* loaded from: classes4.dex */
public final class ny60 implements bd70<Object> {
    public final nl30 b;

    public ny60(nl30 nl30Var) {
        this.b = nl30Var;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        if (i == 114) {
            NewsEntry newsEntry = obj instanceof NewsEntry ? (NewsEntry) obj : null;
            k8q0 k8q0Var = i2 == 100 ? k8q0.a.a : k8q0.b.a;
            if (newsEntry != null) {
                this.b.invoke(new fy60(new ds60.b(new NewsfeedExternalAction.c.f0(newsEntry, k8q0Var))));
            } else {
                com.vk.metrics.eventtracking.b.a.a(new Exception(lhg.a(i, "entry is null, eventType = ")));
            }
        }
    }
}
