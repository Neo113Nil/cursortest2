package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.feature.state.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import xsna.a7f0;
import xsna.aw9;
import xsna.g6c;
import xsna.r2c;
import xsna.wk50;

/* compiled from: OrderListActionApplier.kt */
/* loaded from: classes18.dex */
public final class zu80 implements oj50<w8c, r2c, aw9> {
    public final b8c a;
    public final wj50<g6c> b;

    public zu80(c8c c8cVar, f4z f4zVar) {
        this.a = c8cVar;
        this.b = f4zVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        com.vk.ecomm.cart.impl.checkout.feature.state.g gVar;
        b7r b7rVar;
        w8c w8cVar = (w8c) km50Var;
        r2c r2cVar = (r2c) kj50Var;
        if (r2cVar instanceof r2c.s.b) {
            aVar.b(aw9.d.b.b);
            a7f0.a.f(aVar, this.a.b(w8cVar.b, w8cVar.c), new es00(aVar, 15), new iou(aVar, 26), 1);
            return;
        }
        if (r2cVar instanceof r2c.s.c) {
            aVar.a(r2c.s.b.b);
            return;
        }
        if (r2cVar instanceof r2c.s.a) {
            r2c.s.a aVar2 = (r2c.s.a) r2cVar;
            com.vk.ecomm.cart.impl.checkout.feature.state.f fVar = w8cVar.g;
            FieldKey fieldKey = aVar2.b;
            LinkedHashMap<String, b7r> b = fVar.b(fieldKey.b);
            Object obj = null;
            if (b == null || (b7rVar = b.get(fieldKey.c)) == null) {
                gVar = null;
            } else if (b7rVar instanceof ppg0) {
                b7r b7rVar2 = ((ppg0) b7rVar).c.get(fieldKey.d);
                if (!(b7rVar2 instanceof com.vk.ecomm.cart.impl.checkout.feature.state.g)) {
                    b7rVar2 = null;
                }
                gVar = (com.vk.ecomm.cart.impl.checkout.feature.state.g) b7rVar2;
            } else {
                if (!(b7rVar instanceof com.vk.ecomm.cart.impl.checkout.feature.state.g)) {
                    b7rVar = null;
                }
                gVar = (com.vk.ecomm.cart.impl.checkout.feature.state.g) b7rVar;
            }
            if (gVar != null) {
                g.a aVar3 = gVar.b;
                if (aVar3 instanceof g.a.c) {
                    Iterator<T> it = ((g.a.c) aVar3).a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((xw80) next).a == aVar2.c) {
                            obj = next;
                            break;
                        }
                    }
                    xw80 xw80Var = (xw80) obj;
                    if (xw80Var != null) {
                        this.b.b(new g6c.h(xw80Var));
                    }
                }
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
