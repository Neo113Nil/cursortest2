package defpackage;

import com.yandex.messaging.domain.folders.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class o7t extends vds0 {
    public final i b;

    public o7t(i iVar, kse kseVar) {
        super(kseVar.e);
        this.b = iVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return new g92(2, EmptyList.a);
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(tcc.n(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.a((String) it.next()));
        }
        return new ui7((tpr[]) a.J0(arrayList).toArray(new tpr[0]), 7);
    }
}
