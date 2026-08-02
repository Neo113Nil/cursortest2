package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class oy8 implements vpr {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public oy8(int i, wg6 wg6Var, tls tlsVar) {
        this.a = 2;
        this.w = wg6Var;
        this.b = i;
        this.c = tlsVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                int intValue = ((Number) pair.getSecond()).intValue();
                if (!booleanValue) {
                    tls tlsVar = (tls) obj3;
                    cy8 cy8Var = (cy8) a.S(intValue % this.b, (List) obj2);
                    tlsVar.invoke(cy8Var != null ? cy8Var.g : null);
                }
                return zy11Var;
            case 1:
                ic21 ic21Var = (ic21) obj;
                int i2 = this.b;
                String str = (String) obj2;
                ru.yandex.taxi.logistics.photocomment.a aVar = (ru.yandex.taxi.logistics.photocomment.a) obj3;
                if (ic21Var instanceof gc21) {
                    gc21 gc21Var = (gc21) ic21Var;
                    aVar.a.b(new jkb0(str, gc21Var.a, gc21Var.b, aVar.d.b(str)), new erv(i2));
                } else if (ic21Var instanceof fc21) {
                    aVar.getClass();
                    aVar.a.b(new hkb0(str, new erv(i2), aVar.d.b(str)), new erv(i2));
                } else {
                    if (!(ic21Var instanceof ec21)) {
                        w511.b();
                        return null;
                    }
                    ec21 ec21Var = (ec21) ic21Var;
                    aVar.a.b(new ikb0(str, aVar.d.b(str), ec21Var.a, ec21Var.b), new erv(i2));
                }
                return zy11Var;
            case 2:
                int intValue2 = ((Number) obj).intValue();
                wg6 wg6Var = (wg6) obj2;
                if (rfb1.b(wg6Var) != -2 && rfb1.b(wg6Var) != -1 && rfb1.b(wg6Var) != this.b) {
                    ((tls) obj3).invoke(new Integer(intValue2));
                }
                return zy11Var;
            default:
                int i3 = this.b;
                this.b = i3 + 1;
                if (i3 < 0) {
                    w511.w("Index overflow has happened");
                    return null;
                }
                ip8 ip8Var = (ip8) obj;
                if (i3 == 1) {
                    com.yandex.go.order.tariffs_suggest.ui.a aVar2 = (com.yandex.go.order.tariffs_suggest.ui.a) obj3;
                    aVar2.getClass();
                    lb80 Lg = aVar2.Lg(false);
                    if (Lg != null) {
                        yxx0 yxx0Var = (yxx0) aVar2.B.a;
                        String str2 = Lg.a;
                        ArrayList arrayList = Lg.b;
                        String str3 = Lg.c;
                        yxx0Var.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("order_id", str2);
                        hashMap.put("tariff_list", arrayList);
                        yxx0Var.a.a("TaxiOrder.TariffsSuggest.Shown", hashMap, 1, tse0.r("suggest_id", hashMap, str3));
                    }
                }
                ((nb80) obj2).G3(ip8Var);
                return zy11Var;
        }
    }

    public /* synthetic */ oy8(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }

    public oy8(com.yandex.go.order.tariffs_suggest.ui.a aVar, nb80 nb80Var) {
        this.a = 3;
        this.c = aVar;
        this.w = nb80Var;
    }
}
