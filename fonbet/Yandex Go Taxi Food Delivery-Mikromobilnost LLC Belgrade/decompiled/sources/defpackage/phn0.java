package defpackage;

import com.yandex.go.scooters.api.domain.model.b;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.domain.p;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.a;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.d;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.e;

/* loaded from: classes6.dex */
public final class phn0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ phn0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        CharSequence charSequence;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                ahn0 ahn0Var = (ahn0) obj;
                eVar.getClass();
                zuo0 zuo0Var = ahn0Var.d;
                eVar.b0 = zuo0Var;
                eVar.Ng(zuo0Var);
                p pVar = eVar.D;
                List list = ahn0Var.f;
                r0 r0Var = pVar.a.d;
                b bVar = new b(list);
                r0Var.getClass();
                r0Var.m(null, bVar);
                zgn0 zgn0Var = ahn0Var.h;
                if (zgn0Var instanceof xgn0) {
                    ((nhn0) eVar.Dg()).C0();
                    ((nhn0) eVar.Dg()).F0();
                } else {
                    if (!(zgn0Var instanceof ygn0)) {
                        w511.b();
                        return null;
                    }
                    ygn0 ygn0Var = (ygn0) zgn0Var;
                    x6p0 x6p0Var = ygn0Var.a;
                    boolean z = ygn0Var.b;
                    ((nhn0) eVar.Dg()).T(x6p0Var.b, x6p0Var.c, x6p0Var.a, x6p0Var.e);
                    if (!z && (charSequence = x6p0Var.d) != null) {
                        ((nhn0) eVar.Dg()).S(charSequence);
                    }
                }
                ((nhn0) eVar.Dg()).L2(ahn0Var);
                return zy11Var;
            default:
                Pair pair = (Pair) obj;
                zuo0 zuo0Var2 = (zuo0) pair.getFirst();
                uso0 uso0Var = (uso0) pair.getSecond();
                if (uso0Var != null) {
                    eVar.getClass();
                    hwo0 hwo0Var = uso0Var.a;
                    if (hwo0Var != null) {
                        fgn0 fgn0Var = eVar.V;
                        d dVar = new d(eVar, zuo0Var2);
                        fgn0Var.getClass();
                        iqm0 iqm0Var = new iqm0(null, (String) hwo0Var.b, (FormattedText) hwo0Var.c, (FormattedText) hwo0Var.w, new xpm0((FormattedText) hwo0Var.x, null), null, 169);
                        dgn0 dgn0Var = new dgn0(0, dVar);
                        a aVar = fgn0Var.a;
                        aVar.A((m950) aVar.Q.get(), iqm0Var, dgn0Var);
                    }
                }
                return zy11Var;
        }
    }
}
