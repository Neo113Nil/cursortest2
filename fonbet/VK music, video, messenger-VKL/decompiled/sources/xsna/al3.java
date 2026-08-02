package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: ArrayMultiMap.kt */
/* loaded from: classes5.dex */
public final class al3 {
    public int b;
    public final ArrayList<Object> a = new ArrayList<>();
    public final Object c = new Object();

    public final String a(zzp zzpVar) {
        int i;
        ArrayList arrayList;
        synchronized (this.c) {
            i = this.b;
            arrayList = new ArrayList(this.a.subList(0, i));
            s3q0 s3q0Var = s3q0.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i9x p = swe0.p(2, swe0.q(0, i));
        int i2 = p.b;
        int i3 = p.c;
        int i4 = p.d;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (true) {
                Object obj = arrayList.get(i2);
                linkedHashMap.put(obj.toString(), arrayList.get(i2 + 1));
                if (i2 == i3) {
                    break;
                }
                i2 += i4;
            }
        }
        return zzpVar.a(linkedHashMap);
    }
}
