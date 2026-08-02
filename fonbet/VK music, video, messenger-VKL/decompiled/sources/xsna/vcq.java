package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import xsna.q1g;

/* compiled from: Extension.kt */
/* loaded from: classes4.dex */
public final class vcq {
    public static final q1g.a a(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        q1g.a aVar = null;
        int i2 = 0;
        while (it.hasNext()) {
            q1g.a aVar2 = (q1g.a) it.next();
            int i3 = aVar2.d;
            if (aVar == null || ((i3 <= i && i < i2) || ((i2 + 1 <= i3 && i3 <= i) || (i + 1 <= i3 && i3 < i2)))) {
                aVar = aVar2;
                i2 = i3;
            }
        }
        return aVar;
    }
}
