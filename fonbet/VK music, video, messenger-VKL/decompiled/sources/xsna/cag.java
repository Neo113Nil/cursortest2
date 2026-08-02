package xsna;

import java.util.ArrayList;
import kotlin.Pair;

/* compiled from: AnimatorAnimationSpecs.kt */
/* loaded from: classes11.dex */
public final class cag<T> implements phr<T> {
    public final ArrayList a;

    public cag(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // xsna.iq2
    public final <V extends wq2> xlr0<V> a(itp0<T, V> itp0Var) {
        ArrayList arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(new Pair(Long.valueOf(((Number) r4.d()).intValue() * 1000000), ((phr) ((Pair) arrayList.get(i)).g()).a((itp0) itp0Var)));
        }
        return new vlr0(arrayList2);
    }
}
