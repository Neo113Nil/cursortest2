package xsna;

import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsGetCheckoutUrlIntegrationTypeDto;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.feature.state.ExternalOrderState;
import com.vk.internal.api.GsonHolder;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a7f0;
import xsna.ey9;
import xsna.gzp0;
import xsna.lx9;
import xsna.px9;
import xsna.rv9;

/* compiled from: CartFeature.kt */
/* loaded from: classes18.dex */
public final class vw9 extends wk50<com.vk.ecomm.cart.impl.cart.a, oy9, rv9, px9> {
    public final mzp0 f;
    public final f4z g;
    public final f4z h;
    public final ey9 i;
    public final mj50<oy9, rv9, px9> j;
    public final mj50<oy9, rv9, px9> k;

    /* compiled from: CartFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExternalOrderState.NavigateTo.values().length];
            try {
                iArr[ExternalOrderState.NavigateTo.MARKET_MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExternalOrderState.NavigateTo.ORDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExternalOrderState.NavigateTo.BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vw9(cy9 cy9Var, zvm0 zvm0Var, mzp0 mzp0Var) {
        super(null, cy9Var);
        this.f = mzp0Var;
        f4z f4zVar = new f4z();
        this.g = f4zVar;
        f4z f4zVar2 = new f4z();
        this.h = f4zVar2;
        ey9 ey9Var = new ey9(new yd10(), new k9q0(), new m0());
        this.i = ey9Var;
        this.j = O(new fid0(f4zVar, ey9Var, f4zVar2));
        this.k = O(new cpg(f4zVar, ey9Var, zvm0Var, f4zVar2));
    }

    public static void V(vw9 vw9Var, oy9 oy9Var, mzp0 mzp0Var, izs izsVar, int i) {
        if ((i & 2) != 0) {
            mzp0Var = null;
        }
        boolean z = (i & 4) == 0;
        if ((i & 8) != 0) {
            izsVar = new la2(7);
        }
        if (oy9Var.f || oy9Var.h) {
            return;
        }
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        ey9 ey9Var = vw9Var.i;
        UserId userId = oy9Var.b;
        a7f0.a.f(vw9Var, rsg0.w0(yfb.x(ey9Var.a.h(0, 5, 5, userId != null ? Integer.valueOf((int) userId.b) : null))).l(new b8(new xv2(ey9Var.c), 8)), new z14(mzp0Var, izsVar, vw9Var, 4), new uw9(mzp0Var, z, vw9Var, 0), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wk50
    public final void N(oy9 oy9Var, rv9 rv9Var) {
        io.reactivex.rxjava3.core.x b;
        ExternalOrderState.NavigateTo navigateTo;
        oy9 oy9Var2 = oy9Var;
        rv9 rv9Var2 = rv9Var;
        Integer num = 5;
        LinkedHashMap<UserId, Cart> linkedHashMap = oy9Var2.c;
        boolean z = rv9Var2 instanceof rv9.c;
        ey9 ey9Var = this.i;
        r9 = 0;
        int i = 0;
        f4z f4zVar = this.g;
        if (z) {
            ExternalOrderState externalOrderState = oy9Var2.j;
            if (externalOrderState != null && (navigateTo = externalOrderState.d) != ExternalOrderState.NavigateTo.BACK) {
                int i2 = a.$EnumSwitchMapping$0[navigateTo.ordinal()];
                if (i2 == 1) {
                    f4zVar.b(lx9.g.a);
                } else if (i2 == 2) {
                    f4zVar.b(lx9.h.a);
                } else if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new px9.j(null));
                return;
            }
            if (linkedHashMap.isEmpty() || oy9Var2.e != null) {
                U(oy9Var2);
                return;
            }
            UserId userId = oy9Var2.i;
            if (userId == null) {
                T(px9.e.C3537e.b);
                V(this, oy9Var2, null, null, 14);
                return;
            } else {
                if (oy9Var2.f || oy9Var2.h) {
                    return;
                }
                a7f0.a.f(this, rsg0.w0(yfb.x(ey9Var.a.h(0, 1, num, Integer.valueOf((int) userId.b)))).l(new b8(new xv2(ey9Var.c), 8)), new hb(this, 16), new com.vk.movika.sdk.base.observable.c(this, 18), 1);
                return;
            }
        }
        if (rv9Var2 instanceof rv9.k) {
            U(oy9Var2);
            return;
        }
        if (rv9Var2 instanceof rv9.j) {
            T(px9.e.C3537e.b);
            V(this, oy9Var2, null, null, 14);
            return;
        }
        if (rv9Var2 instanceof rv9.d) {
            d990 d990Var = oy9Var2.d;
            if (d990Var.a || !d990Var.c) {
                return;
            }
            T(px9.f.c.b);
            if (!linkedHashMap.isEmpty()) {
                Iterator<Map.Entry<UserId, Cart>> it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (!it.next().getValue().h) {
                        i++;
                    }
                }
            }
            UserId userId2 = oy9Var2.b;
            a7f0.a.f(this, rsg0.w0(yfb.x(ey9Var.a.h(Integer.valueOf(i), num, num, userId2 != null ? Integer.valueOf((int) userId2.b) : null))).l(new b8(new xv2(ey9Var.c), 8)), new com.vk.movika.sdk.base.observable.g(this, 12), new x7(this, 17), 1);
            return;
        }
        if (rv9Var2 instanceof rv9.e) {
            UserId userId3 = ((rv9.e) rv9Var2).b;
            Cart cart = linkedHashMap.get(userId3);
            if (cart != null) {
                int size = cart.b.size();
                T(new px9.g.c(userId3));
                yd10 yd10Var = ey9Var.a;
                Integer valueOf = Integer.valueOf(size);
                yd10Var.getClass();
                tfx tfxVar = new tfx("market.getCart", new io.reactivex.rxjava3.internal.operators.mixed.n(18), new zq(17));
                tfx.n(tfxVar, "group_id", userId3, 0L, 0L, 8);
                tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 8);
                tfxVar.f(num.intValue(), 0, 100, "count");
                a7f0.a.f(this, rsg0.w0(yfb.x(tfxVar)).l(new c8(new com.vk.movika.sdk.base.observable.a(userId3, 16), 4)), new du0(4, this, userId3), new qb6(1, this, userId3), 1);
                return;
            }
            return;
        }
        if (!(rv9Var2 instanceof rv9.g)) {
            if (rv9Var2 instanceof rv9.b) {
                f4zVar.b(lx9.c.a);
                return;
            }
            if (rv9Var2 instanceof rv9.a) {
                this.k.a(oy9Var2, rv9Var2);
                return;
            }
            if (rv9Var2 instanceof rv9.i) {
                this.j.a(oy9Var2, rv9Var2);
                return;
            }
            if (!(rv9Var2 instanceof rv9.f)) {
                if (!(rv9Var2 instanceof rv9.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new lx9.f(((rv9.h) rv9Var2).b));
                return;
            } else {
                ExternalOrderState.MiniAppOrderResponse miniAppOrderResponse = (ExternalOrderState.MiniAppOrderResponse) GsonHolder.a().fromJson(String.valueOf(((rv9.f) rv9Var2).b), ExternalOrderState.MiniAppOrderResponse.class);
                boolean z2 = miniAppOrderResponse.b() == 1;
                String a2 = miniAppOrderResponse.a();
                T(new px9.j(new ExternalOrderState(true, z2, epx.f(a2, "market_main") ? ExternalOrderState.NavigateTo.MARKET_MAIN : epx.f(a2, "orders") ? ExternalOrderState.NavigateTo.ORDERS : ExternalOrderState.NavigateTo.BACK)));
                return;
            }
        }
        rv9.g gVar = (rv9.g) rv9Var2;
        UserId userId4 = gVar.b;
        Cart cart2 = linkedHashMap.get(userId4);
        if (cart2 == null) {
            return;
        }
        Cart.Type type = cart2.j;
        Object[] objArr = type == Cart.Type.OZON;
        new wv9();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = null;
        CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem = new CommonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem(fkq0.e(userId4).b);
        t1q0 t1q0Var = UiTracker.j;
        UiTrackingScreen b2 = t1q0Var.b();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = b2 != null ? b2.a : null;
        UiTrackingScreen uiTrackingScreen = t1q0Var.b;
        if (uiTrackingScreen != null) {
            mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a;
        }
        gzp0.a.c(MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, mobileOfficialAppsCoreNavStat$EventScreen2, CommonMarketStat$TypeRefSource.CART, mobileOfficialAppsCoreNavStat$EventScreen, null, commonMarketStat$TypeMarketplaceTransitionToCheckoutClickItem, 48));
        if (objArr != true) {
            f4zVar.b(new lx9.d(userId4));
            return;
        }
        T(px9.a.b.b);
        ey9Var.getClass();
        if (ey9.a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            MarketIntegrationsGetCheckoutUrlIntegrationTypeDto marketIntegrationsGetCheckoutUrlIntegrationTypeDto = MarketIntegrationsGetCheckoutUrlIntegrationTypeDto.OZON;
            ey9Var.b.getClass();
            tfx tfxVar2 = new tfx("marketIntegrations.getCheckoutUrl", new eq(18), new com.vk.movika.sdk.base.model.history.b(17));
            tfx.o(tfxVar2, "integration_type", marketIntegrationsGetCheckoutUrlIntegrationTypeDto.i(), 0, 0, 12);
            b = rsg0.w0(yfb.x(tfxVar2)).l(new v20(new nt(10), 8));
        } else {
            b = sn.b("getIntegrationCheckoutUrl method called for market order");
        }
        a7f0.a.f(this, b, new nv2(5, this, gVar), new com.vk.movika.sdk.base.observable.a(this, 15), 1);
    }

    public final void U(oy9 oy9Var) {
        CartCounterState cartCounterState = oy9Var.k;
        mzp0 mzp0Var = this.f;
        if (cartCounterState == null) {
            T(px9.e.d.b);
            T(new px9.e.b(true));
            V(this, oy9Var, mzp0Var, null, 12);
        } else if (cartCounterState.b != 0) {
            T(px9.e.d.b);
            V(this, oy9Var, mzp0Var, new ul1(cartCounterState, 14), 4);
            T(new px9.e.b(true));
        } else {
            if (mzp0Var != null) {
                mzp0Var.k("empty_cart");
            }
            T(new px9.e.a(EmptyList.b, 0));
            V(this, oy9Var, null, new com.vk.movika.sdk.base.observable.e(cartCounterState, 17), 2);
            T(new px9.e.b(false));
        }
    }
}
