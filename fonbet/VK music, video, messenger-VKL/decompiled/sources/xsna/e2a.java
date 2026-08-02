package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.api.generated.catalog.dto.CatalogBlockItemsDto;
import com.vk.api.generated.channels.dto.ChannelsChannelDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.stickers.dto.StickersAuthorSubscriptionDto;
import com.vk.api.generated.stickers.dto.StickersBonusBalanceDto;
import com.vk.api.generated.stickers.dto.StickersCatalogBannerDto;
import com.vk.api.generated.stickers.dto.StickersCatalogInfoDto;
import com.vk.api.generated.stickers.dto.StickersImageSetDto;
import com.vk.api.generated.stickers.dto.StickersOrderPriceDto;
import com.vk.api.generated.stickers.dto.StickersPackBadgeDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewDto;
import com.vk.api.generated.stickers.dto.StickersWishlistsStatusDto;
import com.vk.api.generated.store.dto.StoreAdditionalViewPriceDto;
import com.vk.api.generated.store.dto.StoreProductIconDto;
import com.vk.api.generated.store.dto.StoreStockItemBadgeDto;
import com.vk.api.generated.store.dto.StoreStockItemDto;
import com.vk.api.generated.store.dto.StoreStockItemPurchaseDetailsDto;
import com.vk.api.generated.vmoji.dto.VmojiAvatarDto;
import com.vk.api.generated.vmoji.dto.VmojiConstructorNewItemsDto;
import com.vk.api.generated.vmoji.dto.VmojiConstructorOpenParamsDto;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.stickers.Badge;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.PurchaseDetailsButton;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.dto.stickers.StickersInfo;
import com.vk.dto.stickers.VmojiAvatar;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.stickers.views.sticker.StickerPackBadge;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPrice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.abl0;

