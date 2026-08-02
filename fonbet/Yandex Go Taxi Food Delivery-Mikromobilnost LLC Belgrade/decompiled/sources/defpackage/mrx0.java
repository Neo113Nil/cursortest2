package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class mrx0 {
    public final ynm0 a;

    public mrx0(ynm0 ynm0Var) {
        this.a = ynm0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
    
        if (r6 == r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        r6 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c8, code lost:
    
        if (r6 == r9) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lrx0 a(List list, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, mi31 mi31Var, boolean z, Map map) {
        Object obj;
        mi31 a;
        mi31 mi31Var2;
        int i;
        int i2;
        int i3 = -1;
        if (mi31Var != null) {
            Iterator it = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (mi31Var.a.J0.a(((mi31) it.next()).a)) {
                    i3 = i4;
                    break;
                }
                i4++;
            }
        }
        krx0 krx0Var = new krx0();
        krx0Var.b = priceUpdate$PriceLoadingState;
        ynm0 ynm0Var = this.a;
        krx0Var.e = ynm0Var.c(((k) ynm0Var.a).m());
        krx0Var.f = map;
        if (mi31Var == null || i3 < 0) {
            krx0Var.c = i3;
            krx0Var.a = list;
            return krx0Var.a();
        }
        pex0 pex0Var = mi31Var.a;
        lrx0 lrx0Var = null;
        if (pex0Var.P) {
            pex0 pex0Var2 = pex0Var.M0;
            mi31Var2 = pex0Var2 != null ? mi31.a(mi31Var, pex0Var2, null, 30) : null;
            a = mi31Var;
        } else {
            yw01 d = pex0Var.t0.d();
            Iterator it2 = d.a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = d.b.invoke(it2.next());
                if (((pex0) obj).P) {
                    break;
                }
            }
            pex0 pex0Var3 = (pex0) obj;
            a = pex0Var3 != null ? mi31.a(mi31Var, pex0Var3, null, 30) : null;
            mi31Var2 = mi31Var;
        }
        if (a != null && mi31Var2 != null) {
            ArrayList arrayList = new ArrayList(list.size() + 1);
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList.add(list.get(i5));
            }
            if (z) {
                arrayList.add(a);
                arrayList.add(mi31Var2);
                i = a == mi31Var ? i3 : i3 + 1;
            } else {
                arrayList.add(mi31Var2);
                arrayList.add(a);
                i = a == mi31Var ? i3 + 1 : i3;
            }
            int size = list.size();
            for (int i6 = i3 + 1; i6 < size; i6++) {
                arrayList.add(list.get(i6));
            }
            krx0Var.d = i2;
            krx0Var.a = arrayList;
            krx0Var.c = i;
            lrx0Var = krx0Var.a();
        }
        if (lrx0Var != null) {
            return lrx0Var;
        }
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.set(i3, mi31Var);
        krx0Var.c = i3;
        krx0Var.a = arrayList2;
        return krx0Var.a();
    }
}
