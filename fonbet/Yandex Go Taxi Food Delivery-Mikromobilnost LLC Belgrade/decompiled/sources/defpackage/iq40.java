package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryTariffUnselected;
import com.yandex.go.tariffcard.experiment.MulticlassTariffsUnavailableTextsExperiment;
import com.yandex.go.taxi.tariffs.repository.SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1;
import com.yandex.go.taxi.tariffs.repository.g;
import java.util.Iterator;
import kotlin.Pair;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes14.dex */
public final class iq40 {
    public final g a;
    public final cjj0 b;
    public final hqj0 c;
    public final dqe0 d;
    public final lw90 e;
    public final dy6 f;
    public final tbx0 g;

    public iq40(g gVar, cjj0 cjj0Var, hqj0 hqj0Var, dqe0 dqe0Var, lw90 lw90Var, dy6 dy6Var, tbx0 tbx0Var) {
        this.a = gVar;
        this.b = cjj0Var;
        this.c = hqj0Var;
        this.d = dqe0Var;
        this.e = lw90Var;
        this.f = dy6Var;
        this.g = tbx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hq40 a(mi31 mi31Var, pex0 pex0Var) {
        Object obj;
        String str;
        String str2;
        Object obj2;
        String str3;
        jn40 jn40Var = mi31Var.a.V;
        if (jn40Var == null || !jn40Var.k) {
            return new hq40();
        }
        MulticlassTariffsUnavailableTextsExperiment multiclassTariffsUnavailableTextsExperiment = (MulticlassTariffsUnavailableTextsExperiment) this.f.b.b();
        if (!multiclassTariffsUnavailableTextsExperiment.b) {
            return new hq40();
        }
        String str4 = mi31Var.b;
        if (pex0Var.u) {
            this.g.c(pex0Var.b, mi31Var, SummaryAnalytics$SummaryTariffUnselected.TariffUnavailable);
            String str5 = pex0Var.D;
            str2 = str5 != null ? str5 : "";
            g gVar = this.a;
            tje.N(gVar.c, null, null, new SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1(gVar, str4, null, pex0Var.b), 3);
            return new hq40(true, str2);
        }
        PaymentMethod$Type a = this.d.a.h().a();
        if (a != null) {
            lw90 lw90Var = this.e;
            lw90Var.getClass();
            boolean equals = lw90.c(lw90Var, null, new n65[0], 3).a(a).equals(xw91.C);
            boolean j = b.j(pex0Var, a);
            if (!equals || !j) {
                this.g.c(pex0Var.b, mi31Var, SummaryAnalytics$SummaryTariffUnselected.UnavailablePaymentMethod);
                String str6 = multiclassTariffsUnavailableTextsExperiment.e;
                if (str6 != null) {
                    if (!d6z.Z(multiclassTariffsUnavailableTextsExperiment, str6)) {
                        str6 = null;
                    }
                    if (str6 != null) {
                        str3 = d6z.Y(multiclassTariffsUnavailableTextsExperiment, str6);
                        str2 = str3 != null ? str3 : "";
                        g gVar2 = this.a;
                        tje.N(gVar2.c, null, null, new SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1(gVar2, str4, null, pex0Var.b), 3);
                        return new hq40(true, str2);
                    }
                }
                str3 = null;
                if (str3 != null) {
                }
                g gVar22 = this.a;
                tje.N(gVar22.c, null, null, new SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1(gVar22, str4, null, pex0Var.b), 3);
                return new hq40(true, str2);
            }
        }
        Iterator it = this.b.c(pex0Var, mi31Var.b, this.d.a.x, this.c.b(), new ddj0(mi31Var.f)).b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Pair pair = (Pair) obj;
            Iterator it2 = mi31Var.a.f().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (jl40.l(((lmw0) obj2).getName(), (String) pair.c())) {
                    break;
                }
            }
            lmw0 lmw0Var = (lmw0) obj2;
            if (lmw0Var != null && lmw0Var.f()) {
                break;
            }
        }
        Pair pair2 = (Pair) obj;
        if (pair2 == null) {
            return new hq40();
        }
        this.g.c(pex0Var.b, mi31Var, SummaryAnalytics$SummaryTariffUnselected.TariffNotCompatibleWithRequirment);
        String str7 = (String) multiclassTariffsUnavailableTextsExperiment.d.get((String) pair2.c());
        if (str7 != null) {
            if (!d6z.Z(multiclassTariffsUnavailableTextsExperiment, str7)) {
                str7 = null;
            }
            if (str7 != null) {
                str = d6z.Y(multiclassTariffsUnavailableTextsExperiment, str7);
                str2 = str != null ? str : "";
                g gVar3 = this.a;
                tje.N(gVar3.c, null, null, new SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1(gVar3, str4, null, pex0Var.b), 3);
                return new hq40(true, str2);
            }
        }
        str = null;
        if (str != null) {
        }
        g gVar32 = this.a;
        tje.N(gVar32.c, null, null, new SelectedMultiTariffsRepositoryImpl$removeClass$$inlined$performOperation$1(gVar32, str4, null, pex0Var.b), 3);
        return new hq40(true, str2);
    }
}
