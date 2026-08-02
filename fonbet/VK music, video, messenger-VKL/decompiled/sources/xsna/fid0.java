package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.stat.scheme.CommonMarketStat$TypeEventTypeAddItem;
import com.vk.stat.scheme.CommonMarketStat$TypeEventTypeRemoveItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeAddItemToCart;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import xsna.a7f0;
import xsna.b7k0;
import xsna.lx9;
import xsna.px9;
import xsna.rv9;
import xsna.sx9;
import xsna.wk50;

/* compiled from: ProductActionApplier.kt */
/* loaded from: classes18.dex */
public final class fid0 implements oj50<oy9, rv9, px9> {
    public final f4z a;
    public final ey9 b;
    public final f4z c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();

    public fid0(f4z f4zVar, ey9 ey9Var, f4z f4zVar2) {
        this.a = f4zVar;
        this.b = ey9Var;
        this.c = f4zVar2;
    }

    public static com.vk.ecomm.cart.impl.cart.feature.state.a c(oy9 oy9Var, a.C0919a c0919a) {
        Cart cart = oy9Var.c.get(c0919a.b);
        if (cart != null) {
            return cart.b.get(Long.valueOf(c0919a.a));
        }
        return null;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        oy9 oy9Var = (oy9) km50Var;
        rv9 rv9Var = (rv9) kj50Var;
        boolean z = oy9Var.g;
        boolean z2 = rv9Var instanceof rv9.i.b;
        f4z f4zVar = this.a;
        if (z2) {
            a.C0919a c0919a = ((rv9.i.b) rv9Var).b;
            com.vk.ecomm.cart.impl.cart.feature.state.a c = c(oy9Var, c0919a);
            if (c == null) {
                return;
            }
            if (c.f) {
                f4zVar.b(new lx9.b(c0919a, !c.i));
                return;
            } else {
                aVar.a(new rv9.i.g(c0919a));
                return;
            }
        }
        if (rv9Var instanceof rv9.i.g) {
            b(aVar, oy9Var, ((rv9.i.g) rv9Var).b);
            return;
        }
        if (rv9Var instanceof rv9.i.e) {
            a.C0919a c0919a2 = ((rv9.i.e) rv9Var).b;
            com.vk.ecomm.cart.impl.cart.feature.state.a c2 = c(oy9Var, c0919a2);
            if (c2 != null) {
                f4zVar.b(new lx9.m(c0919a2, c2.i));
                aVar.b(new px9.k(c0919a2));
            }
            aVar.b(new px9.i.b(c0919a2, false));
            return;
        }
        if (rv9Var instanceof rv9.i.d) {
            rv9.i.d dVar = (rv9.i.d) rv9Var;
            if (!z) {
                wv9 wv9Var = new wv9();
                a.C0919a c0919a3 = dVar.b;
                wv9Var.b(new MobileOfficialAppsMarketStat$TypeAddItemToCart(-c0919a3.c.b, CommonMarketStat$TypeEventTypeAddItem.SET_ITEM_AMOUNT, Integer.valueOf((int) c0919a3.a), CommonMarketStat$TypeRefSource.CART));
                aVar.b(new px9.b.c(c0919a3));
                com.vk.ecomm.cart.impl.cart.feature.state.a c3 = c(oy9Var, c0919a3);
                if (c3 != null) {
                    d(aVar, c0919a3, c3.k + 1);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (rv9Var instanceof rv9.i.c) {
            rv9.i.c cVar = (rv9.i.c) rv9Var;
            if (!z) {
                wv9 wv9Var2 = new wv9();
                a.C0919a c0919a4 = cVar.b;
                UserId userId = c0919a4.c;
                long j = c0919a4.a;
                long j2 = -userId.b;
                int i = (int) j;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.CART;
                UiTracker uiTracker = UiTracker.a;
                wv9Var2.b(new MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem(j2, CommonMarketStat$TypeEventTypeRemoveItem.SET_ITEM_AMOUNT, Integer.valueOf(i), UiTracker.c(), commonMarketStat$TypeRefSource));
                aVar.b(new px9.b.a(c0919a4));
                com.vk.ecomm.cart.impl.cart.feature.state.a c4 = c(oy9Var, c0919a4);
                if (c4 != null) {
                    d(aVar, c0919a4, c4.k - 1);
                }
            }
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if (rv9Var instanceof rv9.i.a) {
            rv9.i.a aVar2 = (rv9.i.a) rv9Var;
            a.C0919a c0919a5 = aVar2.b;
            com.vk.ecomm.cart.impl.cart.feature.state.a c5 = c(oy9Var, c0919a5);
            long j3 = c0919a5.a;
            if (c5 == null) {
                return;
            }
            int i2 = c5.e - c5.k;
            int i3 = 6;
            ey9 ey9Var = this.b;
            io.reactivex.rxjava3.core.x<Boolean> b = i2 > 0 ? ey9Var.b(c0919a5, Math.abs(i2)) : i2 < 0 ? rsg0.w0(yfb.x(ey9Var.a.a(c0919a5.c, (int) j3, Math.abs(i2), null, null, null))).l(new fq1(new bz(i3), 4)) : null;
            if (b == null) {
                return;
            }
            String valueOf = String.valueOf(j3);
            StringBuilder sb = new StringBuilder();
            sb.append(j3);
            sb.append(c0919a5.c);
            String sb2 = sb.toString();
            aVar.b(new px9.b.d(c0919a5));
            LinkedHashMap linkedHashMap = this.d;
            io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(valueOf);
            if (cVar2 != null) {
                cVar2.dispose();
            }
            io.reactivex.rxjava3.disposables.c cVar3 = (io.reactivex.rxjava3.disposables.c) linkedHashMap.get(sb2);
            if (cVar3 != null) {
                cVar3.dispose();
            }
            linkedHashMap.put(valueOf, a7f0.a.f(aVar, b, new hoc(this, aVar, aVar2, c5, 2), new bwg(this, aVar, aVar2, i3), 1));
            return;
        }
        if (rv9Var instanceof rv9.i.C3635i) {
            a.C0919a c0919a6 = ((rv9.i.C3635i) rv9Var).b;
            com.vk.ecomm.cart.impl.cart.feature.state.a c6 = c(oy9Var, c0919a6);
            if (c6 != null) {
                f4zVar.b(new lx9.m(c0919a6, c6.i));
                aVar.b(new px9.k(c0919a6));
                return;
            }
            return;
        }
        if (rv9Var instanceof rv9.i.j) {
            a.C0919a c0919a7 = ((rv9.i.j) rv9Var).b;
            com.vk.ecomm.cart.impl.cart.feature.state.a c7 = c(oy9Var, c0919a7);
            if (c7 == null) {
                return;
            }
            f4zVar.b(new lx9.l(new b7k0.a(tq.h(tlo0.Companion, c7.i ? R.string.ecomm_cart_favorite_error_to_add : R.string.ecomm_cart_favorite_error_to_remove))));
            aVar.b(new px9.k(c0919a7));
            if (c7.j) {
                e(aVar, c0919a7);
                return;
            }
            return;
        }
        if (rv9Var instanceof rv9.i.k) {
            rv9.i.k kVar = (rv9.i.k) rv9Var;
            a.C0919a c0919a8 = kVar.b;
            com.vk.ecomm.cart.impl.cart.feature.state.a c8 = c(oy9Var, c0919a8);
            if (c8 == null) {
                return;
            }
            if (c8.j) {
                b(aVar, oy9Var, c0919a8);
            }
            this.c.b(new sx9.b(c0919a8.a, c0919a8.c, kVar.c));
            new wv9().c(kVar.c, c0919a8.c, c0919a8.a, null, null, CommonMarketStat$TypeRefSource.CART);
            return;
        }
        if (rv9Var instanceof rv9.i.f) {
            a.C0919a c0919a9 = ((rv9.i.f) rv9Var).b;
            lx9.j jVar = new lx9.j(c0919a9);
            aVar.b(new px9.h.c(c0919a9.b));
            f4zVar.b(jVar);
            return;
        }
        if (rv9Var instanceof rv9.i.h) {
            a.C0919a c0919a10 = ((rv9.i.h) rv9Var).b;
            com.vk.ecomm.cart.impl.cart.feature.state.a c9 = c(oy9Var, c0919a10);
            UserId userId2 = c0919a10.b;
            if (c9 == null) {
                return;
            }
            lx9.j jVar2 = new lx9.j(new a.C0919a(c9.l, userId2, c0919a10.c));
            aVar.b(new px9.h.c(userId2));
            f4zVar.b(jVar2);
        }
    }

    public final void b(final wk50.a aVar, oy9 oy9Var, final a.C0919a c0919a) {
        LinkedHashMap<Long, com.vk.ecomm.cart.impl.cart.feature.state.a> linkedHashMap;
        com.vk.ecomm.cart.impl.cart.feature.state.a aVar2;
        LinkedHashMap<UserId, Cart> linkedHashMap2 = oy9Var.c;
        UserId userId = c0919a.b;
        long j = c0919a.a;
        Cart cart = linkedHashMap2.get(userId);
        if (cart == null || (aVar2 = (linkedHashMap = cart.b).get(Long.valueOf(j))) == null) {
            return;
        }
        final int max = Integer.max(aVar2.e, aVar2.k);
        if (cart.i <= 1 && linkedHashMap.size() == 1) {
            aVar.a(new rv9.a.C3634a(c0919a.b, Long.valueOf(j)));
        } else {
            aVar.b(new px9.i.b(c0919a, true));
            a7f0.a.f(aVar, this.b.b(c0919a, max), new izs() { // from class: xsna.cid0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    a.C0919a c0919a2 = c0919a;
                    fid0 fid0Var = this;
                    wk50.a aVar3 = aVar;
                    if (booleanValue) {
                        wv9 wv9Var = new wv9();
                        UserId userId2 = c0919a2.c;
                        long j2 = c0919a2.a;
                        long j3 = -userId2.b;
                        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.CART;
                        wv9Var.b(new MobileOfficialAppsMarketStat$TypeRemoveItemFromCartItem(j3, CommonMarketStat$TypeEventTypeRemoveItem.ALL, Integer.valueOf((int) j2), UiTracker.c(), commonMarketStat$TypeRefSource));
                        a7f0.a.f(aVar3, fid0Var.b.a(c0919a2.b), new qd1(29, aVar3, c0919a2), new p83(fid0Var, aVar3, c0919a2, 6), 1);
                        fid0Var.c.b(new sx9.d(c0919a2.c, j2, max));
                    } else {
                        fid0Var.e(aVar3, c0919a2);
                    }
                    return s3q0.a;
                }
            }, new sy4(this, aVar, c0919a, 5), 1);
        }
    }

    public final void d(wk50.a aVar, a.C0919a c0919a, int i) {
        LinkedHashMap linkedHashMap = this.e;
        if (!linkedHashMap.containsKey(c0919a)) {
            io.reactivex.rxjava3.subjects.d N0 = io.reactivex.rxjava3.subjects.d.N0();
            this.d.put("debounce_" + c0919a.a, a7f0.a.e(aVar, N0.y(300L, TimeUnit.MILLISECONDS).h0(Long.MAX_VALUE), null, new lfa(15, aVar, c0919a), null, null, 13));
            linkedHashMap.put(c0919a, N0);
        }
        io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) linkedHashMap.get(c0919a);
        if (dVar != null) {
            dVar.onNext(Integer.valueOf(i));
        }
    }

    public final void e(nj50<? super rv9, ? super px9> nj50Var, a.C0919a c0919a) {
        this.a.b(new lx9.l(new b7k0.a(tq.h(tlo0.Companion, R.string.ecomm_error_remove_product))));
        nj50Var.b(new px9.i.a(c0919a));
    }

    public final void f(wk50.a aVar, a.C0919a c0919a) {
        this.a.b(new lx9.l(new b7k0.a(tq.h(tlo0.Companion, R.string.ecomm_error_change_amount_product))));
        aVar.b(new px9.b.C3535b(c0919a));
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
