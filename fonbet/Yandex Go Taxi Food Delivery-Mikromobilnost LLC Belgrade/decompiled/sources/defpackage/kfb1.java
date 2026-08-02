package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class kfb1 {
    public static au2 a;

    public static final void a(pyt0 pyt0Var, List list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(null);
        }
        Collections.copy(arrayList, list);
        pyt0Var.b = arrayList;
    }
}
