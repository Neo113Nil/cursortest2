package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: BasicText.kt */
/* loaded from: classes11.dex */
public final class vjo0 implements cp10 {
    public final gzs<Boolean> a;
    public final gzs<List<zhf0>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public vjo0(gzs<Boolean> gzsVar, gzs<? extends List<zhf0>> gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Pair pair;
        ArrayList arrayList3 = new ArrayList(list.size());
        List<? extends zo10> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            zo10 zo10Var = list.get(i);
            if (!(zo10Var.c() instanceof sko0)) {
                arrayList3.add(zo10Var);
            }
        }
        List<zhf0> invoke = this.b.invoke();
        if (invoke != null) {
            ArrayList arrayList4 = new ArrayList(invoke.size());
            int size2 = invoke.size();
            int i2 = 0;
            while (i2 < size2) {
                zhf0 zhf0Var = invoke.get(i2);
                if (zhf0Var != null) {
                    float f = zhf0Var.b;
                    float f2 = zhf0Var.a;
                    arrayList2 = arrayList4;
                    tra0 N = ((zo10) arrayList3.get(i2)).N(s6j.b(0, (int) Math.floor(zhf0Var.c - f2), 0, (int) Math.floor(zhf0Var.d - f), 5));
                    int round = Math.round(f2);
                    pair = new Pair(N, new h9x((Math.round(f) & 4294967295L) | (round << 32)));
                } else {
                    arrayList2 = arrayList4;
                    pair = null;
                }
                ArrayList arrayList5 = arrayList2;
                if (pair != null) {
                    arrayList5.add(pair);
                }
                i2++;
                arrayList4 = arrayList5;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            zo10 zo10Var2 = list.get(i3);
            if (zo10Var2.c() instanceof sko0) {
                arrayList6.add(zo10Var2);
            }
        }
        return ep10Var.Q(o6j.i(j), o6j.h(j), jgp.b, new ndg0(5, arrayList, bu6.d(arrayList6, this.a)));
    }
}
