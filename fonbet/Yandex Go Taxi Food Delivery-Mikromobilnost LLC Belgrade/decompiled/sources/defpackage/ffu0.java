package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class ffu0 {
    public static ArrayList a(List list, diu0 diu0Var, jiu0 jiu0Var, int i) {
        if (jiu0Var instanceof hiu0) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(i);
            arrayList.add(i, diu0Var);
            arrayList.addAll(i + 1, ((hiu0) jiu0Var).a);
            return arrayList;
        }
        if (!(jiu0Var instanceof iiu0)) {
            w511.b();
            return null;
        }
        iiu0 iiu0Var = (iiu0) jiu0Var;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList2.add(list.get(i2));
        }
        arrayList2.add(diu0Var);
        int size = list.size();
        for (int i3 = i + iiu0Var.a + 1; i3 < size; i3++) {
            arrayList2.add(list.get(i3));
        }
        return arrayList2;
    }

    public static jiu0 b(List list, jiu0 jiu0Var, int i) {
        if (jiu0Var instanceof hiu0) {
            return new iiu0(((hiu0) jiu0Var).a.size());
        }
        if (jiu0Var instanceof iiu0) {
            int i2 = i + 1;
            return new hiu0(list.subList(i2, ((iiu0) jiu0Var).a + i2));
        }
        w511.b();
        return null;
    }
}
