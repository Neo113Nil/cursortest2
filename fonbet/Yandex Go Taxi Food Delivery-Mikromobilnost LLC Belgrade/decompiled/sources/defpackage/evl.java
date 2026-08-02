package defpackage;

import flex.section.divkit.DivkitSnippet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class evl extends f0q0 {
    public final cvl g;
    public final pxl h;
    public final ovl i = new ovl();
    public ArrayList j = new ArrayList();
    public final ihu k = new ihu();

    public evl(cvl cvlVar, pxl pxlVar) {
        this.g = cvlVar;
        this.h = pxlVar;
    }

    public static Set e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof s7u) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((String) ((s7u) it.next()).getItemId());
        }
        return a.N0(arrayList3);
    }

    @Override // defpackage.f0q0
    public final void a(z5q0 z5q0Var) {
        boolean l;
        if (z5q0Var instanceof y5q0) {
            y5q0 y5q0Var = (y5q0) z5q0Var;
            g4q0 a = y5q0Var.a();
            b5t0 c = y5q0Var.c();
            b5t0 b = y5q0Var.b();
            String str = this.g.a;
            if (a instanceof e4q0) {
                l = true;
            } else {
                if (!(a instanceof f4q0)) {
                    w511.b();
                    return;
                }
                l = jl40.l(((f4q0) a).a(), str);
            }
            if (l) {
                ihu ihuVar = this.k;
                ihuVar.getClass();
                LinkedHashMap linkedHashMap = ihuVar.b;
                LinkedHashMap linkedHashMap2 = ihuVar.a;
                Set a2 = b.a();
                Object obj = linkedHashMap2.get(str);
                if (obj == null) {
                    obj = new LinkedHashSet();
                    linkedHashMap2.put(str, obj);
                }
                ((Set) obj).addAll(a2);
                Set b2 = b.b();
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap.put(str, obj2);
                }
                ((Set) obj2).addAll(b2);
                Set a3 = c.a();
                Set set = (Set) linkedHashMap2.get(str);
                if (set != null) {
                    set.removeAll(a3);
                    if (set.isEmpty()) {
                        linkedHashMap2.remove(str);
                    }
                }
                Set b3 = c.b();
                Set set2 = (Set) linkedHashMap.get(str);
                if (set2 != null) {
                    set2.removeAll(b3);
                    if (set2.isEmpty()) {
                        linkedHashMap.remove(str);
                    }
                }
                ArrayList d = d(new f89(25, this, e(this.j), c));
                this.f.D(d);
                this.j = d;
            }
        }
    }

    @Override // defpackage.f0q0
    public final void b() {
        ArrayList d = d(new zu4(this, e(this.j)));
        this.f.D(d);
        this.j = d;
    }

    public final ArrayList d(tls tlsVar) {
        e0q0 e0q0Var;
        cvl cvlVar = this.g;
        List list = cvlVar.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            DivkitSnippet divkitSnippet = (DivkitSnippet) obj;
            if (((Boolean) tlsVar.invoke(divkitSnippet)).booleanValue()) {
                String str = cvlVar.a;
                LinkedHashMap linkedHashMap = this.k.a;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    obj2 = new LinkedHashSet();
                    linkedHashMap.put(str, obj2);
                }
                if (!((Set) obj2).contains(divkitSnippet.a)) {
                    arrayList.add(obj);
                }
            }
        }
        DivkitSnippet divkitSnippet2 = cvlVar.d;
        DivkitSnippet divkitSnippet3 = null;
        if (divkitSnippet2 == null || !((Boolean) tlsVar.invoke(divkitSnippet2)).booleanValue()) {
            divkitSnippet2 = null;
        }
        DivkitSnippet divkitSnippet4 = cvlVar.e;
        if (divkitSnippet4 != null && ((Boolean) tlsVar.invoke(divkitSnippet4)).booleanValue()) {
            divkitSnippet3 = divkitSnippet4;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            e0q0Var = this.e;
            if (!hasNext) {
                break;
            }
            final int i = 0;
            aul b = this.i.b((DivkitSnippet) it.next(), this.h, e0q0Var, new sls(this) { // from class: dvl
                public final /* synthetic */ evl b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    boolean z;
                    int i2 = i;
                    evl evlVar = this.b;
                    switch (i2) {
                        case 0:
                            z = evlVar.c;
                            break;
                        default:
                            z = evlVar.c;
                            break;
                    }
                    return Boolean.valueOf(!z);
                }
            }, cvlVar.a, cvlVar.f, cvlVar.g, cvlVar.h, cvlVar.i);
            if (b != null) {
                arrayList2.add(b);
            }
        }
        DivkitSnippet divkitSnippet5 = cvlVar.j ? divkitSnippet3 : divkitSnippet2;
        if (divkitSnippet5 != null) {
            String str2 = cvlVar.a;
            x1q0 x1q0Var = cvlVar.f;
            syp0 syp0Var = cvlVar.g;
            String str3 = cvlVar.i;
            mw5 mw5Var = cvlVar.h;
            final int i2 = 1;
            aul b2 = this.i.b(divkitSnippet5, this.h, e0q0Var, new sls(this) { // from class: dvl
                public final /* synthetic */ evl b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    boolean z;
                    int i22 = i2;
                    evl evlVar = this.b;
                    switch (i22) {
                        case 0:
                            z = evlVar.c;
                            break;
                        default:
                            z = evlVar.c;
                            break;
                    }
                    return Boolean.valueOf(!z);
                }
            }, str2, x1q0Var, syp0Var, mw5Var, str3);
            if (b2 != null) {
                return a.o0(arrayList2, b2);
            }
        }
        return arrayList2;
    }
}
