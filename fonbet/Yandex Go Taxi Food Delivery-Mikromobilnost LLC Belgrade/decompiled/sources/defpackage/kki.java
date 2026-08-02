package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes5.dex */
public final class kki {
    public final y5i a;
    public final cpf b;
    public final nki c;
    public final cpi d;

    public kki(y5i y5iVar, cpf cpfVar, nki nkiVar, cpi cpiVar) {
        this.a = y5iVar;
        this.b = cpfVar;
        this.c = nkiVar;
        this.d = cpiVar;
    }

    public final void a() {
        lmw0 g;
        List<rpn> list = this.d.a;
        nki nkiVar = this.c;
        kbi kbiVar = nkiVar.f;
        g580 g580Var = nkiVar.c;
        for (rpn rpnVar : list) {
            pex0 m = ((k) nkiVar.a).m();
            if (m != null && (g = b.g(m, rpnVar.a)) != null) {
                if (g instanceof fmw0) {
                    fmw0 fmw0Var = (fmw0) g;
                    x8 x8Var = (x8) g580Var;
                    x8Var.c(gi.e(fmw0Var.a, fmw0Var.b), true);
                    x8Var.a();
                } else if (g instanceof jmw0) {
                    hvi hviVar = nkiVar.d;
                    hviVar.getClass();
                    hvi.c(hviVar, "DeliveryDetailsCard.SelectorButton.Effect");
                    jvi jviVar = nkiVar.e;
                    r0 r0Var = jviVar.a;
                    jviVar.b = (ivi) r0Var.getValue();
                    r0Var.l(ivi.d);
                    ((pep0) nkiVar.g).f((m950) nkiVar.b.get(), new bpi(kbiVar.c(g.getName()), kbiVar.b(g.getName()), g.getName(), true), hxx.a);
                }
            }
        }
    }
}
