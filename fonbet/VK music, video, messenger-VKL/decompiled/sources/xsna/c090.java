package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.Price;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.market.GoodBadge;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.k910;
import xsna.wid0;

/* compiled from: OtherGoodsHolder.kt */
/* loaded from: classes18.dex */
public final class c090 extends vif0<b090> {
    public final sz00 n;
    public final UsableRecyclerView o;
    public final b p;

    /* compiled from: OtherGoodsHolder.kt */
    public static final class a extends RecyclerView.Adapter<vif0<a090>> {
        public final q530 c;
        public final jo3 d;
        public final sz00 e;
        public List<a090> f = EmptyList.b;
        public int g;
        public e090 h;
        public String i;
        public String j;

        /* compiled from: OtherGoodsHolder.kt */
        /* renamed from: xsna.c090$a$a, reason: collision with other inner class name */
        public static class C2632a extends vif0<a090> implements f530 {
            public final e090 n;
            public final String o;
            public final String p;
            public final jo3 q;
            public final q530 r;
            public final sz00 s;
            public final MarketProductTileView t;
            public final aj6 u;
            public final p530 v;
            public final da50 w;
            public final io60 x;

            public C2632a(ViewGroup viewGroup, e090 e090Var, String str, String str2, jo3 jo3Var, q530 q530Var, sz00 sz00Var) {
                super(R.layout.good_similar_tile_market_item, viewGroup.getContext());
                this.n = e090Var;
                this.o = str;
                this.p = str2;
                this.q = jo3Var;
                this.r = q530Var;
                this.s = sz00Var;
                FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.tile_container);
                this.t = (MarketProductTileView) this.itemView.findViewById(R.id.market_product_tile);
                this.u = new aj6(this, 9);
                this.v = new p530(frameLayout, (VKImageView) null, (TextView) null, (TextView) null, (TextView) null, 60);
                int i = 6;
                this.w = new da50(this, i);
                this.x = new io60(this, i);
            }

            @Override // xsna.vif0
            public final void i6(a090 a090Var) {
                k7u k7uVar = a090Var.a;
                Good good = k7uVar.a;
                this.r.c(e530.b(good, null), this, new ri0(23, this, k7uVar));
                Long valueOf = Long.valueOf(good.b);
                Long valueOf2 = Long.valueOf(good.c.b);
                Integer valueOf3 = Integer.valueOf(getAbsoluteAdapterPosition());
                e090 e090Var = this.n;
                mt00.d(valueOf, valueOf2, valueOf3, e090Var != null ? e090Var.d : null, e090Var != null ? Long.valueOf(e090Var.a) : null, e090Var != null ? e090Var.b : null, e090Var != null ? Long.valueOf(e090Var.c) : null, e090Var != null ? e090Var.e : null, null, null, null, null, null, null, 32272);
            }

