package defpackage;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.PolylineMapObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.map_common.map.k;
import ru.yandex.taxi.map_common.map.o;

/* loaded from: classes6.dex */
public final class bmp0 {
    public final xm00 a;
    public final cv00 b;
    public final b2l0 c;
    public w4e0 d;

    public bmp0(xm00 xm00Var, cv00 cv00Var, b2l0 b2l0Var) {
        this.a = xm00Var;
        this.b = cv00Var;
        this.c = b2l0Var;
    }

    public final void a() {
        w4e0 w4e0Var = this.d;
        if (w4e0Var != null) {
            this.a.o(w4e0Var);
            this.d = null;
        }
    }

    public final void b(List list, boolean z) {
        if (list.isEmpty()) {
            a();
            return;
        }
        if (z) {
            c(((hmp0) a.P(list)).b);
            return;
        }
        List<hmp0> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ycc.r(((hmp0) it.next()).b, arrayList);
        }
        Polyline l = k.l(ru.yandex.taxi.map.utils.a.H(arrayList));
        if (l == null) {
            a();
            return;
        }
        w4e0 w4e0Var = this.d;
        if (w4e0Var == null) {
            this.d = this.a.s(l);
        } else {
            w4e0Var.o(l);
        }
        ArrayList arrayList2 = new ArrayList();
        for (hmp0 hmp0Var : list2) {
            List<zzs> list3 = hmp0Var.b;
            ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
            for (zzs zzsVar : list3) {
                arrayList3.add(hmp0Var.a);
            }
            ycc.r(arrayList3, arrayList2);
        }
        List J = a.J(arrayList2, 1);
        int i = 0;
        for (Object obj : J) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Integer S = q5z.S((String) obj);
            if (S != null) {
                int intValue = S.intValue();
                w4e0 w4e0Var2 = this.d;
                if (w4e0Var2 != null) {
                    w4e0Var2.A(i, intValue);
                }
            }
            i = i2;
        }
        w4e0 w4e0Var3 = this.d;
        if (w4e0Var3 != null) {
            List<Integer> J0 = a.J0(scc.e(J));
            w4e0Var3.t = J0;
            w4e0Var3.s = null;
            ((PolylineMapObject) w4e0Var3.g).setStrokeColors(J0);
        }
    }

    public final void c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                ((o) this.b).g(arrayList, null, new zoy(i3, this), null);
                return;
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            zzs zzsVar = (zzs) next;
            if (i != 0 && i != scc.f(list)) {
                zzs zzsVar2 = (zzs) list.get(i2);
                zzs zzsVar3 = (zzs) list.get(i4);
                boolean z = (ru.yandex.taxi.map.utils.a.j(zzsVar, zzsVar3) + ru.yandex.taxi.map.utils.a.j(zzsVar, zzsVar2)) - ru.yandex.taxi.map.utils.a.j(zzsVar2, zzsVar3) < 1.0f;
                boolean z2 = ru.yandex.taxi.map.utils.a.j(zzsVar, zzsVar2) > 100.0f;
                if (z && !z2) {
                    i3 = 0;
                }
                if (i3 == 0) {
                    i = i2;
                }
                i2 = i;
            }
            if (i3 != 0) {
                arrayList.add(next);
            }
            i = i4;
        }
    }
}
