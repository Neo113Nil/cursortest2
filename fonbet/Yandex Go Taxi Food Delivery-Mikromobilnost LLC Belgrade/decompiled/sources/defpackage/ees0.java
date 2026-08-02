package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class ees0 implements z910 {
    public static final ees0 a = new ees0();

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            o l0 = ((x910) list.get(i3)).l0(j);
            i = Math.max(i, l0.a);
            i2 = Math.max(i2, l0.b);
            arrayList.add(l0);
        }
        w = kVar.w(i, i2, b.f(), new nk2(arrayList, 9));
        return w;
    }
}
