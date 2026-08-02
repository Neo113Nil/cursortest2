package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class hjc implements ct41 {
    public final ArrayList a;

    public hjc(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.ct41
    public final boolean a(mn41 mn41Var, urd0 urd0Var) {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Boolean.valueOf(((ct41) it.next()).a(mn41Var, urd0Var)));
        }
        return arrayList2.contains(Boolean.TRUE);
    }
}
