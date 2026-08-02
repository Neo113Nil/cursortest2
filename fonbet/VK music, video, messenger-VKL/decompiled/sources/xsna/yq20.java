package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.stat.scheme.CommonFeedStat$TypeFeedBlockMiniAppsItem;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import java.util.Objects;
import kotlin.Lazy;

/* compiled from: MiniAppsCarouselUiDtoHolder.kt */
/* loaded from: classes4.dex */
public final class yq20 extends rp6<vq20, AppCarousel> {
    public static final int M = iah0.a(12);
    public final h170 E;
    public final Lazy F;
    public final nbf0 G;
    public final nwq H;
    public long I;
    public final xq20 J;
    public final sq20 K;
    public final RecyclerView L;

    /* compiled from: MiniAppsCarouselUiDtoHolder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnScrollChangedListener(yq20.this.J);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getViewTreeObserver().removeOnScrollChangedListener(yq20.this.J);
        }
    }

    /* compiled from: MiniAppsCarouselUiDtoHolder.kt */
    public static final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            yq20.this.d7();
        }
    }

    /* compiled from: MiniAppsCarouselUiDtoHolder.kt */
    public static final class c extends RecyclerView.n {
        public final int b;

        public c(yq20 yq20Var) {
            yq20Var.itemView.getContext();
            this.b = yq20.M;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            int i = gridLayoutManager != null ? gridLayoutManager.s : 1;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (childAdapterPosition == 0 || childAdapterPosition < i) {
                rect.left = 0;
                return;
            }
            int i2 = this.b;
            if (adapter == null || childAdapterPosition != adapter.getItemCount() - 1) {
                rect.left = i2;
            } else {
                rect.left = i2;
                rect.right = 0;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [xsna.xq20] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    public yq20(ViewGroup viewGroup, h170 h170Var, boolean z, Lazy<? extends NewsFeedComponent> lazy) {
        super(R.layout.carousel_holder_without_header, viewGroup);
        this.E = h170Var;
        this.F = lazy;
        getContext();
        sq20 sq20Var = new sq20(z, h170Var);
        this.K = sq20Var;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler);
        this.L = recyclerView;
        c cVar = new c(this);
        bwt0.e0(this.itemView, 0, 0, 0, 0);
        this.itemView.setBackground(null);
        recyclerView.setAdapter(sq20Var);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.addItemDecoration(cVar);
        sq20Var.e = new wq20(this, 0);
        sq20Var.f = new y3i(this, 23);
        nbf0 nbf0Var = new nbf0();
        this.G = nbf0Var;
        recyclerView.setItemAnimator(new jxq(nbf0Var));
        if (((Boolean) h170Var.y.getValue()).booleanValue()) {
            this.H = new nwq(recyclerView, ((Number) h170Var.z.getValue()).intValue(), new f5x(this, 9), new cqv(this, 15), new nq1(this, 7));
            this.J = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.xq20
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    long currentTimeMillis = System.currentTimeMillis();
                    yq20 yq20Var = yq20.this;
                    if (currentTimeMillis - yq20Var.I >= 100) {
                        yq20Var.I = currentTimeMillis;
                        yq20Var.L.post(new oh(yq20Var, 8));
                    }
                }
            };
            this.itemView.addOnAttachStateChangeListener(new a());
        }
        recyclerView.addOnScrollListener(new b());
    }

    public static void b7(ApiApplication apiApplication) {
        if (apiApplication == null) {
            return;
        }
        int i = (int) apiApplication.b.b;
        String str = apiApplication.B;
        ufx ufxVar = new ufx("apps.addAppToFeedBlackList", new lr(4), new pn(3));
        ufx.k(ufxVar, "app_id", i, 0, 12);
        if (str != null) {
            ufx.n(ufxVar, "track_code", str, 0, 12);
        }
        yfb.x(ufxVar).p();
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(vq20 vq20Var) {
        this.K.submitList(vq20Var.h);
        if (((Boolean) this.E.y.getValue()).booleanValue()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.I >= 100) {
                this.I = currentTimeMillis;
                this.L.post(new oh(this, 8));
            }
        }
        d7();
    }

    public final void c7(AppCarouselItem appCarouselItem, AppCarousel appCarousel, Integer num) {
        CommonFeedStat$TypeFeedBlockMiniAppsItem.EventType eventType;
        String str;
        String str2;
        UserId userId;
        if (num == null) {
            eventType = CommonFeedStat$TypeFeedBlockMiniAppsItem.EventType.VIEW_APP;
            Objects.toString(eventType);
            ApiApplication apiApplication = appCarouselItem.f;
            if (apiApplication != null) {
                UserId userId2 = apiApplication.b;
            }
        } else {
            eventType = CommonFeedStat$TypeFeedBlockMiniAppsItem.EventType.VIEW_APP_PART;
            Objects.toString(eventType);
            ApiApplication apiApplication2 = appCarouselItem.f;
            if (apiApplication2 != null) {
                UserId userId3 = apiApplication2.b;
            }
        }
        CommonFeedStat$TypeFeedBlockMiniAppsItem.EventSource eventSource = epx.f(appCarousel.n, "recommended_games_carousel") ? CommonFeedStat$TypeFeedBlockMiniAppsItem.EventSource.FEED_RECOMMENDED_GAMES_CAROUSEL : CommonFeedStat$TypeFeedBlockMiniAppsItem.EventSource.FEED_MINI_APPS_CAROUSEL;
        ApiApplication apiApplication3 = appCarouselItem.f;
        Long valueOf = (apiApplication3 == null || (userId = apiApplication3.b) == null) ? null : Long.valueOf(userId.b);
        if (epx.f(appCarousel.n, "recommended_games_carousel")) {
            ApiApplication apiApplication4 = appCarouselItem.f;
            if (apiApplication4 == null) {
                str2 = null;
                new iid0(MobileOfficialAppsCoreNavStat$EventScreen.FEED, SchemeStat$TypeAction.a.b(null, null, new CommonFeedStat$TypeFeedBlockMiniAppsItem(eventType, eventSource, new CommonStat$TypeCommonEventItem(valueOf, null, null, str2, 6, null), num), 3)).q();
            }
            str = apiApplication4.B;
        } else {
            str = this.v;
        }
        str2 = str;
        new iid0(MobileOfficialAppsCoreNavStat$EventScreen.FEED, SchemeStat$TypeAction.a.b(null, null, new CommonFeedStat$TypeFeedBlockMiniAppsItem(eventType, eventSource, new CommonStat$TypeCommonEventItem(valueOf, null, null, str2, 6, null), num), 3)).q();
    }

    public final void d7() {
        vq20 vq20Var;
        AppCarousel appCarousel;
        AppCarousel appCarousel2;
        RecyclerView.o layoutManager = this.L.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int v = linearLayoutManager != null ? linearLayoutManager.v() : 0;
        int x = linearLayoutManager != null ? linearLayoutManager.x() : 0;
        if (v > x) {
            return;
        }
        while (true) {
            vq20 vq20Var2 = (vq20) this.C;
            if (((vq20Var2 == null || (appCarousel2 = vq20Var2.i) == null) ? false : Boolean.valueOf(appCarousel2.p.contains(Integer.valueOf(v))).equals(Boolean.FALSE)) && (vq20Var = (vq20) this.C) != null && (appCarousel = vq20Var.i) != null && v <= e43.h(appCarousel.o) && v >= 0) {
                AppCarouselItem appCarouselItem = appCarousel.o.get(v);
                appCarousel.p.add(Integer.valueOf(v));
                c7(appCarouselItem, appCarousel, null);
            }
            if (v == x) {
                return;
            } else {
                v++;
            }
        }
    }
}
