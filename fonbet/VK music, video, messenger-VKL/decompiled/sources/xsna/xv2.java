package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsMarketDeliveryInfoDto;
import com.vk.api.generated.groups.dto.GroupsMarketInfoDto;
import com.vk.api.generated.market.dto.MarketAbandonedCartDto;
import com.vk.api.generated.market.dto.MarketGetAbandonedCartsResponseDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsTypeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.feature.state.DeliveryOptionType;
import com.vk.ecomm.cart.impl.cart.feature.state.c;
import com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.LinkVKBidFragment;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bex0;
import xsna.m0;
import xsna.m0l0;
import xsna.oig0;
import xsna.rq4;
import xsna.utg;
import xsna.xn50;

/* compiled from: AntispamBottomSheet.kt */
/* loaded from: classes14.dex */
public final /* synthetic */ class xv2 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        Cart cart;
        ?? r10;
        List<GroupsMarketDeliveryInfoDto> i;
        Integer e;
        Object obj2;
        int i2 = 10;
        GroupsGroupFullDto groupsGroupFullDto2 = null;
        switch (this.b) {
            case 0:
                vv2 vv2Var = (vv2) this.receiver;
                vv2Var.getClass();
                xn50.a.c(vv2Var, (sv2) obj);
                return s3q0.a;
            case 1:
                rq4 rq4Var = (rq4) this.receiver;
                rq4 rq4Var2 = rq4.a;
                rq4Var.getClass();
                L.f(rq4.b, "onRecordingFailed", (Throwable) obj);
                rq4.h();
                rq4.k = false;
                if (!rq4.f) {
                    rq4.f = true;
                    ysg0.b.a(new rq4.a());
                }
                return s3q0.a;
            case 2:
                ((e1b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 3:
                fh8 fh8Var = (fh8) obj;
                eh8 eh8Var = (eh8) this.receiver;
                synchronized (eh8Var) {
                    if (eh8Var.d) {
                        eh8Var.b.a(eh8Var.b(), fh8Var);
                    }
                }
                return s3q0.a;
            case 4:
                MarketGetAbandonedCartsResponseDto marketGetAbandonedCartsResponseDto = (MarketGetAbandonedCartsResponseDto) obj;
                ((m0) this.receiver).getClass();
                List<MarketAbandonedCartDto> e2 = marketGetAbandonedCartsResponseDto.e();
                List<GroupsGroupFullDto> d = marketGetAbandonedCartsResponseDto.d();
                ArrayList arrayList = new ArrayList();
                for (MarketAbandonedCartDto marketAbandonedCartDto : e2) {
                    if (d != null) {
                        Iterator it = d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (epx.f(((GroupsGroupFullDto) obj2).P0(), marketAbandonedCartDto.i())) {
                                }
                            } else {
                                obj2 = groupsGroupFullDto2;
                            }
                        }
                        groupsGroupFullDto = (GroupsGroupFullDto) obj2;
                    } else {
                        groupsGroupFullDto = groupsGroupFullDto2;
                    }
                    if (groupsGroupFullDto != null) {
                        List c = eno.c(marketAbandonedCartDto.i(), marketAbandonedCartDto.k());
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : c) {
                            linkedHashMap.put(Long.valueOf(((com.vk.ecomm.cart.impl.cart.feature.state.a) obj3).a.a), obj3);
                        }
                        int o = marketAbandonedCartDto.o();
                        m6d0 b = eno.b(marketAbandonedCartDto.l());
                        String g = marketAbandonedCartDto.g();
                        boolean z = g == null || g.length() == 0;
                        String g2 = marketAbandonedCartDto.g();
                        if (g2 == null) {
                            g2 = "";
                        }
                        adp0 adp0Var = new adp0(o, b, z, g2);
                        UserId P0 = groupsGroupFullDto.P0();
                        String y1 = groupsGroupFullDto.y1();
                        String str = y1 == null ? "" : y1;
                        String a = js5.a(100, groupsGroupFullDto.V1());
                        String str2 = a == null ? "" : a;
                        BaseBoolIntDto O2 = groupsGroupFullDto.O2();
                        boolean z2 = O2 != null && O2.i() == 1;
                        GroupsMarketInfoDto b1 = groupsGroupFullDto.b1();
                        int intValue = (b1 == null || (e = b1.e()) == null) ? 0 : e.intValue();
                        GroupsMarketInfoDto b12 = groupsGroupFullDto.b1();
                        if (b12 == null || (i = b12.i()) == null) {
                            r10 = 0;
                        } else {
                            List<GroupsMarketDeliveryInfoDto> list = i;
                            r10 = new ArrayList(c5g.u(list, i2));
                            for (GroupsMarketDeliveryInfoDto groupsMarketDeliveryInfoDto : list) {
                                int d2 = groupsMarketDeliveryInfoDto.d();
                                r10.add(new c.a(groupsMarketDeliveryInfoDto.e(), d2 != 1 ? d2 != 2 ? d2 != 3 ? d2 != 4 ? d2 != 5 ? DeliveryOptionType.Unknown : DeliveryOptionType.Self : DeliveryOptionType.Courier : DeliveryOptionType.PostInternational : DeliveryOptionType.DeliveryPoint : DeliveryOptionType.Post));
                            }
                        }
                        if (r10 == 0) {
                            r10 = EmptyList.b;
                        }
                        List list2 = r10;
                        BaseBoolIntDto I3 = groupsGroupFullDto.I3();
                        BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
                        com.vk.ecomm.cart.impl.cart.feature.state.c cVar = new com.vk.ecomm.cart.impl.cart.feature.state.c(P0, str, str2, z2, list2, intValue, I3 == baseBoolIntDto);
                        boolean z3 = marketAbandonedCartDto.e() == baseBoolIntDto;
                        boolean f = epx.f(groupsGroupFullDto.g3(), Boolean.TRUE);
                        d990 d990Var = new d990(false, 0, 15);
                        int n = marketAbandonedCartDto.n();
                        MarketIntegrationsTypeDto j = marketAbandonedCartDto.j();
                        cart = new Cart(cVar, linkedHashMap, z3, adp0Var, f, d990Var, false, false, n, (j == null ? -1 : m0.a.$EnumSwitchMapping$0[j.ordinal()]) == 1 ? Cart.Type.OZON : Cart.Type.MARKET, marketAbandonedCartDto.f(), marketAbandonedCartDto.d());
                    } else {
                        cart = null;
                    }
                    if (cart != null) {
                        arrayList.add(cart);
                    }
                    i2 = 10;
                    groupsGroupFullDto2 = null;
                }
                return new wy9(arrayList, e2.size() - arrayList.size());
            case 5:
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                ((lue) this.receiver).getClass();
                ArrayList f2 = ums0.f(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d());
                ArrayList arrayList2 = new ArrayList(c5g.u(f2, 10));
                Iterator it2 = f2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ClipVideoFile) it2.next()).r1());
                }
                return new xpe(f2, j5g.S0(arrayList2), shortVideoGetOwnerVideosResponseDto.g());
            case 6:
                utg utgVar = (utg) obj;
                mtg mtgVar = (mtg) this.receiver;
                if (!(utgVar instanceof utg.a)) {
                    int i3 = mtg.k1;
                    mtgVar.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                qtg qtgVar = mtgVar.i1;
                utg.a aVar = (utg.a) utgVar;
                mtg mtgVar2 = qtgVar.a;
                if (aVar.equals(utg.a.C3828a.a)) {
                    mtgVar2.dismiss();
                } else {
                    if (!(aVar instanceof utg.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    maz.c(qtgVar.b, mtgVar2.requireContext(), ((utg.a.b) aVar).a, LaunchContext.A, null, null, 24);
                    mtgVar2.dismiss();
                }
                return s3q0.a;
            case 7:
                ((neh) this.receiver).getClass();
                return neh.c((List) obj);
            case 8:
                String str3 = (String) obj;
                elh elhVar = (elh) this.receiver;
                int i4 = elh.M;
                Services services = (Services) elhVar.t;
                if (services != null) {
                    elhVar.E.j(new eoi0(str3, services));
                }
                return s3q0.a;
            case 9:
                oig0 oig0Var = (oig0) obj;
                cwh cwhVar = (cwh) this.receiver;
                if (oig0Var instanceof oig0.c) {
                    cwhVar.a(null);
                } else if (oig0Var instanceof oig0.b) {
                    maz.c(cwhVar.f, cwhVar.a.requireContext(), ((oig0.b) oig0Var).a, new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, true, null, null, null, 62914559), null, null, 24);
                } else {
                    cwhVar.h = null;
                }
                return s3q0.a;
            case 10:
                xam xamVar = (xam) this.receiver;
                ktk0 ktk0Var = xamVar.t;
                ktk0Var.d = false;
                xpp<Dialog> e3 = ((wpp) obj).e(Long.valueOf(ktk0Var.a.e));
                if (e3.c()) {
                    xamVar.t.a.d.a = true;
                } else {
                    xamVar.t.a.Hb(e3);
                }
                xamVar.t.e = null;
                xamVar.X0();
                xamVar.e1();
                xamVar.a1(xamVar.t.a());
                return s3q0.a;
            case 11:
                List list3 = (List) obj;
                kut kutVar = (kut) this.receiver;
                kutVar.getClass();
                xgx0 xgx0Var = xgx0.a;
                StringBuilder sb = new StringBuilder("VkStepsGetStepsCommand.handleStepsReceivedFromDataSource() -> steps: ");
                sb.append(list3);
                sb.append(", thread: ");
                mft0.a(sb, xgx0Var);
                SimpleDateFormat simpleDateFormat = m0l0.h;
                JSONArray b2 = m0l0.a.b(list3, true);
                r6y r6yVar = kutVar.b;
                if (r6yVar != null) {
                    JsApiMethodType jsApiMethodType = JsApiMethodType.GET_STEPS;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("steps_list", b2);
                    s3q0 s3q0Var = s3q0.a;
                    bex0.a.b(r6yVar, jsApiMethodType, jSONObject, null, 12);
                }
                return s3q0.a;
            case 12:
                LinkVKBidFragment linkVKBidFragment = (LinkVKBidFragment) this.receiver;
                linkVKBidFragment.getClass();
                xn50.a.c(linkVKBidFragment, (hbz) obj);
                return s3q0.a;
            case 13:
                cs90.h((cs90) this.receiver, (tr90) obj);
                return s3q0.a;
            case 14:
                ((mcr) this.receiver).b((List) obj);
                return s3q0.a;
            case 15:
                return (ArrayList) ((izs) this.receiver).invoke((ArrayList) obj);
            case 16:
                ((ips0) this.receiver).getClass();
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 17:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) this.receiver;
                videoRelatedVideosFragment.getClass();
                xn50.a.c(videoRelatedVideosFragment, (com.vk.video.ui.discovery.minimizable.dialog.related_videos.b) obj);
                return s3q0.a;
            default:
                return new Result(dmx0.a((dmx0) this.receiver, (String) obj));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv2(Object obj, int i) {
        super(1, obj, lue.class, "mapResponseInPlaylist", "mapResponseInPlaylist(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetOwnerVideosResponseDto;)Lcom/vk/clips/playlists/ui/model/ClipsPickerResponse;", 0);
        this.b = i;
        switch (i) {
            case 7:
                super(1, obj, neh.class, "mapPhotosToHeaderUrls", "mapPhotosToHeaderUrls(Ljava/util/List;)Ljava/util/List;", 0);
                break;
            case 17:
                super(1, obj, VideoRelatedVideosFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                break;
            case 18:
                super(1, obj, dmx0.class, "makeNetworkCall", "makeNetworkCall-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv2(m0 m0Var) {
        super(1, m0Var, m0.class, "map", "map(Lcom/vk/api/generated/market/dto/MarketGetAbandonedCartsResponseDto;)Lcom/vk/ecomm/cart/impl/cart/feature/state/CartsResult;", 0);
        this.b = 4;
    }
}
