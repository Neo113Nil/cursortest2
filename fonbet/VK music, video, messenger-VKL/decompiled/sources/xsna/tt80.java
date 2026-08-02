package xsna;

import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedAdsInsert;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import xsna.aav0;
import xsna.yzc0;

/* compiled from: OptionalNativeAdPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class tt80 extends de {
    public final boolean b;
    public final m73 c;
    public final NativeAdUserLevelAnalyticsSender d;
    public final yzc0.a e;
    public final x84 f;
    public final xzc0 g;
    public long h;

    public tt80(boolean z, m73 m73Var, NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender, yzc0.a aVar, x84 x84Var, xzc0 xzc0Var) {
        this.b = z;
        this.c = m73Var;
        this.d = nativeAdUserLevelAnalyticsSender;
        this.e = aVar;
        this.f = x84Var;
        this.g = xzc0Var;
    }

    public static void q0(int i, int i2, int i3, String str, String str2, Double d) {
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsFeedStat$TypeFeedAdsInsert(MobileOfficialAppsFeedStat$TypeFeedAdsInsert.RequestSource.APPLOVIN_FEED, i, i2, i3, str, str2, d != null ? Float.valueOf((float) d.doubleValue()) : null), 3);
        iid0 iid0Var = new iid0();
        UiTracker uiTracker = UiTracker.a;
        iid0Var.f = UiTracker.c();
        iid0Var.g = b;
        iid0Var.q();
    }

    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        return 0;
    }

    @Override // xsna.de
    public final /* bridge */ /* synthetic */ String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, final NewsEntry newsEntry) {
        if (!(newsEntry instanceof OptionalNativeAdEntry)) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asu0.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.completable.x(new io.reactivex.rxjava3.internal.operators.maybe.s(new io.reactivex.rxjava3.internal.operators.observable.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.Q(0L, 300L, timeUnit, asu0.i()), new v34(new ayo(this, 29), 20))).o(3000L, timeUnit)), new x34(new quz(11), 23)).d(new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.rt80
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                io.reactivex.rxjava3.core.x bVar;
                OptionalNativeAdEntry optionalNativeAdEntry = (OptionalNativeAdEntry) newsEntry;
                tt80 tt80Var = tt80.this;
                aav0.a aVar = (aav0.a) tt80Var.f.invoke();
                if (aVar == null) {
                    tt80.q0(0, 0, 0, null, null, null);
                    return io.reactivex.rxjava3.core.q.T(optionalNativeAdEntry.i);
                }
                String str2 = (String) tt80Var.g.get();
                if (str2 == null || str2.length() == 0) {
                    tt80.q0(0, 0, 0, null, null, null);
                    return io.reactivex.rxjava3.core.q.T(optionalNativeAdEntry.i);
                }
                int hashCode = UUID.randomUUID().hashCode();
                ce60 ce60Var = ce60.b;
                String k = ce60.k(ce60Var, ce60Var.i());
                xo9 create = aVar.create();
                List<String> list = optionalNativeAdEntry.l;
                if (tt80Var.b) {
                    m0g0 m0g0Var = new m0g0();
                    m0g0Var.b = list;
                    bVar = new io.reactivex.rxjava3.internal.operators.single.b(new k73(0, create, m0g0Var));
                } else {
                    bVar = io.reactivex.rxjava3.core.x.i(new Exception("AppLovin cache not enabled"));
                }
                io.reactivex.rxjava3.internal.operators.single.e0 e0Var = new io.reactivex.rxjava3.internal.operators.single.e0(bVar, new tj60(new st80(str2, k, optionalNativeAdEntry, tt80Var, hashCode, create), 2));
                asu0 asu0Var = asu0.a;
                asu0Var.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.n(e0Var.q(asu0.i()).m(asu0Var.d()), new oz(new pb00(tt80Var, 12), 28)), new qj4(new c230(tt80Var, hashCode, optionalNativeAdEntry), 23)), new rj4(new tbx(tt80Var, hashCode, optionalNativeAdEntry), 25));
            }
        })), new t34(new hb40(this, newsEntry), 26));
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q<NewsEntry> f0(u1c0 u1c0Var) {
        return e0(u1c0Var.l, u1c0Var.b);
    }

    @Override // xsna.de
    public final boolean l0() {
        return true;
    }
}
