package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class og01 {
    public final ArrayList a = new ArrayList();

    public final synchronized ArrayList a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ng01 ng01Var = (ng01) it.next();
            if ((ng01Var.a.isAssignableFrom(cls) && cls2.isAssignableFrom(ng01Var.b)) && !arrayList.contains(ng01Var.b)) {
                arrayList.add(ng01Var.b);
            }
        }
        return arrayList;
    }
}
