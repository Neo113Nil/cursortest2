package com.yandex.go.places.impl.domain.interactors.organizations;

import com.yandex.go.places.impl.data.mappers.organizations.h;
import defpackage.gvp0;
import defpackage.jl40;
import defpackage.pwy0;
import defpackage.s95;
import defpackage.t95;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u95;
import defpackage.uyj;
import defpackage.v95;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class g {
    public final h a;
    public final com.yandex.go.places.impl.data.repositories.organizations.b b;
    public final tpr c;

    public g(tt2 tt2Var, pwy0 pwy0Var, h hVar, com.yandex.go.places.impl.data.repositories.organizations.b bVar) {
        this.a = hVar;
        this.b = bVar;
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(bVar.c, bVar.d, pwy0Var.a(), new OrganizationsSearchOptionsInteractor$currentSearchOptionsFlow$1(this, null)));
        tt2Var.getClass();
        this.c = kotlinx.coroutines.flow.e.F(t, uyj.a);
    }

    public static ArrayList c(List list, gvp0 gvp0Var) {
        List<gvp0> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (gvp0 gvp0Var2 : list2) {
            arrayList.add(jl40.l(gvp0Var2.a, gvp0Var.a) ? gvp0.a(gvp0Var2, true) : gvp0.a(gvp0Var2, false));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [u95] */
    /* JADX WARN: Type inference failed for: r3v3, types: [v95] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    public final void a(String str) {
        v95 t95Var;
        ArrayList c;
        com.yandex.go.places.impl.data.repositories.organizations.b bVar = this.b;
        List a = bVar.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (true) {
            gvp0 gvp0Var = null;
            if (!it.hasNext()) {
                r0 r0Var = bVar.c;
                r0Var.getClass();
                r0Var.m(null, arrayList);
                return;
            }
            ?? r3 = (v95) it.next();
            if (r3 instanceof u95) {
                r3 = (u95) r3;
                gvp0 gvp0Var2 = r3.b;
                if (jl40.l(gvp0Var2.a, str)) {
                    t95Var = new u95(r3.a, gvp0.a(gvp0Var2, !gvp0Var2.b));
                    r3 = t95Var;
                    arrayList.add(r3);
                } else {
                    arrayList.add(r3);
                }
            } else if (r3 instanceof s95) {
                s95 s95Var = (s95) r3;
                ArrayList<gvp0> arrayList2 = s95Var.b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ?? next = it2.next();
                    if (jl40.l(((gvp0) next).a, str)) {
                        gvp0Var = next;
                        break;
                    }
                }
                gvp0 gvp0Var3 = gvp0Var;
                if (gvp0Var3 != null) {
                    if (gvp0Var3.b) {
                        c = new ArrayList(tcc.n(arrayList2, 10));
                        for (gvp0 gvp0Var4 : arrayList2) {
                            if (jl40.l(gvp0Var4.a, gvp0Var3.a)) {
                                gvp0Var4 = gvp0.a(gvp0Var4, false);
                            }
                            c.add(gvp0Var4);
                        }
                    } else {
                        c = c(arrayList2, gvp0Var3);
                    }
                    t95Var = new s95(s95Var.a, c);
                    r3 = t95Var;
                    arrayList.add(r3);
                } else {
                    arrayList.add(r3);
                }
            } else {
                if (!(r3 instanceof t95)) {
                    w511.b();
                    return;
                }
                t95 t95Var2 = (t95) r3;
                List list = t95Var2.b;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ?? next2 = it3.next();
                    if (jl40.l(((gvp0) next2).a, str)) {
                        gvp0Var = next2;
                        break;
                    }
                }
                gvp0 gvp0Var5 = gvp0Var;
                if (gvp0Var5 == null) {
                    arrayList.add(r3);
                } else {
                    t95Var = new t95(t95Var2.a, c(list, gvp0Var5));
                    r3 = t95Var;
                    arrayList.add(r3);
                }
            }
        }
    }

    public final void b() {
        com.yandex.go.places.impl.data.repositories.organizations.b bVar = this.b;
        List<v95> a = bVar.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        for (v95 v95Var : a) {
            if (v95Var instanceof u95) {
                u95 u95Var = (u95) v95Var;
                v95Var = new u95(u95Var.a, gvp0.a(u95Var.b, false));
            } else if (v95Var instanceof s95) {
                s95 s95Var = (s95) v95Var;
                ArrayList arrayList2 = s95Var.b;
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(gvp0.a((gvp0) it.next(), false));
                }
                v95Var = new s95(s95Var.a, arrayList3);
            } else if (!(v95Var instanceof t95)) {
                w511.b();
                return;
            }
            arrayList.add(v95Var);
        }
        r0 r0Var = bVar.c;
        r0Var.getClass();
        r0Var.m(null, arrayList);
    }
}
