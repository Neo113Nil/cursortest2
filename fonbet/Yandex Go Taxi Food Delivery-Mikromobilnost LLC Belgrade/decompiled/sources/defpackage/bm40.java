package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class bm40 extends f55 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;

    public bm40(wl40 wl40Var, List list) {
        sny snyVar;
        List list2 = wl40Var.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (list.contains(((o2y0) obj).b().a)) {
                arrayList.add(obj);
            }
        }
        this.a = arrayList;
        List list3 = wl40Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list3) {
            List list4 = list;
            tly a = ((sly) obj2).a();
            if (a.G(list4, (a == null || (snyVar = a.c) == null) ? null : snyVar.a)) {
                arrayList2.add(obj2);
            }
        }
        this.b = arrayList2;
        List list5 = wl40Var.c;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list5) {
            if (list.contains(((ren) obj3).a)) {
                arrayList3.add(obj3);
            }
        }
        this.c = arrayList3;
        List list6 = wl40Var.d;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list6) {
            if (list.contains(((fnt) obj4).a)) {
                arrayList4.add(obj4);
            }
        }
        this.d = arrayList4;
        List list7 = wl40Var.e;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list7) {
            if (list.contains(((vhz) obj5).r)) {
                arrayList5.add(obj5);
            }
        }
        this.e = arrayList5;
        List list8 = wl40Var.f;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list8) {
            if (list.contains(((zuo0) obj6).getSessionId())) {
                arrayList6.add(obj6);
            }
        }
        this.f = arrayList6;
        List list9 = wl40Var.g;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list9) {
            if (list.contains(((taa) obj7).a())) {
                arrayList7.add(obj7);
            }
        }
        this.g = arrayList7;
        List list10 = wl40Var.h;
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : list10) {
            if (list.contains(((s850) obj8).a)) {
                arrayList8.add(obj8);
            }
        }
        this.h = arrayList8;
        List list11 = wl40Var.i;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : list11) {
            if (list.contains(((xu40) obj9).a)) {
                arrayList9.add(obj9);
            }
        }
        this.i = arrayList9;
    }

    @Override // defpackage.f55
    public final List a() {
        return this.g;
    }

    @Override // defpackage.f55
    public final List b() {
        return this.d;
    }

    @Override // defpackage.f55
    public final List c() {
        return this.c;
    }

    @Override // defpackage.f55
    public final List d() {
        return this.b;
    }

    @Override // defpackage.f55
    public final List e() {
        return this.e;
    }

    @Override // defpackage.f55
    public final List f() {
        return this.i;
    }

    @Override // defpackage.f55
    public final List g() {
        return this.h;
    }

    @Override // defpackage.f55
    public final List h() {
        return this.f;
    }

    @Override // defpackage.f55
    public final List i() {
        return this.a;
    }
}
