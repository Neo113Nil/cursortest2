package defpackage;

import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.VerticalTariffDto;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes14.dex */
public final class hcu {
    public final ecu a;
    public final ck31 b;

    public hcu(ecu ecuVar, ck31 ck31Var) {
        this.a = ecuVar;
        this.b = ck31Var;
    }

    public final void a(SummaryRedirectActionModel summaryRedirectActionModel, oa31 oa31Var, m1s0 m1s0Var) {
        boolean l;
        String str = summaryRedirectActionModel.a;
        if (str.length() <= 0) {
            str = null;
        }
        String str2 = summaryRedirectActionModel.b;
        String str3 = str2.length() > 0 ? str2 : null;
        ecu ecuVar = this.a;
        if (str3 == null) {
            if (str != null) {
                b(str, m1s0Var);
                return;
            }
            ecuVar.getClass();
            jst.e.n("Shortcuts.HeaderSummaryRedirect.InvalidRedirectParameters");
            m1s0Var.a();
            return;
        }
        if (oa31Var != null) {
            String str4 = oa31Var.g;
            yw01 d = eja1.d("", ((k) this.b).j().a);
            Iterator it = d.a.iterator();
            while (it.hasNext()) {
                mi31 mi31Var = (mi31) d.b.invoke(it.next());
                if (oa31Var.c()) {
                    List list = oa31Var.f;
                    l = false;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (jl40.l(((VerticalTariffDto) it2.next()).a, mi31Var.a.b)) {
                                l = true;
                                break;
                            }
                        }
                    }
                } else {
                    l = jl40.l(str4, mi31Var.a.b);
                }
                if (l) {
                    boolean C = gwk0.C(oa31Var, str);
                    String str5 = oa31Var.a;
                    if (C) {
                        m1s0Var.b(str5, str);
                        return;
                    } else {
                        m1s0Var.b(str5, str4);
                        return;
                    }
                }
            }
        }
        ecuVar.getClass();
        jst.e.n("Shortcuts.HeaderSummaryRedirect.UnavailableVertical(vertical_id: " + str3 + Extension.C_BRAKE);
        if (str != null) {
            b(str, m1s0Var);
        } else {
            m1s0Var.a();
        }
    }

    public final void b(String str, m1s0 m1s0Var) {
        yw01 d = eja1.d("", ((k) this.b).j().a);
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            if (jl40.l(((mi31) d.b.invoke(it.next())).a.b, str)) {
                h1s0 h1s0Var = m1s0Var.a.d;
                fcj0 fcj0Var = new fcj0(m1s0Var.b);
                fcj0Var.c = str;
                fcj0Var.d = m1s0Var.c;
                fcj0Var.e = SelectionOrigin.ACTION;
                h1s0Var.b(new k9s0(fcj0Var));
                return;
            }
        }
        this.a.getClass();
        jst.e.n("Shortcuts.HeaderSummaryRedirect.UnavailableTariffClass(tariff_class: " + str + ", vertical_id: null");
        m1s0Var.a();
    }
}
