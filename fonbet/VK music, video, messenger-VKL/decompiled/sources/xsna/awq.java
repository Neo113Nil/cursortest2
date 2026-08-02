package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FeedApiTimelineLoadingBuilder.kt */
/* loaded from: classes3.dex */
public interface awq {
    public static final a a = a.a;

    /* compiled from: FeedApiTimelineLoadingBuilder.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final AtomicLong b = new AtomicLong();
        public static final AtomicLong c = new AtomicLong();
        public static final AtomicLong d = new AtomicLong();
    }

    NewsEntry a(String str, izs<? super ak90, ? extends NewsEntry> izsVar);

    void b(int i, String str);

    void c();

    void d();

    void e();

    <R> R f(NewsEntry newsEntry, izs<? super jzf0, ? extends R> izsVar);

    void g();

    void h();

    void i();

    void j(Throwable th);

    void k(int i, MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason reason);

    void l(int i, boolean z);

    void m(NewsEntry newsEntry);

    void n(boolean z, boolean z2, boolean z3);

    void o(Throwable th);

    boolean onRequestSent();
}
