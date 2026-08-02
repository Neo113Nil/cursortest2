package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.e43;
import xsna.g5g;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class hq3 implements up2 {
    public final up2 a;
    public final iq3 b;

    public hq3(kq3 kq3Var, iq3 iq3Var) {
        this.a = kq3Var;
        this.b = iq3Var;
    }

    @Override // yads.up2
    public final void a(ff3 ff3Var) {
        this.a.a(ff3Var);
    }

    @Override // yads.up2
    public final void onSuccess(Object obj) {
        List list = (List) obj;
        iq3 iq3Var = this.b;
        mq3 mq3Var = iq3Var.a.a.m;
        if (mq3Var != null) {
            if (!mq3Var.b) {
                iq3Var.b.getClass();
                list = th3.a(list).a;
            }
            if (!mq3Var.a) {
                list = j5g.H0(list, 1);
            }
            dq3 dq3Var = iq3Var.c;
            dq3Var.getClass();
            int i = 10;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ye3 ye3Var = (ye3) it.next();
                bq3 bq3Var = dq3Var.b;
                List list2 = bq3Var.a.b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    g5g.y(((b20) it2.next()).d, arrayList2);
                }
                List<b20> list3 = ye3Var.b;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, i));
                for (b20 b20Var : list3) {
                    bq3Var.b.getClass();
                    List list4 = b20Var.c;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list4, i));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((l21) it3.next()).a);
                    }
                    Set R0 = j5g.R0(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        g5g.y(((b20) it4.next()).c, arrayList5);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Object next = it5.next();
                        if (R0.add(((l21) next).a)) {
                            arrayList6.add(next);
                        }
                    }
                    List list5 = b20Var.d;
                    ArrayList u0 = j5g.u0(b20Var.b, b20Var.a);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = it;
                    ArrayList arrayList9 = new ArrayList();
                    String str = b20Var.h;
                    arrayList7.addAll(u0);
                    Collection collection = b20Var.c;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    arrayList8.addAll(collection);
                    arrayList9.addAll(arrayList2);
                    String str2 = b20Var.f;
                    r13 r13Var = b20Var.g;
                    int i2 = b20Var.i;
                    arrayList8.addAll(arrayList6);
                    arrayList9.addAll(list5 == null ? EmptyList.b : list5);
                    String str3 = b20Var.j;
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        ArrayList arrayList11 = arrayList9;
                        Object next2 = it7.next();
                        int i3 = i2;
                        if (next2 instanceof lm1) {
                            arrayList10.add(next2);
                        }
                        arrayList9 = arrayList11;
                        i2 = i3;
                    }
                    ArrayList arrayList12 = arrayList9;
                    int i4 = i2;
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it8 = arrayList7.iterator();
                    while (it8.hasNext()) {
                        Object next3 = it8.next();
                        Iterator it9 = it8;
                        if (next3 instanceof uc1) {
                            arrayList13.add(next3);
                        }
                        it8 = it9;
                    }
                    arrayList3.add(new b20(arrayList10, arrayList13, arrayList8, arrayList12, null, str2, r13Var, str, i4, str3));
                    it = it6;
                    i = 10;
                }
                Iterator it10 = it;
                cq3 cq3Var = dq3Var.c;
                ye3 ye3Var2 = dq3Var.a;
                cq3Var.getClass();
                hf3 hf3Var = ye3Var.d;
                hf3 hf3Var2 = ye3Var2.d;
                hf3 hf3Var3 = new hf3(j5g.u0(hf3Var2.a, hf3Var.a), j5g.u0(hf3Var2.b, hf3Var.b));
                eq3 eq3Var = dq3Var.d;
                ye3 ye3Var3 = dq3Var.a;
                eq3Var.getClass();
                List l = e43.l(ye3Var, ye3Var3);
                ArrayList arrayList14 = new ArrayList();
                Iterator it11 = l.iterator();
                while (it11.hasNext()) {
                    sm3 sm3Var = ((ye3) it11.next()).j;
                    List list6 = sm3Var != null ? sm3Var.a : null;
                    if (list6 == null) {
                        list6 = EmptyList.b;
                    }
                    g5g.y(list6, arrayList14);
                }
                sm3 sm3Var2 = new sm3(arrayList14);
                Map map = ye3Var.c;
                ye3 ye3Var4 = dq3Var.a;
                Map map2 = ye3Var4.c;
                ArrayList u02 = j5g.u0(ye3Var4.n, ye3Var.n);
                xe3 xe3Var = new xe3(ye3Var.a, new oh3(dq3Var.e));
                xe3Var.k = ye3Var.l;
                xe3Var.l.addAll(arrayList3);
                xe3 a = xe3Var.a(map);
                a.d = ye3Var.e;
                a.e = ye3Var.f;
                a.f = ye3Var.g;
                a.g = ye3Var.h;
                a.h = ye3Var.i;
                a.o = hf3Var3;
                a.i = sm3Var2;
                a.c = ye3Var.m;
                xe3 a2 = a.a(map2);
                a2.m.addAll(u02);
                arrayList.add(a2.a());
                it = it10;
                i = 10;
            }
            list = arrayList;
        }
        this.a.onSuccess(list);
    }
}
