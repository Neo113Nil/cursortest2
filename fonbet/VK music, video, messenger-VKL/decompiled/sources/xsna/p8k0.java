package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Snackbar.kt */
/* loaded from: classes11.dex */
public final class p8k0 implements cp10 {
    public static final p8k0 a = new p8k0();

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z = false;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            tra0 N = list.get(i4).N(j);
            arrayList.add(N);
            icv icvVar = ht1.a;
            if (N.g0(icvVar) != Integer.MIN_VALUE && (i == Integer.MIN_VALUE || N.g0(icvVar) < i)) {
                i = N.g0(icvVar);
            }
            icv icvVar2 = ht1.b;
            if (N.g0(icvVar2) != Integer.MIN_VALUE && (i2 == Integer.MIN_VALUE || N.g0(icvVar2) > i2)) {
                i2 = N.g0(icvVar2);
            }
            i3 = Math.max(i3, N.c);
        }
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            z = true;
        }
        int max = Math.max(ep10Var.r0((i == i2 || !z) ? t8k0.f : t8k0.g), i3);
        return ep10Var.Q(o6j.i(j), max, jgp.b, new e7g(arrayList, max, 2));
    }
}
