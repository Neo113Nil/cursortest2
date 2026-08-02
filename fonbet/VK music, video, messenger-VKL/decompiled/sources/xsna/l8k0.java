package xsna;

import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.tra0;

/* compiled from: Snackbar.kt */
/* loaded from: classes11.dex */
public final class l8k0 implements cp10 {
    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        int r0;
        int max;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zo10 zo10Var = list.get(i2);
            if (epx.f(vua0.o(zo10Var), "action")) {
                long j2 = j;
                final tra0 N = zo10Var.N(j2);
                int i3 = (o6j.i(j2) - N.b) - ep10Var.r0(t8k0.e);
                int k = o6j.k(j2);
                int i4 = i3 < k ? k : i3;
                int size2 = list.size();
                int i5 = 0;
                while (i5 < size2) {
                    zo10 zo10Var2 = list.get(i5);
                    if (epx.f(vua0.o(zo10Var2), "text")) {
                        final tra0 N2 = zo10Var2.N(o6j.b(0, j2, i4, 0, 0, 9));
                        icv icvVar = ht1.a;
                        int g0 = N2.g0(icvVar);
                        int g02 = N2.g0(ht1.b);
                        boolean z = true;
                        boolean z2 = (g0 == Integer.MIN_VALUE || g02 == Integer.MIN_VALUE) ? false : true;
                        if (g0 != g02 && z2) {
                            z = false;
                        }
                        final int i6 = o6j.i(j) - N.b;
                        if (z) {
                            max = Math.max(ep10Var.r0(t8k0.f), N.c);
                            r0 = (max - N2.c) / 2;
                            int g03 = N.g0(icvVar);
                            if (g03 != Integer.MIN_VALUE) {
                                i = (g0 + r0) - g03;
                            }
                        } else {
                            r0 = ep10Var.r0(t8k0.a) - g0;
                            max = Math.max(ep10Var.r0(t8k0.g), N2.c + r0);
                            i = (max - N.c) / 2;
                        }
                        final int i7 = i;
                        final int i8 = r0;
                        return ep10Var.Q(o6j.i(j), max, jgp.b, new izs() { // from class: xsna.k8k0
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                tra0.a aVar = (tra0.a) obj;
                                tra0.a.x(aVar, tra0.this, 0, i8);
                                tra0.a.x(aVar, N, i6, i7);
                                return s3q0.a;
                            }
                        });
                    }
                    i5++;
                    j2 = j;
                }
                hgz.c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
