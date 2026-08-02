package defpackage;

import com.yandex.go.zone.model.Zone;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class mvm {
    public static final int[] b = {10, 15};
    public final dqe0 a;

    public mvm(dqe0 dqe0Var) {
        this.a = dqe0Var;
    }

    public final int[] a() {
        Zone c = this.a.c();
        if (c != null) {
            int[] iArr = c.o;
            int i = 0;
            if (!(iArr.length == 0)) {
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i2 : iArr) {
                    int i3 = i2 / 60;
                    if (i3 > 0) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
                int[] iArr2 = new int[arrayList.size()];
                for (Object obj : arrayList) {
                    int i4 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw null;
                    }
                    iArr2[i] = ((Number) obj).intValue();
                    i = i4;
                }
                return iArr2;
            }
        }
        return b;
    }
}
