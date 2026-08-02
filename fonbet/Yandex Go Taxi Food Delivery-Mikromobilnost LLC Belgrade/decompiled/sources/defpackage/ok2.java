package defpackage;

import androidx.compose.ui.layout.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class ok2 implements z910 {
    public static final ok2 a = new ok2();

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((x910) list.get(i)).l0(j));
        }
        w = kVar.w(n8e.i(j), n8e.h(j), b.f(), new nk2(arrayList, 0));
        return w;
    }
}
