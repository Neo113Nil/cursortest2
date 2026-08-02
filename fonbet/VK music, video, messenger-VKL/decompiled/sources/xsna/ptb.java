package xsna;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.checkout.feature.state.e;
import com.vk.ecomm.cart.impl.common.models.geo.Address;
import com.vk.ecomm.cart.impl.common.models.geo.City;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapFragment;
import com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapFragment;
import com.vk.im.chat.api.ChatAnalyticsParamsNoLogging;
import com.vk.log.L;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.g6c;
import xsna.ikv0;
import xsna.k8c;
import xsna.otb;
import xsna.q1x;
import xsna.tlo0;
import xsna.zw80;

/* compiled from: ChatMembersLoaderImpl.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class ptb extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptb(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [T, xsna.dw20] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        wwh0 c;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                otb otbVar = (otb) this.receiver;
                otbVar.getClass();
                L.j(th, "otb", "onUpdateInconsistentMembersInfoError");
                otbVar.l = otb.b.a(otbVar.l, null, false, false, null, false, null, 959);
                otbVar.i.onNext(th);
                return s3q0.a;
            case 1:
                g6c g6cVar = (g6c) obj;
                q5c q5cVar = (q5c) this.receiver;
                FragmentImpl fragmentImpl = q5cVar.a;
                r4c r4cVar = q5cVar.c;
                Coordinates coordinates = null;
                if (g6cVar instanceof g6c.l) {
                    g6c.l lVar = (g6c.l) g6cVar;
                    q5cVar.d = lVar.b;
                    c = ((mfc) r4cVar.c.getValue()).c(q5cVar.a(), "checkout_city_request_key", lVar.a, (r18 & 8) != 0 ? null : 1, false, (r18 & 32) != 0 ? null : Integer.valueOf(R.string.community_add_contacts_bs_city_null_item_title), (r18 & 64) == 0);
                    ((sh90) c).a.a().Wn(fragmentImpl.getParentFragmentManager(), null);
                } else {
                    int i = 0;
                    if (g6cVar instanceof g6c.k) {
                        g6c.k kVar = (g6c.k) g6cVar;
                        com.vk.ecomm.cart.impl.checkout.feature.state.e eVar = kVar.a;
                        List<e.a> list = eVar.e;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        for (e.a aVar : list) {
                            String str = aVar.a;
                            arrayList.add(new n4c(str, aVar.b, aVar.c, epx.f(str, eVar.h)));
                        }
                        int i2 = k8c.f1;
                        Context a = q5cVar.a();
                        yu1 yu1Var = new yu1(3, q5cVar, kVar);
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        l22 l22Var = new l22(4, yu1Var, ref$ObjectRef);
                        k8c.a aVar2 = new k8c.a(a, new j8c());
                        aVar2.T0();
                        aVar2.c(new d5j(aVar2.S0()));
                        aVar2.v0(R.string.ecomm_checkout_deliveries_zones);
                        aVar2.J();
                        aVar2.U0(new jai(152782854, new i8c(i, arrayList, l22Var), true));
                        s3q0 s3q0Var = s3q0.a;
                        ref$ObjectRef.element = aVar2.I0(null);
                    } else if (g6cVar instanceof g6c.m) {
                        u8k0 u8k0Var = ((g6c.m) g6cVar).a;
                        tlo0.f fVar = u8k0Var.a;
                        Context a2 = q5cVar.a();
                        fVar.getClass();
                        String obj2 = tlo0.b.a(fVar, a2).toString();
                        Context a3 = q5cVar.a();
                        ikv0.a aVar3 = new ikv0.a(a3);
                        int i3 = 6;
                        aVar3.u = new ikv0.d(obj2, (String) null, (ikv0.d.a) null, 6);
                        r2c r2cVar = u8k0Var.b;
                        if (r2cVar != null) {
                            aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, a3.getResources().getString(R.string.ecomm_cart_retry), new sh3(i3, q5cVar, r2cVar));
                        }
                        aVar3.n();
                    } else if (g6cVar instanceof g6c.a) {
                        fragmentImpl.kn().onBackPressed();
                    } else if (g6cVar instanceof g6c.i) {
                        hy80 hy80Var = (hy80) r4cVar.d.getValue();
                        UserId userId = ((g6c.i) g6cVar).a;
                        UiTracker uiTracker = UiTracker.a;
                        hy80Var.e(q5cVar.a(), userId, UiTracker.c(), CommonMarketStat$TypeMarketOrdersItem.Source.CART);
                    } else if (g6cVar instanceof g6c.c) {
                        g6c.c cVar = (g6c.c) g6cVar;
                        String string = q5cVar.a().getString(R.string.ecomm_checkout_order_chat_greeting, cVar.a);
                        UserId e = fkq0.e(cVar.c);
                        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.CART;
                        UiTracker uiTracker2 = UiTracker.a;
                        pyb.b((pyb) r4cVar.f.getValue(), q5cVar.a(), null, cVar.b, string, null, null, new ChatAnalyticsParamsNoLogging(null, e, commonMarketStat$TypeRefSource, UiTracker.c(), true, null, null, null, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, null), 31457266);
                    } else if (g6cVar instanceof g6c.j) {
                        ((m7c) r4cVar.e.getValue()).a(((g6c.j) g6cVar).a, CommonMarketStat$TypeMarketOrdersItem.Source.CART, fragmentImpl);
                    } else if (g6cVar instanceof g6c.b) {
                        g6c.b bVar = (g6c.b) g6cVar;
                        Long l = bVar.b;
                        UserId userId2 = bVar.a;
                        ((fy00) r4cVar.g.getValue()).b(l != null ? new ku00(l.longValue(), userId2) : new ju00(userId2));
                    } else if (g6cVar instanceof g6c.h) {
                        Context a4 = q5cVar.a();
                        zw80 zw80Var = new zw80(a4, ((g6c.h) g6cVar).a);
                        int f = e3m.f(R.attr.vk_ui_background_modal, a4);
                        dw20.b bVar2 = new dw20.b(a4, null);
                        ComposeView composeView = zw80Var.b;
                        ((dw20.b) ((dw20.b) ((dw20.b) bVar2.D0(composeView, false)).J()).c(new zw80.a(composeView)).w0(a4.getString(R.string.ecomm_checkout_product)).z0(1).l(f).S(f).D()).I0("zw80");
                    } else if (g6cVar instanceof g6c.d) {
                        Address address = ((g6c.d) g6cVar).a;
                        CourierMapFragment.a aVar4 = new CourierMapFragment.a(CourierMapFragment.class, null, null);
                        aVar4.j.putParcelable("ADDRESS_KEY_ARG", address);
                        aVar4.g(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, fragmentImpl);
                    } else if (g6cVar instanceof g6c.g) {
                        g6c.g gVar = (g6c.g) g6cVar;
                        UserId userId3 = gVar.a;
                        City city = gVar.b;
                        int i4 = city.c;
                        String str2 = city.b;
                        Coordinates coordinates2 = gVar.c;
                        Double valueOf = coordinates2 != null ? Double.valueOf(coordinates2.b) : null;
                        Double valueOf2 = coordinates2 != null ? Double.valueOf(coordinates2.c) : null;
                        List<Integer> list2 = gVar.d;
                        DeliveryPoint deliveryPoint = gVar.e;
                        if (valueOf != null && valueOf2 != null) {
                            coordinates = new Coordinates(valueOf.doubleValue(), valueOf2.doubleValue());
                        }
                        City city2 = new City(str2, i4);
                        DeliveryPointsMapFragment.a aVar5 = new DeliveryPointsMapFragment.a();
                        Bundle bundle = aVar5.j;
                        bundle.putBoolean("need_to_pick_delivery_point", true);
                        bundle.putParcelable("city", city2);
                        bundle.putParcelable("city_coordinates", coordinates);
                        bundle.putParcelable("group_id", userId3);
                        bundle.putIntArray("service_ids", j5g.N0(list2));
                        bundle.putParcelable("selected_delivery_point", deliveryPoint);
                        aVar5.g(IronSourceError.ERROR_CAPPED_PER_SESSION, fragmentImpl);
                    } else if (g6cVar instanceof g6c.e) {
                        int i5 = q1x.f1;
                        sz szVar = new sz(q5cVar, 14);
                        String str3 = ((g6c.e) g6cVar).a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        q1x.b.a(szVar, new n8v0(1), str3, q5cVar.a());
                    } else {
                        if (!(g6cVar instanceof g6c.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        maz.c((maz) r4cVar.i.getValue(), q5cVar.a(), ((g6c.f) g6cVar).a, LaunchContext.A, null, null, 24);
                    }
                }
                return s3q0.a;
            case 2:
                ((e3a) this.receiver).getClass();
                return e3a.b((CatalogCatalogResponseObjectDto) obj);
            case 3:
                return ((mm50) this.receiver).G((izs) obj);
            case 4:
                ((TextView) this.receiver).setTextColor(((Number) obj).intValue());
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((lcw0) this.receiver).getClass();
                com.vk.voip.ui.c.b.getClass();
                boolean z0 = com.vk.voip.ui.c.z0();
                if (!booleanValue) {
                    ysg0.b.a(new k4u0());
                } else if (z0) {
                    ysg0.b.a(new rjj0());
                } else {
                    ysg0.b.a(new l4u0());
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptb(Object obj, int i) {
        super(1, obj, otb.class, "onUpdateInconsistentMembersInfoError", "onUpdateInconsistentMembersInfoError(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, e3a.class, "mapToCatalog", "mapToCatalog(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0);
                break;
            case 5:
                super(1, obj, lcw0.class, "openVirtualBackgroundSettingsIfReady", "openVirtualBackgroundSettingsIfReady(Z)V", 0);
                break;
            default:
                break;
        }
    }
}
