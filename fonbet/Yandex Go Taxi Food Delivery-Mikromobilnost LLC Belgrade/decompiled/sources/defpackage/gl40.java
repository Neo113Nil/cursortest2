package defpackage;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.d;
import androidx.compose.ui.layout.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public interface gl40 {
    aa10 b(k kVar, List list, long j);

    default int e(yuw yuwVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ldh((x910) list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList2.add(arrayList3);
        }
        return b(new d(yuwVar, yuwVar.getLayoutDirection()), arrayList2, p8e.b(0, 0, 0, i, 7)).getWidth();
    }

    default int f(yuw yuwVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ldh((x910) list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList2.add(arrayList3);
        }
        return b(new d(yuwVar, yuwVar.getLayoutDirection()), arrayList2, p8e.b(0, 0, 0, i, 7)).getWidth();
    }

    default int g(yuw yuwVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ldh((x910) list2.get(i3), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList2.add(arrayList3);
        }
        return b(new d(yuwVar, yuwVar.getLayoutDirection()), arrayList2, p8e.b(0, i, 0, 0, 13)).getHeight();
    }

    default int i(yuw yuwVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new ldh((x910) list2.get(i3), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList2.add(arrayList3);
        }
        return b(new d(yuwVar, yuwVar.getLayoutDirection()), arrayList2, p8e.b(0, i, 0, 0, 13)).getHeight();
    }
}
