package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.feature.state.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.aw9;

/* compiled from: CheckoutReducer.kt */
/* loaded from: classes18.dex */
public final class w7c extends dm50<o9c, aw9, w8c> {
    public final com.vk.ecomm.cart.impl.checkout.feature.state.b d;
    public final FieldKey e;

    /* compiled from: CheckoutFormStructure.kt */
    public static final class a implements wzs<String, b7r, b7r> {
        public final /* synthetic */ izs b;

        public a(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.wzs
        public final b7r invoke(String str, b7r b7rVar) {
            b7r b7rVar2;
            b7r b7rVar3 = b7rVar;
            com.vk.ecomm.cart.impl.checkout.feature.state.g gVar = (com.vk.ecomm.cart.impl.checkout.feature.state.g) (!(b7rVar3 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.g) ? null : b7rVar3);
            return (gVar == null || (b7rVar2 = (b7r) this.b.invoke(gVar)) == null) ? b7rVar3 : b7rVar2;
        }
    }

    public w7c(w8c w8cVar, r4c r4cVar) {
        super(w8cVar);
        this.d = new com.vk.ecomm.cart.impl.checkout.feature.state.b(r4cVar);
        this.e = new FieldKey("order_list", "order_list", null, null, 12, null);
    }

    @Override // xsna.dm50
    public final w8c c(w8c w8cVar, aw9 aw9Var) {
        b7r b7rVar;
        w8c w8cVar2;
        LinkedHashMap<String, b7r> b;
        String str;
        b7r b7rVar2;
        w8c w8cVar3;
        int i;
        LinkedHashMap<String, b7r> b2;
        String str2;
        b7r b7rVar3;
        w8c w8cVar4 = w8cVar;
        aw9 aw9Var2 = aw9Var;
        com.vk.ecomm.cart.impl.checkout.feature.state.f fVar = w8cVar4.g;
        if (aw9Var2 instanceof aw9.c) {
            aw9.c cVar = (aw9.c) aw9Var2;
            if (cVar instanceof aw9.c.b) {
                return w8c.a(w8cVar4, null, true, false, null, false, null, null, 499);
            }
            if (cVar instanceof aw9.c.a) {
                return w8c.a(w8cVar4, ((aw9.c.a) cVar).b, false, false, null, false, null, null, 499);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (aw9Var2 instanceof aw9.e) {
            return w8c.a(w8cVar4, null, false, true, null, false, null, null, 495);
        }
        if (!(aw9Var2 instanceof aw9.b)) {
            if (aw9Var2 instanceof aw9.a) {
                aw9.a aVar = (aw9.a) aw9Var2;
                if (aVar instanceof aw9.a.C2577a) {
                    return w8c.a(w8cVar4, null, false, false, null, false, null, null, 447);
                }
                if (aVar instanceof aw9.a.b) {
                    return w8c.a(w8cVar4, null, false, false, null, true, null, null, 447);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (aw9Var2 instanceof aw9.j) {
                return w8c.a(w8cVar4, null, false, false, ((aw9.j) aw9Var2).b, true, null, null, 415);
            }
            if (aw9Var2 instanceof aw9.d) {
                aw9.d dVar = (aw9.d) aw9Var2;
                if (dVar instanceof aw9.d.b) {
                    return i(w8cVar4, new com.vk.movika.sdk.base.observable.s(14));
                }
                if (dVar instanceof aw9.d.c) {
                    return i(w8cVar4, new mz(dVar, 25));
                }
                if (dVar instanceof aw9.d.a) {
                    return i(w8cVar4, new w8(dVar, 19));
                }
                throw new NoWhenBranchMatchedException();
            }
            if (aw9Var2 instanceof aw9.i) {
                ((aw9.i) aw9Var2).getClass();
                return w8c.a(w8cVar4, null, false, false, new com.vk.ecomm.cart.impl.checkout.feature.state.f(fVar.a, false), false, null, null, 479);
            }
            if (!(aw9Var2 instanceof aw9.h)) {
                return aw9Var2 instanceof aw9.g ? w8c.a(w8cVar4, null, false, false, null, false, new q1n0(((aw9.g) aw9Var2).b), null, 307) : aw9Var2 instanceof aw9.f ? w8c.a(w8cVar4, null, false, false, null, false, null, ((aw9.f) aw9Var2).b, 255) : w8cVar4;
            }
            com.vk.ecomm.cart.impl.checkout.feature.state.f a2 = fVar.a();
            FieldKey fieldKey = ((aw9.h) aw9Var2).b;
            String str3 = fieldKey.b;
            String str4 = fieldKey.c;
            LinkedHashMap<String, b7r> b3 = a2.b(str3);
            if (b3 != null && (b7rVar = b3.get(str4)) != null) {
                if (b7rVar instanceof ppg0) {
                    ((ppg0) b7rVar).c.computeIfPresent(fieldKey.d, new a.C0925a(new v7c()));
                } else {
                    c26 c26Var = (c26) (b7rVar instanceof c26 ? b7rVar : null);
                    if (c26Var != null) {
                        b7rVar = c26.d(c26Var);
                    }
                    b3.put(str4, b7rVar);
                }
            }
            s3q0 s3q0Var = s3q0.a;
            return w8c.a(w8cVar4, null, false, false, a2, false, null, null, 479);
        }
        aw9.b bVar = (aw9.b) aw9Var2;
        com.vk.ecomm.cart.impl.checkout.feature.state.f fVar2 = bVar.b;
        for (Map.Entry<String, LinkedHashMap<String, b7r>> entry : fVar.a.entrySet()) {
            String key = entry.getKey();
            for (Map.Entry<String, b7r> entry2 : entry.getValue().entrySet()) {
                String key2 = entry2.getKey();
                b7r value = entry2.getValue();
                int i2 = 23;
                if (value instanceof ppg0) {
                    for (Map.Entry<String, b7r> entry3 : ((ppg0) value).c.entrySet()) {
                        String key3 = entry3.getKey();
                        b7r value2 = entry3.getValue();
                        if (value2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h) {
                            w8cVar3 = w8cVar4;
                            i = i2;
                            FieldKey fieldKey2 = new FieldKey(key, key2, key3, null, 8, null);
                            if (!((com.vk.ecomm.cart.impl.checkout.feature.state.h) value2).d && (b2 = fVar2.b(fieldKey2.b)) != null && (b7rVar3 = b2.get((str2 = fieldKey2.c))) != null) {
                                if (b7rVar3 instanceof ppg0) {
                                    ((ppg0) b7rVar3).c.computeIfPresent(fieldKey2.d, new a.C0925a(new u7c()));
                                } else {
                                    com.vk.ecomm.cart.impl.checkout.feature.state.h hVar = (com.vk.ecomm.cart.impl.checkout.feature.state.h) (!(b7rVar3 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h) ? null : b7rVar3);
                                    if (hVar != null) {
                                        b7rVar3 = com.vk.ecomm.cart.impl.checkout.feature.state.h.d(hVar, null, i);
                                    }
                                    b2.put(str2, b7rVar3);
                                }
                            }
                        } else {
                            w8cVar3 = w8cVar4;
                            i = i2;
                        }
                        i2 = i;
                        w8cVar4 = w8cVar3;
                    }
                    w8cVar2 = w8cVar4;
                } else {
                    w8cVar2 = w8cVar4;
                    if (value instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h) {
                        FieldKey fieldKey3 = new FieldKey(key, key2, null, null, 12, null);
                        if (!((com.vk.ecomm.cart.impl.checkout.feature.state.h) value).d && (b = fVar2.b(fieldKey3.b)) != null && (b7rVar2 = b.get((str = fieldKey3.c))) != null) {
                            if (b7rVar2 instanceof ppg0) {
                                ((ppg0) b7rVar2).c.computeIfPresent(fieldKey3.d, new a.C0925a(new u7c()));
                            } else {
                                com.vk.ecomm.cart.impl.checkout.feature.state.h hVar2 = (com.vk.ecomm.cart.impl.checkout.feature.state.h) (!(b7rVar2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.h) ? null : b7rVar2);
                                if (hVar2 != null) {
                                    b7rVar2 = com.vk.ecomm.cart.impl.checkout.feature.state.h.d(hVar2, null, 23);
                                }
                                b.put(str, b7rVar2);
                            }
                        }
                    }
                }
                w8cVar4 = w8cVar2;
            }
        }
        w8c w8cVar5 = w8cVar4;
        LinkedHashMap<String, b7r> b4 = fVar.b("order_list");
        if (b4 != null && !b4.isEmpty()) {
            fVar2.a.put("order_list", b4);
        }
        return w8c.a(w8cVar5, null, false, bVar.c, bVar.b, false, null, null, 387);
    }

    @Override // xsna.dm50
    public final o9c d() {
        return new o9c(e(new com.vk.movika.sdk.base.observable.o(this, 17)), e(new qb(10)), e(new com.vk.movika.sdk.base.observable.q(this, 20)), e(new tb(this, 28)));
    }

    @Override // xsna.dm50
    public final void h(w8c w8cVar, o9c o9cVar) {
        w8c w8cVar2 = w8cVar;
        o9c o9cVar2 = o9cVar;
        if (w8cVar2.d != null) {
            f(o9cVar2.a, w8cVar2);
            return;
        }
        if (w8cVar2.e) {
            f(o9cVar2.b, w8cVar2);
        } else if (w8cVar2.i != null) {
            f(o9cVar2.d, w8cVar2);
        } else {
            f(o9cVar2.c, w8cVar2);
        }
    }

    public final w8c i(w8c w8cVar, izs<? super com.vk.ecomm.cart.impl.checkout.feature.state.g, com.vk.ecomm.cart.impl.checkout.feature.state.g> izsVar) {
        b7r b7rVar;
        com.vk.ecomm.cart.impl.checkout.feature.state.g invoke;
        com.vk.ecomm.cart.impl.checkout.feature.state.f a2 = w8cVar.g.a();
        FieldKey fieldKey = this.e;
        String str = fieldKey.b;
        String str2 = fieldKey.c;
        LinkedHashMap<String, b7r> b = a2.b(str);
        if (b != null && (b7rVar = b.get(str2)) != null) {
            if (b7rVar instanceof ppg0) {
                ((ppg0) b7rVar).c.computeIfPresent(fieldKey.d, new a.C0925a(new a(izsVar)));
            } else {
                com.vk.ecomm.cart.impl.checkout.feature.state.g gVar = (com.vk.ecomm.cart.impl.checkout.feature.state.g) (!(b7rVar instanceof com.vk.ecomm.cart.impl.checkout.feature.state.g) ? null : b7rVar);
                if (gVar != null && (invoke = izsVar.invoke(gVar)) != null) {
                    b7rVar = invoke;
                }
                b.put(str2, b7rVar);
            }
        }
        return w8c.a(w8cVar, null, false, false, a2, false, null, null, 479);
    }
}
