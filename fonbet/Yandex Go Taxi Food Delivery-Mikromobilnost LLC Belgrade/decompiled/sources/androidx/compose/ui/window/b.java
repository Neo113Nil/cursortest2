package androidx.compose.ui.window;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import defpackage.aa10;
import defpackage.n8e;
import defpackage.tls;
import defpackage.x910;
import defpackage.z910;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class b implements z910 {
    public static final b a = new b();

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            o l0 = ((x910) list.get(i3)).l0(j);
            i = Math.max(i, l0.a);
            i2 = Math.max(i2, l0.b);
            arrayList.add(l0);
        }
        if (list.isEmpty()) {
            i = n8e.k(j);
            i2 = n8e.j(j);
        }
        w = kVar.w(i, i2, kotlin.collections.b.f(), new tls() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a aVar = (o.a) obj;
                List<o> list2 = arrayList;
                int size2 = list2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    o.a.o(aVar, list2.get(i4), 0, 0);
                }
                return zy11.a;
            }
        });
        return w;
    }
}
