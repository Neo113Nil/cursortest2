package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.ui.dialog.CartCommunityMenuAction;
import com.vk.stat.scheme.CommonMarketStat$TypeEventTypeRemoveItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.collections.builders.ListBuilder;
import xsna.a7f0;
import xsna.b7k0;
import xsna.lx9;
import xsna.px9;
import xsna.rv9;
import xsna.sx9;
import xsna.wk50;

/* compiled from: CommunityActionApplier.kt */
/* loaded from: classes18.dex */
public final class cpg implements oj50<oy9, rv9, px9> {
    public final f4z a;
    public final ey9 b;
    public final zvm0 c;
    public final f4z d;

    public cpg(f4z f4zVar, ey9 ey9Var, zvm0 zvm0Var, f4z f4zVar2) {
        this.a = f4zVar;
        this.b = ey9Var;
        this.c = zvm0Var;
        this.d = f4zVar2;
    }

    @Override // xsna.oj50
    public final void a(final wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        final oy9 oy9Var = (oy9) km50Var;
        rv9 rv9Var = (rv9) kj50Var;
        LinkedHashMap<UserId, Cart> linkedHashMap = oy9Var.c;
        boolean z = rv9Var instanceof rv9.a.e;
        f4z f4zVar = this.a;
        if (z) {
            UserId userId = ((rv9.a.e) rv9Var).b;
            Cart cart = linkedHashMap.get(userId);
            if (cart == null) {
                return;
            }
            Cart.Type type = cart.j;
            ListBuilder e = e43.e();
            Cart.Type type2 = Cart.Type.OZON;
            if (type != type2 && !cart.a.g) {
                e.add(CartCommunityMenuAction.Subscribe);
            }
            if (type != type2) {
                e.add(CartCommunityMenuAction.WriteToSeller);
            }
            e.add(CartCommunityMenuAction.DeleteAll);
            f4zVar.b(new lx9.k(userId, e.g()));
            return;
        }
        if (rv9Var instanceof rv9.a.g) {
            UserId userId2 = ((rv9.a.g) rv9Var).b;
            Cart cart2 = linkedHashMap.get(userId2);
            if (cart2 == null) {
                return;
            }
            lx9.n nVar = new lx9.n(cart2.a.f);
            aVar.b(new px9.h.c(userId2));
            f4zVar.b(nVar);
            return;
        }
        if (rv9Var instanceof rv9.a.b) {
            f4zVar.b(new lx9.a(((rv9.a.b) rv9Var).b));
            return;
        }
        if (rv9Var instanceof rv9.a.C3634a) {
            final rv9.a.C3634a c3634a = (rv9.a.C3634a) rv9Var;
            UserId userId3 = c3634a.b;
            aVar.b(new px9.c.b(userId3));
            this.b.a.getClass();
            tfx tfxVar = new tfx("market.clearCart", new en(24), new io.reactivex.rxjava3.internal.operators.observable.q1(29));
            tfx.n(tfxVar, "group_id", userId3, 1L, 0L, 8);
            a7f0.a.f(aVar, rsg0.w0(yfb.x(tfxVar)).l(new aa6(new dz(4), 3)), new izs() { // from class: xsna.bpg
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    rv9.a.C3634a c3634a2 = rv9.a.C3634a.this;
                    cpg cpgVar = this;
                    wk50.a aVar2 = aVar;
                    if (booleanValue) {
                        Long l = c3634a2.c;
                        UserId userId4 = c3634a2.b;
                        if (l != null) {
                            new wv9().b(new MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem(-userId4.b, CommonMarketStat$TypeEventTypeRemoveItem.ALL, Integer.valueOf((int) c3634a2.c.longValue()), UiTracker.c(), CommonMarketStat$TypeRefSource.CART));
                        }
                        new wv9();
                        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(-userId4.b), null, null, null, 58, null);
                        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.CART;
                        t1q0 t1q0Var = UiTracker.j;
                        UiTrackingScreen b = t1q0Var.b();
                        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = b != null ? b.a : null;
                        UiTrackingScreen b2 = t1q0Var.b();
                        SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b2 != null ? b2.a : null, commonMarketStat$TypeRefSource, mobileOfficialAppsCoreNavStat$EventScreen, null, new com.vk.stat.scheme.m(), 49), 2);
                        UiTracker uiTracker = UiTracker.a;
                        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                        uzp0 uzp0Var = UiTracker.h;
                        uzp0Var.getClass();
                        new bjc(c, b3, uzp0Var.a).q();
                        if (oy9Var.c.get(userId4) != null && (!r1.b.isEmpty())) {
                            cpgVar.d.b(new sx9.a(userId4));
                        }
                        aVar2.b(new px9.c.C3536c(userId4));
                    } else {
                        cpgVar.b(aVar2, c3634a2.b);
                    }
                    return s3q0.a;
                }
            }, new ab6(this, aVar, c3634a, 2), 1);
            return;
        }
        if (!(rv9Var instanceof rv9.a.d)) {
            if (rv9Var instanceof rv9.a.f) {
                rv9.a.f fVar = (rv9.a.f) rv9Var;
                a7f0.a.e(aVar, new io.reactivex.rxjava3.internal.operators.observable.c0(zvm0.h(this.c, fkq0.e(fVar.b), false, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED), new f50(new rh4(8, aVar, fVar), 19), io.reactivex.rxjava3.internal.functions.a.c), null, new apg(this, aVar, fVar, 0), new r9e(this, aVar, fVar, 1), null, 9);
                return;
            } else {
                if (rv9Var instanceof rv9.a.c) {
                    aVar.b(new px9.d(((rv9.a.c) rv9Var).b));
                    return;
                }
                return;
            }
        }
        new wv9();
        UserId userId4 = ((rv9.a.d) rv9Var).b;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(userId4.b), null, null, null, 58, null);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.CART;
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        UiTrackingScreen b = UiTracker.j.b();
        SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b != null ? b.a : null, commonMarketStat$TypeRefSource, c, null, new MobileOfficialAppsMarketStat$TypeMarketTransitionToMarketItem(null, null, null, null, null, 31, null), 48), 2);
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c2, b2, uzp0Var.a).q();
        lx9.e eVar = new lx9.e(userId4);
        aVar.b(new px9.h.c(userId4));
        f4zVar.b(eVar);
    }

    public final void b(wk50.a aVar, UserId userId) {
        this.a.b(new lx9.l(new b7k0.a(tq.h(tlo0.Companion, R.string.ecomm_error_clear_cart))));
        aVar.b(new px9.c.a(userId));
    }

    public final void c(wk50.a aVar, UserId userId) {
        b7k0.a aVar2 = new b7k0.a(tq.h(tlo0.Companion, R.string.ecomm_cart_error_on_subscribe));
        aVar.b(new px9.l(userId));
        this.a.b(new lx9.l(aVar2));
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
