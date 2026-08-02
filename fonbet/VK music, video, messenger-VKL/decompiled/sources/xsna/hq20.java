package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.newsfeed.entries.RecommendedMiniAppEntry;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebCatalogBanner;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.stat.scheme.CommonFeedStat$TypeFeedBlockMiniAppsItem;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppCustomEventItem;
import com.vkontakte.android.R;
import java.util.Objects;
import xsna.gd60;

/* compiled from: MiniAppRecommendedHolderV2.kt */
/* loaded from: classes4.dex */
public final class hq20 extends qi6<RecommendedMiniAppEntry> implements View.OnClickListener {
    public final h170 C;
    public final VkImage D;
    public final VkImage E;
    public final TextView F;
    public final TextView G;
    public final Button H;
    public final View I;
    public final float J;
    public RecommendedMiniAppEntry K;
    public final Rect L;
    public long M;
    public final gq20 N;
    public final bpn0 O;

    /* compiled from: MiniAppRecommendedHolderV2.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnScrollChangedListener(hq20.this.N);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getViewTreeObserver().removeOnScrollChangedListener(hq20.this.N);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [xsna.gq20] */
    public hq20(ViewGroup viewGroup, h170 h170Var) {
        super(R.layout.holder_game_recommended_v3, viewGroup);
        this.C = h170Var;
        VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.game_banner_container);
        this.D = vkImage;
        this.E = (VkImage) this.itemView.findViewById(R.id.game_icon);
        this.F = (TextView) this.itemView.findViewById(R.id.app_title);
        this.G = (TextView) this.itemView.findViewById(R.id.app_subtitle);
        Button button = (Button) this.itemView.findViewById(R.id.play_game);
        this.H = button;
        View findViewById = this.itemView.findViewById(R.id.clickable_area);
        this.I = findViewById;
        this.J = i35.k(((Number) h170Var.z.getValue()).intValue() / 100.0f, 2);
        this.L = new Rect();
        this.O = new bpn0(new nh0(22));
        dek0.b(vkImage, null, null, 6);
        findViewById.setOnClickListener(this);
        button.setOnClickListener(this);
        if (((Boolean) h170Var.y.getValue()).booleanValue()) {
            this.N = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.gq20
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    long currentTimeMillis = System.currentTimeMillis();
                    hq20 hq20Var = hq20.this;
                    if (currentTimeMillis - hq20Var.M >= 100) {
                        hq20Var.M = currentTimeMillis;
                        hq20Var.itemView.post(new ic3(hq20Var, 6));
                    }
                }
            };
            this.itemView.addOnAttachStateChangeListener(new a());
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qi6
    public final void E6(RecommendedMiniAppEntry recommendedMiniAppEntry) {
        RecommendedMiniAppEntry recommendedMiniAppEntry2 = recommendedMiniAppEntry;
        this.K = recommendedMiniAppEntry2;
        WebApiApplication webApiApplication = recommendedMiniAppEntry2.m;
        this.F.setText(webApiApplication.c);
        boolean f = webApiApplication.f();
        String str = webApiApplication.l;
        if (!f) {
            WebCatalogBanner webCatalogBanner = webApiApplication.G;
            String str2 = webCatalogBanner != null ? webCatalogBanner.e : null;
            if (str2 == null || drm0.N(str2)) {
                str2 = webApiApplication.h;
            }
            if (str2 != null && !drm0.N(str2)) {
                str = str2;
            }
            if (str == null || drm0.N(str)) {
                str = v6(R.string.mini_app_recommendation_subtitle_stub);
            }
        } else if (str == null || drm0.N(str)) {
            str = v6(R.string.game_recommendation_subtitle_stub);
        }
        this.G.setText(str);
        this.H.setText(recommendedMiniAppEntry2.k);
        bwt0.S(this.D, new du0(16, recommendedMiniAppEntry2, this));
        WebImageSize e = webApiApplication.d.b.e(cn70.b(48));
        this.E.o0(e != null ? e.b : null, null);
        if (((Boolean) this.C.y.getValue()).booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.M >= 100) {
                this.M = currentTimeMillis;
                this.itemView.post(new ic3(this, 6));
            }
        }
        if (!epx.f(recommendedMiniAppEntry2.i, "recommended_game") || recommendedMiniAppEntry2.r) {
            return;
        }
        RecommendedMiniAppEntry q6 = q6();
        if (q6 != null) {
            q6.r = true;
        }
        R6(recommendedMiniAppEntry2, null);
    }

    public final void R6(RecommendedMiniAppEntry recommendedMiniAppEntry, Integer num) {
        CommonFeedStat$TypeFeedBlockMiniAppsItem.EventType eventType;
        if (num == null) {
            eventType = CommonFeedStat$TypeFeedBlockMiniAppsItem.EventType.VIEW_APP;
            Objects.toString(eventType);
            long j = recommendedMiniAppEntry.m.b;
        } else {
            eventType = CommonFeedStat$TypeFeedBlockMiniAppsItem.EventType.VIEW_APP_PART;
            Objects.toString(eventType);
            long j2 = recommendedMiniAppEntry.m.b;
        }
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.FEED, SchemeStat$TypeAction.a.b(null, null, new CommonFeedStat$TypeFeedBlockMiniAppsItem(eventType, CommonFeedStat$TypeFeedBlockMiniAppsItem.EventSource.FEED_RECOMMENDED_GAME, new CommonStat$TypeCommonEventItem(Long.valueOf(recommendedMiniAppEntry.m.b), null, null, epx.f(recommendedMiniAppEntry.i, "recommended_game") ? recommendedMiniAppEntry.m.w : this.v, 6, null), num), 3)).q();
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.j
    public final boolean isEnabled() {
        return false;
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebApiApplication webApiApplication;
        WebApiApplication webApiApplication2;
        WebApiApplication webApiApplication3;
        String l;
        if (jjc.b()) {
            return;
        }
        if (epx.f(view, this.I) || epx.f(view, this.H)) {
            RecommendedMiniAppEntry recommendedMiniAppEntry = this.K;
            Action action = recommendedMiniAppEntry != null ? recommendedMiniAppEntry.q : null;
            if (action instanceof ActionOpenUrl) {
                ActionOpenUrl actionOpenUrl = (ActionOpenUrl) action;
                if (actionOpenUrl.c.length() > 0) {
                    afq0 afq0Var = (afq0) this.O.getValue();
                    String str = actionOpenUrl.c;
                    afq0Var.getClass();
                    String a2 = afq0.a(str);
                    RecommendedMiniAppEntry recommendedMiniAppEntry2 = this.K;
                    Integer m = (recommendedMiniAppEntry2 == null || (webApiApplication3 = recommendedMiniAppEntry2.m) == null || (l = Long.valueOf(webApiApplication3.b).toString()) == null) ? null : arm0.m(10, l);
                    RecommendedMiniAppEntry recommendedMiniAppEntry3 = this.K;
                    String str2 = (recommendedMiniAppEntry3 == null || (webApiApplication2 = recommendedMiniAppEntry3.m) == null) ? null : webApiApplication2.w;
                    long currentTimeMillis = System.currentTimeMillis();
                    int intValue = m != null ? m.intValue() : 0;
                    UiTracker uiTracker = UiTracker.a;
                    new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMiniAppCustomEventItem("", currentTimeMillis, intValue, a2, "feed_recommended_game_action_url_click", UiTracker.c().name(), SchemeStat$TypeMiniAppCustomEventItem.Type.TYPE_CLICK, null, str2, null, null, 1664, null), 3)).q();
                    hd60.a().v(new ActionOpenUrl(a2, null, 2, null), this.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
                    return;
                }
            }
            RecommendedMiniAppEntry recommendedMiniAppEntry4 = this.K;
            if (recommendedMiniAppEntry4 == null || (webApiApplication = recommendedMiniAppEntry4.m) == null) {
                return;
            }
            int i = (int) webApiApplication.b;
            String str3 = webApiApplication.g() ? "feed_block_recommended_mini_app" : "feed_block_recommended_game";
            gd60 a3 = hd60.a();
            Context context = this.itemView.getContext();
            String str4 = webApiApplication.f() ? webApiApplication.w : this.v;
            if (str4 == null) {
                str4 = "";
            }
            gd60.a aVar = gd60.a;
            a3.F(context, str3, i, str4);
        }
    }
}
