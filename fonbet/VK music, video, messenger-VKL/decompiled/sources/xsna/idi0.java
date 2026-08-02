package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.attachpicker.stickers.selection.views.GifSearchSkeletonView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vkontakte.android.R;

/* compiled from: SelectionGifTabView.kt */
/* loaded from: classes6.dex */
public final class idi0 extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final afi0 b;
    public final RecyclerPaginatedView c;
    public final GifSearchSkeletonView d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final com.vk.lists.c f;
    public boolean g;
    public final yvh0 h;
    public final ylh0 i;

    /* compiled from: SelectionGifTabView.kt */
    public static final class a extends GridLayoutManager.c {
        public a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            idi0 idi0Var = idi0.this;
            ylh0 ylh0Var = idi0Var.i;
            if (i >= (ylh0Var != null ? ylh0Var.getItemCount() : 0)) {
                return 3;
            }
            ylh0 ylh0Var2 = idi0Var.i;
            if (ylh0Var2 == null) {
                return 1;
            }
            int itemViewType = ylh0Var2.getItemViewType(i);
            return (itemViewType == 2 || itemViewType == 3) ? 3 : 1;
        }
    }

    public idi0(Context context, uei0 uei0Var, SelectionStickerView.OpenFrom openFrom, afi0 afi0Var) {
        super(context);
        this.b = afi0Var;
        RecyclerPaginatedView recyclerPaginatedView = new RecyclerPaginatedView(context);
        recyclerPaginatedView.setId(R.id.gif_search_recycler);
        this.c = recyclerPaginatedView;
        GifSearchSkeletonView gifSearchSkeletonView = new GifSearchSkeletonView(context, null, 6);
        this.d = gifSearchSkeletonView;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.e = bVar;
        this.h = new yvh0(new gws(null), getGifSearchState(), new hyd0(1), new b290(this, 16));
        zyt zytVar = new zyt(getGifSearchState(), (syt) afi0Var.g.getValue(), bVar, new buc0(4), new it7(this, 6), new wt30(this, 16));
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(recyclerPaginatedView, layoutParams);
        addView(gifSearchSkeletonView, layoutParams);
        gifSearchSkeletonView.setVisibility(8);
        ylh0 ylh0Var = new ylh0(uei0Var, openFrom, recyclerPaginatedView.getRecyclerView(), new buc0(4));
        this.i = ylh0Var;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
        gridLayoutManager.x = new a();
        recyclerPaginatedView.getRecyclerView().setLayoutManager(gridLayoutManager);
        recyclerPaginatedView.setAdapter(ylh0Var);
        float f = 12;
        recyclerPaginatedView.setPadding(iah0.a(f), 0, iah0.a(f), 0);
        c.h hVar = new c.h(zytVar);
        hVar.f = ylh0Var;
        this.f = com.vk.lists.f.a(hVar, recyclerPaginatedView);
    }

    public static s3q0 a(idi0 idi0Var) {
        x820<Object> a2 = idi0Var.h.a(SearchMode.GIF);
        ylh0 ylh0Var = idi0Var.i;
        if (ylh0Var != null) {
            ylh0Var.i = "";
            ylh0Var.g.b(a2, null);
        }
        GifSearchSkeletonView gifSearchSkeletonView = idi0Var.d;
        RecyclerPaginatedView recyclerPaginatedView = idi0Var.c;
        boolean z = idi0Var.getGifSearchState().d;
        boolean z2 = false;
        if (ylh0Var != null && ylh0Var.getItemCount() == 0) {
            z2 = true;
        }
        if (z && z2) {
            gifSearchSkeletonView.a(idi0Var.getGifSearchState().a.size(), true);
            if (gifSearchSkeletonView.getVisibility() != 0 || gifSearchSkeletonView.getAlpha() < 1.0f) {
                d3m.c(idi0Var.d, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (recyclerPaginatedView.getVisibility() == 0) {
                d3m.e(recyclerPaginatedView, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
        } else {
            if (gifSearchSkeletonView.getVisibility() == 0) {
                d3m.e(idi0Var.d, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
            if (recyclerPaginatedView.getVisibility() != 0 || recyclerPaginatedView.getAlpha() < 1.0f) {
                d3m.c(recyclerPaginatedView, (r15 & 1) != 0 ? 300L : 125L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        return s3q0.a;
    }

    private final czt getGifSearchState() {
        return this.b.s;
    }

    public final void b(boolean z) {
        b1z b1zVar = new b1z(this, 25);
        if (z) {
            post(new m50(b1zVar, 7));
        } else {
            b1zVar.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        com.vk.lists.c cVar;
        super.onAttachedToWindow();
        this.e.b(this.b.u.a0(asu0.a.d()).subscribe(new hdi0(new i0b0(this, 10), 0), new fl30(new wo40(16), 22)));
        ylh0 ylh0Var = this.i;
        if (ylh0Var == null || ylh0Var.getItemCount() != 0 || !this.g || (cVar = this.f) == null) {
            return;
        }
        cVar.p(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.e();
        com.vk.lists.c cVar = this.f;
        if (cVar != null) {
            cVar.v();
        }
    }

    public final void setTabActive(boolean z) {
        this.g = z;
        if (z) {
            ylh0 ylh0Var = this.i;
            if (ylh0Var == null || ylh0Var.getItemCount() != 0) {
                b(false);
                return;
            }
            com.vk.lists.c cVar = this.f;
            if (cVar != null) {
                cVar.p(false);
            }
        }
    }
}
