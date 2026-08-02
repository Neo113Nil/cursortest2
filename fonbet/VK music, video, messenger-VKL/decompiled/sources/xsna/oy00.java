package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.ActionSendMarketMessage;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.presentation.model.items.attachments.CtaButtonClickType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.wid0;

/* compiled from: MarketFaveTransformer.kt */
/* loaded from: classes4.dex */
public final class oy00 implements gn60<Pair<? extends FaveMarketItem, ? extends NewsEntry>, wm60> {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new x5(23));
    public final my00 c = new my00();

    /* compiled from: MarketFaveTransformer.kt */
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

    /* JADX WARN: Code restructure failed: missing block: B:99:0x00a5, code lost:
    
        if (r35.y != 0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MarketProductTileConfig a(Good good, MarketProductTileConfig.a aVar, boolean z, boolean z2) {
        EmptyList emptyList;
        VerifyInfo verifyInfo;
        ArrayList arrayList;
        wid0 cVar;
        ely elyVar;
        boolean z3 = good.g0;
        boolean z4 = good.g0;
        MarketRejectInfo marketRejectInfo = good.e0;
        String str = good.d;
        Image image = good.n;
        boolean z5 = good.i0;
        Image image2 = (!z3 && z5) ? null : image;
        int i = R.drawable.vk_icon_gallery_outline_56;
        if (!z3 && z5) {
            i = R.drawable.vk_icon_block_outline_56;
        }
        if (!z3) {
            if (z5) {
                str = y8g0.e(R.string.product_tile_unavailable);
            } else if (z) {
                str = y8g0.e(R.string.product_tile_specify_age);
            }
        }
        String str2 = str;
        int i2 = 1;
        MarketProductTileConfig.ProductStatus productStatus = z5 ? MarketProductTileConfig.ProductStatus.HardBlock : marketRejectInfo != null ? MarketProductTileConfig.ProductStatus.SoftBlock : !good.Bb() ? MarketProductTileConfig.ProductStatus.OutOfStock : (marketRejectInfo == null || !marketRejectInfo.g) ? MarketProductTileConfig.ProductStatus.Normal : MarketProductTileConfig.ProductStatus.Moderation;
        Integer valueOf = Integer.valueOf(R.string.product_tile_status_badge_not_in_stock);
        if (!z4) {
            if (!z5) {
                if (z) {
                    valueOf = Integer.valueOf(R.string.product_tile_status_badge_for_adults);
                } else if (good.Bb()) {
                }
            }
            valueOf = null;
        } else if (good.y != 0) {
            if (marketRejectInfo != null && marketRejectInfo.g) {
                valueOf = Integer.valueOf(R.string.product_tile_status_badge_moderation);
            } else if (z5) {
                valueOf = Integer.valueOf(R.string.product_tile_status_badge_blocked);
            } else {
                if (!good.Bb()) {
                    valueOf = Integer.valueOf(R.string.product_tile_status_badge_inactive);
                }
                valueOf = null;
            }
        }
        String e = valueOf != null ? y8g0.e(valueOf.intValue()) : null;
        if (z5) {
            emptyList = EmptyList.b;
        } else {
            List<GoodBadge> list = good.O;
            if (list != null) {
                arrayList = new ArrayList();
                for (GoodBadge goodBadge : list) {
                    GoodBadge.BadgeType badgeType = goodBadge.c;
                    int i3 = badgeType == null ? -1 : a.$EnumSwitchMapping$0[badgeType.ordinal()];
                    if (i3 == i2) {
                        cVar = new wid0.c(null);
                    } else if (i3 != 2) {
                        cVar = i3 != 3 ? null : new wid0.a(new wid0.a.InterfaceC3933a.C3934a(goodBadge.b));
                    } else {
                        List<BaseImageDto> list2 = goodBadge.h;
                        if (list2 != null) {
                            Serializer.c<GoodBadge> cVar2 = GoodBadge.CREATOR;
                            elyVar = new ely(GoodBadge.a.c(list2), GoodBadge.a.a(list2), GoodBadge.a.d(list2), GoodBadge.a.b(list2));
                        } else {
                            elyVar = null;
                        }
                        wid0 dVar = new wid0.d(elyVar);
                        if (((Boolean) this.b.getValue()).booleanValue()) {
                            cVar = dVar;
                        }
                    }
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                    i2 = 1;
                }
            } else {
                arrayList = 0;
            }
            emptyList = arrayList;
        }
        EmptyList emptyList2 = emptyList;
        MarketProductTileConfig.d dVar2 = new MarketProductTileConfig.d(image2, str2, Integer.valueOf(i), z2, z, true);
        boolean z6 = false;
        MarketProductTileConfig.k kVar = new MarketProductTileConfig.k(e, e != null);
        if (emptyList2 == null) {
            emptyList2 = EmptyList.b;
        }
        EmptyList emptyList3 = emptyList2;
        Price price = good.h;
        MarketProductTileConfig.h hVar = new MarketProductTileConfig.h(price.e, price.f, price.i, productStatus, good.g0, 64);
        MarketProductTileConfig.e eVar = new MarketProductTileConfig.e(str2, z4, productStatus, 16);
        Owner owner = good.M;
        String str3 = owner != null ? owner.c : null;
        boolean z7 = (owner == null || (verifyInfo = owner.f) == null || !verifyInfo.b) ? false : true;
        if ((owner != null ? owner.c : null) != null && !z5) {
            z6 = true;
        }
        return new MarketProductTileConfig(dVar2, (MarketProductTileConfig.g) null, hVar, eVar, new MarketProductTileConfig.f(str3, z7, z6, 8), new MarketProductTileConfig.b(good.J, true), (MarketProductTileConfig.c) null, (MarketProductTileConfig.j) null, kVar, emptyList3, aVar, (com.vk.catalog2.common.ui.holders.b) null, (com.vk.voip.a) null, (wx0) null, 61890);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    public final List<ol60> b(int i, Pair<FaveMarketItem, ? extends NewsEntry> pair, wm60 wm60Var) {
        fkk a2;
        MarketRejectInfo marketRejectInfo;
        LinkButton linkButton;
        FaveMarketItem i2 = pair.i();
        Good good = i2.b;
        boolean z = good.g0;
        boolean z2 = good.i0;
        int i3 = good.y;
        boolean z3 = !z && (!good.Bb() || i3 == 0);
        CallProducerButton callProducerButton = i2.c;
        String str = good.l0;
        my00 my00Var = this.c;
        if (i3 == 0) {
            my00Var.getClass();
            a2 = my00.a();
        } else if (z2 || ((marketRejectInfo = good.e0) != null && marketRejectInfo.g)) {
            my00Var.getClass();
            a2 = my00.a();
        } else if (!good.Bb()) {
            my00Var.getClass();
            a2 = my00.a();
        } else if (good.V) {
            List<LinkButton> list = good.W;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((LinkButton) obj).c instanceof ActionSendMarketMessage) {
                        arrayList.add(obj);
                    }
                }
                linkButton = (LinkButton) j5g.b0(0, arrayList);
            } else {
                linkButton = null;
            }
            if (linkButton != null) {
                my00Var.getClass();
                a2 = new fkk(CtaButtonClickType.WRITE_OWNER, new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Accent, y8g0.e(R.string.fave_market_button_write), null, true, null, 32));
            } else {
                my00Var.getClass();
                a2 = my00.a();
            }
        } else if (str == null || !str.equals("pro")) {
            if (str == null || !str.equals("base")) {
                my00Var.getClass();
                a2 = my00.a();
            } else {
                Integer valueOf = callProducerButton != null ? Integer.valueOf(callProducerButton.b) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    my00Var.getClass();
                    a2 = new fkk(CtaButtonClickType.WRITE_OWNER, new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Accent, y8g0.e(R.string.fave_market_button_write), null, true, null, 32));
                } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 6)) {
                    if (callProducerButton.k != null) {
                        my00Var.getClass();
                        a2 = new fkk(CtaButtonClickType.OPEN_LINK, new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Accent, callProducerButton.c, Integer.valueOf(R.drawable.vk_icon_link_16), true, null, 32));
                    } else {
                        my00Var.getClass();
                        a2 = my00.a();
                    }
                } else if (valueOf == null || valueOf.intValue() != 2) {
                    my00Var.getClass();
                    a2 = my00.a();
                } else if (callProducerButton.d != null) {
                    my00Var.getClass();
                    a2 = new fkk(CtaButtonClickType.CALL, new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Accent, y8g0.e(R.string.fave_market_button_call), null, true, null, 32));
                } else {
                    my00Var.getClass();
                    a2 = my00.a();
                }
            }
        } else if (b210.a(good, ((Boolean) this.b.getValue()).booleanValue())) {
            my00Var.getClass();
            a2 = my00.a();
        } else if (good.x > 0) {
            my00Var.getClass();
            a2 = new fkk(CtaButtonClickType.OPEN_CART, new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Positive, y8g0.e(R.string.fave_market_button_to_cart), null, true, null, 32));
        } else {
            my00Var.getClass();
            a2 = new fkk(CtaButtonClickType.ADD_TO_CART, new MarketProductTileConfig.a(VkButton.Mode.Primary, VkButton.Appearance.Accent, y8g0.e(R.string.fave_market_button_add_to_cart), null, true, null, 32));
        }
        MarketProductTileConfig.a aVar = a2.b;
        return Collections.singletonList(new py00(a(good, aVar, false, z3), new r530(a(good, aVar, !good.g0, z3), e530.b(good, null)), a2.a, !z3 || z2));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return b(0, pair, bp5Var);
    }
}
