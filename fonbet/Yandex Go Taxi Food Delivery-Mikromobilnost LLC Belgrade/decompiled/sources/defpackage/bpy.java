package defpackage;

import com.yandex.mapkit.geometry.PolylinePosition;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.linked_order.map.LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$safeCollectIn$1;
import ru.yandex.taxi.linked_order.map.p;
import ru.yandex.taxi.map_common.map.o;

/* loaded from: classes5.dex */
public final class bpy implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpy b;

    public /* synthetic */ bpy(cpy cpyVar, int i) {
        this.a = i;
        this.b = cpyVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cpy cpyVar = this.b;
        switch (i) {
            case 0:
                h8l0 h8l0Var = (h8l0) obj;
                PolylinePosition polylinePosition = h8l0Var.b;
                if (polylinePosition != null) {
                    cpyVar.i = polylinePosition;
                }
                g20 g20Var = new g20(h8l0Var);
                cpyVar.j = g20Var;
                cpyVar.k.g(g20Var);
                break;
            default:
                List list = (List) obj;
                cpyVar.getClass();
                cv00 cv00Var = cpyVar.d;
                boolean isEmpty = list.isEmpty();
                pzt0 pzt0Var = cpyVar.l;
                if (!isEmpty) {
                    if (pzt0Var == null || !pzt0Var.isActive()) {
                        p pVar = new p(e.f(((plm) cpyVar.c).c, 0, BufferOverflow.DROP_OLDEST, 1), cpyVar);
                        cpyVar.b.getClass();
                        sjh sjhVar = uyj.a;
                        cpyVar.l = tje.N(cpyVar.a, null, null, new LinkedOrderRouteProgressTracker$startGuideTrackIfNeed$$inlined$safeCollectIn$1(e.F(pVar, o400.a), cpyVar, null), 3);
                    }
                    ((o) cv00Var).g(list, Boolean.TRUE, cpyVar.g, null);
                    break;
                } else {
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    cpyVar.l = null;
                    ((o) cv00Var).d();
                    vwn vwnVar = vwn.a;
                    cpyVar.j = vwnVar;
                    cpyVar.k.g(vwnVar);
                    break;
                }
        }
        return zy11Var;
    }
}
