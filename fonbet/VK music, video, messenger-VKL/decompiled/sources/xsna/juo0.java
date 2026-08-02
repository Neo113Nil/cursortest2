package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tra0;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class juo0 implements cp10 {
    public final /* synthetic */ float a;

    public juo0(float f) {
        this.a = f;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, final long j) {
        zo10 zo10Var;
        zo10 zo10Var2;
        final float h = o6j.h(j) * this.a;
        long b = o6j.b(0, j, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        List<? extends zo10> list2 = list;
        int size = list2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zo10 zo10Var3 = list.get(i2);
            zo10 zo10Var4 = zo10Var3;
            if (vua0.o(zo10Var4) != aoy.Selector && vua0.o(zo10Var4) != aoy.InnerCircle) {
                arrayList.add(zo10Var3);
            }
        }
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3 = rf3.a((zo10) arrayList.get(i3), b, arrayList2, i3, 1)) {
        }
        int size3 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                zo10Var = null;
                break;
            }
            zo10Var = list.get(i4);
            if (vua0.o(zo10Var) == aoy.Selector) {
                break;
            }
            i4++;
        }
        zo10 zo10Var5 = zo10Var;
        int size4 = list2.size();
        while (true) {
            if (i >= size4) {
                zo10Var2 = null;
                break;
            }
            zo10Var2 = list.get(i);
            if (vua0.o(zo10Var2) == aoy.InnerCircle) {
                break;
            }
            i++;
        }
        zo10 zo10Var6 = zo10Var2;
        final float size5 = 6.2831855f / arrayList2.size();
        final tra0 N = zo10Var5 != null ? zo10Var5.N(b) : null;
        final tra0 N2 = zo10Var6 != null ? zo10Var6.N(b) : null;
        return ep10Var.Q(o6j.k(j), o6j.j(j), jgp.b, new izs() { // from class: xsna.iuo0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                long j2;
                tra0.a aVar = (tra0.a) obj;
                int i5 = 0;
                tra0 tra0Var = tra0.this;
                if (tra0Var != null) {
                    aVar.q(tra0Var, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                ArrayList arrayList3 = arrayList2;
                int size6 = arrayList3.size();
                while (true) {
                    j2 = j;
                    if (i5 >= size6) {
                        break;
                    }
                    tra0 tra0Var2 = (tra0) arrayList3.get(i5);
                    int i6 = (o6j.i(j2) / 2) - (tra0Var2.b / 2);
                    int h2 = (o6j.h(j2) / 2) - (tra0Var2.c / 2);
                    double d = h;
                    double d2 = (size5 * i5) - 1.5707963267948966d;
                    aVar.q(tra0Var2, an10.a((Math.cos(d2) * d) + i6), an10.a((Math.sin(d2) * d) + h2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i5++;
                    arrayList3 = arrayList3;
                }
                tra0 tra0Var3 = N2;
                if (tra0Var3 != null) {
                    aVar.q(tra0Var3, (o6j.k(j2) - tra0Var3.b) / 2, (o6j.j(j2) - tra0Var3.c) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
            }
        });
    }
}
