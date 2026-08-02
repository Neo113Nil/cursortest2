package xsna;

import com.vk.metrics.logging.PerfLogger;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$NetworkInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$EventTimeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: StoriesFeedMetricsImpl.kt */
/* loaded from: classes6.dex */
public final class gsl0 implements fsl0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public volatile boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public long g;
    public Long h;

    public static void i(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid eventTypeAndroid, long j, long j2, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        if (ow90.f.d.get()) {
            return;
        }
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType contentType = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType.STORY;
        MobileOfficialAppsCoreDeviceStat$NetworkInfo b = x260.b(com.vk.core.utils.newtork.b.c());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.START, j));
        arrayList.add(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.FINISH, j2));
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(0L, contentType, b, null, null, null, arrayList, null, null, null, null, null, null, null, eventTypeAndroid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mobileOfficialAppsConStoriesStat$ViewEntryPoint, 1073725368, null);
        Objects.toString(mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.i());
        mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.toString();
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
        kx6Var.q();
    }

    @Override // xsna.fsl0
    public final void a() {
        this.d = true;
    }

    @Override // xsna.fsl0
    public final void b() {
        this.b = true;
    }

    @Override // xsna.fsl0
    public final void c() {
        if (this.e || this.d) {
            return;
        }
        this.e = true;
        i(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.STORIES_GET, ow90.f.a.get(), System.currentTimeMillis(), null);
    }

    @Override // xsna.fsl0
    public final void d() {
        if (!this.b) {
            i(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.STORIES_FEED_COMPLETED_FOR_DRAW, this.g, System.currentTimeMillis(), null);
            new PerfLogger().a(PerfLogger.Event.STORIES_FEED_COMPLETED_FOR_DRAW);
        } else {
            if (this.c) {
                return;
            }
            this.c = true;
            i(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.STORIES_FEED_DRAW, this.g, System.currentTimeMillis(), null);
            i(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.STORIES_FEED_DRAW_APP_TIME, ow90.f.a.get(), System.currentTimeMillis(), null);
            new PerfLogger().a(PerfLogger.Event.STORIES_FEED_DRAW);
        }
    }

    @Override // xsna.fsl0
    public final void e(MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        Long l = this.h;
        if (l == null) {
            return;
        }
        i(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.STORIES_FEED_OPEN, l.longValue(), System.currentTimeMillis(), mobileOfficialAppsConStoriesStat$ViewEntryPoint);
        this.h = null;
    }

    @Override // xsna.fsl0
    public final void f() {
        this.h = Long.valueOf(System.currentTimeMillis());
    }

    @Override // xsna.fsl0
    public final void g() {
        if (this.f || this.d) {
            return;
        }
        this.f = true;
        i(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.SUCCESS_STORIES_GET, ow90.f.a.get(), System.currentTimeMillis(), null);
    }

    @Override // xsna.fsl0
    public final void h() {
        if (this.a) {
            return;
        }
        this.g = System.currentTimeMillis();
        i(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.START_INIT_STORIES_FEED, ow90.f.a.get(), this.g, null);
        this.a = true;
        new PerfLogger().a(PerfLogger.Event.START_INIT_STORIES_FEED);
    }
}
