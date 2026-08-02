package xsna;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.EmptyList;
import xsna.buy;
import xsna.qsy;

/* compiled from: LazyLayoutBeyondBoundsState.kt */
/* loaded from: classes11.dex */
public final class usy {
    public static final List<Integer> a(androidx.compose.foundation.lazy.layout.b bVar, buy buyVar, qsy qsyVar) {
        k9x k9xVar;
        ci50<qsy.a> ci50Var = qsyVar.a;
        if (!(ci50Var.d != 0) && buyVar.b.isEmpty()) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        if (qsyVar.a.d != 0) {
            int i = ci50Var.d;
            if (i == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            qsy.a[] aVarArr = ci50Var.b;
            int i2 = aVarArr[0].a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = aVarArr[i3].a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                xzw.a("negative minIndex");
            }
            int i5 = ci50Var.d;
            if (i5 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            qsy.a[] aVarArr2 = ci50Var.b;
            int i6 = aVarArr2[0].b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = aVarArr2[i7].b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            k9xVar = new k9x(i2, Math.min(i6, bVar.getItemCount() - 1), 1);
        } else {
            k9xVar = k9x.e;
        }
        int size = buyVar.b.size();
        for (int i9 = 0; i9 < size; i9++) {
            buy.a aVar = (buy.a) buyVar.get(i9);
            int f = ine0.f(aVar.getIndex(), bVar, aVar.getKey());
            int i10 = k9xVar.b;
            if ((f > k9xVar.c || i10 > f) && f >= 0 && f < bVar.getItemCount()) {
                arrayList.add(Integer.valueOf(f));
            }
        }
        int i11 = k9xVar.b;
        int i12 = k9xVar.c;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
