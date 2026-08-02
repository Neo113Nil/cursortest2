package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.settings.email.a;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class aue {
    public final CorpAccountFlowExperiment a;
    public final a b;
    public final g c;
    public final h d;

    public aue(CorpAccountFlowExperiment corpAccountFlowExperiment, a aVar, g gVar, h hVar) {
        this.a = corpAccountFlowExperiment;
        this.b = aVar;
        this.c = gVar;
        this.d = hVar;
    }

    public final String a() {
        String str;
        String c = this.b.c();
        if (!evu0.J(c)) {
            return c;
        }
        kj Ig = this.c.a.Ig();
        if (Ig == null || (str = Ig.g) == null) {
            str = "";
        }
        return !evu0.J(str) ? str : "";
    }

    public final String b() {
        String Ig;
        return (this.c.a.Mg() || (Ig = this.d.Ig()) == null || Ig.length() == 0) ? "" : bgb0.c(Ig);
    }

    public final boolean c() {
        CorpAccountFlowExperiment corpAccountFlowExperiment = CorpAccountFlowExperiment.k;
        CorpAccountFlowExperiment corpAccountFlowExperiment2 = this.a;
        if (corpAccountFlowExperiment2 != corpAccountFlowExperiment) {
            return corpAccountFlowExperiment2.b;
        }
        corpAccountFlowExperiment2.getClass();
        return false;
    }
}
