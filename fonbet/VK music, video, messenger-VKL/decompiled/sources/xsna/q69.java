package xsna;

import android.content.Context;
import com.vk.api.generated.market.dto.MarketDeliveryPointDto;
import com.vk.api.generated.market.dto.MarketGetOrderByIdResponseDto;
import com.vk.api.generated.market.dto.MarketIntegrationsGroupsDto;
import com.vk.api.generated.market.dto.MarketItemPropertyValueDto;
import com.vk.api.generated.market.dto.MarketOrderDeliveryDto;
import com.vk.api.generated.market.dto.MarketOrderDetailsPriceDto;
import com.vk.api.generated.market.dto.MarketOrderDto;
import com.vk.api.generated.market.dto.MarketOrderInfoBannerDto;
import com.vk.api.generated.market.dto.MarketOrderItemDto;
import com.vk.api.generated.market.dto.MarketOrderPaymentDto;
import com.vk.api.generated.market.dto.MarketOrderRecipientDto;
import com.vk.api.generated.market.dto.MarketOrderSellerDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.market.dto.MarketPromoCodeDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.Image;
import com.vk.dto.common.Price;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.common.model.OrderGroupPreview;
import com.vk.ecomm.orders.impl.common.model.OrderSource;
import com.vk.ecomm.orders.impl.common.model.OrderStatus;
import com.vk.ecomm.orders.impl.order.domain.OrderIsEmptyException;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.profile.community.details.impl.contacts.f;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.voip.ui.onboarding.ui.CallOnboardingView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.oig0;
import xsna.uu80;
import xsna.xn50;

