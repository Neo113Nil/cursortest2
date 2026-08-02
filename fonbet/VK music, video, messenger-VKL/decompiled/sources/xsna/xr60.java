package xsna;

import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.dzen.DzenNews;
import com.vk.feed.core.models.dzen.DzenStory;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeFeedItem;
import java.util.concurrent.ConcurrentHashMap;
import xsna.fb80;
import xsna.hzp0;

/* compiled from: NewsfeedListStatisticsViewsPlugin.kt */
/* loaded from: classes4.dex */
public final class xr60 implements fb80.b<Object> {
    public final /* synthetic */ bs60 b;

    public xr60(bs60 bs60Var) {
        this.b = bs60Var;
    }

    @Override // xsna.fb80.b
    public final void d(NewsEntry newsEntry, fb80.c cVar) {
        String Db;
        String str;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = cVar.i;
        bs60 bs60Var = this.b;
        bs60Var.getClass();
        if (newsEntry != null) {
            boolean z = newsEntry instanceof FaveEntry;
            if (z) {
                FaveEntry faveEntry = (FaveEntry) newsEntry;
                Object obj = faveEntry.i.f;
                NewsEntry newsEntry2 = obj instanceof NewsEntry ? (NewsEntry) obj : null;
                if (newsEntry2 == null || (Db = newsEntry2.Db()) == null) {
                    Db = faveEntry.m;
                }
            } else {
                Db = newsEntry.Db();
            }
            String str2 = Db;
            if (newsEntry instanceof PromoPost) {
                str = ((PromoPost) newsEntry).n.L.b;
            } else if (z) {
                FaveEntry faveEntry2 = (FaveEntry) newsEntry;
                Object obj2 = faveEntry2.i.f;
                str = obj2 instanceof NewsEntry ? ((NewsEntry) obj2).Cb().b : faveEntry2.b.b;
            } else {
                str = newsEntry.Cb().b;
            }
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, null, null, null, str, null, 46, null);
            int i = cVar.e;
            boolean z2 = cVar.h;
            long j = cVar.c;
            long j2 = cVar.d;
            int i2 = cVar.f;
            int i3 = cVar.g;
            SchemeStat$TypeFeedItem.StateAsync stateAsync = cVar.b;
            Feedback feedback = newsEntry.g;
            new hzp0.i0(schemeStat$EventItem, i, z2, j, j2, new SchemeStat$TypeFeedItem(i2, i3, str2, null, stateAsync, feedback != null ? feedback.d : null, cVar.j, 8, null), cVar.i).a();
            bs60Var.l.getClass();
            o8s0.a(newsEntry, str2, cVar);
            newsEntry.Cb().f = true;
        }
        if (bu60.a.contains(mobileOfficialAppsCoreNavStat$EventScreen)) {
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
            jt50.a(SingleEvent.FEED);
        }
        boolean z3 = newsEntry instanceof DzenNews;
        if (z3) {
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView2 = jt50.a;
            jt50.a(SingleEvent.FEED_DZEN_BLOCK);
        }
        if (newsEntry == null || z3 || (newsEntry instanceof DzenStory)) {
            return;
        }
        bs60Var.m(newsEntry, di60.g(newsEntry), di60.f(newsEntry), mobileOfficialAppsCoreNavStat$EventScreen);
    }

    @Override // xsna.fb80.b
    public final void n(Object obj, long j, long j2) {
    }
}
