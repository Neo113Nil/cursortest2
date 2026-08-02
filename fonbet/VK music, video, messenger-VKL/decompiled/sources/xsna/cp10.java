package xsna;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MeasurePolicy.kt */
/* loaded from: classes11.dex */
public interface cp10 {
    dp10 b(ep10 ep10Var, List<? extends zo10> list, long j);

    default int c(apx apxVar, List<? extends zox> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new vgl(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return b(new fpx(apxVar, apxVar.getLayoutDirection()), arrayList, s6j.b(0, i, 0, 0, 13)).getHeight();
    }

    default int e(apx apxVar, List<? extends zox> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new vgl(list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return b(new fpx(apxVar, apxVar.getLayoutDirection()), arrayList, s6j.b(0, 0, 0, i, 7)).getWidth();
    }

    default int f(apx apxVar, List<? extends zox> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new vgl(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return b(new fpx(apxVar, apxVar.getLayoutDirection()), arrayList, s6j.b(0, i, 0, 0, 13)).getHeight();
    }

    default int g(apx apxVar, List<? extends zox> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new vgl(list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return b(new fpx(apxVar, apxVar.getLayoutDirection()), arrayList, s6j.b(0, 0, 0, i, 7)).getWidth();
    }
}
