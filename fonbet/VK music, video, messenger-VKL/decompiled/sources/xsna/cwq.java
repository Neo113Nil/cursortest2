package xsna;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedResponseContext;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.protocol.impl.commands.RtcCommandExecutorImpl;
import xsna.awq;
import xsna.ow90;
import xsna.uuv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cwq implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cwq(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                iwq iwqVar = (iwq) this.d;
                if (!iwqVar.v) {
                    ow90.a aVar = ow90.f;
                    long j = aVar.a.get();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    iwqVar.v(new MobileOfficialAppsFeedStat$FeedTimelineEventAppStarted(new MobileOfficialAppsFeedStat$FeedTime(String.valueOf(timeUnit.toMicros(j)))));
                    iwqVar.v(new MobileOfficialAppsFeedStat$FeedTimelineEventAppInitialized(new MobileOfficialAppsFeedStat$FeedTime(String.valueOf(timeUnit.toMicros(aVar.b.get())))));
                    awq.a.getClass();
                    iwqVar.v(new MobileOfficialAppsFeedStat$FeedTimelineEventLoaderAppeared(new MobileOfficialAppsFeedStat$FeedTime(String.valueOf(timeUnit.toMicros(awq.a.b.get())))));
                    iwqVar.v(new MobileOfficialAppsFeedStat$FeedTimelineEventCacheLoadingStarted(new MobileOfficialAppsFeedStat$FeedTime(String.valueOf(timeUnit.toMicros(awq.a.c.get())))));
                    iwqVar.v(new MobileOfficialAppsFeedStat$FeedTimelineEventCachedNewsAppeared(new MobileOfficialAppsFeedStat$FeedTime(String.valueOf(timeUnit.toMicros(awq.a.d.get())))));
                    iwqVar.q.clear();
                    MobileOfficialAppsFeedStat$FeedResponseContext mobileOfficialAppsFeedStat$FeedResponseContext = iwqVar.j;
                    MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline = new MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline(iwqVar.g, new MobileOfficialAppsFeedStat$FeedTimeRange(String.valueOf(iwqVar.k), String.valueOf(this.c)), iwqVar.r, mobileOfficialAppsFeedStat$FeedResponseContext);
                    kx6 kx6Var = new kx6();
                    kx6Var.f = mobileOfficialAppsFeedStat$TypeFeedLoadingTimeline;
                    kx6Var.q();
                    iwqVar.v = true;
                    break;
                }
                break;
            case 1:
                ((RtcCommandExecutorImpl) this.d).b(this.c);
                break;
            default:
                ((uuv0.a) this.d).a(this.c);
                break;
        }
    }

    public /* synthetic */ cwq(uuv0.a aVar, uuv0 uuv0Var, int i, long j, long j2, long j3, long j4) {
        this.b = 2;
        this.d = aVar;
        this.c = j2;
    }
}
