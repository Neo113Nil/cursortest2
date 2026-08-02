package xsna;

import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PriorityManagerQueue.kt */
/* loaded from: classes.dex */
public final class cll implements zbd0 {
    public final gzs<Integer> b;
    public final Comparator<ckv> c;
    public final boolean d;
    public final ArrayList<ckv> e = new ArrayList<>();

    public cll(gzs<Integer> gzsVar, Comparator<ckv> comparator, boolean z) {
        this.b = gzsVar;
        this.c = comparator;
        this.d = z;
    }

    public static int d(Object obj, ArrayList arrayList) {
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (obj2 == obj) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // xsna.zbd0
    public final boolean a(ckv ckvVar) {
        ArrayList<ckv> arrayList = this.e;
        d(ckvVar, arrayList);
        return d(ckvVar, arrayList) < this.b.invoke().intValue();
    }

    @Override // xsna.zbd0
    public final void b(ckv ckvVar) {
        ArrayList<ckv> arrayList = this.e;
        d(ckvVar, arrayList);
        arrayList.add(ckvVar);
        g5g.L(arrayList, this.c);
    }

    @Override // xsna.zbd0
    public final boolean c(ckv ckvVar) {
        ArrayList<ckv> arrayList = this.e;
        d(ckvVar, arrayList);
        int d = d(ckvVar, arrayList);
        if (d == -1) {
            return false;
        }
        arrayList.remove(d);
        if (this.d) {
            return true;
        }
        g5g.L(arrayList, this.c);
        return true;
    }
}
