package xsna;

import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.market.api.analytics.MarketCtaButtonAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;

/* compiled from: MarketAnalytics.kt */
/* loaded from: classes18.dex */
public interface lt00 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = a.a;
    }

    static /* synthetic */ void h(lt00 lt00Var, Long l, Long l2, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, Integer num2, Long l3, CommonMarketStat$TypeMarketContextContent.Type type, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            l3 = null;
        }
        if ((i & 128) != 0) {
            type = null;
        }
        lt00Var.i(l, l2, num, commonMarketStat$TypeRefSource, str, num2, l3, type);
    }

    /* compiled from: MarketAnalytics.kt */
    public static final class a {
        private static final lt00 STUB = new C3292a();
        public static final /* synthetic */ int a = 0;

        public final lt00 getSTUB() {
            return STUB;
        }

        /* compiled from: MarketAnalytics.kt */
        /* renamed from: xsna.lt00$a$a, reason: collision with other inner class name */
        public static final class C3292a implements lt00 {
            @Override // xsna.lt00
            public final void a(zz00 zz00Var) {
            }

            @Override // xsna.lt00
            public final void b(zz00 zz00Var) {
            }

            @Override // xsna.lt00
            public final void e(zz00 zz00Var) {
            }

            @Override // xsna.lt00
            public final void f(MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams) {
            }

            @Override // xsna.lt00
            public final void g(zz00 zz00Var) {
            }

            @Override // xsna.lt00
            public final void c(String str, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
            }

            @Override // xsna.lt00
            public final void d(MarketFavable marketFavable, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, String str) {
            }

            @Override // xsna.lt00
            public final void i(Long l, Long l2, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, Integer num2, Long l3, CommonMarketStat$TypeMarketContextContent.Type type) {
            }
        }
    }

    default void a(zz00 zz00Var) {
    }

    default void b(zz00 zz00Var) {
    }

    default void e(zz00 zz00Var) {
    }

    default void f(MarketCtaButtonAnalyticsParams marketCtaButtonAnalyticsParams) {
    }

    default void g(zz00 zz00Var) {
    }

    default void c(String str, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource) {
    }

    default void d(MarketFavable marketFavable, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, Integer num, String str) {
    }

    default void i(Long l, Long l2, Integer num, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, String str, Integer num2, Long l3, CommonMarketStat$TypeMarketContextContent.Type type) {
    }
}
