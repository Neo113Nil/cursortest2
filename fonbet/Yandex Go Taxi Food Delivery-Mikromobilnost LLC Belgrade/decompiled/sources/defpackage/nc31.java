package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.internal.widget.e;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class nc31 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nc31(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        x0v x0vVar;
        int i = this.a;
        Object obj2 = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                rsn rsnVar = (rsn) obj;
                c cVar = (c) obj4;
                Object obj5 = rsnVar.b;
                rc31 rc31Var = (rc31) obj5;
                cVar.O = rc31Var;
                rc31 rc31Var2 = (rc31) rsnVar.a;
                if (!jl40.l(rc31Var2 != null ? rc31Var2.d : null, rc31Var.d)) {
                    cVar.P = false;
                }
                rc31 rc31Var3 = (rc31) obj5;
                ((lc31) obj3).X6(rc31Var2, rc31Var3);
                gyu gyuVar = rc31Var3.d;
                if (gyuVar != null && (x0vVar = gyuVar.a) != null) {
                    cVar.M.a(x0vVar.a);
                }
                return obj2;
            case 1:
                wg6 wg6Var = (wg6) obj4;
                dh31 dh31Var = (dh31) obj3;
                gi31 gi31Var = (gi31) obj;
                if (jl40.l(gi31Var, fi31.a)) {
                    dtr0 dtr0Var = dh31Var.a.b;
                    Object d = dtr0Var == null ? obj2 : com.yandex.go.design.compose.modal.bottomsheet.c.d(wg6Var, dtr0Var.a, continuation);
                    if (d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return d;
                    }
                } else {
                    if (!jl40.l(gi31Var, ei31.a)) {
                        w511.b();
                        return null;
                    }
                    dtr0 dtr0Var2 = dh31Var.b.b;
                    Object d2 = dtr0Var2 == null ? obj2 : com.yandex.go.design.compose.modal.bottomsheet.c.d(wg6Var, dtr0Var2.a, continuation);
                    if (d2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return d2;
                    }
                }
                return obj2;
            default:
                Map map = (Map) obj;
                boolean z = !jl40.l(map.get("instant_reload"), "true");
                e eVar = (e) obj4;
                v351 v351Var = eVar.f;
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.remove("instant_reload");
                v351Var.a(linkedHashMap);
                eVar.a((tse) obj3, z);
                return obj2;
        }
    }
}
