package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class mk2 {
    public static final kk2 a = new kk2("");

    public static final List a(List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((ik2) list.get(i));
        }
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add((ik2) list2.get(i2));
        }
        return arrayList;
    }

    public static final ArrayList b(int i, int i2, List list) {
        if (i > i2) {
            jxv.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ik2 ik2Var = (ik2) list.get(i3);
            int i4 = ik2Var.b;
            int i5 = ik2Var.c;
            if (d(i, i2, i4, i5)) {
                arrayList.add(new ik2(Math.max(i, ik2Var.b) - i, Math.min(i2, i5) - i, ik2Var.a, ik2Var.d));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final List c(kk2 kk2Var, int i, int i2, f22 f22Var) {
        List list;
        if (i == i2 || (list = kk2Var.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= kk2Var.b.length()) {
            if (f22Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) f22Var.invoke(((ik2) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            ik2 ik2Var = (ik2) list.get(i3);
            if (f22Var != null ? ((Boolean) f22Var.invoke(ik2Var.a)).booleanValue() : true) {
                int i4 = ik2Var.b;
                int i5 = ik2Var.c;
                if (d(i, i2, i4, i5)) {
                    arrayList2.add(new ik2(y6i0.d(ik2Var.b, i, i2) - i, y6i0.d(i5, i, i2) - i, (fk2) ik2Var.a, ik2Var.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean d(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
