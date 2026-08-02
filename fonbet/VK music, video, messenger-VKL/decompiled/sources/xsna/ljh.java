package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.MarketItemRating;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.design.view.tile.MarketProductTileView;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.s9h;
import xsna.wid0;

/* compiled from: CommunityProfileContentMarketAdapter.kt */
/* loaded from: classes5.dex */
public final class ljh extends wx3 implements g530 {
    public static final /* synthetic */ int s = 0;
    public final q530 j;
    public final FunctionReferenceImpl k;
    public final FunctionReferenceImpl l;
    public final FunctionReferenceImpl m;
    public final boolean n;
    public final gzs<Boolean> o;
    public final pjh p;
    public final ojh q;
    public final njh r;

    /* compiled from: CommunityProfileContentMarketAdapter.kt */
    public static final class a extends m.e<hfz> {
        @Override // androidx.recyclerview.widget.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
            f5u f5uVar = (f5u) hfzVar;
            f5u f5uVar2 = (f5u) hfzVar2;
            return f5uVar.getItemId().longValue() == f5uVar2.getItemId().longValue() && epx.f(f5uVar.b.c, f5uVar2.b.c);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
            f5u f5uVar = (f5u) hfzVar;
            Good good = f5uVar.b;
            f5u f5uVar2 = (f5u) hfzVar2;
            Good good2 = f5uVar2.b;
            if (!areItemsTheSame(f5uVar, f5uVar2)) {
                return false;
            }
            boolean z = good.J;
            MarketItemRating marketItemRating = good.t;
            boolean z2 = good2.J;
            MarketItemRating marketItemRating2 = good2.t;
            if (z != z2 || !epx.f(good.n, good2.n)) {
                return false;
            }
            if (!epx.e(marketItemRating != null ? marketItemRating.b : null, marketItemRating2 != null ? marketItemRating2.b : null) || !epx.f(good.d, good2.d)) {
                return false;
            }
            if (!epx.f(marketItemRating != null ? marketItemRating.c : null, marketItemRating2 != null ? marketItemRating2.c : null) || !epx.f(good.h, good2.h)) {
                return false;
            }
            List<CallProducerButton> list = good.n0;
            CallProducerButton callProducerButton = list != null ? (CallProducerButton) j5g.a0(list) : null;
            List<CallProducerButton> list2 = good2.n0;
            return epx.f(callProducerButton, list2 != null ? (CallProducerButton) j5g.a0(list2) : null);
        }
    }

    /* compiled from: CommunityProfileContentMarketAdapter.kt */
    public static final class b extends vfz<f5u> {
        public final q530 l;
        public final izs<Good, s3q0> m;
        public final wzs<f5u, Integer, s3q0> n;
        public final wzs<f5u, Integer, s3q0> o;
        public final boolean p;
        public f5u q;
        public final MarketProductTileView r;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ViewGroup viewGroup, q530 q530Var, izs<? super Good, s3q0> izsVar, wzs<? super f5u, ? super Integer, s3q0> wzsVar, wzs<? super f5u, ? super Integer, s3q0> wzsVar2, boolean z) {
            super(new MarketProductTileView(viewGroup.getContext(), null));
            this.l = q530Var;
            this.m = izsVar;
            this.n = wzsVar;
            this.o = wzsVar2;
            this.p = z;
            this.r = (MarketProductTileView) this.itemView;
        }

        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        public final void W5(f5u f5uVar) {
            c530 c530Var;
            Integer valueOf;
            List list;
            wid0 cVar;
            ely elyVar;
            boolean z;
            MarketProductTileConfig.a aVar;
            CallProducerButton callProducerButton;
            MarketProductTileConfig.a aVar2;
            Float f;
            f5u f5uVar2 = f5uVar;
            this.q = f5uVar2;
            Good good = f5uVar2.b;
            c530 b = e530.b(good, null);
            ModerationRestriction a = this.l.a(b);
            Object obj = s9h.a;
            Context context = this.itemView.getContext();
            boolean h = a.h();
            MarketProductTileConfig.DisplayCtaButtonType displayCtaButtonType = MarketProductTileConfig.DisplayCtaButtonType.BOTTOM;
            MarketRejectInfo marketRejectInfo = good.e0;
            boolean z2 = good.i0;
            MarketItemRating marketItemRating = good.t;
            String str = good.d;
            Image image = good.n;
            boolean z3 = good.g0;
            if (!z3 && h) {
                str = context.getString(R.string.product_tile_specify_age);
            }
            boolean z4 = ((marketItemRating == null || (f = marketItemRating.b) == null) ? 0.0f : f.floatValue()) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.p;
            if (z3) {
                c530Var = b;
                if (marketRejectInfo != null && marketRejectInfo.g) {
                    valueOf = Integer.valueOf(R.string.product_tile_status_badge_moderation);
                } else if (z2) {
                    valueOf = Integer.valueOf(R.string.product_tile_status_badge_blocked);
                } else {
                    if (!good.Bb()) {
                        valueOf = Integer.valueOf(R.string.product_tile_status_badge_inactive);
                    }
                    valueOf = null;
                }
            } else {
                c530Var = b;
                if (!z2) {
                    if (h) {
                        valueOf = Integer.valueOf(R.string.product_tile_status_badge_for_adults);
                    } else if (!good.Bb()) {
                        valueOf = Integer.valueOf(R.string.product_tile_status_badge_not_in_stock);
                    }
                }
                valueOf = null;
            }
            String string = valueOf != null ? context.getString(valueOf.intValue()) : null;
            Integer valueOf2 = marketRejectInfo != null ? Integer.valueOf(marketRejectInfo.f) : null;
            MarketProductTileConfig.ProductStatus productStatus = (valueOf2 != null && valueOf2.intValue() == 2) ? MarketProductTileConfig.ProductStatus.SoftBlock : MarketProductTileConfig.ProductStatus.Normal;
            boolean z5 = z4;
            int i = 1;
            MarketProductTileConfig.d dVar = new MarketProductTileConfig.d(image, str, Integer.valueOf(R.drawable.vk_icon_gallery_outline_56), !good.Bb(), h, true);
            Price price = good.h;
            MarketProductTileConfig.h hVar = new MarketProductTileConfig.h(price.e, price.f, price.i, null, false, 88);
            MarketProductTileConfig.e eVar = new MarketProductTileConfig.e(str, z3, productStatus, 16);
            Owner owner = good.M;
            MarketProductTileConfig.f fVar = new MarketProductTileConfig.f(owner != null ? owner.c : null, false, ((owner != null ? owner.c : null) == null || z5) ? false : true, 8);
            MarketProductTileConfig.j jVar = new MarketProductTileConfig.j(marketItemRating != null ? marketItemRating.b : null, marketItemRating != null ? marketItemRating.d : null, z5, 8);
            MarketProductTileConfig.b bVar = new MarketProductTileConfig.b(good.J, !h);
            List<GoodBadge> list2 = z2 ? null : good.O;
            if (list2 == null) {
                list = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList();
                for (GoodBadge goodBadge : list2) {
                    GoodBadge.BadgeType badgeType = goodBadge.c;
                    int i2 = badgeType == null ? -1 : s9h.a.$EnumSwitchMapping$0[badgeType.ordinal()];
                    if (i2 == i) {
                        cVar = new wid0.c(null);
                    } else if (i2 == 2) {
                        List<BaseImageDto> list3 = goodBadge.h;
                        if (list3 != null) {
                            Serializer.c<GoodBadge> cVar2 = GoodBadge.CREATOR;
                            elyVar = new ely(GoodBadge.a.c(list3), GoodBadge.a.a(list3), GoodBadge.a.d(list3), GoodBadge.a.b(list3));
                        } else {
                            elyVar = null;
                        }
                        cVar = ((Boolean) s9h.a.getValue()).booleanValue() ? new wid0.d(elyVar) : null;
                    } else if (i2 != 3) {
                        cVar = null;
                    } else {
                        cVar = new wid0.a(new wid0.a.InterfaceC3933a.C3934a(goodBadge.b));
                    }
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                    i = 1;
                }
                list = arrayList;
            }
            Integer valueOf3 = Integer.valueOf(R.drawable.vk_icon_link_16);
            List<CallProducerButton> list4 = good.n0;
            if (list4 == null || (callProducerButton = (CallProducerButton) j5g.a0(list4)) == null) {
                z = true;
                aVar = null;
            } else {
                UserId userId = callProducerButton.i;
                Boolean bool = callProducerButton.f;
                int i3 = callProducerButton.b;
                int i4 = s9h.a.$EnumSwitchMapping$1[displayCtaButtonType.ordinal()];
                if (i4 == 1) {
                    MarketProductTileConfig.a aVar3 = new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Accent, callProducerButton.c, null, true, MarketProductTileConfig.DisplayCtaButtonType.BOTTOM, 8);
                    switch (i3) {
                        case 0:
                            z = true;
                            aVar = MarketProductTileConfig.a.a(aVar3, null, null, null, null, !(userId != null && userId.b == 0), 47);
                            break;
                        case 1:
                            aVar = MarketProductTileConfig.a.a(aVar3, null, null, null, valueOf3, false, 55);
                            z = true;
                            break;
                        case 2:
                            aVar = MarketProductTileConfig.a.a(aVar3, null, null, null, null, bool != null ? bool.booleanValue() : false, 47);
                            z = true;
                            break;
                        case 3:
                            aVar = MarketProductTileConfig.a.a(aVar3, null, VkButton.Appearance.Positive, y8g0.e(R.string.fave_market_button_to_cart), null, false, 57);
                            z = true;
                            break;
                        case 4:
                            aVar = MarketProductTileConfig.a.a(aVar3, null, null, y8g0.e(R.string.fave_market_button_add_to_cart), null, false, 59);
                            z = true;
                            break;
                        case 5:
                            aVar = MarketProductTileConfig.a.a(aVar3, VkButton.Mode.Outline, null, null, null, false, 62);
                            z = true;
                            break;
                        case 6:
                            aVar = aVar3;
                            z = true;
                            break;
                        default:
                            aVar2 = new MarketProductTileConfig.a(null, null, null, null, false, null, 63);
                            aVar = aVar2;
                            z = true;
                            break;
                    }
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MarketProductTileConfig.a aVar4 = new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Overlay, null, null, true, MarketProductTileConfig.DisplayCtaButtonType.ABOVE_IMAGE, 12);
                    switch (i3) {
                        case 0:
                            aVar = MarketProductTileConfig.a.a(aVar4, null, null, null, Integer.valueOf(R.drawable.vk_icon_message_outline_16), !(userId != null && userId.b == 0), 39);
                            break;
                        case 1:
                        case 6:
                            aVar = MarketProductTileConfig.a.a(aVar4, null, null, null, valueOf3, false, 55);
                            break;
                        case 2:
                            aVar = MarketProductTileConfig.a.a(aVar4, null, null, null, Integer.valueOf(R.drawable.vk_icon_phone_outline_16), bool != null ? bool.booleanValue() : false, 39);
                            break;
                        case 3:
                            aVar = MarketProductTileConfig.a.a(aVar4, null, VkButton.Appearance.Neutral, null, Integer.valueOf(R.drawable.vk_icon_done_16), false, 53);
                            break;
                        case 4:
                            aVar = MarketProductTileConfig.a.a(aVar4, null, null, null, Integer.valueOf(R.drawable.vk_icon_shopping_cart_add_outline_16), false, 55);
                            break;
                        case 5:
                            aVar = MarketProductTileConfig.a.a(aVar4, null, null, null, Integer.valueOf(R.drawable.vk_icon_search_outline_16), false, 55);
                            break;
                        default:
                            aVar2 = new MarketProductTileConfig.a(null, null, null, null, false, null, 63);
                            aVar = aVar2;
                            break;
                    }
                    z = true;
                }
            }
            MarketProductTileConfig marketProductTileConfig = new MarketProductTileConfig(dVar, (MarketProductTileConfig.g) null, hVar, eVar, fVar, bVar, (MarketProductTileConfig.c) null, jVar, new MarketProductTileConfig.k(string, string != null ? z : false), list, aVar == null ? new MarketProductTileConfig.a(null, null, null, null, false, null, 63) : aVar, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 61762);
            MarketProductTileView marketProductTileView = this.r;
            marketProductTileView.P4(marketProductTileConfig);
            marketProductTileView.Z4(new mjh(this, c530Var, a, f5uVar2, 0));
            marketProductTileView.U4(new uh3(9, this, f5uVar2));
            marketProductTileView.Q4(new vq6(6, this, f5uVar2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ljh(q530 q530Var, izs izsVar, wzs wzsVar, wzs wzsVar2, nih nihVar, int i) {
        super(new a());
        boolean z = (i & 16) == 0;
        gzs pd4Var = (i & 32) != 0 ? new pd4(8) : nihVar;
        this.j = q530Var;
        this.k = (FunctionReferenceImpl) izsVar;
        this.l = (FunctionReferenceImpl) wzsVar;
        this.m = (FunctionReferenceImpl) wzsVar2;
        this.n = z;
        this.o = pd4Var;
        q530Var.d(this);
        x0(f5u.class, new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 28));
        this.p = new pjh(this);
        this.q = new ojh(this);
        this.r = new njh(this);
    }

    public static final int K0(ljh ljhVar, int i) {
        return ljhVar.o.invoke().booleanValue() ? i - 1 : i;
    }

    @Override // xsna.g530
    public final void H2() {
        int i = 0;
        for (Object obj : this.h.f) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            hfz hfzVar = (hfz) obj;
            if ((hfzVar instanceof f5u) && ((f5u) hfzVar).b.h0) {
                notifyItemChanged(i);
            }
            i = i2;
        }
    }

    @Override // xsna.g530
    public final void g3() {
    }
}
