package defpackage;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class e721 implements vpr {
    public final /* synthetic */ f721 a;

    public e721(f721 f721Var) {
        this.a = f721Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        LinkedHashMap linkedHashMap;
        Object obj2;
        OrderStatusInfo.RidaSearchInfo ridaSearchInfo = (OrderStatusInfo.RidaSearchInfo) obj;
        f721 f721Var = this.a;
        pp5 pp5Var = f721Var.a;
        int i = ridaSearchInfo.a;
        List list = ridaSearchInfo.g;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (true) {
            Long l = null;
            if (!it.hasNext()) {
                break;
            }
            OrderStatusInfo.RidaSearchInfo.BidInfoDto bidInfoDto = (OrderStatusInfo.RidaSearchInfo.BidInfoDto) it.next();
            Long l2 = bidInfoDto.d;
            if (l2 != null) {
                o430 o430Var = e3n.b;
                l = Long.valueOf(e3n.e(kp50.V(l2.longValue(), DurationUnit.SECONDS)));
            }
            long longValue = l != null ? l.longValue() - f721Var.c.Hg() : System.currentTimeMillis();
            long currentTimeMillis = System.currentTimeMillis();
            o430 o430Var2 = e3n.b;
            int i2 = bidInfoDto.e;
            DurationUnit durationUnit = DurationUnit.SECONDS;
            arrayList.add(new oui0(bidInfoDto.a, new zo5(bidInfoDto.b, bidInfoDto.i, bidInfoDto.c, bidInfoDto.f, bidInfoDto.g, bidInfoDto.h), currentTimeMillis, (int) e3n.o(kp50.V((e3n.e(kp50.U(i2, durationUnit)) + longValue) - currentTimeMillis, DurationUnit.MILLISECONDS), durationUnit)));
            f721Var = f721Var;
        }
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo increasePriceInfo = ridaSearchInfo.f;
        r0 r0Var = pp5Var.a;
        if (i >= ((Number) r0Var.getValue()).intValue() && !((Boolean) pp5Var.d.getValue()).booleanValue()) {
            r0Var.m(null, Integer.valueOf(i));
            r0 r0Var2 = pp5Var.b;
            do {
                value = r0Var2.getValue();
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) value;
                linkedHashMap = new LinkedHashMap(linkedHashMap2);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    oui0 oui0Var = (oui0) it2.next();
                    String str = oui0Var.a;
                    zo5 zo5Var = oui0Var.b;
                    Object obj3 = (y1z) linkedHashMap.get(str);
                    String str2 = oui0Var.a;
                    if (obj3 != null) {
                        if (obj3 instanceof u1z) {
                            obj3 = u1z.e((u1z) obj3, zo5Var, 13);
                        } else if (obj3 instanceof w1z) {
                            obj3 = w1z.e((w1z) obj3, zo5Var, 13);
                        } else if (obj3 instanceof v1z) {
                            obj3 = v1z.e((v1z) obj3, zo5Var, 13);
                        } else if (!(obj3 instanceof x1z)) {
                            w511.b();
                            return null;
                        }
                        linkedHashMap.put(str2, obj3);
                    } else {
                        u1z u1zVar = new u1z(str2, zo5Var, oui0Var.c, oui0Var.d);
                        if (n6b1.c(u1zVar)) {
                            linkedHashMap.put(oui0Var.a, u1zVar);
                        }
                    }
                }
                List J0 = a.J0(linkedHashMap2.values());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : J0) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (jl40.l(((y1z) obj4).b(), ((oui0) obj2).a)) {
                            break;
                        }
                    }
                    if (obj2 == null) {
                        arrayList2.add(obj4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        y1z y1zVar = (y1z) it4.next();
                        if (y1zVar instanceof u1z) {
                            u1z u1zVar2 = (u1z) y1zVar;
                            linkedHashMap.put(u1zVar2.a, pp5.a(u1zVar2));
                        } else if (y1zVar instanceof w1z) {
                            w1z w1zVar = (w1z) y1zVar;
                            linkedHashMap.put(w1zVar.a, (w1z) (y1zVar instanceof u1z ? u1z.e((u1z) y1zVar, null, 7) : y1zVar instanceof v1z ? v1z.e((v1z) y1zVar, null, 7) : w1z.e(w1zVar, null, 7)));
                        } else if (!(y1zVar instanceof x1z) && !(y1zVar instanceof v1z)) {
                            w511.b();
                            return null;
                        }
                    }
                }
            } while (!r0Var2.k(value, linkedHashMap));
            pp5Var.c.l(increasePriceInfo);
        }
        return zy11.a;
    }
}
