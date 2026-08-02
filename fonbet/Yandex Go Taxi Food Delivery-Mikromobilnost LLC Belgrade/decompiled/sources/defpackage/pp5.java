package defpackage;

import com.yandex.go.rida.bids.controller.BidsControllerAction;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class pp5 {
    public final r0 a = bvf0.c(0);
    public final r0 b = bvf0.c(new LinkedHashMap());
    public final r0 c = bvf0.c(null);
    public final r0 d = bvf0.c(Boolean.FALSE);

    public static v1z a(u1z u1zVar) {
        return v1z.e(new v1z(u1zVar.a, u1zVar.b, u1zVar.c, u1zVar.d), null, 7);
    }

    public final void b(String str, BidsControllerAction bidsControllerAction) {
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) value;
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
            y1z y1zVar = (y1z) linkedHashMap2.get(str);
            switch (op5.a[bidsControllerAction.ordinal()]) {
                case 1:
                    if (y1zVar instanceof u1z) {
                        u1z u1zVar = (u1z) y1zVar;
                        linkedHashMap.put(str, new w1z(u1zVar.a, u1zVar.b, u1zVar.c, u1zVar.d));
                        break;
                    }
                    break;
                case 2:
                    Boolean bool = Boolean.TRUE;
                    r0 r0Var2 = this.d;
                    r0Var2.getClass();
                    r0Var2.m(null, bool);
                    break;
                case 3:
                    if (y1zVar instanceof w1z) {
                        if (!n6b1.c((ap5) y1zVar)) {
                            w1z w1zVar = (w1z) y1zVar;
                            linkedHashMap.put(str, new v1z(w1zVar.a, w1zVar.b, w1zVar.c, w1zVar.d));
                            break;
                        } else {
                            w1z w1zVar2 = (w1z) y1zVar;
                            linkedHashMap.put(str, new u1z(w1zVar2.a, w1zVar2.b, w1zVar2.c, w1zVar2.d));
                            break;
                        }
                    }
                    break;
                case 4:
                case 5:
                    if (y1zVar instanceof u1z) {
                        linkedHashMap.put(str, a((u1z) y1zVar));
                        break;
                    }
                    break;
                case 6:
                case 7:
                    if (y1zVar instanceof v1z) {
                        linkedHashMap.put(str, new x1z(((v1z) y1zVar).a));
                        break;
                    }
                    break;
                default:
                    w511.b();
                    return;
            }
        } while (!r0Var.k(value, linkedHashMap));
    }
}
