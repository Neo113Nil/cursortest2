package xsna;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MultiContentMeasurePolicy.kt */
/* loaded from: classes11.dex */
public interface b540 {
    dp10 b(ep10 ep10Var, List<? extends List<? extends zo10>> list, long j);

    default int c(apx apxVar, List<? extends List<? extends zox>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new vgl((zox) list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList2.add(arrayList3);
        }
        return b(new fpx(apxVar, apxVar.getLayoutDirection()), arrayList2, s6j.b(0, i, 0, 0, 13)).getHeight();
    }

    default int e(apx apxVar, List<? extends List<? extends zox>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new vgl((zox) list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList2.add(arrayList3);
        }
        return b(new fpx(apxVar, apxVar.getLayoutDirection()), arrayList2, s6j.b(0, 0, 0, i, 7)).getWidth();
    }

    default int f(apx apxVar, List<? extends List<? extends zox>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new vgl((zox) list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList2.add(arrayList3);
        }
        return b(new fpx(apxVar, apxVar.getLayoutDirection()), arrayList2, s6j.b(0, i, 0, 0, 13)).getHeight();
    }

    default int g(apx apxVar, List<? extends List<? extends zox>> list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new vgl((zox) list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList2.add(arrayList3);
        }
        return b(new fpx(apxVar, apxVar.getLayoutDirection()), arrayList2, s6j.b(0, 0, 0, i, 7)).getWidth();
    }
}
