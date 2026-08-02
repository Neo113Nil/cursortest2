package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.log.L;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.px9;

/* compiled from: CartReducer.kt */
/* loaded from: classes18.dex */
public final class cy9 extends dm50<com.vk.ecomm.cart.impl.cart.a, px9, oy9> {
    public final com.vk.ecomm.cart.impl.cart.feature.state.b d;
    public final bpn0 e;

    public cy9(oy9 oy9Var, sdz sdzVar) {
        super(oy9Var);
        this.d = new com.vk.ecomm.cart.impl.cart.feature.state.b(sdzVar);
        this.e = new bpn0(new nm0(2));
    }

    public static Pair i(Cart cart) {
        int i = cart.i;
        LinkedHashMap<Long, com.vk.ecomm.cart.impl.cart.feature.state.a> linkedHashMap = cart.b;
        return new Pair(cart.a.a, Cart.a(cart, null, null, new d990(linkedHashMap.size() < cart.i, Math.min(i - linkedHashMap.size(), 5), 3), false, 0, 4063));
    }

    public static final void j(cy9 cy9Var, oy9 oy9Var, px9.b bVar, int i) {
        com.vk.ecomm.cart.impl.cart.feature.state.a l = l(oy9Var, bVar.b);
        if (l == null) {
            return;
        }
        m(oy9Var, bVar.b, com.vk.ecomm.cart.impl.cart.feature.state.a.a(l, false, false, l.k + i, 3071));
    }

    public static final void k(oy9 oy9Var, UserId userId, boolean z) {
        Cart cart = oy9Var.c.get(userId);
        if (cart != null) {
            oy9Var.c.replace(userId, Cart.a(cart, null, null, null, z, 0, 3967));
        }
    }

    public static com.vk.ecomm.cart.impl.cart.feature.state.a l(oy9 oy9Var, a.C0919a c0919a) {
        Cart cart = oy9Var.c.get(c0919a.b);
        if (cart != null) {
            return cart.b.get(Long.valueOf(c0919a.a));
        }
        return null;
    }

    public static void m(oy9 oy9Var, a.C0919a c0919a, com.vk.ecomm.cart.impl.cart.feature.state.a aVar) {
        Cart cart = oy9Var.c.get(c0919a.b);
        if (cart != null) {
            cart.b.replace(Long.valueOf(c0919a.a), aVar);
        }
    }

