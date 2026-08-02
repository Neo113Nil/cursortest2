package defpackage;

import com.yandex.go.layers.api.model.Action;
import com.yandex.go.navigation.base.a;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.common_models.net.map_object.i0;

/* loaded from: classes12.dex */
public final class enw implements xsd0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ enw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                zy11 zy11Var = zy11.a;
                Object obj = null;
                pm00 pm00Var = wsd0Var instanceof pm00 ? (pm00) wsd0Var : null;
                if (pm00Var != null && pm00Var.g != Action.SERVER_SELECTION) {
                    String str = pm00Var.b;
                    fnw fnwVar = (fnw) this.b;
                    Iterator it = fnwVar.z.h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((ymw) next).a, str)) {
                                obj = next;
                            }
                        }
                    }
                    fnwVar.F = (ymw) obj;
                    fnw fnwVar2 = (fnw) this.b;
                    fnwVar2.Kg(fnwVar2.F);
                }
                return zy11Var;
            case 1:
                b5p0 b5p0Var = (b5p0) this.b;
                b5p0Var.L.a.g(wsd0Var.getPosition());
                Object y = e.y(b5p0Var.N, continuation);
                return y == CoroutineSingletons.COROUTINE_SUSPENDED ? y : zy11.a;
            default:
                if (wsd0Var instanceof pm00) {
                    xx70 xx70Var = (xx70) this.b;
                    pm00 pm00Var2 = (pm00) wsd0Var;
                    return a.a(xx70Var, (m950) ((sxn0) xx70Var.E).get(), new bbp0(pm00Var2.b, ((i0) pm00Var2.d).a), sy60.Q2, k1j0.a, (ContinuationImpl) continuation);
                }
                hst hstVar = jst.e;
                ke00 a = hstVar.b.a();
                if (a != null && a.b(15)) {
                    a.a(15, null, null, "actionInfo (" + wsd0Var + ", action: " + wsd0Var.getAction() + ") must be MapObjectActionInfo<SelectScootersZoneAction>", hstVar.a);
                }
                return zy11.a;
        }
    }
}