/* compiled from: CatalogBlockResponseMapper.kt */
/* loaded from: classes16.dex */
public final class e2a {
    public final z1a a = new z1a();
    public final j5a b = new j5a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v56, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v57, types: [java.util.ArrayList] */
    public final hda a(CatalogBlockItemsDto catalogBlockItemsDto) {
        StickersBonusBalance stickersBonusBalance;
        Iterator it;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        StickerPackBadge stickerPackBadge;
        StickerPackPrice stickerPackPrice;
        StickerStockItemPreviewImage stickerStockItemPreviewImage;
        ArrayList arrayList2;
        StickerPackBadge stickerPackBadge2;
        int i;
        ?? r9;
        NotificationImage notificationImage;
        StickerStockItemPreviewImage stickerStockItemPreviewImage2;
        Badge badge;
        PurchaseDetails purchaseDetails;
        VmojiAvatar vmojiAvatar;
        BaseLinkButtonActionDto e;
        j5a j5aVar = this.b;
        qw0 qw0Var = j5aVar.d;
        Map<Integer, StoreStockItemDto> O2 = catalogBlockItemsDto.O2();
        if (O2 == null) {
            O2 = jgp.b;
        }
        Set<Map.Entry<Integer, StoreStockItemDto>> entrySet = O2.entrySet();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String valueOf = String.valueOf(((Number) entry.getKey()).intValue());
            ejl0 ejl0Var = (ejl0) j5aVar.e.getValue();
            StoreStockItemDto storeStockItemDto = (StoreStockItemDto) entry.getValue();
            ejl0Var.getClass();
            int id = storeStockItemDto.y0().getId();
            String i2 = storeStockItemDto.y0().B().i();
            String title = storeStockItemDto.y0().getTitle();
            String str = title == null ? "" : title;
            String e2 = storeStockItemDto.e();
            String str2 = e2 == null ? "" : e2;
            String description = storeStockItemDto.getDescription();
            String str3 = description == null ? "" : description;
            List<BaseStickerDto> o = storeStockItemDto.y0().o();
            if (o != null) {
                List<BaseStickerDto> list = o;
                r9 = new ArrayList(c5g.u(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    r9.add(bo6.a((BaseStickerDto) it3.next()));
                }
            } else {
                r9 = 0;
            }
            if (r9 == 0) {
                r9 = EmptyList.b;
            }
            List list2 = r9;
            BaseBoolIntDto n = storeStockItemDto.y0().n();
            boolean z = n != null && n.i() == BaseBoolIntDto.YES.i();
            BaseBoolIntDto i3 = storeStockItemDto.i();
            boolean z2 = i3 != null && i3.i() == BaseBoolIntDto.YES.i();
            BaseBoolIntDto j = storeStockItemDto.j();
            boolean z3 = j != null && j.i() == BaseBoolIntDto.YES.i();
            BaseBoolIntDto d = storeStockItemDto.y0().d();
            boolean z4 = d != null && d.i() == BaseBoolIntDto.YES.i();
            BaseBoolIntDto k = storeStockItemDto.y0().k();
            boolean z5 = k != null && k.i() == BaseBoolIntDto.YES.i();
            BaseBoolIntDto l = storeStockItemDto.l();
            boolean z6 = l != null && l.i() == BaseBoolIntDto.YES.i();
            Integer W = storeStockItemDto.W();
            int intValue = W != null ? W.intValue() : 0;
            String a0 = storeStockItemDto.a0();
            if (a0 == null) {
                a0 = "";
            }
            Price.PriceInfo priceInfo = new Price.PriceInfo(intValue, a0);
            Integer u = storeStockItemDto.u();
            int intValue2 = u != null ? u.intValue() : 0;
            String B = storeStockItemDto.B();
            Price.PriceInfo priceInfo2 = new Price.PriceInfo(intValue2, B == null ? "" : B);
            Integer l0 = storeStockItemDto.l0();
            int intValue3 = l0 != null ? l0.intValue() : 0;
            String w0 = storeStockItemDto.w0();
            Price.PriceInfo priceInfo3 = new Price.PriceInfo(intValue3, w0 == null ? "" : w0);
            Integer C = storeStockItemDto.C();
            int intValue4 = C != null ? C.intValue() : 0;
            String D = storeStockItemDto.D();
            Price.PriceInfo priceInfo4 = new Price.PriceInfo(intValue4, D == null ? "" : D);
            String Z = storeStockItemDto.Z();
            String str4 = Z == null ? "" : Z;
            String v0 = storeStockItemDto.v0();
            String str5 = v0 == null ? "" : v0;
            StoreAdditionalViewPriceDto d2 = storeStockItemDto.d();
            String d3 = d2 != null ? d2.d() : null;
            Price price = new Price(priceInfo, priceInfo2, priceInfo3, priceInfo4, str4, str5, d3 == null ? "" : d3);
            String n2 = storeStockItemDto.n();
            String str6 = n2 == null ? "" : n2;
            StoreStockItemDto.PaymentTypeDto F = storeStockItemDto.F();
            String i4 = F != null ? F.i() : null;
            String str7 = i4 == null ? "" : i4;
            String M = storeStockItemDto.M();
            String str8 = M == null ? "" : M;
            String T = storeStockItemDto.T();
            String str9 = T == null ? "" : T;
            String G = storeStockItemDto.G();
            String str10 = G == null ? "" : G;
            String K = storeStockItemDto.K();
            String str11 = K == null ? "" : K;
            String R = storeStockItemDto.R();
            String str12 = R == null ? "" : R;
            List<BaseImageDto> j2 = storeStockItemDto.y0().j();
            if (j2 != null) {
                List<BaseImageDto> list3 = j2;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                for (BaseImageDto baseImageDto : list3) {
                    arrayList3.add(new NotificationImage.ImageInfo(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl()));
                }
                notificationImage = new NotificationImage(arrayList3);
            } else {
                notificationImage = null;
            }
            String o2 = storeStockItemDto.o();
            if (o2 == null) {
                o2 = "";
            }
            long intValue5 = storeStockItemDto.y0().l() != null ? r10.intValue() : 0L;
            boolean f = epx.f(storeStockItemDto.y0().g(), Boolean.TRUE);
            BaseBoolIntDto g = storeStockItemDto.g();
            boolean z7 = g != null && g.i() == BaseBoolIntDto.YES.i();
            String p = storeStockItemDto.p();
            String str13 = p == null ? "" : p;
            StoreProductIconDto i5 = storeStockItemDto.y0().i();
            if (i5 != null) {
                String d4 = i5.d();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                List<BaseImageDto> e3 = i5.e();
                if (e3 != null) {
                    for (BaseImageDto baseImageDto2 : e3) {
                        String id2 = baseImageDto2.getId();
                        if (epx.f(id2, "square")) {
                            arrayList4.add(new ImageSize(baseImageDto2.getUrl(), baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.e(), (char) 0, false, 48, null));
                        } else if (epx.f(id2, "wide")) {
                            arrayList5.add(new ImageSize(baseImageDto2.getUrl(), baseImageDto2.getWidth(), baseImageDto2.getHeight(), baseImageDto2.e(), (char) 0, false, 48, null));
                        }
                    }
                }
                stickerStockItemPreviewImage2 = new StickerStockItemPreviewImage(d4, new Image(arrayList4), new Image(arrayList5));
            } else {
                stickerStockItemPreviewImage2 = null;
            }
            String url = storeStockItemDto.y0().getUrl();
            String str14 = url == null ? "" : url;
            StoreStockItemBadgeDto f2 = storeStockItemDto.f();
            if (f2 != null) {
                String i6 = f2.f().i();
                Badge.BadgeSubtype.a aVar = Badge.BadgeSubtype.Companion;
                StoreStockItemBadgeDto.SubtypeDto d5 = f2.d();
                String i7 = d5 != null ? d5.i() : null;
                aVar.getClass();
                badge = new Badge(i6, Badge.BadgeSubtype.a.a(i7), f2.e());
            } else {
                badge = null;
            }
            StoreStockItemPurchaseDetailsDto D0 = storeStockItemDto.D0();
            if (D0 != null) {
                String e4 = D0.e();
                String title2 = D0.getTitle();
                String f3 = D0.f();
                BaseLinkButtonDto d6 = D0.d();
                String title3 = d6 != null ? d6.getTitle() : null;
                BaseLinkButtonDto d7 = D0.d();
                purchaseDetails = new PurchaseDetails(e4, title2, f3, new PurchaseDetailsButton(title3, (d7 == null || (e = d7.e()) == null) ? null : xf6.a(e)));
            } else {
                purchaseDetails = null;
            }
            BaseBoolIntDto K0 = storeStockItemDto.K0();
            boolean z8 = K0 != null && K0.i() == BaseBoolIntDto.YES.i();
            VmojiAvatarDto C2 = storeStockItemDto.y0().C();
            if (C2 != null) {
                String id3 = C2.getId();
                String d8 = C2.d();
                String f4 = C2.f();
                boolean f5 = epx.f(C2.g(), Boolean.TRUE);
                VmojiConstructorNewItemsDto e5 = C2.e();
                VmojiConstructorOpenParamsDto f6 = e5 != null ? e5.f() : null;
                vmojiAvatar = new VmojiAvatar(id3, d8, f4, f5, new VmojiConstructorOpenParamsModel(f6 != null ? f6.f() : null, f6 != null ? f6.d() : null, f6 != null ? f6.e() : null));
            } else {
                vmojiAvatar = null;
            }
            String H0 = storeStockItemDto.H0();
            String str15 = H0 == null ? "" : H0;
            List<Integer> p2 = storeStockItemDto.y0().p();
            if (p2 == null) {
                p2 = EmptyList.b;
            }
            List<Integer> list4 = p2;
            List<Integer> u2 = storeStockItemDto.y0().u();
            Integer e6 = storeStockItemDto.y0().e();
            Boolean D2 = storeStockItemDto.y0().D();
            Boolean bool = Boolean.TRUE;
            boolean f7 = epx.f(D2, bool);
            String f8 = storeStockItemDto.y0().f();
            String str16 = f8 == null ? "" : f8;
            String r = storeStockItemDto.r();
            String str17 = r == null ? "" : r;
            boolean f9 = epx.f(storeStockItemDto.y0().G(), bool);
            StickersWishlistsStatusDto N0 = storeStockItemDto.N0();
            Boolean d9 = N0 != null ? N0.d() : null;
            StickersAuthorSubscriptionDto F0 = storeStockItemDto.F0();
            Pair pair = new Pair(valueOf, new StickerStockItem(id, i2, str, str2, str3, list2, z, z2, z3, z4, z5, z6, price, str6, str7, str8, str9, str10, str11, str12, notificationImage, o2, intValue5, f, 0, z7, str13, stickerStockItemPreviewImage2, str14, badge, purchaseDetails, z8, vmojiAvatar, str15, list4, u2, e6, f7, str16, null, str17, f9, d9, F0 != null ? Boolean.valueOf(F0.U()) : null, Boolean.valueOf(epx.f(storeStockItemDto.y0().F(), bool))));
            linkedHashMap5.put(pair.i(), pair.j());
        }
        LinkedHashMap z9 = j5a.z(catalogBlockItemsDto.i2());
        LinkedHashMap F2 = j5a.F(catalogBlockItemsDto.K());
        LinkedHashMap v = j5a.v(catalogBlockItemsDto.U1(), catalogBlockItemsDto.G());
        HashMap h = j5a.h(catalogBlockItemsDto.B(), catalogBlockItemsDto.V1(), catalogBlockItemsDto.I2());
        LinkedHashMap r2 = j5a.r(catalogBlockItemsDto.V0());
        LinkedHashMap w = j5a.w(catalogBlockItemsDto.d0());
        LinkedHashMap p3 = j5a.p(catalogBlockItemsDto.N0());
        List<MarketMarketItemDto> x1 = catalogBlockItemsDto.x1();
        qw0Var.getClass();
        LinkedHashMap f10 = qw0.f(x1);
        LinkedHashMap n3 = j5a.n(catalogBlockItemsDto.K0());
        LinkedHashMap d10 = qw0.d(catalogBlockItemsDto.F0());
        LinkedHashMap B2 = j5a.B(catalogBlockItemsDto.q2());
        LinkedHashMap e7 = j5a.e(catalogBlockItemsDto.n());
        LinkedHashMap f11 = j5a.f(catalogBlockItemsDto.o());
        LinkedHashMap t = j5aVar.t(catalogBlockItemsDto.L1());
        LinkedHashMap a = j5a.a(catalogBlockItemsDto.i());
        LinkedHashMap j3 = j5a.j(catalogBlockItemsDto.l0());
        LinkedHashMap q = j5aVar.q(catalogBlockItemsDto.U0());
        LinkedHashMap l2 = j5a.l(catalogBlockItemsDto.y0());
        LinkedHashMap x = j5a.x(catalogBlockItemsDto.W1());
        LinkedHashMap D3 = j5a.D(catalogBlockItemsDto.p());
        LinkedHashMap y = j5a.y(catalogBlockItemsDto.X1());
        LinkedHashMap k2 = j5a.k(catalogBlockItemsDto.v0());
        LinkedHashMap A = j5a.A(catalogBlockItemsDto.m2());
        LinkedHashMap b = j5a.b(catalogBlockItemsDto.j());
        LinkedHashMap g2 = j5a.g(catalogBlockItemsDto.u());
        LinkedHashMap d11 = j5a.d(catalogBlockItemsDto.l());
        LinkedHashMap m = j5a.m(catalogBlockItemsDto.D0());
        LinkedHashMap o3 = j5a.o(catalogBlockItemsDto.H0());
        LinkedHashMap E = j5a.E(catalogBlockItemsDto.Q2(), catalogBlockItemsDto.E2());
        LinkedHashMap G2 = j5a.G(catalogBlockItemsDto.V2(), catalogBlockItemsDto.i2(), catalogBlockItemsDto.N0(), catalogBlockItemsDto.g());
        LinkedHashMap C3 = j5a.C(catalogBlockItemsDto.B2());
        LinkedHashMap u3 = j5aVar.u(catalogBlockItemsDto.N1());
        LinkedHashMap b2 = qw0Var.b(catalogBlockItemsDto.T());
        ArrayList a2 = qw0Var.a(catalogBlockItemsDto.d1());
        LinkedHashMap c = qw0Var.c(catalogBlockItemsDto.W());
        LinkedHashMap e8 = qw0Var.e(catalogBlockItemsDto.o1());
        LinkedHashMap c2 = j5a.c(catalogBlockItemsDto.a0());
        List<ChannelsChannelDto> R2 = catalogBlockItemsDto.R();
        if (R2 == null) {
            R2 = EmptyList.b;
        }
        List<GroupsGroupFullDto> N02 = catalogBlockItemsDto.N0();
        if (N02 == null) {
            N02 = EmptyList.b;
        }
        LinkedHashMap i8 = j5a.i(R2, N02);
        List<StickersPackPreviewDto> N2 = catalogBlockItemsDto.N2();
        if (N2 == null) {
            N2 = EmptyList.b;
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        abl0 abl0Var = (abl0) j5aVar.f.getValue();
        Iterator it4 = N2.iterator();
        while (it4.hasNext()) {
            StickersPackPreviewDto stickersPackPreviewDto = (StickersPackPreviewDto) it4.next();
            Iterator it5 = it4;
            String valueOf2 = String.valueOf(stickersPackPreviewDto.getId());
            abl0Var.getClass();
            int id4 = stickersPackPreviewDto.getId();
            String title4 = stickersPackPreviewDto.getTitle();
            String description2 = stickersPackPreviewDto.getDescription();
            String d12 = stickersPackPreviewDto.d();
            LinkedHashMap linkedHashMap7 = c;
            Boolean o4 = stickersPackPreviewDto.o();
            abl0 abl0Var2 = abl0Var;
            Boolean bool2 = Boolean.TRUE;
            boolean f12 = epx.f(o4, bool2);
            boolean f13 = epx.f(stickersPackPreviewDto.u(), bool2);
            boolean f14 = epx.f(stickersPackPreviewDto.i(), bool2);
            boolean f15 = epx.f(stickersPackPreviewDto.g(), bool2);
            boolean f16 = epx.f(stickersPackPreviewDto.f(), bool2);
            boolean f17 = epx.f(stickersPackPreviewDto.n(), bool2);
            boolean f18 = epx.f(stickersPackPreviewDto.B(), bool2);
            StickersPackBadgeDto e9 = stickersPackPreviewDto.e();
            if (e9 != null) {
                String e10 = e9.e();
                if (e10 == null || drm0.N(e10)) {
                    linkedHashMap2 = G2;
                } else {
                    StickersPackBadgeDto.SubtypeDto d13 = e9.d();
                    if (d13 == null) {
                        linkedHashMap2 = G2;
                        i = -1;
                    } else {
                        linkedHashMap2 = G2;
                        i = abl0.a.$EnumSwitchMapping$0[d13.ordinal()];
                    }
                    if (i != -1) {
                        linkedHashMap3 = f11;
                        if (i == 1) {
                            linkedHashMap4 = t;
                            stickerPackBadge2 = new StickerPackBadge.New(e10, 0, 2, null);
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            linkedHashMap4 = t;
                            stickerPackBadge2 = new StickerPackBadge.Discount(e10, 0, 2, null);
                        }
                        stickerPackBadge = stickerPackBadge2;
                    }
                }
                linkedHashMap3 = f11;
                linkedHashMap4 = t;
                stickerPackBadge2 = null;
                stickerPackBadge = stickerPackBadge2;
            } else {
                linkedHashMap2 = G2;
                linkedHashMap3 = f11;
                linkedHashMap4 = t;
                stickerPackBadge = null;
            }
            StickersOrderPriceDto k3 = stickersPackPreviewDto.k();
            if (k3 != null) {
                int d14 = k3.d();
                Integer f19 = k3.f();
                Integer valueOf3 = Integer.valueOf(f19 != null ? f19.intValue() : 0);
                Integer e11 = k3.e();
                stickerPackPrice = new StickerPackPrice(d14, valueOf3, Integer.valueOf(e11 != null ? e11.intValue() : 0));
            } else {
                stickerPackPrice = null;
            }
            Serializer.c<StickerStockItemPreviewImage> cVar = StickerStockItemPreviewImage.CREATOR;
            StickersImageSetDto j4 = stickersPackPreviewDto.j();
            if (j4 == null) {
                stickerStockItemPreviewImage = null;
            } else {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                List<BaseImageDto> e12 = j4.e();
                if (e12 != null) {
                    Iterator it6 = e12.iterator();
                    while (it6.hasNext()) {
                        BaseImageDto baseImageDto3 = (BaseImageDto) it6.next();
                        StickersImageSetDto stickersImageSetDto = j4;
                        String id5 = baseImageDto3.getId();
                        Iterator it7 = it6;
                        if (id5 == null || !drm0.D(id5, "square", false)) {
                            String id6 = baseImageDto3.getId();
                            if (id6 != null) {
                                if (drm0.D(id6, "wide", false)) {
                                    arrayList7.add(new ImageSize(baseImageDto3.getUrl(), baseImageDto3.getWidth(), baseImageDto3.getHeight(), baseImageDto3.e(), (char) 0, false, 48, null));
                                }
                                j4 = stickersImageSetDto;
                                it6 = it7;
                            }
                        } else {
                            arrayList6.add(new ImageSize(baseImageDto3.getUrl(), baseImageDto3.getWidth(), baseImageDto3.getHeight(), baseImageDto3.e(), (char) 0, false, 48, null));
                        }
                        j4 = stickersImageSetDto;
                        it6 = it7;
                    }
                }
                stickerStockItemPreviewImage = new StickerStockItemPreviewImage(j4.d(), new Image(arrayList6), new Image(arrayList7));
            }
            List<BaseStickerDto> l3 = stickersPackPreviewDto.l();
            if (l3 != null) {
                List<BaseStickerDto> list5 = l3;
                ArrayList arrayList8 = new ArrayList(c5g.u(list5, 10));
                Iterator it8 = list5.iterator();
                while (it8.hasNext()) {
                    arrayList8.add(bo6.a((BaseStickerDto) it8.next()));
                }
                arrayList2 = arrayList8;
            } else {
                arrayList2 = null;
            }
            String r3 = stickersPackPreviewDto.r();
            linkedHashMap6.put(valueOf2, new StickerPackPreview(id4, title4, description2, d12, f12, f13, f14, false, f15, f16, f17, f18, stickerPackBadge, stickerPackPrice, stickerStockItemPreviewImage, arrayList2, r3 == null ? "" : r3, Boolean.valueOf(epx.f(stickersPackPreviewDto.p(), Boolean.TRUE))));
            c = linkedHashMap7;
            it4 = it5;
            abl0Var = abl0Var2;
            t = linkedHashMap4;
            G2 = linkedHashMap2;
            f11 = linkedHashMap3;
        }
        LinkedHashMap linkedHashMap8 = c;
        LinkedHashMap linkedHashMap9 = G2;
        LinkedHashMap linkedHashMap10 = f11;
        LinkedHashMap linkedHashMap11 = t;
        List<StickersCatalogBannerDto> J2 = catalogBlockItemsDto.J2();
        if (J2 == null) {
            J2 = EmptyList.b;
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        Iterator it9 = J2.iterator();
        while (it9.hasNext()) {
            StickersCatalogBannerDto stickersCatalogBannerDto = (StickersCatalogBannerDto) it9.next();
            String valueOf4 = String.valueOf(stickersCatalogBannerDto.getId());
            int id7 = stickersCatalogBannerDto.getId();
            String url2 = stickersCatalogBannerDto.getUrl();
            List<BaseImageDto> d15 = stickersCatalogBannerDto.d();
            if (d15 != null) {
                List<BaseImageDto> list6 = d15;
                it = it9;
                linkedHashMap = linkedHashMap6;
                arrayList = new ArrayList(c5g.u(list6, 10));
                Iterator it10 = list6.iterator();
                while (it10.hasNext()) {
                    BaseImageDto baseImageDto4 = (BaseImageDto) it10.next();
                    arrayList.add(new NotificationImage.ImageInfo(baseImageDto4.getWidth(), baseImageDto4.getHeight(), baseImageDto4.getUrl()));
                    it10 = it10;
                    l2 = l2;
                }
            } else {
                it = it9;
                linkedHashMap = linkedHashMap6;
                arrayList = null;
            }
            LinkedHashMap linkedHashMap13 = l2;
            linkedHashMap12.put(valueOf4, new Banner(id7, url2, new NotificationImage(arrayList), null));
            it9 = it;
            linkedHashMap6 = linkedHashMap;
            l2 = linkedHashMap13;
        }
        LinkedHashMap linkedHashMap14 = linkedHashMap6;
        LinkedHashMap linkedHashMap15 = l2;
        List<StickersCatalogInfoDto> L2 = catalogBlockItemsDto.L2();
        if (L2 == null) {
            L2 = EmptyList.b;
        }
        LinkedHashMap linkedHashMap16 = new LinkedHashMap();
        o2l0 o2l0Var = (o2l0) j5aVar.g.getValue();
        for (StickersCatalogInfoDto stickersCatalogInfoDto : L2) {
            String valueOf5 = String.valueOf(stickersCatalogInfoDto.e());
            o2l0Var.getClass();
            long intValue6 = stickersCatalogInfoDto.e() != null ? r8.intValue() : 0L;
            StickersBonusBalanceDto d16 = stickersCatalogInfoDto.d();
            if (d16 != null) {
                stickersBonusBalance = new StickersBonusBalance(d16.i(), d16.d() != null ? Long.valueOf(r11.intValue() * 1000) : null, d16.e(), d16.g(), d16.f());
            } else {
                stickersBonusBalance = null;
            }
            linkedHashMap16.put(valueOf5, new StickersInfo(intValue6, stickersBonusBalance));
        }
        LinkedHashMap linkedHashMap17 = new LinkedHashMap();
        Iterator it11 = linkedHashMap5.entrySet().iterator();
        while (it11.hasNext()) {
            StickerStockItem stickerStockItem = (StickerStockItem) ((Map.Entry) it11.next()).getValue();
            Iterator it12 = stickerStockItem.g.iterator();
            while (it12.hasNext()) {
                linkedHashMap17.put(String.valueOf(((StickerItem) it12.next()).b), stickerStockItem);
            }
        }
        CatalogExtendedData catalogExtendedData = new CatalogExtendedData(z9, p3, null, linkedHashMap9, null, null, null, null, w, B2, e7, linkedHashMap10, linkedHashMap11, h, E, r2, F2, a, linkedHashMap5, linkedHashMap14, linkedHashMap17, linkedHashMap12, linkedHashMap16, null, v, null, f10, d10, u3, j3, null, null, q, null, linkedHashMap15, x, linkedHashMap8, b2, a2, D3, e8, C3, y, null, k2, n3, A, b, m, o3, null, null, null, g2, null, null, d11, null, c2, null, null, null, i8, null, null, null, null, -1031798540, -1159985150, 7, null);
        CatalogBlock b3 = this.a.b(catalogBlockItemsDto.F(), "");
        return new hda(b3, catalogExtendedData, b3.f);
    }
}
