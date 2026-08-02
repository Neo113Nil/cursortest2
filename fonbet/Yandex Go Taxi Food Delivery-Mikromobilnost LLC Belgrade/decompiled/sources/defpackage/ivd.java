package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementTappedSource;
import java.util.List;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class ivd extends ad5 {
    public final x A;
    public final gvd B;
    public final pwy0 C;
    public final f580 D;
    public final aqj0 E;
    public final wiq0 F;
    public final iev0 G;
    public final r0 H;
    public final tt2 x;
    public final yvf0 y;
    public final oep0 z;

    public ivd(tt2 tt2Var, yvf0 yvf0Var, oep0 oep0Var, x xVar, gvd gvdVar, pwy0 pwy0Var, f580 f580Var, aqj0 aqj0Var, wiq0 wiq0Var, iev0 iev0Var) {
        super(hvd.class);
        this.x = tt2Var;
        this.y = yvf0Var;
        this.z = oep0Var;
        this.A = xVar;
        this.B = gvdVar;
        this.C = pwy0Var;
        this.D = f580Var;
        this.E = aqj0Var;
        this.F = wiq0Var;
        this.G = iev0Var;
        this.H = bvf0.c(null);
    }

    public final boolean Kg(pud pudVar) {
        String str = pudVar.f;
        idj0 idj0Var = pudVar.g;
        if (idj0Var != null) {
            if (this.E.a.i("pref_usage_count_".concat(str), 0) < idj0Var.b.a) {
                return true;
            }
        }
        return false;
    }

    public final void Lg(List list, pud pudVar, gmw0 gmw0Var, mi31 mi31Var) {
        int i = pudVar.a;
        if (mi31Var == null) {
            return;
        }
        ejj0 ejj0Var = (ejj0) a.S(i, list);
        String str = ejj0Var != null ? ejj0Var.a : null;
        String str2 = gmw0Var.c;
        boolean z = str != null;
        String str3 = mi31Var.f;
        String str4 = mi31Var.b;
        String str5 = mi31Var.g;
        iev0 iev0Var = this.G;
        iev0Var.getClass();
        iev0Var.b(str2, SummaryAnalytics$RequirementTappedSource.Glued, z, str, new t450(i), str3, str4, str5);
    }
}
