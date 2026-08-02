package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.List;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class kdr {
    public final x a;
    public final g0g b;
    public final oep0 c;
    public final wiq0 d;
    public final qqo e;

    public kdr(x xVar, g0g g0gVar, oep0 oep0Var, wiq0 wiq0Var, rqo rqoVar) {
        this.a = xVar;
        this.b = g0gVar;
        this.c = oep0Var;
        this.d = wiq0Var;
        this.e = ((jbh) rqoVar).c(new wvd(0));
    }

    public final boolean a(gmw0 gmw0Var, int i) {
        List c = this.a.c(gmw0Var);
        if (i < 0 || i >= gmw0Var.t.a.size()) {
            return false;
        }
        fnx0 n = ((k) this.d).n();
        mi31 mi31Var = n != null ? n.a : null;
        if (mi31Var == null) {
            xby.l(jst.e, "Summary:Requirement:OptionSelection:Modal:Show", null, null, "Selected tariff is null", 6);
            return false;
        }
        ((pep0) this.c).f((m950) this.b.get(), new wud(mi31Var, gmw0Var, c, i), hxx.a);
        return true;
    }
}
