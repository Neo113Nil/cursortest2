package defpackage;

import android.graphics.PathMeasure;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import com.google.android.gms.internal.fido.g;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div2.DivEvaluableType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class jva1 {
    public static final lb2 a() {
        return new lb2(new PathMeasure());
    }

    public static final aa10 b(ghl0 ghl0Var, int i, int i2, int i3, int i4, int i5, k kVar, List list, o[] oVarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            x910 x910Var = (x910) list2.get(i14);
            float c = cva1.c(cva1.b(x910Var));
            if (c > 0.0f) {
                f2 += c;
                i16++;
                j = j2;
                i10 = i14;
            } else {
                int i19 = i3 - i17;
                o oVar = oVarArr[i14];
                j = j2;
                if (oVar == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i16;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i16;
                        i12 = i19 < 0 ? 0 : i19;
                    }
                    oVar = x910Var.l0(ghl0Var.c(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i16;
                }
                o oVar2 = oVar;
                int h = ghl0Var.h(oVar2);
                int d = ghl0Var.d(oVar2);
                iArr2[i10 - i6] = h;
                int i20 = i19 - h;
                if (i20 < 0) {
                    i20 = 0;
                }
                i18 = Math.min(i5, i20);
                i17 += h + i18;
                i15 = Math.max(i15, d);
                oVarArr[i10] = oVar2;
                i16 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i16 == 0) {
            i17 -= i18;
            i9 = 0;
        } else {
            long j4 = (r22 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i17) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                j5 -= Math.round(cva1.c(cva1.b((x910) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = i15;
            int i24 = 0;
            while (i22 < i7) {
                if (oVarArr[i22] == null) {
                    x910 x910Var2 = (x910) list2.get(i22);
                    f = f3;
                    hhl0 b = cva1.b(x910Var2);
                    float c2 = cva1.c(b);
                    if (c2 <= 0.0f) {
                        gxv.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j5);
                    long j6 = j5 - signum;
                    int max = Math.max(0, Math.round(c2 * f) + signum);
                    o l0 = x910Var2.l0(ghl0Var.c((!(b != null ? b.b : true) || max == Integer.MAX_VALUE) ? 0 : max, max, i4, true));
                    int h2 = ghl0Var.h(l0);
                    int d2 = ghl0Var.d(l0);
                    iArr2[i22 - i6] = h2;
                    i24 += h2;
                    int max2 = Math.max(i23, d2);
                    oVarArr[i22] = l0;
                    i23 = max2;
                    j5 = j6;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (i24 + j4);
            int i25 = i3 - i17;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
            i15 = i23;
        }
        int i26 = i9 + i17;
        if (i26 < 0) {
            i26 = 0;
        }
        int max3 = Math.max(i26, i);
        int max4 = Math.max(i15, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        ghl0Var.a(max3, iArr2, iArr3, kVar);
        return ghl0Var.j(oVarArr, kVar, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static final EvaluableType c(DivEvaluableType divEvaluableType) {
        switch (mms.a[divEvaluableType.ordinal()]) {
            case 1:
                return EvaluableType.STRING;
            case 2:
                return EvaluableType.INTEGER;
            case 3:
                return EvaluableType.NUMBER;
            case 4:
                return EvaluableType.BOOLEAN;
            case 5:
                return EvaluableType.DATETIME;
            case 6:
                return EvaluableType.COLOR;
            case 7:
                return EvaluableType.URL;
            case 8:
                return EvaluableType.DICT;
            case 9:
                return EvaluableType.ARRAY;
            default:
                w511.b();
                return null;
        }
    }

    public static final ArrayList f(List list) {
        List<irk> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (irk irkVar : list2) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (jrk jrkVar : irkVar.a) {
                arrayList2.add(jrkVar.a);
                arrayList3.add(new kms(c(jrkVar.b), false));
            }
            arrayList.add(new f3z(irkVar.c, arrayList3, c(irkVar.d), arrayList2, irkVar.b));
        }
        return arrayList;
    }

    public abstract g g();
}
