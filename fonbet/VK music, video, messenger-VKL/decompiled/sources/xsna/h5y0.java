package xsna;

import android.os.SystemClock;
import com.vk.ads.analytics.NativeAdType;
import com.vk.ads.analytics.NativeAdUserLevelAnalyticsSender;
import com.vk.ads.yandex.api.nativead.YandexNativeAdError;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.YandexNativeAdEntry;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedAdsInsert;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.EmptyStackException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: YandexNativeAdPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class h5y0 extends de {
    public final NativeAdUserLevelAnalyticsSender b;
    public final v4y0 c;
    public final b25 d;
    public long e;

    public h5y0(NativeAdUserLevelAnalyticsSender nativeAdUserLevelAnalyticsSender, v4y0 v4y0Var, b25 b25Var) {
        this.b = nativeAdUserLevelAnalyticsSender;
        this.c = v4y0Var;
        this.d = b25Var;
    }

    public static void q0(int i, int i2, int i3) {
        SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsFeedStat$TypeFeedAdsInsert(MobileOfficialAppsFeedStat$TypeFeedAdsInsert.RequestSource.YANDEX_COMMUNITY, i, i2, i3, "yandex", null, null, 96, null), 3);
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
    public final String d0(u1c0 u1c0Var, int i) {
        return null;
    }

    @Override // xsna.de
    public final io.reactivex.rxjava3.core.q e0(String str, final NewsEntry newsEntry) {
        if (!(newsEntry instanceof YandexNativeAdEntry)) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        asu0.a.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.p1(new io.reactivex.rxjava3.internal.operators.completable.x(new io.reactivex.rxjava3.internal.operators.maybe.s(new io.reactivex.rxjava3.internal.operators.observable.e0(new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.Q(0L, 300L, timeUnit, asu0.i()), new bx80(new qzl0(this, 24), 18))).o(3000L, timeUnit)), new ac20(new hcs0(7), 27)).d(new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.f5y0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                io.reactivex.rxjava3.core.x bVar;
                final h5y0 h5y0Var = h5y0.this;
                final YandexNativeAdEntry yandexNativeAdEntry = (YandexNativeAdEntry) newsEntry;
                String P = h5y0Var.d.P();
                if (P == null || drm0.N(P)) {
                    h5y0.q0(0, 0, 0);
                    return io.reactivex.rxjava3.core.q.T(yandexNativeAdEntry.i);
                }
                e5y0 a = h5y0Var.c.a();
                if (a == null) {
                    h5y0.q0(0, 0, 0);
                    return io.reactivex.rxjava3.core.q.T(yandexNativeAdEntry.i);
                }
                final int hashCode = UUID.randomUUID().hashCode();
                gv50 gv50Var = new gv50(P);
                try {
                    kv50 pop = a.f.pop();
                    a.g.put(pop.a, pop.b);
                    bVar = new io.reactivex.rxjava3.internal.operators.single.o(io.reactivex.rxjava3.core.x.k(pop.a), new qgs0(new zas0(3, a, gv50Var), 7));
                } catch (EmptyStackException unused) {
                    if (a.b) {
                        a.b(gv50Var, new uxb(a, 12), new u5u0(7));
                        bVar = io.reactivex.rxjava3.core.x.i(new YandexNativeAdError.ContinuousError());
                    } else {
                        bVar = new io.reactivex.rxjava3.internal.operators.single.b(new yqg0(a, gv50Var));
                    }
                }
                return new io.reactivex.rxjava3.internal.operators.single.d0(new io.reactivex.rxjava3.internal.operators.single.n(bVar.q(asu0.a.d()), new v5u0(new tuw0(h5y0Var, 3), 7)).l(new awi0(new yva(h5y0Var, hashCode, yandexNativeAdEntry, 3), 19)), new io.reactivex.rxjava3.functions.l() { // from class: xsna.g5y0
                    @Override // io.reactivex.rxjava3.functions.l
                    public final Object apply(Object obj) {
                        h5y0.q0(1, 0, 0);
                        YandexNativeAdEntry yandexNativeAdEntry2 = yandexNativeAdEntry;
                        NewsEntry.TrackData trackData = yandexNativeAdEntry2.m;
                        h5y0 h5y0Var2 = h5y0.this;
                        h5y0Var2.b.a(new fv50(NativeAdType.YANDEX, hashCode, trackData.b, trackData.c), null, false, SystemClock.elapsedRealtime() - h5y0Var2.e);
                        return yandexNativeAdEntry2.i;
                    }
                }, null).w();
            }
        })), new uf20(new ijw0(this, newsEntry), 27));
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