            @Override // xsna.f530
            public final p530 k1(Integer num) {
                return this.v;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.f530
            public final void o1(Integer num) {
                q6(((a090) this.m).a, false);
                io60 io60Var = this.x;
                MarketProductTileView marketProductTileView = this.t;
                marketProductTileView.Z4(io60Var);
                marketProductTileView.U4(this.w);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
            public final void q6(k7u k7uVar, boolean z) {
                List list;
                wid0 cVar;
                ely elyVar;
                Float f;
                Object obj = k910.a;
                Context context = this.itemView.getContext();
                MarketFavable marketFavable = ((a090) this.m).b;
                Good good = k7uVar.a;
                MarketProductTileConfig.d dVar = new MarketProductTileConfig.d(good.n, z, 14);
                boolean z2 = good.g0;
                String str = good.d;
                if (!z2 && z) {
                    str = context.getString(R.string.product_tile_specify_age);
                }
                MarketProductTileConfig.e eVar = new MarketProductTileConfig.e(str, false, null, 22);
                Price price = good.h;
                MarketProductTileConfig.h hVar = new MarketProductTileConfig.h(price.e, price.f, price.i, null, false, 88);
                MarketProductTileConfig.b bVar = new MarketProductTileConfig.b(marketFavable.f, !z);
                MarketItemRating marketItemRating = good.t;
                Float valueOf = Float.valueOf((marketItemRating == null || (f = marketItemRating.b) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue());
                MarketItemRating marketItemRating2 = good.t;
                int i = 1;
                MarketProductTileConfig.j jVar = new MarketProductTileConfig.j(valueOf, marketItemRating2 != null ? marketItemRating2.d : null, true, 8);
                if (good.i0) {
                    list = EmptyList.b;
                } else {
                    Iterable<GoodBadge> iterable = good.O;
                    if (iterable == null) {
                        iterable = EmptyList.b;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (GoodBadge goodBadge : iterable) {
                        GoodBadge.BadgeType badgeType = goodBadge.c;
                        int i2 = badgeType == null ? -1 : k910.a.$EnumSwitchMapping$0[badgeType.ordinal()];
                        if (i2 == i) {
                            cVar = new wid0.c(null);
                        } else if (i2 != 2) {
                            if (i2 == 3) {
                                cVar = new wid0.a(new wid0.a.InterfaceC3933a.C3934a(goodBadge.b));
                            }
                            cVar = null;
                        } else {
                            List<BaseImageDto> list2 = goodBadge.h;
                            if (list2 != null) {
                                Serializer.c<GoodBadge> cVar2 = GoodBadge.CREATOR;
                                elyVar = new ely(GoodBadge.a.c(list2), GoodBadge.a.a(list2), GoodBadge.a.d(list2), GoodBadge.a.b(list2));
                            } else {
                                elyVar = null;
                            }
                            wid0 dVar2 = new wid0.d(elyVar);
                            if (((Boolean) k910.a.getValue()).booleanValue()) {
                                cVar = dVar2;
                            }
                            cVar = null;
                        }
                        if (cVar != null) {
                            arrayList.add(cVar);
                        }
                        i = 1;
                    }
                    list = arrayList;
                }
                String string = z ? context.getString(R.string.product_tile_status_badge_for_adults) : null;
                this.t.P4(new MarketProductTileConfig(dVar, (MarketProductTileConfig.g) null, hVar, eVar, (MarketProductTileConfig.f) null, bVar, (MarketProductTileConfig.c) null, jVar, new MarketProductTileConfig.k(string, string != null), list, (MarketProductTileConfig.a) null, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 63826));
            }
        }

        public a(q530 q530Var, jo3 jo3Var, sz00 sz00Var) {
            this.c = q530Var;
            this.d = jo3Var;
            this.e = sz00Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return this.g;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(vif0<a090> vif0Var, int i) {
            vif0Var.V5(this.f.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final vif0<a090> onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 2) {
                return new d090(new View(viewGroup.getContext()));
            }
            return new C2632a(viewGroup, this.h, this.i, this.j, this.d, this.c, this.e);
        }
    }

    /* compiled from: OtherGoodsHolder.kt */
    public static final class b extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = iah0.a(11.0f);
            }
            if (childAdapterPosition == (recyclerView.getAdapter() != null ? r4.getItemCount() : 0) - 1) {
                rect.right = iah0.a(11.0f);
            }
            rect.bottom = iah0.a(-10.0f);
        }
    }

    public c090(jo3 jo3Var, q530 q530Var, ViewGroup viewGroup, int i, sz00 sz00Var) {
        super(viewGroup, R.layout.good_other_items_holder, 0);
        this.n = sz00Var;
        UsableRecyclerView usableRecyclerView = (UsableRecyclerView) this.itemView.findViewById(R.id.other_items_list);
        usableRecyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.setOrientation(0);
        usableRecyclerView.setLayoutManager(linearLayoutManager);
        usableRecyclerView.setAdapter(new a(q530Var, jo3Var, sz00Var));
        ViewGroup.LayoutParams layoutParams = usableRecyclerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = iah0.a(i) + marginLayoutParams.bottomMargin;
        usableRecyclerView.setLayoutParams(marginLayoutParams);
        this.o = usableRecyclerView;
        this.p = new b();
    }

    @Override // xsna.vif0
    public final void i6(b090 b090Var) {
        b090 b090Var2 = b090Var;
        List<a090> list = b090Var2.a;
        if (list == null) {
            return;
        }
        UsableRecyclerView usableRecyclerView = this.o;
        RecyclerView.o layoutManager = usableRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        a aVar = (a) usableRecyclerView.getAdapter();
        if (linearLayoutManager != null) {
            linearLayoutManager.setOrientation(0);
        }
        if (usableRecyclerView.getItemDecorationCount() == 0) {
            usableRecyclerView.addItemDecoration(this.p);
        }
        aVar.g = b090Var2.b;
        aVar.h = b090Var2.c;
        aVar.i = b090Var2.d;
        aVar.j = b090Var2.e;
        aVar.f = list;
        aVar.notifyDataSetChanged();
    }
}
