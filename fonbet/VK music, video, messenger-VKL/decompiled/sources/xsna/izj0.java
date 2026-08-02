package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: SkipContainer.kt */
/* loaded from: classes3.dex */
public final class izj0 implements cp10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public izj0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        int i;
        int i2 = o6j.i(j);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        for (zo10 zo10Var : list) {
            int i5 = this.a - 1;
            tra0 N = zo10Var.N(s6j.b(0, i3 == i5 ? i2 - i4 : i2, 0, 0, 13));
            arrayList.add(N);
            int i6 = N.b;
            i4 += i6;
            if (i4 > i2) {
                i3++;
                i4 = i6;
            } else if (i4 == i2 && i3 == i5) {
                break;
            }
        }
        int i7 = o6j.i(j);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            i = this.b;
            if (!hasNext) {
                break;
            }
            tra0 tra0Var = (tra0) it.next();
            if (tra0Var.b + i10 > i7) {
                Integer valueOf = Integer.valueOf(i);
                if (arrayList2.isEmpty()) {
                    valueOf = null;
                }
                i8 += (valueOf != null ? valueOf.intValue() : 0) + i9;
                arrayList2.add(new Pair(arrayList3, Integer.valueOf(i9)));
                arrayList4.clear();
                arrayList3 = new ArrayList();
                i9 = 0;
                i10 = 0;
                i11 = 0;
            }
            Object c = tra0Var.c();
            kzj0 kzj0Var = c instanceof kzj0 ? (kzj0) c : null;
            if (!(kzj0Var != null ? kzj0Var.a : false)) {
                arrayList3.addAll(arrayList4);
                arrayList3.add(tra0Var);
                arrayList4.clear();
                i11 = Math.max(i11, tra0Var.c);
                i10 += tra0Var.b;
                i9 = i11;
            } else if (i10 != 0) {
                arrayList4.add(tra0Var);
                i11 = Math.max(i11, tra0Var.c);
                i10 += tra0Var.b;
            }
        }
        Integer valueOf2 = arrayList2.isEmpty() ? null : Integer.valueOf(i);
        int intValue = valueOf2 != null ? valueOf2.intValue() : 0;
        arrayList2.add(new Pair(arrayList3, Integer.valueOf(i9)));
        return ep10Var.Q(i7, intValue + i9 + i8, jgp.b, new x0s(arrayList2, i, 3));
    }
}
