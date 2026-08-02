package defpackage;

import android.animation.ValueAnimator;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.map.n;
import ru.yandex.taxi.preorder.source.routeoverlay.a;

/* loaded from: classes6.dex */
public final class m6l0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ m6l0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                u0c0 u0c0Var = (u0c0) obj;
                kdd0 kdd0Var = aVar.Q;
                kdd0Var.d = u0c0Var;
                ((ru.yandex.taxi.preorder.source.points.a) kdd0Var.a).l = u0c0Var;
                aVar.Mg();
                n nVar = aVar.x;
                r0 r0Var = nVar.s;
                p0c0 p0c0Var = u0c0Var.a;
                r0Var.getClass();
                r0Var.m(null, p0c0Var);
                r0 r0Var2 = nVar.t;
                p0c0 p0c0Var2 = u0c0Var.b;
                r0Var2.getClass();
                r0Var2.m(null, p0c0Var2);
                break;
            case 1:
                aVar.Mg();
                break;
            case 2:
                js00 js00Var = (js00) obj;
                for (p190 p190Var : aVar.t0.values()) {
                    ValueAnimator valueAnimator = p190Var.g.c;
                    valueAnimator.cancel();
                    valueAnimator.removeAllUpdateListeners();
                    valueAnimator.removeAllListeners();
                    b2l0 b2l0Var = p190Var.c;
                    b2l0Var.c(js00Var);
                    ylm ylmVar = p190Var.n;
                    if (ylmVar != null) {
                        p190Var.a(ylmVar.c);
                    }
                    w4e0 w4e0Var = p190Var.l;
                    if (w4e0Var != null) {
                        ((zrz0) b2l0Var.f.getValue()).a(w4e0Var);
                    }
                }
                break;
            case 3:
                ArrayList arrayList = aVar.W;
                if (arrayList.size() > 1) {
                    int size = arrayList.size() - 1;
                    aVar.Ug((f4c0) arrayList.get(size), size);
                    aVar.Tg();
                    break;
                }
                break;
            default:
                aVar.n0 = ((Boolean) obj).booleanValue();
                aVar.Ng();
                break;
        }
        return zy11Var;
    }
}
