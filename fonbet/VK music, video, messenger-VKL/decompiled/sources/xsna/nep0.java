package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: TracerSharedState.java */
/* loaded from: classes8.dex */
public final class nep0 {
    public final cvf b;
    public final hsv c;
    public final boolean d;
    public final gag0 e;
    public final Supplier<zhk0> f;
    public final n0h0 g;
    public final fik0 h;
    public final n1q i;
    public final clh0 j;
    public final Object a = new Object();
    public volatile v7i k = null;

    public nep0(cvf cvfVar, hsv hsvVar, gag0 gag0Var, Supplier<zhk0> supplier, n0h0 n0h0Var, List<fik0> list, n1q n1qVar, clh0 clh0Var) {
        this.b = cvfVar;
        this.c = hsvVar;
        this.d = hsvVar instanceof hwe0;
        this.e = gag0Var;
        this.f = supplier;
        this.g = n0h0Var;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((fik0) it.next());
        }
        this.h = arrayList.isEmpty() ? w670.b : arrayList.size() == 1 ? (fik0) arrayList.get(0) : new e640(new ArrayList(arrayList));
        this.i = n1qVar;
        this.j = clh0Var;
    }
}
