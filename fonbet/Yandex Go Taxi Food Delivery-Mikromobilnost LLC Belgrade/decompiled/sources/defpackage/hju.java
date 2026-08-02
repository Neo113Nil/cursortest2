package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class hju {
    public static final int b = mqg0.component_blue_normal;
    public zuj0 a;

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            if (iArr.length == 2) {
                int i = iArr[0];
                int i2 = iArr[1];
                zuj0 zuj0Var = this.a;
                if (zuj0Var == null) {
                    zuj0Var = null;
                }
                arrayList.add(new gju(i, i2, ((avj0) zuj0Var).a(b)));
            }
        }
        return arrayList;
    }
}
