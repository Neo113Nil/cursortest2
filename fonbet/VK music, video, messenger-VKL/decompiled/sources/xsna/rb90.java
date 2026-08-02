package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import xsna.dt1;

/* compiled from: PagerMeasure.kt */
/* loaded from: classes11.dex */
public final class rb90 {
    public static final kp10 a(qty qtyVar, int i, long j, qb90 qb90Var, long j2, Orientation orientation, dt1.b bVar, dt1.c cVar, LayoutDirection layoutDirection, int i2, pg50 pg50Var) {
        List list;
        Object h = qb90Var.h(i);
        List list2 = (List) pg50Var.b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List<zo10> c = qtyVar.c(i);
            int size = c.size();
            ArrayList arrayList = new ArrayList(size);
            int i3 = 0;
            while (i3 < size) {
                i3 = rf3.a(c.get(i3), j, arrayList, i3, 1);
            }
            pg50Var.k(i, arrayList);
            list = arrayList;
        }
        return new kp10(i, i2, list, j2, h, orientation, bVar, cVar, layoutDirection);
    }
}
