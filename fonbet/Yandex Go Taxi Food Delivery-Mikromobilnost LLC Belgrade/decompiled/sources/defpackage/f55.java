package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes9.dex */
public abstract class f55 {
    public abstract List a();

    public abstract List b();

    public abstract List c();

    public abstract List d();

    public abstract List e();

    public abstract List f();

    public abstract List g();

    public abstract List h();

    public abstract List i();

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0024, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j() {
        int i;
        int i2;
        int size = i().size();
        List<ren> c = c();
        int i3 = 0;
        if ((c instanceof Collection) && c.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (ren renVar : c) {
                List f = f();
                if (!(f instanceof Collection) || !f.isEmpty()) {
                    Iterator it = f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!evu0.y(renVar.g(), ((xu40) it.next()).b(), false)) {
                                i++;
                                if (i < 0) {
                                    scc.l();
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        int i4 = size + i;
        List d = d();
        if ((d instanceof Collection) && d.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it2 = d.iterator();
            i2 = 0;
            while (it2.hasNext()) {
                if (((sly) it2.next()).a() != null && (i2 = i2 + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
        }
        int size2 = g().size() + h().size() + a().size() + e().size() + b().size() + i4 + i2;
        List f2 = f();
        if (!(f2 instanceof Collection) || !f2.isEmpty()) {
            Iterator it3 = f2.iterator();
            int i5 = 0;
            while (it3.hasNext()) {
                if (!evu0.y(((xu40) it3.next()).a(), TariffOrderFlow.ORDER_FLOW_TAXI_KEY, false) && (i5 = i5 + 1) < 0) {
                    scc.l();
                    throw null;
                }
            }
            i3 = i5;
        }
        return size2 + i3;
    }
}
