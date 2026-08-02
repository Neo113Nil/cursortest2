package xsna;

import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedRequestContext;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedResponseContext;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimeRange;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventRequestSent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
/* loaded from: classes4.dex */
public final class iwq extends kx6 implements awq {
    public static final AtomicBoolean w = new AtomicBoolean(true);
    public final MobileOfficialAppsFeedStat$FeedRequestContext g;
    public MobileOfficialAppsFeedStat$FeedResponseContext j;
    public long k;
    public long l;
    public long m;
    public long n;
    public int o;
    public int p;
    public boolean v;
    public final kq01 h = new kq01();
    public final q7o i = new q7o();
    public final sk3<MobileOfficialAppsFeedStat$FeedTimelineEvent.b> q = new sk3<>(10);
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final LinkedHashMap t = new LinkedHashMap();
    public final LinkedHashSet u = new LinkedHashSet();

    /* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
    public static final class a {
        public static long a() {
            return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        }
    }

    /* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
    public static final class b implements Runnable {
        public final /* synthetic */ boolean c;
        public final /* synthetic */ int d;

        public b(boolean z, int i) {
            this.c = z;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            iwq.this.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds(this.c ? MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds.Where.BETWEEN_PAGES : MobileOfficialAppsFeedStat$FeedTimelineEventConsecutiveAds.Where.WITHIN_PAGE, Integer.valueOf(this.d))));
        }
    }

    /* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
    public static final class c implements Runnable {
        public final /* synthetic */ int c;
        public final /* synthetic */ MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason d;

        public c(int i, MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason reason) {
            this.c = i;
            this.d = reason;
        }

        @Override // java.lang.Runnable
        public final void run() {
            iwq.this.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded(this.c, this.d)));
        }
    }

    /* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
    public static final class d implements Runnable {
        public final /* synthetic */ iwq c;
        public final /* synthetic */ long d;

        public d(iwq iwqVar, long j) {
            this.c = iwqVar;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            iwq.this.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventResponseParsingTime(new MobileOfficialAppsFeedStat$FeedTimeRange(String.valueOf(this.c.l), String.valueOf(this.d)))));
        }
    }

    /* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
    public static final class e implements Runnable {
        public final /* synthetic */ iwq c;
        public final /* synthetic */ long d;

        public e(iwq iwqVar, long j) {
            this.c = iwqVar;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            long j = this.d;
            iwq iwqVar = this.c;
            iwqVar.n = j;
            iwq.this.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventRenderingTime(new MobileOfficialAppsFeedStat$FeedTimeRange(String.valueOf(iwqVar.m), String.valueOf(iwqVar.n)), Integer.valueOf(iwqVar.p))));
        }
    }

    /* compiled from: FeedApiTimelineLoadingBuilderImpl.kt */
    public static final class f implements Runnable {
        public final /* synthetic */ iwq c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ long f;

        public f(iwq iwqVar, String str, int i, long j) {
            this.c = iwqVar;
            this.d = str;
            this.e = i;
            this.f = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MobileOfficialAppsFeedStat$FeedResponseContext mobileOfficialAppsFeedStat$FeedResponseContext = new MobileOfficialAppsFeedStat$FeedResponseContext(this.d, Integer.valueOf(this.e));
            iwq iwqVar = this.c;
            iwqVar.j = mobileOfficialAppsFeedStat$FeedResponseContext;
            iwq.this.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventNetworkWaitTime(new MobileOfficialAppsFeedStat$FeedTimeRange(String.valueOf(iwqVar.k), String.valueOf(this.f)))));
        }
    }

    public iwq(MobileOfficialAppsFeedStat$FeedRequestContext mobileOfficialAppsFeedStat$FeedRequestContext) {
        this.g = mobileOfficialAppsFeedStat$FeedRequestContext;
    }

    @Override // xsna.awq
    public final NewsEntry a(String str, izs<? super ak90, ? extends NewsEntry> izsVar) {
        final ArrayList arrayList;
        final long a2;
        final NewsEntry invoke;
        final long a3;
        try {
            arrayList = new ArrayList();
            this.h.getClass();
            bk90 bk90Var = new bk90(arrayList);
            a2 = a.a();
            invoke = izsVar.invoke(bk90Var);
            a3 = a.a();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (invoke != null) {
                asu0.a.getClass();
                asu0.x().execute(new Runnable() { // from class: xsna.gwq
                    @Override // java.lang.Runnable
                    public final void run() {
                        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = new MobileOfficialAppsFeedStat$FeedTimeRange(String.valueOf(a2), String.valueOf(a3));
                        NewsEntry newsEntry = invoke;
                        String Db = newsEntry.Db();
                        iwq iwqVar = this;
                        Integer valueOf = Integer.valueOf(iwqVar.o);
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                        iwqVar.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingTime(mobileOfficialAppsFeedStat$FeedTimeRange, Db, valueOf, arrayList2)));
                        iwqVar.t.put(newsEntry, Integer.valueOf(iwqVar.o));
                        iwqVar.o++;
                    }
                });
                return invoke;
            }
            Exception exc = new Exception("Failed to generate news_entry for unknown reason. Position:  " + this.o);
            this.o = this.o + 1;
            asu0.a.getClass();
            asu0.x().execute(new lwq(this, str, exc));
            return invoke;
        } catch (Exception e3) {
            e = e3;
            Exception exc2 = e;
            asu0.a.getClass();
            asu0.x().execute(new lwq(this, str, exc2));
            throw exc2;
        }
    }

    @Override // xsna.awq
    public final void b(int i, String str) {
        long a2 = a.a();
        asu0.a.getClass();
        asu0.x().execute(new f(this, str, i, a2));
    }

    @Override // xsna.awq
    public final void c() {
        long a2 = a.a();
        asu0.a.getClass();
        asu0.x().execute(new d(this, a2));
    }

    @Override // xsna.awq
    public final void d() {
        final long a2 = a.a();
        asu0.a.getClass();
        asu0.x().execute(new Runnable() { // from class: xsna.hwq
            @Override // java.lang.Runnable
            public final void run() {
                iwq.this.k = a2;
            }
        });
    }

    @Override // xsna.awq
    public final void e() {
        long a2 = a.a();
        asu0.a.getClass();
        asu0.x().execute(new dwq(this, a2, 0));
    }

    @Override // xsna.awq
    public final <R> R f(final NewsEntry newsEntry, izs<? super jzf0, ? extends R> izsVar) {
        final ArrayList arrayList;
        final long a2;
        R invoke;
        final long a3;
        try {
            arrayList = new ArrayList();
            this.i.getClass();
            kzf0 kzf0Var = new kzf0(arrayList);
            a2 = a.a();
            invoke = izsVar.invoke(kzf0Var);
            a3 = a.a();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (invoke != null) {
                asu0.a.getClass();
                asu0.x().execute(new Runnable() { // from class: xsna.ewq
                    @Override // java.lang.Runnable
                    public final void run() {
                        iwq iwqVar = this;
                        LinkedHashMap linkedHashMap = iwqVar.t;
                        NewsEntry newsEntry2 = newsEntry;
                        int intValue = ((Number) linkedHashMap.getOrDefault(newsEntry2, -1)).intValue();
                        MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = new MobileOfficialAppsFeedStat$FeedTimeRange(String.valueOf(a2), String.valueOf(a3));
                        String Db = newsEntry2.Db();
                        Integer valueOf = Integer.valueOf(intValue);
                        ArrayList arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                        iwqVar.r.add(MobileOfficialAppsFeedStat$FeedTimelineEvent.a.a(new MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime(mobileOfficialAppsFeedStat$FeedTimeRange, Db, valueOf, arrayList2)));
                        iwqVar.p++;
                    }
                });
                return invoke;
            }
            Exception exc = new Exception("Failed to generate post_display_item for unknown reason. Position:  " + ((Number) this.t.getOrDefault(newsEntry, -1)).intValue());
            String Db = newsEntry.Db();
            asu0.a.getClass();
            asu0.x().execute(new mwq(this, Db, exc));
            return invoke;
        } catch (Exception e3) {
            e = e3;
            Exception exc2 = e;
            String Db2 = newsEntry.Db();
            asu0.a.getClass();
            asu0.x().execute(new mwq(this, Db2, exc2));
            throw exc2;
        }
    }

    @Override // xsna.awq
    public final void g() {
        long a2 = a.a();
        asu0.a.getClass();
        asu0.x().execute(new hnk(this, a2, 1));
    }

    @Override // xsna.awq
    public final void h() {
        long a2 = a.a();
        asu0.a.getClass();
        asu0.x().execute(new cwq(this, a2, 0));
    }

    @Override // xsna.awq
    public final void i() {
        if (this.p == 0) {
            return;
        }
        long a2 = a.a();
        asu0.a.getClass();
        asu0.x().execute(new e(this, a2));
    }

    @Override // xsna.awq
    public final void j(Throwable th) {
        asu0.a.getClass();
        asu0.x().execute(new kw6(2, this, th));
    }

    @Override // xsna.awq
    public final void k(int i, MobileOfficialAppsFeedStat$FeedTimelineEventFeedEnded.Reason reason) {
        asu0.a.getClass();
        asu0.x().execute(new c(i, reason));
    }

    @Override // xsna.awq
    public final void l(int i, boolean z) {
        asu0.a.getClass();
        asu0.x().execute(new b(z, i));
    }

    @Override // xsna.awq
    public final void m(NewsEntry newsEntry) {
        asu0.a.getClass();
        asu0.x().execute(new fwq(0, newsEntry, this));
    }

    @Override // xsna.awq
    public final void n(boolean z, boolean z2, boolean z3) {
        asu0.a.getClass();
        asu0.x().execute(new po4(this, 1));
        if (z) {
            asu0.x().execute(new kwq(this));
        }
        if (z3 || !z2) {
            return;
        }
        asu0.x().execute(new jwq(this));
    }

    @Override // xsna.awq
    public final void o(Throwable th) {
        asu0.a.getClass();
        asu0.x().execute(new at6(4, this, th));
    }

    @Override // xsna.awq
    public final boolean onRequestSent() {
        v(new MobileOfficialAppsFeedStat$FeedTimelineEventRequestSent(new MobileOfficialAppsFeedStat$FeedTime(String.valueOf(a.a()))));
        return false;
    }

    public final String u(Throwable th) {
        if (!(th instanceof VKApiExecutionException)) {
            String str = fpf0.a(th.getClass()).l() + ':' + th.getMessage();
            if (str.length() > 256) {
                str.substring(0, 256);
            }
            return str;
        }
        StringBuilder e2 = fw3.e("api:");
        StringBuilder sb = new StringBuilder("c=");
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        sb.append(vKApiExecutionException.s());
        e2.append(sb.toString());
        if (!epx.f(vKApiExecutionException.g(), this.g.a)) {
            e2.append("mt=" + vKApiExecutionException.g());
        }
        if (th.getMessage() != null) {
            e2.append("m=" + th.getMessage());
        }
        if (th.getCause() != null) {
            StringBuilder sb2 = new StringBuilder("ca=");
            Throwable cause = th.getCause();
            sb2.append(cause != null ? cause.getClass().getSimpleName() : null);
            sb2.append(':');
            Throwable cause2 = th.getCause();
            sb2.append(cause2 != null ? cause2.getMessage() : null);
            e2.append(sb2.toString());
        }
        if (vKApiExecutionException.I()) {
            e2.append("e=" + vKApiExecutionException.y());
        }
        if (vKApiExecutionException.v() != null) {
            StringBuilder sb3 = new StringBuilder("er=");
            List<VKApiExecutionException> v = vKApiExecutionException.v();
            sb3.append(v != null ? j5g.g0(v, null, X3.j.d, X3.j.e, 0, new nj(21), 25) : null);
            e2.append(sb3.toString());
        }
        if (e2.length() > 256) {
            e2.setLength(256);
        }
        return e2.toString();
    }

    public final void v(MobileOfficialAppsFeedStat$FeedTimelineEvent.b bVar) {
        if (w.get()) {
            this.q.addLast(bVar);
        }
    }
}
