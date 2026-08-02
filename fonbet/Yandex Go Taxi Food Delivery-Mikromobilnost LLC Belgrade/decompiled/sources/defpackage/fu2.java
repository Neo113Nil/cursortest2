package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final class fu2 implements z910 {
    public static final fu2 a = new fu2();

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((x910) it.next()).l0(j));
        }
        w = kVar.w(((o) arrayList.get(0)).a, ((o) arrayList.get(0)).b, b.f(), new nk2(arrayList, 1));
        return w;
    }
}
