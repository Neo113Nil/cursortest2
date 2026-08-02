package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final class dg2 implements z910 {
    public final /* synthetic */ qor a;
    public final /* synthetic */ qor b;
    public final /* synthetic */ qor c;

    public dg2(qor qorVar, qor qorVar2, qor qorVar3) {
        this.a = qorVar;
        this.b = qorVar2;
        this.c = qorVar3;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        o l0;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            qor qorVar = this.a;
            int i3 = i;
            qor qorVar2 = this.b;
            qor qorVar3 = this.c;
            if (i3 >= size) {
                w = kVar.w(n8e.i(j), i2, b.f(), new lc0(arrayList, qorVar, qorVar2, qorVar3, 3));
                return w;
            }
            x910 x910Var = (x910) list.get(i3);
            if (i3 == 0) {
                qorVar2 = qorVar;
            } else if (i3 != 1) {
                qorVar2 = qorVar3;
            }
            if (qorVar2.getFloatValue() <= 0.0f) {
                l0 = null;
            } else {
                l0 = x910Var.l0(j);
                i2 = Math.max(i2, (int) (qorVar2.getFloatValue() * l0.m0()));
            }
            arrayList.add(l0);
            i = i3 + 1;
        }
    }
}
