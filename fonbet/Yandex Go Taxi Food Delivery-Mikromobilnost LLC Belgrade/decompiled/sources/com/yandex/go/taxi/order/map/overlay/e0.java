package com.yandex.go.taxi.order.map.overlay;

import defpackage.f4c0;
import defpackage.ftk0;
import defpackage.gtk0;
import defpackage.htk0;
import defpackage.i3y;
import defpackage.itk0;
import defpackage.ktk0;
import defpackage.ltk0;
import defpackage.scc;
import defpackage.ssd;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w511;
import defpackage.xm00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class e0 implements ltk0 {
    public final /* synthetic */ ktk0 a;

    public e0(ktk0 ktk0Var) {
        this.a = ktk0Var;
    }

    @Override // defpackage.ltk0
    public final void H1(itk0 itk0Var) {
        ktk0 ktk0Var = this.a;
        i3y i3yVar = ktk0Var.g;
        CopyOnWriteArrayList copyOnWriteArrayList = ktk0Var.h;
        boolean z = false;
        if (!(itk0Var instanceof htk0)) {
            if (!(itk0Var instanceof ftk0)) {
                w511.b();
                return;
            }
            ru.yandex.taxi.map.utils.a.I((xm00) i3yVar.getValue(), copyOnWriteArrayList, EmptyList.a, new ssd(z));
            return;
        }
        List list = ((htk0) itk0Var).c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((gtk0) it.next()).a);
        }
        ru.yandex.taxi.map.utils.a.I((xm00) i3yVar.getValue(), copyOnWriteArrayList, arrayList, new ssd(z));
        Iterator it2 = copyOnWriteArrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            f4c0 f4c0Var = (f4c0) next;
            gtk0 gtk0Var = (gtk0) kotlin.collections.a.S(i, list);
            if (gtk0Var != null) {
                f4c0Var.x(gtk0Var.b);
            }
            f4c0Var.g(ktk0Var.i);
            i = i2;
        }
        tje.N(ktk0Var.a, null, null, new RoadObjectsOverlay$updateVisibility$1(ktk0Var, false, null), 3);
    }
}