    @Override // xsna.dm50
    public final oy9 c(oy9 oy9Var, px9 px9Var) {
        com.vk.ecomm.cart.impl.cart.feature.state.c cVar;
        Cart a;
        oy9 oy9Var2 = oy9Var;
        px9 px9Var2 = px9Var;
        LinkedHashMap<UserId, Cart> linkedHashMap = oy9Var2.c;
        d990 d990Var = oy9Var2.d;
        if (px9Var2 instanceof px9.e) {
            px9.e eVar = (px9.e) px9Var2;
            if (eVar instanceof px9.e.d) {
                return oy9.a(oy9Var2, null, null, null, null, true, false, false, null, null, null, false, 1959);
            }
            if (eVar instanceof px9.e.C3537e) {
                return oy9.a(oy9Var2, null, null, null, null, false, false, true, null, null, null, false, 1959);
            }
            if (!(eVar instanceof px9.e.a)) {
                if (eVar instanceof px9.e.c) {
                    return oy9.a(oy9Var2, null, null, null, ((px9.e.c) eVar).b, false, false, false, null, null, null, false, 1959);
                }
                if (eVar instanceof px9.e.b) {
                    return oy9.a(oy9Var2, null, null, null, null, false, false, false, null, null, null, ((px9.e.b) eVar).b, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                }
                throw new NoWhenBranchMatchedException();
            }
            px9.e.a aVar = (px9.e.a) eVar;
            List<Cart> list = aVar.b;
            d990 d990Var2 = new d990(list.size() + aVar.c >= 5, 0, 8);
            List<Cart> list2 = list;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                Pair i = i((Cart) it.next());
                linkedHashMap2.put(i.i(), i.j());
            }
            return oy9.a(oy9Var2, null, linkedHashMap2, d990Var2, null, false, false, false, null, null, null, false, 1953);
        }
        if (px9Var2 instanceof px9.h) {
            px9.h hVar = (px9.h) px9Var2;
            oy9 a2 = oy9.a(oy9Var2, null, null, null, null, false, false, false, null, null, null, false, 1831);
            AbstractMap abstractMap = a2.c;
            if (!(hVar instanceof px9.h.a)) {
                if (hVar instanceof px9.h.b) {
                    return a2;
                }
                if (hVar instanceof px9.h.c) {
                    return oy9.a(oy9Var2, null, null, null, null, false, false, false, ((px9.h.c) hVar).b, null, null, false, 1919);
                }
                throw new NoWhenBranchMatchedException();
            }
            Cart cart = ((px9.h.a) hVar).b;
            UserId userId = oy9Var2.i;
            if (cart != null) {
                com.vk.ecomm.cart.impl.cart.feature.state.c cVar2 = cart.a;
                if (epx.f(cVar2.a, userId)) {
                    return a2;
                }
            }
            return a2;
        }
        if (px9Var2 instanceof px9.f) {
            px9.f fVar = (px9.f) px9Var2;
            if (fVar instanceof px9.f.c) {
                return oy9.a(oy9Var2, null, null, d990.a(d990Var, true, false), null, false, false, false, null, null, null, false, 2043);
            }
            if (!(fVar instanceof px9.f.a)) {
                if (fVar instanceof px9.f.b) {
                    return oy9.a(oy9Var2, null, null, d990.a(d990Var, false, true), null, false, false, false, null, null, null, false, 2043);
                }
                throw new NoWhenBranchMatchedException();
            }
            px9.f.a aVar2 = (px9.f.a) fVar;
            ArrayList arrayList = aVar2.b;
            d990 d990Var3 = new d990(arrayList.size() + aVar2.c >= 5, 0, 8);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair i2 = i((Cart) it2.next());
                linkedHashMap3.put(i2.i(), i2.j());
            }
            linkedHashMap.putAll(linkedHashMap3);
            return oy9.a(oy9Var2, null, null, d990Var3, null, false, false, false, null, null, null, false, 1955);
        }
        if (px9Var2 instanceof px9.g) {
            px9.g gVar = (px9.g) px9Var2;
            UserId userId2 = gVar.b;
            Cart cart2 = linkedHashMap.get(userId2);
            if (cart2 != null) {
                d990 d990Var4 = cart2.f;
                if (gVar instanceof px9.g.c) {
                    a = Cart.a(cart2, null, null, d990.a(d990Var4, true, false), false, 0, 4063);
                } else if (gVar instanceof px9.g.b) {
                    LinkedHashMap<Long, com.vk.ecomm.cart.impl.cart.feature.state.a> linkedHashMap4 = cart2.b;
                    int i3 = cart2.i;
                    List<com.vk.ecomm.cart.impl.cart.feature.state.a> list3 = ((px9.g.b) gVar).c;
                    int e = on00.e(c5g.u(list3, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(e);
                    for (Object obj : list3) {
                        linkedHashMap5.put(Long.valueOf(((com.vk.ecomm.cart.impl.cart.feature.state.a) obj).a.a), obj);
                    }
                    linkedHashMap4.putAll(linkedHashMap5);
                    a = Cart.a(cart2, null, null, new d990(linkedHashMap4.size() < i3, Math.min(i3 - linkedHashMap4.size(), 5), 3), false, 0, 4063);
                } else {
                    if (!(gVar instanceof px9.g.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a = Cart.a(cart2, null, null, d990.a(d990Var4, false, true), false, 0, 4063);
                }
                linkedHashMap.replace(userId2, a);
                return oy9Var2;
            }
        } else {
            if (px9Var2 instanceof px9.c) {
                px9.c cVar3 = (px9.c) px9Var2;
                if (cVar3 instanceof px9.c.b) {
                    k(oy9Var2, ((px9.c.b) cVar3).b, true);
                    return oy9Var2;
                }
                if (cVar3 instanceof px9.c.C3536c) {
                    linkedHashMap.remove(((px9.c.C3536c) cVar3).b);
                    return oy9Var2;
                }
                if (!(cVar3 instanceof px9.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                k(oy9Var2, ((px9.c.a) cVar3).b, false);
                return oy9Var2;
            }
            if (px9Var2 instanceof px9.i) {
                px9.i iVar = (px9.i) px9Var2;
                if (iVar instanceof px9.i.b) {
                    px9.i.b bVar = (px9.i.b) iVar;
                    a.C0919a c0919a = bVar.b;
                    com.vk.ecomm.cart.impl.cart.feature.state.a l = l(oy9Var2, c0919a);
                    if (l != null) {
                        m(oy9Var2, c0919a, com.vk.ecomm.cart.impl.cart.feature.state.a.a(l, false, true, 0, 3583));
                    }
                    return oy9.a(oy9Var2, null, null, null, null, false, bVar.c, false, null, null, null, false, 2015);
                }
                if (!(iVar instanceof px9.i.c)) {
                    if (!(iVar instanceof px9.i.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.C0919a c0919a2 = ((px9.i.a) iVar).b;
                    com.vk.ecomm.cart.impl.cart.feature.state.a l2 = l(oy9Var2, c0919a2);
                    if (l2 != null) {
                        m(oy9Var2, c0919a2, com.vk.ecomm.cart.impl.cart.feature.state.a.a(l2, false, false, 0, 3583));
                    }
                    return oy9.a(oy9Var2, null, null, null, null, false, false, false, null, null, null, false, 2015);
                }
                px9.i.c cVar4 = (px9.i.c) iVar;
                a.C0919a c0919a3 = cVar4.b;
                Cart cart3 = linkedHashMap.get(c0919a3.b);
                if (cart3 != null) {
                    int i4 = cart3.i - 1;
                    cart3.b.remove(Long.valueOf(c0919a3.a));
                    linkedHashMap.replace(c0919a3.b, Cart.a(cart3, null, cVar4.c, null, false, i4, 3831));
                }
                return oy9.a(oy9Var2, null, null, null, null, false, false, false, null, null, null, false, 2015);
            }
            if (px9Var2 instanceof px9.b) {
                px9.b bVar2 = (px9.b) px9Var2;
                if (bVar2 instanceof px9.b.a) {
                    j(this, oy9Var2, bVar2, -1);
                    return oy9Var2;
                }
                if (bVar2 instanceof px9.b.c) {
                    j(this, oy9Var2, bVar2, 1);
                    return oy9Var2;
                }
                if (bVar2 instanceof px9.b.d) {
                    return oy9.a(oy9Var2, null, null, null, null, false, true, false, null, null, null, false, 2015);
                }
                if (bVar2 instanceof px9.b.e) {
                    px9.b.e eVar2 = (px9.b.e) bVar2;
                    a.C0919a c0919a4 = eVar2.b;
                    Cart cart4 = linkedHashMap.get(c0919a4.b);
                    if (cart4 != null) {
                        linkedHashMap.replace(c0919a4.b, Cart.a(cart4, null, eVar2.c, null, false, 0, 4087));
                    }
                    m(oy9Var2, c0919a4, eVar2.d);
                    return oy9.a(oy9Var2, null, null, null, null, false, false, false, null, null, null, false, 2015);
                }
                if (!(bVar2 instanceof px9.b.C3535b)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.C0919a c0919a5 = bVar2.b;
                com.vk.ecomm.cart.impl.cart.feature.state.a l3 = l(oy9Var2, c0919a5);
                if (l3 != null) {
                    m(oy9Var2, c0919a5, com.vk.ecomm.cart.impl.cart.feature.state.a.a(l3, false, false, l3.e, 3071));
                }
                return oy9.a(oy9Var2, null, null, null, null, false, false, false, null, null, null, false, 2015);
            }
            if (px9Var2 instanceof px9.k) {
                a.C0919a c0919a6 = ((px9.k) px9Var2).b;
                com.vk.ecomm.cart.impl.cart.feature.state.a l4 = l(oy9Var2, c0919a6);
                if (l4 != null) {
                    m(oy9Var2, c0919a6, com.vk.ecomm.cart.impl.cart.feature.state.a.a(l4, !l4.i, false, 0, 3839));
                    return oy9Var2;
                }
            } else if (px9Var2 instanceof px9.l) {
                UserId userId3 = ((px9.l) px9Var2).b;
                Cart cart5 = linkedHashMap.get(userId3);
                if (cart5 != null && (cVar = cart5.a) != null) {
                    com.vk.ecomm.cart.impl.cart.feature.state.c cVar5 = new com.vk.ecomm.cart.impl.cart.feature.state.c(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f, !cVar.g);
                    Cart cart6 = linkedHashMap.get(userId3);
                    if (cart6 != null) {
                        linkedHashMap.replace(userId3, Cart.a(cart6, cVar5, null, null, false, 0, 4094));
                        return oy9Var2;
                    }
                }
            } else {
                if (!(px9Var2 instanceof px9.d)) {
                    if (px9Var2 instanceof px9.j) {
                        return oy9.a(oy9Var2, null, null, null, null, false, false, false, null, ((px9.j) px9Var2).b, null, false, 1791);
                    }
                    if (!(px9Var2 instanceof px9.a)) {
                        L.G("Unknown patch " + px9Var2);
                        return oy9Var2;
                    }
                    px9.a aVar3 = (px9.a) px9Var2;
                    if (aVar3 instanceof px9.a.b) {
                        return oy9.a(oy9Var2, null, null, null, null, false, true, false, null, null, null, false, 2015);
                    }
                    if (aVar3 instanceof px9.a.C3534a) {
                        return oy9.a(oy9Var2, null, null, null, null, false, false, false, null, null, null, false, 2015);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                UserId userId4 = ((px9.d) px9Var2).b;
                Cart cart7 = linkedHashMap.get(userId4);
                if (cart7 != null) {
                    linkedHashMap.replace(userId4, Cart.a(cart7, null, null, null, false, 0, 4031));
                    return oy9Var2;
                }
            }
        }
        return oy9Var2;
    }

    @Override // xsna.dm50
    public final com.vk.ecomm.cart.impl.cart.a d() {
        return new com.vk.ecomm.cart.impl.cart.a(e(new m7(this, 19)), e(new a60(10)), e(new qm0(5)), e(new zx(this, 13)));
    }

    @Override // xsna.dm50
    public final void h(oy9 oy9Var, com.vk.ecomm.cart.impl.cart.a aVar) {
        oy9 oy9Var2 = oy9Var;
        com.vk.ecomm.cart.impl.cart.a aVar2 = aVar;
        if (oy9Var2.e != null) {
            f(aVar2.a, oy9Var2);
            return;
        }
        if (oy9Var2.f) {
            f(aVar2.b, oy9Var2);
            return;
        }
        LinkedHashMap<UserId, Cart> linkedHashMap = oy9Var2.c;
        if (!linkedHashMap.isEmpty()) {
            Iterator<Map.Entry<UserId, Cart>> it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (!it.next().getValue().h) {
                    f(aVar2.d, oy9Var2);
                    return;
                }
            }
        }
        f(aVar2.c, oy9Var2);
    }
}
