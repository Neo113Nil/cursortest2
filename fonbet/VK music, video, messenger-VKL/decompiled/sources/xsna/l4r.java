package xsna;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.ironsource.C4504q2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.home.HomeFragment2;
import com.vk.newsfeed.api.NewsfeedRouter;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import ru.ok.android.utils.Logger;
import xsna.hl10;
import xsna.lq60;

/* compiled from: FeedRootHandler.kt */
/* loaded from: classes7.dex */
public final class l4r implements fhd0, lao0 {
    public final NewsfeedRouter a;
    public final zb70 b;
    public final wro c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new x84(9));

    public l4r(NewsfeedRouter newsfeedRouter, zb70 zb70Var, wro wroVar) {
        this.a = newsfeedRouter;
        this.b = zb70Var;
        this.c = wroVar;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        Context context = fgxVar.e;
        String a = fgxVar.a("section");
        String a2 = fgxVar.a("feed_id");
        String a3 = fgxVar.a("filter");
        boolean f = epx.f(a, "discover");
        NewsfeedRouter newsfeedRouter = this.a;
        if (f || epx.f(a, "recommended")) {
            newsfeedRouter.t(context);
        } else if (epx.f(a, C4504q2.x)) {
            if (epx.f(fgxVar.a("list"), BillingClient.FeatureType.SUBSCRIPTIONS)) {
                newsfeedRouter.S(context, fgxVar.a("title"), fgxVar.a("ref"), fgxVar.a("scroll_to"));
            } else {
                this.b.a(context);
            }
        } else if (epx.f(a, "search")) {
            String a4 = fgxVar.a("situational_suggest_id");
            String a5 = fgxVar.a(CampaignEx.JSON_KEY_AD_Q);
            NewsfeedRouter.l(this.a, fgxVar.e, a5, null, null, a4, null, null, 108);
        } else if (epx.f(a, "friends")) {
            newsfeedRouter.e(context, lq60.b.a);
        } else if (epx.f(a, "photos")) {
            newsfeedRouter.e(context, lq60.c.a);
        } else if (epx.f(a, "videos")) {
            newsfeedRouter.e(context, lq60.d.a);
        } else if (epx.f(a, "likes")) {
            newsfeedRouter.d0(context, a3);
        } else if (!epx.f(a, "custom") || a2 == null || a2.length() == 0) {
            if (epx.f(a, "") || a == null) {
                String a6 = fgxVar.a(Logger.METHOD_W);
                if (a6 == null || !brm0.B(a6, "actual-news-", false)) {
                    HomeFragment2.a aVar = new HomeFragment2.a();
                    String a7 = fgxVar.a("access_key");
                    if (a7 != null && a7.length() != 0) {
                        aVar.y(a7);
                    }
                    aVar.k(context);
                } else {
                    hl10 e = new Regex("actual-news-([-a-zA-Z0-9_]+)").e(a6);
                    if (e != null && e.b().size() >= 2) {
                        String str = (String) ((hl10.a) e.b()).get(1);
                        if (((Boolean) this.d.getValue()).booleanValue()) {
                            this.c.a(context, str, "from_deeplink");
                        } else {
                            com.vk.common.links.c.J(context);
                        }
                    }
                }
            } else if (a.equals("comments")) {
                newsfeedRouter.e(context, lq60.a.a);
            } else {
                com.vk.common.links.c.J(context);
            }
        } else if (brm0.B(a2, "discover_category_trends/trends/", false)) {
            NewsfeedRouter.b(this.a, fgxVar.e, a2, null, null, null, 60);
        } else if (brm0.B(a2, "discover_category_trends/dzen/", false)) {
            NewsfeedRouter.O(newsfeedRouter, context, a2);
        } else if (a2.equals("discover_category_trends/trends")) {
            newsfeedRouter.f(context, a2);
        } else if (brm0.B(a2, "discover_media_similar_news/similar_news/", false)) {
            newsfeedRouter.F(context, a2);
        } else {
            newsfeedRouter.c(context, a2);
        }
        blk.P(fgxVar).onSuccess();
    }
}