/* compiled from: CallOnboardingView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class q69 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q69(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0299  */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v59, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        wwh0 c;
        ?? r13;
        OrderSource ozon;
        dx80 dx80Var;
        ou80 ou80Var;
        ax80 ax80Var;
        MarketGetOrderByIdResponseDto marketGetOrderByIdResponseDto;
        String str;
        List<MarketOrderDetailsPriceDto> F;
        Price price;
        rx80 rx80Var;
        ArrayList arrayList;
        List<MarketOrderInfoBannerDto> u;
        Price price2;
        rx80 rx80Var2;
        String str2;
        List<MarketOrderItemDto> D;
        List list;
        EmptyList emptyList;
        long j;
        List list2;
        ?? r1;
        MarketOrderInfoBannerDto marketOrderInfoBannerDto;
        boolean z;
        switch (this.b) {
            case 0:
                ((CallOnboardingView) this.receiver).i.onNext((r69) obj);
                return s3q0.a;
            case 1:
                ShortVideoGetPlaylistsResponseDto shortVideoGetPlaylistsResponseDto = (ShortVideoGetPlaylistsResponseDto) obj;
                ((lue) this.receiver).getClass();
                Integer f = shortVideoGetPlaylistsResponseDto.f();
                int intValue = f != null ? f.intValue() : 100;
                ShortVideoPlaylistFullDto shortVideoPlaylistFullDto = (ShortVideoPlaylistFullDto) j5g.a0(shortVideoGetPlaylistsResponseDto.d());
                return new e8b0(intValue, shortVideoPlaylistFullDto != null ? shortVideoPlaylistFullDto.getCount() : 0);
            case 2:
                com.vk.profile.community.details.impl.contacts.f fVar = (com.vk.profile.community.details.impl.contacts.f) obj;
                com.vk.profile.community.details.impl.contacts.b bVar = (com.vk.profile.community.details.impl.contacts.b) this.receiver;
                int i = com.vk.profile.community.details.impl.contacts.b.m1;
                bVar.getClass();
                if (fVar instanceof f.b) {
                    Integer num = ((f.b) fVar).a;
                    Context mo2getContext = bVar.mo2getContext();
                    if (mo2getContext != null) {
                        c = ((mfc) bVar.l1.getValue()).c(mo2getContext, "city_dialog_request_key", num, (r18 & 8) != 0 ? null : 1, true, (r18 & 32) != 0 ? null : Integer.valueOf(R.string.community_add_contacts_bs_city_null_item_title), (r18 & 64) == 0);
                        ((sh90) c).a.a().Wn(bVar.getParentFragmentManager(), null);
                    }
                } else if (fVar instanceof f.c) {
                    h03.b(((f.c) fVar).a);
                } else {
                    if (!epx.f(fVar, f.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gzs<s3q0> gzsVar = bVar.i1;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                    bVar.hide();
                }
                return s3q0.a;
            case 3:
                mtg mtgVar = (mtg) this.receiver;
                mtgVar.getClass();
                xn50.a.c(mtgVar, (ltg) obj);
                return s3q0.a;
            case 4:
                GoodAlbum goodAlbum = (GoodAlbum) obj;
                elh elhVar = (elh) this.receiver;
                int i2 = elh.M;
                Services services = (Services) elhVar.t;
                if (services != null) {
                    zih.a(elhVar.E, services, new rri0(goodAlbum, services), null, 12);
                }
                return s3q0.a;
            case 5:
                oig0 oig0Var = (oig0) obj;
                cwh cwhVar = (cwh) this.receiver;
                if (oig0Var instanceof oig0.d) {
                    cwhVar.a(null);
                } else if (oig0Var instanceof oig0.b) {
                    maz.c(cwhVar.f, cwhVar.a.requireContext(), ((oig0.b) oig0Var).a, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, true, null, null, null, 62914559), null, null, 24);
                } else {
                    cwhVar.h = null;
                    cwhVar.c.invoke();
                }
                return s3q0.a;
            case 6:
                Throwable th = (Throwable) obj;
                xam xamVar = (xam) this.receiver;
                f9w f9wVar = xam.y;
                xamVar.getClass();
                xam.y.a(th);
                ktk0 ktk0Var = xamVar.t;
                ktk0Var.d = false;
                DialogExt dialogExt = ktk0Var.a;
                dialogExt.Hb(new ypp(Long.valueOf(dialogExt.e)));
                xamVar.t.e = th;
                xamVar.e1();
                return s3q0.a;
            case 7:
                ((fnt) this.receiver).b((com.vk.geo.impl.presentation.h) obj);
                return s3q0.a;
            case 8:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 9:
                MarketGetOrderByIdResponseDto marketGetOrderByIdResponseDto2 = (MarketGetOrderByIdResponseDto) obj;
                uu80 uu80Var = (uu80) this.receiver;
                uu80Var.getClass();
                MarketOrderDto d = marketGetOrderByIdResponseDto2.d();
                if (d == null) {
                    throw new OrderIsEmptyException();
                }
                int id = d.getId();
                UserId userId = d.getUserId();
                String j2 = d.j();
                MarketOrderPaymentDto B = d.B();
                ms90 ms90Var = B != null ? new ms90(B.e(), B.d()) : null;
                MarketIntegrationsTypeDto o = d.o();
                int i3 = o == null ? -1 : uu80.a.$EnumSwitchMapping$0[o.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    List<MarketIntegrationsGroupsDto> k = d.k();
                    if (k != null) {
                        List<MarketIntegrationsGroupsDto> list3 = k;
                        r13 = new ArrayList(c5g.u(list3, 10));
                        for (MarketIntegrationsGroupsDto marketIntegrationsGroupsDto : list3) {
                            r13.add(new OrderGroupPreview(marketIntegrationsGroupsDto.d(), marketIntegrationsGroupsDto.getTitle()));
                        }
                    } else {
                        r13 = EmptyList.b;
                    }
                    ozon = new OrderSource.Ozon(r13, d.n(), d.l());
                } else {
                    ozon = OrderSource.Market.b;
                }
                MarketOrderSellerDto M = d.M();
                if (M != null) {
                    String title = M.getTitle();
                    String f2 = M.f();
                    dx80Var = new dx80(title, M.d() != null ? Long.valueOf(r12.intValue()) : null, M.e(), f2);
                } else {
                    dx80Var = null;
                }
                OrderStatus.a aVar = OrderStatus.Companion;
                int R = d.R();
                MarketIntegrationsTypeDto o2 = d.o();
                boolean z2 = (o2 == null || o2 == MarketIntegrationsTypeDto.NONE) ? false : true;
                aVar.getClass();
                OrderStatus b = OrderStatus.a.b(R, z2);
                long e = d.e();
                Price i4 = b210.i(d.T());
                MarketPriceDto i5 = d.i();
                Price i6 = i5 != null ? b210.i(i5) : null;
                MarketPromoCodeDto G = d.G();
                String d2 = G != null ? G.d() : null;
                MarketOrderDeliveryDto g = d.g();
                if (g != null) {
                    f0p0 f0p0Var = uu80Var.a;
                    String d3 = g.d();
                    String type = g.getType();
                    MarketDeliveryPointDto e2 = g.e();
                    ou80Var = new ou80(d3, type, e2 != null ? f0p0Var.a(e2) : null, g.g(), g.f());
                } else {
                    ou80Var = null;
                }
                MarketOrderRecipientDto K = d.K();
                if (K != null) {
                    marketGetOrderByIdResponseDto2 = marketGetOrderByIdResponseDto2;
                    ax80Var = new ax80(K.d(), K.e());
                } else {
                    ax80Var = null;
                }
                String Z = d.Z();
                if (Z == null) {
                    MarketOrderDeliveryDto g2 = d.g();
                    Z = g2 != null ? g2.g() : null;
                }
                String W = d.W();
                if (W == null) {
                    MarketOrderDeliveryDto g3 = d.g();
                    if (g3 == null) {
                        marketGetOrderByIdResponseDto = marketGetOrderByIdResponseDto2;
                        str = null;
                        rx80 rx80Var3 = new rx80(Z, str);
                        F = d.F();
                        if (F == null) {
                            List<MarketOrderDetailsPriceDto> list4 = F;
                            price = i4;
                            rx80Var = rx80Var3;
                            arrayList = new ArrayList(c5g.u(list4, 10));
                            Iterator it = list4.iterator();
                            while (it.hasNext()) {
                                MarketOrderDetailsPriceDto marketOrderDetailsPriceDto = (MarketOrderDetailsPriceDto) it.next();
                                arrayList.add(new vw80(marketOrderDetailsPriceDto.getTitle(), b210.i(marketOrderDetailsPriceDto.d()), epx.f(marketOrderDetailsPriceDto.e(), Boolean.TRUE), marketOrderDetailsPriceDto.getType()));
                                it = it;
                                d = d;
                                ozon = ozon;
                            }
                        } else {
                            price = i4;
                            rx80Var = rx80Var3;
                            arrayList = null;
                        }
                        MarketOrderDto marketOrderDto = d;
                        OrderSource orderSource = ozon;
                        List list5 = arrayList;
                        if (arrayList == null) {
                            list5 = EmptyList.b;
                        }
                        u = marketOrderDto.u();
                        if (u != null || (marketOrderInfoBannerDto = (MarketOrderInfoBannerDto) j5g.Y(u)) == null) {
                            price2 = price;
                            rx80Var2 = rx80Var;
                            str2 = null;
                        } else {
                            price2 = price;
                            rx80Var2 = rx80Var;
                            str2 = marketOrderInfoBannerDto.d();
                        }
                        MarketOrderDto d4 = marketGetOrderByIdResponseDto.d();
                        boolean z3 = (d4 == null ? d4.C() : null) == null;
                        D = marketOrderDto.D();
                        if (D == null) {
                            List<MarketOrderItemDto> list6 = D;
                            ?? arrayList2 = new ArrayList(c5g.u(list6, 10));
                            Iterator it2 = list6.iterator();
                            List list7 = list5;
                            while (it2.hasNext()) {
                                MarketOrderItemDto marketOrderItemDto = (MarketOrderItemDto) it2.next();
                                Iterator it3 = it2;
                                long f3 = marketOrderItemDto.f();
                                UserId q = marketOrderItemDto.q();
                                PhotosPhotoDto g4 = marketOrderItemDto.g();
                                Image image = g4 != null ? xfa0.a(g4).y : null;
                                String title2 = marketOrderItemDto.getTitle();
                                if (title2 == null) {
                                    title2 = "";
                                }
                                String str3 = title2;
                                List<MarketItemPropertyValueDto> G2 = marketOrderItemDto.e().G();
                                if (G2 != null) {
                                    List<MarketItemPropertyValueDto> list8 = G2;
                                    j = f3;
                                    list2 = list7;
                                    r1 = new ArrayList(c5g.u(list8, 10));
                                    Iterator it4 = list8.iterator();
                                    while (it4.hasNext()) {
                                        r1.add(((MarketItemPropertyValueDto) it4.next()).g());
                                    }
                                } else {
                                    j = f3;
                                    list2 = list7;
                                    r1 = EmptyList.b;
                                }
                                List list9 = r1;
                                int j3 = marketOrderItemDto.j();
                                String n = marketOrderItemDto.i().n();
                                Boolean d5 = marketOrderItemDto.d();
                                arrayList2.add(new ww80(j, q, image, str3, list9, j3, n, d5 != null ? d5.booleanValue() : false));
                                it2 = it3;
                                list7 = list2;
                            }
                            list = list7;
                            emptyList = arrayList2;
                        } else {
                            list = list5;
                            emptyList = EmptyList.b;
                        }
                        return new iu80(userId, id, j2, ms90Var, orderSource, dx80Var, b, e, price2, i6, d2, ou80Var, ax80Var, rx80Var2, list, str2, z3, emptyList);
                    }
                    W = g3.f();
                }
                marketGetOrderByIdResponseDto = marketGetOrderByIdResponseDto2;
                str = W;
                rx80 rx80Var32 = new rx80(Z, str);
                F = d.F();
                if (F == null) {
                }
                MarketOrderDto marketOrderDto2 = d;
                OrderSource orderSource2 = ozon;
                List list52 = arrayList;
                if (arrayList == null) {
                }
                u = marketOrderDto2.u();
                if (u != null) {
                }
                price2 = price;
                rx80Var2 = rx80Var;
                str2 = null;
                MarketOrderDto d42 = marketGetOrderByIdResponseDto.d();
                if ((d42 == null ? d42.C() : null) == null) {
                }
                D = marketOrderDto2.D();
                if (D == null) {
                }
                return new iu80(userId, id, j2, ms90Var, orderSource2, dx80Var, b, e, price2, i6, d2, ou80Var, ax80Var, rx80Var2, list, str2, z3, emptyList);
            case 10:
                cs90.f((cs90) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 11:
                RedesignNotificationSettingsFragment redesignNotificationSettingsFragment = (RedesignNotificationSettingsFragment) this.receiver;
                redesignNotificationSettingsFragment.getClass();
                xn50.a.c(redesignNotificationSettingsFragment, (rf70) obj);
                return s3q0.a;
            case 12:
                return Boolean.valueOf(((cpu) this.receiver).d((UserId) obj));
            case 13:
                ((bmm0) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 14:
                int intValue2 = ((Number) obj).intValue();
                bio0 bio0Var = (bio0) this.receiver;
                int i7 = bio0.T;
                bio0Var.getClass();
                try {
                    z = bio0Var.I.onTextContextMenuItem(intValue2);
                } catch (Exception unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                ((ips0) this.receiver).getClass();
                zk70.e((Throwable) obj);
                return s3q0.a;
            default:
                return cxx0.n((cxx0) this.receiver, (String) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q69(RedesignNotificationSettingsFragment redesignNotificationSettingsFragment) {
        super(1, redesignNotificationSettingsFragment, RedesignNotificationSettingsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q69(Object obj, int i) {
        super(1, obj, lue.class, "mapResponseInCounts", "mapResponseInCounts(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetPlaylistsResponseDto;)Lcom/vk/clips/playlists/ui/model/PlaylistCountsResponse;", 0);
        this.b = i;
        switch (i) {
            case 7:
                super(1, obj, fnt.class, "notify", "notify(Lcom/vk/geo/impl/presentation/GeoSideEffect;)V", 0);
                break;
            case 8:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 13:
                super(1, obj, bmm0.class, "handleErrorLoadingFirstPage", "handleErrorLoadingFirstPage(Ljava/lang/Throwable;)V", 0);
                break;
            case 16:
                super(1, obj, cxx0.class, "findService", "findService(Ljava/lang/String;)Landroid/content/ComponentName;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q69(cpu cpuVar) {
        super(1, cpuVar, cpu.class, "isCurrentUserOrGroupAdmin", "isCurrentUserOrGroupAdmin(Lcom/vk/dto/common/id/UserId;)Z", 0);
        this.b = 12;
    }
}
