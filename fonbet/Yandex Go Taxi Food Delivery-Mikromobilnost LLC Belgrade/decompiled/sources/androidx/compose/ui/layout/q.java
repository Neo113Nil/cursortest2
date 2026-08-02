package androidx.compose.ui.layout;

import androidx.compose.ui.layout.o;
import defpackage.a1y;
import defpackage.aa10;
import defpackage.n8e;
import defpackage.p8e;
import defpackage.tls;
import defpackage.x910;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends a1y {
    public static final q b = new q("Undefined intrinsics block and it is required");

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        aa10 w2;
        aa10 w3;
        int size = list.size();
        if (size == 0) {
            w = kVar.w(n8e.k(j), n8e.j(j), kotlin.collections.b.f(), RootMeasurePolicy$measure$1.w);
            return w;
        }
        if (size == 1) {
            final o l0 = ((x910) list.get(0)).l0(j);
            w2 = kVar.w(p8e.g(l0.a, j), p8e.f(l0.b, j), kotlin.collections.b.f(), new tls() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    o.a.q((o.a) obj, o.this, 0, 0);
                    return zy11.a;
                }
            });
            return w2;
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            o l02 = ((x910) list.get(i3)).l0(j);
            i = Math.max(l02.a, i);
            i2 = Math.max(l02.b, i2);
            arrayList.add(l02);
        }
        w3 = kVar.w(p8e.g(i, j), p8e.f(i2, j), kotlin.collections.b.f(), new tls() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a aVar = (o.a) obj;
                List<o> list2 = arrayList;
                int size3 = list2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    o.a.q(aVar, list2.get(i4), 0, 0);
                }
                return zy11.a;
            }
        });
        return w3;
    }
}
