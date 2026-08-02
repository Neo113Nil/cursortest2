package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class gvd {
    public final jgv a;

    public gvd(jgv jgvVar) {
        this.a = jgvVar;
    }

    public final ArrayList a(gmw0 gmw0Var, List list) {
        pud pudVar;
        ArrayList arrayList = gmw0Var.t.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            qvd qvdVar = (qvd) obj;
            ejj0 ejj0Var = (ejj0) a.S(i, list);
            n7v n7vVar = qvdVar.f;
            jgv jgvVar = this.a;
            String a = jgvVar.a(n7vVar);
            String h = qv10.h(i, gmw0Var.c, "_");
            if (ejj0Var != null) {
                String a2 = jgvVar.a(ejj0Var.g);
                if (a2 != null) {
                    a = a2;
                }
                String str = qvdVar.g;
                if (str == null || evu0.J(str)) {
                    str = qvdVar.a;
                }
                String str2 = ejj0Var.n;
                if (str2 == null || evu0.J(str2)) {
                    str2 = ejj0Var.b;
                }
                pudVar = new pud(i, a, str, str2, true, h, qvdVar.i);
            } else {
                pudVar = new pud(i, a, qvdVar.a, qvdVar.e, false, h, qvdVar.i);
            }
            arrayList2.add(pudVar);
            i = i2;
        }
        return arrayList2;
    }

    public final sud b(gmw0 gmw0Var, List list, int i) {
        String str;
        qvd qvdVar = (qvd) a.S(i, gmw0Var.t.a);
        if (qvdVar == null) {
            return null;
        }
        ejj0 ejj0Var = (ejj0) a.S(i, list);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (!it.hasNext()) {
                String str2 = qvdVar.b;
                String str3 = qvdVar.d;
                ArrayList<ejj0> arrayList = gmw0Var.j.c;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (ejj0 ejj0Var2 : arrayList) {
                    String str4 = ejj0Var2.a;
                    String str5 = ejj0Var2.c;
                    de70 de70Var = ejj0Var2.m;
                    int i5 = ejj0Var2.e;
                    Integer num = (Integer) hashMap2.get(str4);
                    HashMap hashMap3 = hashMap2;
                    int intValue = num != null ? num.intValue() : -1;
                    if (i5 != i4 || intValue < 0) {
                        Integer num2 = (Integer) hashMap.get(str4);
                        str = (num2 != null ? num2.intValue() : 0) >= i5 ? de70Var.b : ejj0Var2.d + i3 > gmw0Var.m ? de70Var.a : null;
                    } else {
                        str = ((qvd) gmw0Var.t.a.get(intValue)).c;
                    }
                    arrayList2.add(new tud(ejj0Var2.a, this.a.a(ejj0Var2.h), ejj0Var2.j, ejj0Var2.b, str == null ? !jl40.l(str5, ejj0Var2.b) ? str5 : null : str, jl40.l(str4, ejj0Var != null ? ejj0Var.a : null), str == null));
                    hashMap2 = hashMap3;
                    i4 = 1;
                }
                return new sud(str2, str3, qvdVar.h, arrayList2);
            }
            Object next = it.next();
            int i6 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            ejj0 ejj0Var3 = (ejj0) next;
            String str6 = ejj0Var3.a;
            if (i2 != i) {
                i3 += ejj0Var3.d;
                Integer num3 = (Integer) hashMap.get(str6);
                hashMap.put(str6, Integer.valueOf((num3 != null ? num3.intValue() : 0) + 1));
                hashMap2.put(str6, Integer.valueOf(i2));
            }
            i2 = i6;
        }
    }
}
