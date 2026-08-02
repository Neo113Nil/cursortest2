package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.Price;
import com.vk.dto.market.GoodBadge;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.ecomm.design.view.tile.b;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.wid0;

/* compiled from: GoodPreviewMarketItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class w6u extends vfz<v6u> {
    public final sop l;
    public final bih m;
    public final Object n;
    public final MarketProductTileView o;
    public v6u p;

    /* compiled from: GoodPreviewMarketItemViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoodBadge.BadgeType.values().length];
            try {
                iArr[GoodBadge.BadgeType.OZON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoodBadge.BadgeType.PARTNER_INTEGRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoodBadge.BadgeType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w6u(ViewGroup viewGroup, sop sopVar, bih bihVar) {
        super(R.layout.good_preview_market_item, viewGroup);
        this.l = sopVar;
        this.m = bihVar;
        this.n = msy.a(LazyThreadSafetyMode.NONE, new ml7(10));
        MarketProductTileView marketProductTileView = (MarketProductTileView) this.itemView.findViewById(R.id.market_product_tile);
        this.o = marketProductTileView;
        marketProductTileView.U4(new m2g(this, 23));
        marketProductTileView.Z4(new fbh(this, 23));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [xsna.wid0$d] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v18, types: [xsna.wid0$a] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(v6u v6uVar) {
        wid0.c cVar;
        ely elyVar;
        v6u v6uVar2 = v6uVar;
        k7u k7uVar = v6uVar2.b;
        v6u v6uVar3 = this.p;
        MarketProductTileView marketProductTileView = this.o;
        if (v6uVar3 != null && v6uVar3.getItemId().equals(v6uVar2.getItemId())) {
            v6u v6uVar4 = this.p;
            if (v6uVar4 == null) {
                v6uVar4 = null;
            }
            if (v6uVar4.getItemId().equals(v6uVar2.getItemId())) {
                v6u v6uVar5 = this.p;
                boolean z = (v6uVar5 != null ? v6uVar5 : null).b.a.J;
                boolean z2 = k7uVar.a.J;
                if (z != z2) {
                    marketProductTileView.T4(new MarketProductTileConfig.b(z2, true));
                    this.p = v6uVar2;
                    return;
                }
                return;
            }
            return;
        }
        this.p = v6uVar2;
        Good good = k7uVar.a;
        Good good2 = k7uVar.a;
        MarketProductTileConfig.ProductStatus productStatus = good.i0 ? MarketProductTileConfig.ProductStatus.HardBlock : good.h0 ? MarketProductTileConfig.ProductStatus.SoftBlock : !good.Bb() ? MarketProductTileConfig.ProductStatus.OutOfStock : MarketProductTileConfig.ProductStatus.Normal;
        Image image = good.n;
        boolean z3 = good.i0;
        boolean z4 = good.g0;
        int i = R.drawable.vk_icon_gallery_outline_56;
        if (!z4 && z3) {
            i = R.drawable.vk_icon_block_outline_56;
        }
        Integer valueOf = Integer.valueOf(i);
        boolean z5 = good.h0;
        marketProductTileView.getClass();
        Context context = marketProductTileView.getContext();
        if (context != null) {
            awt0.u(marketProductTileView.t, true);
            marketProductTileView.getContext();
            b.a aVar = new b.a(context, marketProductTileView.t, marketProductTileView.v, image, null, valueOf, false);
            if (z5) {
                com.vk.ecomm.design.view.tile.b.b(aVar);
            } else {
                com.vk.ecomm.design.view.tile.b.a(aVar);
            }
        }
        marketProductTileView.X4(new MarketProductTileConfig.e(good.d, z4, productStatus, 16));
        Price price = good2.h;
        marketProductTileView.Y4(new MarketProductTileConfig.h(price.e, price.f, price.i, productStatus, good.g0, 64));
        if (!z3) {
            Iterable<GoodBadge> iterable = good2.O;
            if (iterable == null) {
                iterable = EmptyList.b;
            }
            ArrayList arrayList = new ArrayList();
            for (GoodBadge goodBadge : iterable) {
                GoodBadge.BadgeType badgeType = goodBadge.c;
                int i2 = badgeType == null ? -1 : a.$EnumSwitchMapping$0[badgeType.ordinal()];
                if (i2 == 1) {
                    cVar = new wid0.c(null);
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        cVar = new wid0.a(new wid0.a.InterfaceC3933a.C3934a(goodBadge.b));
                    }
                    cVar = null;
                } else {
                    List<BaseImageDto> list = goodBadge.h;
                    if (list != null) {
                        Serializer.c<GoodBadge> cVar2 = GoodBadge.CREATOR;
                        elyVar = new ely(GoodBadge.a.c(list), GoodBadge.a.a(list), GoodBadge.a.d(list), GoodBadge.a.b(list));
                    } else {
                        elyVar = null;
                    }
                    ?? dVar = new wid0.d(elyVar);
                    if (((Boolean) this.n.getValue()).booleanValue()) {
                        cVar = dVar;
                    }
                    cVar = null;
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
            }
            marketProductTileView.V4(arrayList);
        }
        marketProductTileView.T4(new MarketProductTileConfig.b(good.J, true));
        long j = good.b;
        long j2 = good.c.b;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.FEED_PORTLET_GOODS;
        r41 r41Var = ((n5u) this.m.c).i;
        mt00.d(Long.valueOf(j), Long.valueOf(j2), r41Var != null ? r41Var.b(k7uVar) : null, commonMarketStat$TypeRefSource, null, null, null, null, null, null, null, null, null, null, 32752);
    }
}
