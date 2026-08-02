package xsna;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;

/* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
/* loaded from: classes4.dex */
public final class kwq implements Runnable {
    public final /* synthetic */ iwq b;

    public kwq(iwq iwqVar) {
        this.b = iwqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new com.vk.stat.scheme.y()));
    }
}
