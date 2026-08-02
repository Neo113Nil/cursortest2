package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class v50 {
    public final ds1 a;
    public final os1 b;
    public final j50 c;
    public final ls1 d;

    public v50(ds1 ds1Var, os1 os1Var, j50 j50Var, ls1 ls1Var) {
        this.a = ds1Var;
        this.b = os1Var;
        this.c = j50Var;
        this.d = ls1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113 A[LOOP:2: B:39:0x010d->B:41:0x0113, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u50 a(b80 b80Var, j80 j80Var) {
        List list;
        List list2;
        List list3;
        EmptyList emptyList;
        Iterator it;
        h50 h50Var;
        Object obj;
        a50 y40Var;
        Iterator it2;
        if (j80Var == null || (list = j80Var.g) == null) {
            list = EmptyList.b;
        }
        m50 m50Var = b80Var.a;
        t80 t80Var = b80Var.b;
        b40 b40Var = new b40(j80Var != null ? j80Var.a : null, j80Var != null ? j80Var.d : null, j80Var != null ? j80Var.c : null);
        List<cs1> list4 = b80Var.c;
        ArrayList a = this.b.a(list);
        if (!a.isEmpty()) {
            list4 = a;
        }
        ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
        for (cs1 cs1Var : list4) {
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (epx.f(((g80) obj).b, cs1Var.a)) {
                    break;
                }
            }
            g80 g80Var = (g80) obj;
            this.a.getClass();
            boolean a2 = ds1.a(cs1Var);
            this.d.getClass();
            List list5 = cs1Var.d;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    if (!((bs1) it4.next()).c) {
                        List list6 = cs1Var.d;
                        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                            Iterator it5 = list6.iterator();
                            while (it5.hasNext()) {
                                if (((bs1) it5.next()).c) {
                                    es1 es1Var = es1.b;
                                    y40Var = new y40();
                                    break;
                                }
                            }
                        }
                        y40Var = z40.a;
                        a50 a50Var = y40Var;
                        String str = cs1Var.a;
                        String str2 = g80Var == null ? g80Var.c : null;
                        bs1 bs1Var = (bs1) j5g.a0(cs1Var.d);
                        String str3 = bs1Var == null ? bs1Var.b : null;
                        String str4 = g80Var == null ? g80Var.f : null;
                        String str5 = cs1Var.c;
                        List list7 = cs1Var.d;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list7, 10));
                        it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((bs1) it2.next()).a);
                        }
                        arrayList.add(new b50(str, str2, a2, str3, str4, str5, a50Var, arrayList2));
                    }
                }
            }
            y40Var = x40.a;
            a50 a50Var2 = y40Var;
            String str6 = cs1Var.a;
            if (g80Var == null) {
            }
            bs1 bs1Var2 = (bs1) j5g.a0(cs1Var.d);
            if (bs1Var2 == null) {
            }
            if (g80Var == null) {
            }
            String str52 = cs1Var.c;
            List list72 = cs1Var.d;
            ArrayList arrayList22 = new ArrayList(c5g.u(list72, 10));
            it2 = list72.iterator();
            while (it2.hasNext()) {
            }
            arrayList.add(new b50(str6, str2, a2, str3, str4, str52, a50Var2, arrayList22));
        }
        d50 d50Var = new d50(arrayList);
        t50 t50Var = b80Var.d;
        u70 u70Var = b80Var.e;
        if (j80Var == null || (list2 = j80Var.f) == null) {
            list2 = EmptyList.b;
        }
        j50 j50Var = this.c;
        List list8 = j80Var != null ? j80Var.e : null;
        j50Var.getClass();
        if (list8 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list8) {
                g50 g50Var = (g50) obj2;
                if (g50Var.a != null || g50Var.b != null) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                g50 g50Var2 = (g50) it6.next();
                String str7 = g50Var2.a;
                String str8 = g50Var2.b;
                h50[] values = h50.values();
                int length = values.length;
                List list9 = list2;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        it = it6;
                        h50Var = null;
                        break;
                    }
                    int i2 = length;
                    h50Var = values[i];
                    int i3 = i;
                    it = it6;
                    if (epx.f(g50Var2.c, h50Var.b)) {
                        break;
                    }
                    i = i3 + 1;
                    it6 = it;
                    length = i2;
                }
                if (h50Var == null) {
                    h50Var = h50.c;
                }
                arrayList4.add(new i50(str7, str8, h50Var));
                list2 = list9;
                it6 = it;
            }
            list3 = list2;
            emptyList = arrayList4;
        } else {
            list3 = list2;
            emptyList = EmptyList.b;
        }
        return new u50(m50Var, t80Var, b40Var, d50Var, t50Var, u70Var, list3, emptyList);
    }
}
