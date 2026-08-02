package defpackage;

import androidx.media3.common.StreamKey;
import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class pxt0 implements o5r {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final nxt0 e;
    public final oxt0[] f;
    public final long g;
    public final long h;

    public pxt0(int i, int i2, long j, long j2, int i3, boolean z, nxt0 nxt0Var, oxt0[] oxt0VarArr) {
        this.a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = nxt0Var;
        this.f = oxt0VarArr;
    }

    @Override // defpackage.o5r
    public final Object copy(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        oxt0 oxt0Var = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            oxt0 oxt0Var2 = this.f[streamKey.groupIndex];
            if (oxt0Var2 != oxt0Var && oxt0Var != null) {
                arrayList2.add(oxt0Var.b((a[]) arrayList3.toArray(new a[0])));
                arrayList3.clear();
            }
            arrayList3.add(oxt0Var2.j[streamKey.streamIndex]);
            i++;
            oxt0Var = oxt0Var2;
        }
        if (oxt0Var != null) {
            arrayList2.add(oxt0Var.b((a[]) arrayList3.toArray(new a[0])));
        }
        return new pxt0(this.a, this.b, this.g, this.h, this.c, this.d, this.e, (oxt0[]) arrayList2.toArray(new oxt0[0]));
    }
}
