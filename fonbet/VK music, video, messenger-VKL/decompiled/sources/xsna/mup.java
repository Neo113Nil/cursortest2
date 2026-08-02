package xsna;

import java.util.List;
import kotlin.KotlinNothingValueException;
import xsna.tra0;

/* compiled from: EqualizerSlider.kt */
/* loaded from: classes3.dex */
public final class mup implements cp10 {
    public final /* synthetic */ l06 a;
    public final /* synthetic */ short b;
    public final /* synthetic */ short c;
    public final /* synthetic */ short d;

    public mup(l06 l06Var, short s, short s2, short s3) {
        this.a = l06Var;
        this.b = s;
        this.c = s2;
        this.d = s3;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        zo10 zo10Var;
        List<? extends zo10> list2 = list;
        int size = list2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zo10 zo10Var2 = list.get(i2);
            if (vua0.o(zo10Var2) == mtp.TRACK) {
                final tra0 N = zo10Var2.N(j);
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    zo10 zo10Var3 = list.get(i3);
                    if (vua0.o(zo10Var3) == mtp.THUMB) {
                        final tra0 N2 = zo10Var3.N(j);
                        int size3 = list2.size();
                        while (true) {
                            if (i >= size3) {
                                zo10Var = null;
                                break;
                            }
                            zo10Var = list.get(i);
                            if (vua0.o(zo10Var) == mtp.LABEL) {
                                break;
                            }
                            i++;
                        }
                        zo10 zo10Var4 = zo10Var;
                        final tra0 N3 = zo10Var4 != null ? zo10Var4.N(j) : null;
                        final int max = Math.max(N.b, N2.b);
                        int i4 = N.c;
                        int i5 = N2.b;
                        l06 l06Var = this.a;
                        ((wak0) l06Var.i).C(i4);
                        ((wak0) l06Var.j).C(i5);
                        ((vak0) l06Var.h).g(l06Var.g / i4);
                        final int abs = ((int) ((N.c / 2) - (this.d * (N.c / (Math.abs((int) this.c) + Math.abs((int) this.b)))))) - (N2.c / 2);
                        return ep10Var.Q(max, i4, jgp.b, new izs() { // from class: xsna.lup
                            @Override // xsna.izs
                            public final Object invoke(Object obj) {
                                tra0.a aVar = (tra0.a) obj;
                                int i6 = max / 2;
                                tra0 tra0Var = N;
                                tra0.a.x(aVar, tra0Var, i6 - (tra0Var.b / 2), 0);
                                tra0 tra0Var2 = N2;
                                tra0.a.x(aVar, tra0Var2, 0, abs);
                                tra0 tra0Var3 = N3;
                                if (tra0Var3 != null) {
                                    tra0.a.x(aVar, tra0Var3, i6 - (tra0Var3.b / 2), (-tra0Var3.c) - (tra0Var2.c / 2));
                                }
                                return s3q0.a;
                            }
                        });
                    }
                }
                hgz.c("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        hgz.c("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
