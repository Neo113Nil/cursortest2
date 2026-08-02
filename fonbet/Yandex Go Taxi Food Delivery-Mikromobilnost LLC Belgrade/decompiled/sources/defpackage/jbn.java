package defpackage;

import com.yandex.go.due.experiment.EarlyOptionConfigExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;

/* loaded from: classes14.dex */
public final class jbn implements ibn {
    public final wiq0 a;
    public final dqe0 b;
    public final RequirementsChangedNotifier c;
    public final qqo d;

    public jbn(rqo rqoVar, wiq0 wiq0Var, dqe0 dqe0Var, RequirementsChangedNotifier requirementsChangedNotifier) {
        this.a = wiq0Var;
        this.b = dqe0Var;
        this.c = requirementsChangedNotifier;
        EarlyOptionConfigExperiment.Companion.getClass();
        this.d = ((jbh) rqoVar).c(EarlyOptionConfigExperiment.e);
    }

    public final EarlyOptionConfigExperiment.TariffRule a(String str) {
        Object obj;
        Iterator it = ((EarlyOptionConfigExperiment) this.d.b()).c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((EarlyOptionConfigExperiment.TariffRule) obj).a, str)) {
                break;
            }
        }
        return (EarlyOptionConfigExperiment.TariffRule) obj;
    }

    public final b580 b() {
        EarlyOptionConfigExperiment.TariffRule a;
        Object obj;
        pex0 m = ((k) this.a).m();
        if (m != null && (a = a(m.b)) != null) {
            Iterator it = m.f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((lmw0) obj).getName(), a.b)) {
                    break;
                }
            }
            lmw0 lmw0Var = (lmw0) obj;
            if (lmw0Var != null && (lmw0Var instanceof fmw0)) {
                fmw0 fmw0Var = (fmw0) lmw0Var;
                return gi.e(fmw0Var.a, fmw0Var.b);
            }
        }
        return null;
    }

    public final String c() {
        EarlyOptionConfigExperiment.TariffRule a;
        pex0 m = ((k) this.a).m();
        if (m == null || (a = a(m.b)) == null) {
            return null;
        }
        return a.b;
    }

    public final ArrayList d() {
        List list = ((EarlyOptionConfigExperiment) this.d.b()).c;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EarlyOptionConfigExperiment.TariffRule) it.next()).b);
        }
        return arrayList;
    }

    public final boolean e() {
        if (f()) {
            return false;
        }
        ArrayList d = d();
        List list = this.b.a.x;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (d.contains(((b580) it.next()).a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        String c = c();
        List list = this.b.a.x;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((b580) it.next()).a, c)) {
                return true;
            }
        }
        return false;
    }
}
