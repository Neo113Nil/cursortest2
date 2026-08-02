package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SimpleLayout.kt */
/* loaded from: classes11.dex */
public final class erj0 implements cp10 {
    public static final erj0 a = new erj0();

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            tra0 N = list.get(i3).N(j);
            i = Math.max(i, N.b);
            i2 = Math.max(i2, N.c);
            arrayList.add(N);
        }
        return ep10Var.Q(i, i2, jgp.b, new ni30(arrayList, 1));
    }
}
