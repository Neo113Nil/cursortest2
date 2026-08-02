package defpackage;

import com.yandex.go.quark.impl.dependencies.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class fqt implements eya0, oza0 {
    public final lhg0 a;

    public fqt(lhg0 lhg0Var) {
        this.a = lhg0Var;
    }

    public static ArrayList b(List list) {
        Integer num;
        List<cya0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (cya0 cya0Var : list2) {
            if (jl40.l(cya0Var, sxa0.a)) {
                num = 1;
            } else if (jl40.l(cya0Var, txa0.a)) {
                num = 15;
            } else if (jl40.l(cya0Var, uxa0.a)) {
                num = 2;
            } else if (jl40.l(cya0Var, wxa0.a)) {
                num = 12;
            } else {
                if (!jl40.l(cya0Var, xxa0.a)) {
                    if (jl40.l(cya0Var, yxa0.a)) {
                        num = 9;
                    } else if (jl40.l(cya0Var, zxa0.a)) {
                        num = 14;
                    } else if (!jl40.l(cya0Var, aya0.a)) {
                        jl40.l(cya0Var, bya0.a);
                    }
                }
                num = null;
            }
            arrayList.add(num);
        }
        return arrayList;
    }

    @Override // defpackage.eya0
    public final /* bridge */ mya0 a(cya0 cya0Var) {
        return qh91.b(this, cya0Var);
    }

    @Override // defpackage.eya0
    public final List c(List list) {
        b bVar = this.a.b;
        int i = 2;
        boolean z = false;
        if (bVar == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new mya0((cya0) it.next(), z, i));
            }
            return arrayList;
        }
        ArrayList b = b(list);
        ArrayList arrayList2 = new ArrayList(tcc.n(b, 10));
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            arrayList2.add(Boolean.valueOf(num != null ? ((com.yandex.go.permission.b) bVar.b).a(num.intValue()) : false));
        }
        List list3 = list;
        ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
        int i2 = 0;
        for (Object obj : list3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            cya0 cya0Var = (cya0) obj;
            Boolean bool = (Boolean) a.S(i2, arrayList2);
            arrayList3.add(new mya0(cya0Var, bool != null ? bool.booleanValue() : false, i));
            i2 = i3;
        }
        return arrayList3;
    }

    @Override // defpackage.oza0
    public final void d(List list, dya0 dya0Var) {
        if (list.isEmpty()) {
            dya0Var.a(EmptyList.a);
            return;
        }
        b bVar = this.a.b;
        if (bVar != null) {
            bVar.a(b(list), new sxo(23, list, dya0Var));
            return;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new mya0((cya0) it.next(), false, 2));
        }
        dya0Var.a(arrayList);
    }

    @Override // defpackage.oza0
    public final /* bridge */ void e(og7 og7Var) {
        ai91.d(this, og7Var);
    }
}
