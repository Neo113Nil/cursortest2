package com.yandex.div.core.expression.local;

import com.yandex.div.core.expression.variables.d;
import com.yandex.div.core.view2.Div2View;
import defpackage.all0;
import defpackage.br60;
import defpackage.cvu0;
import defpackage.da1;
import defpackage.egk;
import defpackage.fo40;
import defpackage.gp50;
import defpackage.jb7;
import defpackage.jl40;
import defpackage.jva1;
import defpackage.l6o;
import defpackage.m3k;
import defpackage.nfh;
import defpackage.omk;
import defpackage.rvo;
import defpackage.seu;
import defpackage.tls;
import defpackage.tvo;
import defpackage.u1n;
import defpackage.ykl0;
import defpackage.ym11;
import defpackage.yuf0;
import defpackage.yvi0;
import defpackage.zmk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class b implements ykl0 {
    public final nfh b;
    public final l6o c;
    public boolean d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final br60 g = new br60();
    public final c h = new c();
    public final LinkedHashMap i = new LinkedHashMap();
    public WeakReference j;
    public final da1 k;
    public final com.yandex.div.core.expression.a l;

    public b(omk omkVar, zmk zmkVar, nfh nfhVar, l6o l6oVar) {
        this.b = nfhVar;
        this.c = l6oVar;
        da1 da1Var = new da1(3, this);
        this.k = da1Var;
        String str = zmkVar.a;
        d dVar = new d(da1Var, null);
        fo40 fo40Var = ((com.yandex.div.core.expression.variables.a) nfhVar.a).i;
        if (dVar.x.add(fo40Var)) {
            fo40Var.a.d(dVar.B);
            fo40Var.a.c(dVar.C);
            dVar.w.add(fo40Var);
        }
        jb7 jb7Var = new jb7(13, nfhVar, l6oVar, str);
        int i = 17;
        gp50 gp50Var = new gp50(i, seu.B);
        List list = omkVar.a;
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList f = jva1.f(list);
            if (!f.isEmpty()) {
                gp50Var = new gp50(i, new u1n(24, new com.yandex.div.evaluable.d(f), gp50Var));
            }
        }
        yvi0 yvi0Var = new yvi0(l6oVar);
        com.yandex.div.core.expression.a p = nfhVar.p(omkVar.g, omkVar.f, dVar, jb7Var, gp50Var, yvi0Var, "", this, l6oVar);
        l(p, "", null);
        this.l = p;
    }

    public static boolean k(m3k m3kVar) {
        List v;
        List x;
        egk d = m3kVar.d();
        List d2 = d.d();
        return !((d2 == null || d2.isEmpty()) && ((v = d.v()) == null || v.isEmpty()) && ((x = d.x()) == null || x.isEmpty()));
    }

    @Override // defpackage.ykl0
    public final com.yandex.div.core.expression.a a(com.yandex.div.core.state.b bVar, m3k m3kVar, rvo rvoVar, rvo rvoVar2) {
        String b = bVar.b();
        LinkedHashMap linkedHashMap = this.f;
        com.yandex.div.core.expression.a aVar = (com.yandex.div.core.expression.a) linkedHashMap.get(b);
        if (aVar != null) {
            return aVar;
        }
        if (!(rvoVar instanceof tvo)) {
            return null;
        }
        com.yandex.div.core.expression.a i = i(rvoVar2);
        if (i == null) {
            m(b);
            return null;
        }
        if (k(m3kVar)) {
            l6o l6oVar = this.c;
            com.yandex.div.core.expression.a o = this.b.o(b, m3kVar, (tvo) rvoVar, l6oVar);
            l(o, b, i);
            return o;
        }
        if (rvoVar == rvoVar2) {
            linkedHashMap.put(b, i);
            return i;
        }
        com.yandex.div.core.expression.a aVar2 = new com.yandex.div.core.expression.a((tvo) rvoVar, null, null);
        l(aVar2, b, i);
        return aVar2;
    }

    @Override // defpackage.ykl0
    public final com.yandex.div.core.expression.a b() {
        return this.l;
    }

    @Override // defpackage.ykl0
    public final void c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((com.yandex.div.core.expression.a) it.next()).a();
        }
    }

    @Override // defpackage.ykl0
    public final Map d() {
        LinkedHashMap linkedHashMap = this.h.b;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), ((all0) entry.getValue()).a));
        }
        return kotlin.collections.b.s(arrayList);
    }

    @Override // defpackage.ykl0
    public final com.yandex.div.core.expression.a e(m3k m3kVar, rvo rvoVar, String str) {
        LinkedHashMap linkedHashMap = this.f;
        com.yandex.div.core.expression.a aVar = (com.yandex.div.core.expression.a) linkedHashMap.get(str);
        if (aVar != null) {
            return aVar;
        }
        boolean z = rvoVar instanceof tvo;
        com.yandex.div.core.expression.a aVar2 = this.l;
        if (!z) {
            return aVar2;
        }
        com.yandex.div.core.expression.a i = i(rvoVar);
        if (i == null) {
            m(str);
            return aVar2;
        }
        if (!k(m3kVar)) {
            linkedHashMap.put(str, i);
            return i;
        }
        l6o l6oVar = this.c;
        com.yandex.div.core.expression.a o = this.b.o(str, m3kVar, (tvo) rvoVar, l6oVar);
        l(o, str, i);
        return o;
    }

    @Override // defpackage.ykl0
    public final void f(com.yandex.div.core.expression.a aVar, com.yandex.div.core.state.b bVar, tls tlsVar) {
        String b = bVar.b();
        RuntimeStoreImpl$traverseFrom$1 runtimeStoreImpl$traverseFrom$1 = new RuntimeStoreImpl$traverseFrom$1(tlsVar);
        all0 all0Var = (all0) this.h.a.get(aVar);
        if (all0Var == null) {
            return;
        }
        if (cvu0.x(all0Var.b, b, false)) {
            c.a(all0Var, runtimeStoreImpl$traverseFrom$1);
            return;
        }
        for (all0 all0Var2 : all0Var.c) {
            if (cvu0.x(all0Var2.b, b, false)) {
                c.a(all0Var2, runtimeStoreImpl$traverseFrom$1);
            }
        }
    }

    @Override // defpackage.ykl0
    public final void g(egk egkVar) {
        if (this.d || egkVar.d() == null) {
            return;
        }
        this.d = true;
        this.c.f(new Throwable("You are using local variables. Please ensure that all elements that use local variables and all of their parents recursively have an 'id' attribute."));
    }

    @Override // defpackage.ykl0
    public final void h(Div2View div2View) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            yuf0 yuf0Var = ((com.yandex.div.core.expression.a) it.next()).c;
            if (yuf0Var != null) {
                yuf0Var.m(div2View);
            }
        }
    }

    @Override // defpackage.ykl0
    public final com.yandex.div.core.expression.a i(rvo rvoVar) {
        return (com.yandex.div.core.expression.a) this.e.get(rvoVar);
    }

    @Override // defpackage.ykl0
    public final void j(Div2View div2View) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            yuf0 yuf0Var = ((com.yandex.div.core.expression.a) it.next()).c;
            if (yuf0Var != null) {
                if (jl40.l((Div2View) yuf0Var.e, div2View)) {
                    yuf0Var.e = null;
                }
                Iterator it2 = ((LinkedHashMap) yuf0Var.d).entrySet().iterator();
                while (it2.hasNext()) {
                    for (com.yandex.div.core.expression.triggers.a aVar : (List) ((Map.Entry) it2.next()).getValue()) {
                        ym11.a(aVar.n).remove(div2View);
                        aVar.b();
                    }
                }
            }
        }
    }

    public final void l(com.yandex.div.core.expression.a aVar, String str, com.yandex.div.core.expression.a aVar2) {
        all0 all0Var;
        ArrayList arrayList;
        this.f.put(str, aVar);
        this.e.put(aVar.a, aVar);
        this.g.a(aVar);
        c cVar = this.h;
        cVar.getClass();
        all0 all0Var2 = new all0(aVar, str);
        cVar.b.put(str, all0Var2);
        LinkedHashMap linkedHashMap = cVar.a;
        linkedHashMap.put(aVar, all0Var2);
        if (aVar2 != null && (all0Var = (all0) linkedHashMap.get(aVar2)) != null && (arrayList = all0Var.c) != null) {
            arrayList.add(all0Var2);
        }
        aVar.a();
    }

    public final void m(String str) {
        this.c.e(new AssertionError(String.format("Parent runtime for path '%s' is not stored.", Arrays.copyOf(new Object[]{str}, 1))));
    }
}
