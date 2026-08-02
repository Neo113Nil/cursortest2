package xsna;

import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeFeedItem;
import java.util.Collections;
import java.util.List;
import xsna.hzp0;
import xsna.uz30;

/* compiled from: MsgShowReporterImpl.kt */
/* loaded from: classes11.dex */
public final class vz30 implements uz30 {
    public final MobileOfficialAppsCoreNavStat$EventScreen a;
    public final List<String> b = Collections.singletonList("StatlogTracker");

    public vz30(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.a = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    @Override // xsna.uz30
    public final void a(long j) {
        el3 el3Var = Event.b;
        Event.a b = h5s.b("open_post_duration");
        b.b("time", Long.valueOf(j));
        b.j(this.b);
        com.vk.metrics.eventtracking.b.a.k(b.e());
    }

    @Override // xsna.uz30
    public final void b(uz30.a aVar) {
        new hzp0.i0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.FEED_ITEM, null, null, null, aVar.c(), null, 46, null), 0, false, aVar.b(), aVar.a(), new SchemeStat$TypeFeedItem(1, 1, "post", null, null, null, null, 120, null), this.a).a();
    }
}
